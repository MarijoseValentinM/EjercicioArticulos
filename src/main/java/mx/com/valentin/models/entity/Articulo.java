package mx.com.valentin.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="to001_articulos")
public class Articulo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String fc_id_articulo;
	private String fc_nombre;
	private String fc_descripcion;
	private BigDecimal ff_precio;
	private String fc_modelo;
	public String getFc_id_articulo() {
		return fc_id_articulo;
	}
	public void setFc_id_articulo(String fc_id_articulo) {
		this.fc_id_articulo = fc_id_articulo;
	}
	public String getFc_nombre() {
		return fc_nombre;
	}
	public void setFc_nombre(String fc_nombre) {
		this.fc_nombre = fc_nombre;
	}
	public String getFc_descripcion() {
		return fc_descripcion;
	}
	public void setFc_descripcion(String fc_descripcion) {
		this.fc_descripcion = fc_descripcion;
	}
	public BigDecimal getFf_precio() {
		return ff_precio;
	}
	public void setFf_precio(BigDecimal ff_precio) {
		this.ff_precio = ff_precio;
	}
	public String getFc_modelo() {
		return fc_modelo;
	}
	public void setFc_modelo(String fc_modelo) {
		this.fc_modelo = fc_modelo;
	}
	
	
	
}
