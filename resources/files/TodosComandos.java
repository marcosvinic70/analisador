import java.util.Scanner; //entrada e saída de dados

public class TodosComandos {

	private void variableDeclarations() {

		int a = 0;
		String b = "00";
		char c = '0';
		float d = 0.0f;
		double e = 0.0d;

	}

	private void comments() {

		/*comentário*/
		//comentário

	}

	private void arithmeticOperators() {

		int resultado;
		int i = 10;
		int j = 5;

		resultado = i + j; //soma
		resultado = i - j; //subtração
		resultado = i * j; //multiplicação
		resultado = i / j; //divisão
		resultado = i % j; //resto
		resultado = i; //atribuição

	}

	private void relationalOperators() {

		boolean resultado;
		int i = 10;
		int j = 5;

		resultado = i > j; //maior
		resultado = i < j; //menor
		resultado = i >= j; //maior igual
		resultado = i <= j; //menor igual
		resultado = i != j; //diferente
		resultado = i == j; //igual

	}

	private void logicalOperators() {

		boolean resultado;
		boolean i = true;
		boolean j = false;

		resultado = i && j; //Conjunção
		resultado = i || j; //Disjunção
		resultado = !i; //negação

	}

	private void dataInput() {

		Scanner scanner = new Scanner(System.in);

		int idade;
		float preco;
		double salario;
		String nome;
		char sexo;

		idade = scanner.nextInt(); // leitura de int
		preco = scanner.nextFloat();// leitura de float
		salario = scanner.nextDouble();// leitura de double
		nome = scanner.next();// leitura de string
		sexo = scanner.next().charAt(0);// leitura de string pegando o char da primeira posição.

	}

	private void dataOutput() {

		System.out.println("Teste");

	}

	private void ifElseElseIf() {

		String cor = "azul";

		if(cor.equalsIgnoreCase("azul")) {

			System.out.println("A cor é azul");

		} else if(cor.equalsIgnoreCase("vermelho")) {

			System.out.println("A cor é vermelha");

		} else {

			System.out.println("A cor não é azul e nem vermelha");

		}

	}

	private void switchCase() {

		int valor = 1;

		switch(valor) {

			case 1:

				System.out.println("valor => 1");

				break;

			case 2:

				System.out.println("valor => 2");

				break;

			case 3:

				System.out.println("valor => 3");

				break;

			case 4:

				System.out.println("valor => 4");

				break;

			default:

				System.out.println("valor => 0");

		}

	}

	private void _while() {

		float raio, v;
		raio = 0;

		while(raio <= 20) {

			v = 4/3 * (float) 3.14 * (float) Math.pow(raio, 3);

			System.out.println("Para raio: " + raio + " o volume é: " + v);

			raio = raio + 0.5f;

		}

	}

	private void doWhile() {

		float raio, v;
		raio = 0;

		 do {

			v = 4/3 * (float) 3.14 * (float) Math.pow(raio, 3);

			System.out.println("Para raio: " + raio + " o volume é: " + v);

			raio = raio + 0.5f;

		} while(raio < 20);

	}

	private void _for() {

		float raio, v;
		raio = 0;

		for(int i = 0; i <= 40; i++) {

			v = 4/3 * (float) 3.14 * (float) Math.pow(raio, 3);

			System.out.println("Para raio: " + raio + " o volume é: " + v);

			raio = raio + 0.5f;

		}

	}

}
