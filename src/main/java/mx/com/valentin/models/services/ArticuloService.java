package mx.com.valentin.models.services;

import mx.com.valentin.models.entity.ArticuloPutDTO;
import mx.com.valentin.models.entity.RespuestaDTO;

public interface ArticuloService {

	public RespuestaDTO obtenerPorId(String id);

	public RespuestaDTO actualizarArticulo(String id, ArticuloPutDTO articuloDTO);		
	
}
