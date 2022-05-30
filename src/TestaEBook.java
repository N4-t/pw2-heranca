
public class TestaEBook {

	public static void main(String[] args) {
		
		EBook book = new EBook();
		
		book.setAutor("Natanael");
		book.setCategoria("Terror");
		book.setTitulo("1001 vagões de medo");
		book.setMarcaDagua("AAA Enterteniment");
		book.setValor(100.0);
		
		book.aplicarDesconto();
		 System.out.println(book.getValor());
	}
}
