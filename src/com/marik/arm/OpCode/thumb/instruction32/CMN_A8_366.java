/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb.instruction32;

import com.marik.arm.OpCode.thumb.instruction32.support.ParseSupport;

import static com.marik.vm.OS.*;
import static com.marik.vm.Register.*;
import static com.marik.arm.OpCode.OpUtil.*;

public class CMN_A8_366 extends ParseSupport {

	public static final CMN_A8_366 INSTANCE = new CMN_A8_366();


	@Override
	protected String getOpCode(int data) {
		return "CMN";
	}

	@Override
	protected int getRn(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected int getRm(int data) {
		return getShiftInt(data, 0, 4);
	}

	@Override
	protected int getS(int data) {
		return getShiftInt(data, 20, 1);
	}

	@Override
	protected int getType(int data) {
		return getShiftInt(data, 4, 2);
	}

	@Override
	protected int getShift(int data) {
		int imm3 = getShiftInt(data, 12, 3);
		int imm2 = getShiftInt(data, 6, 2);
		return imm3 << 2 | imm2;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}