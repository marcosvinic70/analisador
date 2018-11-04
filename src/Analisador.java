import antlr.ScannerBaseListener;
import antlr.ScannerLexer;
import antlr.ScannerParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import utils.Constants;
import utils.PrintOutput;

import java.util.List;

public class Analisador {

	public static void main(String[] args) throws Exception {

		String fileName = args[0] != null ? args[0] : Constants.DEFAULT_FILE;
		boolean printTokens = args[1] != null && Integer.parseInt(args[1]) == 1;
		CharStream charStream = CharStreams.fromFileName(Constants.FILES_PATH + fileName);
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
