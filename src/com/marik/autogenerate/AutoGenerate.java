package com.marik.autogenerate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AutoGenerate {

	public static final String THUMB16_PATH = "D:/Android/ELFDecorder/src/com/marik/arm/OpCode/thumb16/instruction/";
	public static final String THUMB16_CFG = "src/com/marik/autogenerate/Thumb16Instruction.cfg";

	public static void main(String[] args) {
		try {
			genrateThumb16Class();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void genrateThumb16Class() throws Exception {

		List<String> THUMB16_CLASS_NAME = parseNeededClass();

		for (String fileName : THUMB16_CLASS_NAME) {
			File file = new File(THUMB16_PATH + fileName + ".java");
			if (!file.exists())
				generateNewFile(file, fileName);
			else
				System.err.println(fileName + " exist , skipping");
		}
	}

	private static List<String> parseNeededClass() throws Exception {

		File file = new File(THUMB16_CFG);
		if (file.exists()) {

			List<String> clz = new ArrayList<>();

			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

			String className;
			while ((className = br.readLine()) != null)
				if (!"".equals(className) && !className.startsWith("#"))
					clz.add(className);

			br.close();

			return clz;

		}
		return null;
	}

	private static void generateNewFile(File file, String className) {
		try {
			file.createNewFile();

			PrintWriter pw = new PrintWriter(file);
			pw.println("/*-------------------------------");
			pw.println(" Auto Generated By AutoGenetate.java");
			pw.println("     Don't remove or modify");
			pw.println("        License GPL/GNU");
			pw.println("-------------------------------*/");

			pw.println("package com.marik.arm.OpCode.thumb16.instruction;");
			pw.println();
			pw.println("import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;");
			pw.println("import static com.marik.arm.OpCode.OpUtil.*;");
			pw.println();
			pw.println("public class " + className + " extends ParseSupport {");
			pw.println();
			pw.println("	public static final " + className + " INSTANCE = new " + className + "();");
			pw.println();
			pw.println("	@Override");
			pw.println("	protected String getOpCode() {");
			pw.println("		return null;");
			pw.println("	}");
			pw.println("	@Override");
			pw.println("	protected String getRn(int data) {");
			pw.println("		return null;");
			pw.println("	}");
			pw.println("	@Override");
			pw.println("	protected String getRm(int data) {");
			pw.println("		return null;");
			pw.println("	}");
			pw.println();
			pw.print("}");

			pw.flush();
			pw.close();

			System.out.println(className + " generated successfully");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
