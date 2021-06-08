package mx.com.valentin.models.dao;

import org.springframework.data.repository.CrudRepository;

import mx.com.valentin.models.entity.Articulo;

public interface ArticuloDao extends CrudRepository<Articulo, String> {

}
