package mx.com.valentin.models.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.valentin.models.dao.ArticuloDao;
import mx.com.valentin.models.entity.Articulo;
import mx.com.valentin.models.entity.ArticuloPutDTO;
import mx.com.valentin.models.entity.RespuestaDTO;

@Service
public class ArticuloServiceImpl implements ArticuloService{

	@Autowired
	private ArticuloDao articuloDAO;
	
	@Override
	@Transactional(readOnly = true)
	public RespuestaDTO obtenerPorId(String id) {
		RespuestaDTO respuesta = new RespuestaDTO();
		
		try {
			Optional<Articulo> optArticulo = articuloDAO.findById(id);			
			if (!optArticulo.isPresent()) {
				respuesta.setEstatus("NOK");
				respuesta.setMensaje("No se encontro artículo con el id: " + id);
				respuesta.setResultado(null);
				return respuesta;
			}			
			respuesta.setEstatus("OK");
			respuesta.setMensaje("Operación realizada correctamente");
			respuesta.setResultado(optArticulo.get());
			
		} catch (Exception e) {
			respuesta.setEstatus("ERROR");
			respuesta.setMensaje("Ocurrio un error al tratar de consultar el artículo con id: " + id);
			respuesta.setResultado(null);
		}

		
		return respuesta;
	}

	@Override
	public RespuestaDTO actualizarArticulo(String id, ArticuloPutDTO articuloDTO) {
		RespuestaDTO respuesta = new RespuestaDTO();
		
		try {
			Optional<Articulo> optArticulo = articuloDAO.findById(id);			
			if (!optArticulo.isPresent()) {
				respuesta.setEstatus("NOK");
				respuesta.setMensaje("No se encontro artículo con el id: " + id);
				respuesta.setResultado(null);
				return respuesta;
			}
			
			Articulo art = optArticulo.get();
			art.setFc_modelo(articuloDTO.getFcModelo());
			art.setFc_descripcion(articuloDTO.getFcDescripcion());
			
			articuloDAO.save(art);
			
			respuesta.setEstatus("OK");
			respuesta.setMensaje("Se actualizo correctamente la información del artículo con id: " + id);
			respuesta.setResultado(null);
			
			
		} catch (Exception e) {
			respuesta.setEstatus("ERROR");
			respuesta.setMensaje("Ocurrio un error al tratar de actualizar el artículo con id: " + id);
			respuesta.setResultado(null);
		}
		
		return respuesta;
	}

}
