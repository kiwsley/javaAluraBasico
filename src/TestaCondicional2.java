
public class TestaCondicional2 {

	public static void main(String[] args) {
		
		System.out.println("Testando Condicionais");
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		//boolean acompanhado = quantidadePessoas >= 3;
		
		if ( quantidadePessoas >=2) {
			acompanhado =true;
		}else {
			 acompanhado = false;
		}
		
		
		System.out.println("Valor de Acompanhado = "+ acompanhado);
		
		if (idade >= 18 && acompanhado) {
			
			System.out.println("Seja Bem Vindo");
		} else {
			
				System.out.println("Infelizmente n�o pode entrar");
		}
			
		
	}

}
