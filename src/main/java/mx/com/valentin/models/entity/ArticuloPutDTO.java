package mx.com.valentin.models.entity;

public class ArticuloPutDTO {
	
	private String fcDescripcion;
	
	private String fcModelo;
	public String getFcDescripcion() {
		return fcDescripcion;
	}
	public void setFcDescripcion(String fcDescripcion) {
		this.fcDescripcion = fcDescripcion;
	}
	public String getFcModelo() {
		return fcModelo;
	}
	public void setFcModelo(String fcModelo) {
		this.fcModelo = fcModelo;
	}
	@Override
	public String toString() {
		return "ArticuloPutDTO [fcDescripcion=" + fcDescripcion + ", fcModelo=" + fcModelo + "]";
	}
	
	
	
}
