
public class EBook extends Livro {

	private String marcaDagua;
	
	public void aplicarDesconto() {
		valor *= 0.8;
	}

	public String getMarcaDagua() {
		return marcaDagua;
	}

	public void setMarcaDagua(String marcaDagua) {
		this.marcaDagua = marcaDagua;
	}
}
