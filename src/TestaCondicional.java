
public class TestaCondicional {

	public static void main(String[] args) {
		
		System.out.println("Testando Condicionais");
		int idade = 17;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja Bem Vindo");
		}else {
			if ( quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar, porque está acompanhado");
			}else {
				System.out.println("Infelizmente não pode entrar");
			}
			
		}

	}

}
