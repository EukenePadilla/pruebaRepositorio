package model;

public class categoriaClass extends Connect{

	protected int id_categoria;
	protected String nombre;
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public categoriaClass(int id_categoria, String nombre) {
		super();
		this.id_categoria = id_categoria;
		this.nombre = nombre;
	}
	public categoriaClass() {
		super();
	}
	
	
	
	
}
