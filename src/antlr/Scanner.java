package antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import utils.Constants;
import utils.PrintOutput;

import java.util.List;

public class Scanner {

	public static void scan(String filenameParam, String printTokensParam) throws Exception {

		String filename = filenameParam != null ? filenameParam : Constants.DEFAULT_FILE;
		boolean printTokens = printTokensParam != null && Integer.parseInt(printTokensParam) == 1;
		CharStream charStream = CharStreams.fromFileName(Constants.FILES_PATH + filename);
		ScannerLexer lexer = new ScannerLexer(charStream);
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		ScannerParser parser = new ScannerParser(commonTokenStream);
		ParseTree tree = parser.compilationUnit();
		ParseTreeWalker.DEFAULT.walk(new ScannerBaseListener(), tree);

		if(printTokens) {

			commonTokenStream.fill();

			print(commonTokenStream.getTokens(), lexer);

		}

	}

	private static void print(List<Token> tokens, ScannerLexer lexer) throws Exception {

		Thread.sleep(10);

		PrintOutput.tokens(tokens, lexer);
		PrintOutput.symbolTable(tokens, lexer);
		PrintOutput.graphViz(tokens, lexer);

	}

}
