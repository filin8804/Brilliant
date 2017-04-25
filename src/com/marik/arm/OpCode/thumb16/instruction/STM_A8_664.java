/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;
import static com.marik.arm.OpCode.OpUtil.*;

public class STM_A8_664 extends ParseSupport {

	public static final STM_A8_664 INSTANCE = new STM_A8_664();

	@Override
	protected String getOpCode() {
		return "STM";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 8, 3)) + "!";
	}

	@Override
	protected String getRm(int data) {
		return parseRigisterBit(getShiftInt(data, 0, 8), -1);
	}

	@Override
	protected boolean isRmRegisterList() {
		return true;
	}

}
