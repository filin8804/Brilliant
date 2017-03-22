package com.marik.test;

import java.io.File;
import java.io.PrintStream;

import com.marik.elf.ELF;
import com.marik.vm.OS;

public class Test {

	public static void main(String[] args) throws Exception {
		 ELF.decode("C:\\Users\\monitor\\Desktop\\test");
		OS.dumpMemory(new PrintStream(new File("C:\\Users\\monitor\\Desktop\\dump.txt")));

		// new ELF("C:\\Users\\monitor\\Desktop\\Decomplied
		// File\\500彩票\\lib\\armeabi\\libesunlib.so");
		// ELF.decode("C:\\Users\\monitor\\Desktop\\Decomplied
		// File\\crackme\\lib\\armeabi\\libdata.so");
	}

}
