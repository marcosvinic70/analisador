package soot;

import soot.options.Options;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Soot {

	public static void generateThreeAddressCode(String sootClassPath, String classesNames) throws IOException {

		init(sootClassPath);

		String[] classes = getClasses(classesNames);
		List<SootClass> sootClasses = resolveToSootClasses(classes);

		run();

		generateJimpleFiles(sootClasses);

	}

	private static void generateJimpleFiles(List<SootClass> sootClasses) throws IOException {

		OutputStream streamOut;
		PrintWriter writerOut;

		for(SootClass sootClass : sootClasses) {

			String fileName = SourceLocator.v().getFileNameFor(sootClass, Options.output_format_jimple);
			streamOut = new FileOutputStream(fileName);
			writerOut = new PrintWriter(new OutputStreamWriter(streamOut));

			Printer.v().printTo(sootClass, writerOut);

			writerOut.flush();
			streamOut.close();

		}

	}

	private static void run() {

		Scene.v().loadNecessaryClasses();
		PackManager.v().runPacks();

	}

	private static List<SootClass> resolveToSootClasses(String[] classes) {

		List<SootClass> sootClasses = new ArrayList<>();

		for(String clazz : classes) {

			SootClass c = Scene.v().forceResolve(clazz, SootClass.BODIES);
			c.setApplicationClass();
			sootClasses.add(c);

		}

		return sootClasses;

	}

	private static void init(String sootClassPath) {

		G.reset();
		Options.v().set_whole_program(true);
		Scene.v().loadBasicClasses();
		Scene.v().extendSootClassPath(sootClassPath);

	}

	private static String[] getClasses(String classesNames) {

		String[] classes;

		if(classesNames.contains(",")) {

			classes = classesNames.split(",");

		} else {

			classes = new String[]{classesNames};

		}

		return classes;

	}

}
