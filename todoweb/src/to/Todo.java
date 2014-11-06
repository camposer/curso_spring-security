package to;


public class Todo {
	private Integer id;
	private String nombre;
	private Status estatus;
	
	public static enum Status {
		HECHO, EN_PROGRESO, POR_HACER;
	}

	public Todo(String nombre, Status status) {
		this.nombre = nombre;
		this.estatus  = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Status getStatus() {
		return estatus;
	}

	public void setStatus(Status status) {
		this.estatus = status;
	}
}
