package utils;

import antlr.ScannerLexer;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class PrintOutput {

	private static GraphViz graphViz;

	static {

		graphViz = new GraphViz();

	}

	public static void tokens(List<Token> tokens, ScannerLexer lexer) {

		System.out.println("Informações de tokens (linha, coluna, tipo, lexema):");

		tokens.stream()
				.filter(token -> token.getType() != Token.EOF)
				.forEach(token -> System.out.println(
						" |   " + token.getLine() +
						" |   " + token.getCharPositionInLine() +
						" |   " + lexer.getVocabulary().getSymbolicName(token.getType()) +
						" |   " + token.getText()));

	}

	public static void symbolTable(List<Token> tokens, ScannerLexer lexer) {

		System.out.println("\nTabela de símbolos (entrada, tipo, lexema):");

		tokens.stream()
				.filter(token -> token.getType() != Token.EOF)
				.forEach(token -> System.out.println(
						" |   " + token.getTokenIndex() +
						" |   " + lexer.getVocabulary().getSymbolicName(token.getType()) +
						" |   " + token.getText()));

	}

	public static void graphViz(List<Token> tokens, ScannerLexer lexer) {

		tokens.forEach(token -> {

			if(token.getType() != Token.EOF) {

				String prefixName = Constants.DOT_FILE_PREFIX + lexer.getVocabulary().getSymbolicName(token.getType());
				graphViz.readSource(Constants.DOT_PATH + prefixName + "." + Constants.DOT);
				byte[] img = graphViz.getGraph(graphViz.getDotSource(), Constants.PNG, Constants.DOT);
				graphViz.writeGraphToFile(img, Constants.AFD_PATH + prefixName + "." + Constants.PNG);

			}

		});

	}

}

