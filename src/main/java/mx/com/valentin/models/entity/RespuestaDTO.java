package mx.com.valentin.models.entity;

public class RespuestaDTO {

	private String estatus;
	private Object resultado;
	private String mensaje;
	
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public Object getResultado() {
		return resultado;
	}
	public void setResultado(Object resultado) {
		this.resultado = resultado;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		return "RespuestaDTO [estatus=" + estatus + ", resultado=" + resultado + ", mensaje=" + mensaje + "]";
	}
	
	
}
