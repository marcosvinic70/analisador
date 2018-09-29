import lex.Scanner;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import utils.PrintOutput;

import java.util.List;

public class Main {

	public static void main (String[] args) throws Exception {

		CharStream charStream = CharStreams.fromFileName("HelloWorld.java");
		Scanner scanner = new Scanner(charStream);
		List<Token> tokens = scan(scanner);
		Thread.sleep(10);

		print(tokens, scanner);

	}

	private static List<Token> scan(Scanner scanner) {

		CommonTokenStream commonTokenStream = new CommonTokenStream(scanner);
		commonTokenStream.fill();

		return commonTokenStream.getTokens();

	}

	private static void print(List<Token> tokens, Scanner scanner) {

		PrintOutput printOutput = new PrintOutput();
		printOutput.tokens(tokens);
		printOutput.symbolTable(tokens);
		printOutput.graphViz(tokens, scanner);

	}

}
