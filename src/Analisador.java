import antlr.Scanner;
import soot.Soot;

public class Analisador {

	public static void main(String[] args) throws Exception {

		Scanner.scan(args[0], args[1]);
		Soot.generateThreeAddressCode(args[2], args[3]);

	}

}
