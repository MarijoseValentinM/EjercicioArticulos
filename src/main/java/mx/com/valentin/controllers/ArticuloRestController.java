package mx.com.valentin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.valentin.models.entity.ArticuloPutDTO;
import mx.com.valentin.models.entity.RespuestaDTO;
import mx.com.valentin.models.services.ArticuloService;

@RestController
@RequestMapping("/articulos")
public class ArticuloRestController {

	@Autowired
	private ArticuloService articuloService;

	@GetMapping("/{id}")
	public RespuestaDTO obtenerPorId(	
		@PathVariable String id) {
		return articuloService.obtenerPorId(id);		
	}
	
	@PutMapping("/{id}")
	public RespuestaDTO actualizarArticulo(
		@PathVariable String id,
		@RequestBody ArticuloPutDTO articuloDTO) {
		return articuloService.actualizarArticulo(id, articuloDTO);		
	}
	
	
}
