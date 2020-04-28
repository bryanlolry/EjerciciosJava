package banco;

public class cuenta {
	private String titular;
	private float cantidad;
	public cuenta(){
	titular = "Bryan";
	cantidad = 500;
	}
	public String mostrar_tit(){
		return titular;
	}
	public void pedir_cantidad(float cantidad1){
		cantidad = cantidad1;
	}

	public float devolver_cantidad(){
		return cantidad;
	}
}
