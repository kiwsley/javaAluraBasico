
public class TestaCondicional {

	public static void main(String[] args) {
		
		System.out.println("Testando Condicionais");
		int idade = 17;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja Bem Vindo");
		}else {
			if ( quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, mas pode entrar, porque est� acompanhado");
			}else {
				System.out.println("Infelizmente n�o pode entrar");
			}
			
		}

	}

}
