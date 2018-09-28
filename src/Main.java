import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main (String[] args) throws IOException {

		CharStream charStream = CharStreams.fromFileName("HelloWorld.java");
		Scanner scanner = new Scanner(charStream);
		CommonTokenStream commonTokenStream = new CommonTokenStream(scanner);
		commonTokenStream.fill();

		List<Token> tokens = commonTokenStream.getTokens();

	}

}
