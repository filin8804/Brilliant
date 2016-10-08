package com.BB.util;

import java.io.PrintStream;

public class Log {

	public static final boolean DEBUG = true;
	private static PrintStream out = System.out;

	public static void i(String msg) {
		if (DEBUG)
			out.println("ELF " + msg);
	}
	
	public static void i() {
		if (DEBUG)
			out.println();
	}

	public static void e(String msg) {
		if (DEBUG)
			out.println(msg);
	}
	
	public static void e() {
		if (DEBUG)
			out.println();
	}


	public static void setOuter(PrintStream out) {
		Log.out = out;
	}

}