package utils;

import lex.Scanner;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class PrintOutput {

	public void tokens(List<Token> tokens) {

		System.out.println("Informações de tokens (linha, coluna, tipo, lexema):");

		tokens.forEach(token ->
				System.out.println(
						" | " + token.getLine() +
						" | " + token.getCharPositionInLine() +
						" | " + token.getType() +
						" | " + token.getText()));

	}

	public void symbolTable(List<Token> tokens) {

		System.out.println("\nTabela de símbolos (entrada, lexema, tipo):");

		tokens.forEach(token ->
				System.out.println(
						" | " + token.getTokenIndex() +
						" | " + token.getText() +
						" | " + token.getType()));

	}

	public void graphViz(List<Token> tokens, Scanner scanner) {

		GraphViz graphViz = new GraphViz();

		tokens.forEach(token -> {

			if(token.getType() != Token.EOF) {

				String prefixName = "Scanner." + scanner.getVocabulary().getSymbolicName(token.getType());

				graphViz.readSource("resources/dots/" + prefixName +  ".dot");

				byte[] img = graphViz.getGraph(graphViz.getDotSource(), "png", "dot");

				graphViz.writeGraphToFile(img, "resources/afd/" + prefixName + ".png");

			}

		});

	}

}

