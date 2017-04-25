/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;
import static com.marik.arm.OpCode.OpUtil.*;

public class LSL_A8_470 extends ParseSupport {

	public static final LSL_A8_470 INSTANCE = new LSL_A8_470();

	@Override
	protected String getOpCode() {
		return "LSLS";
	}
	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 0, 3));
	}

	@Override
	protected String getRm(int data) {
		return parseRegister(getShiftInt(data, 3, 3));
	}

}