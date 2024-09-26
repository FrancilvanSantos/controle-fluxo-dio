import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro número:");
		int primeiroNumero = input.nextInt();

		System.out.println("Insira o segundo número:");
		int segundoNumero = input.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(primeiroNumero, segundoNumero);
		
		}catch(ParametrosInvalidosException exception) {
			System.err.println("O segundo parâmetro deve ser maior que o primeiro \n");
		}
	}
	static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(primeiroNumero > segundoNumero)
            throw new ParametrosInvalidosException();
        
		int contagem = segundoNumero - primeiroNumero;
		//realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i + 1));
        }
	}
}