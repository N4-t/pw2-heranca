
public class TestaLivroFisico {

	public static void main(String[] args) {
		
		LivroFisico fisico = new LivroFisico();
		
		fisico.setAutor("Natanael");
		fisico.setCategoria("Terror");
		fisico.setTitulo("1101 Vagões de comprimento");
		fisico.setValor(100.0);
		
		fisico.aplicarDesconto();
		System.out.println(fisico.getValor());		
		System.out.println(fisico.getTaxaImpressao());
	}
}
