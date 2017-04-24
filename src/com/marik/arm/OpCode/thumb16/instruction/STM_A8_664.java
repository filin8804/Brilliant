package com.marik.arm.OpCode.thumb16.instruction;

import com.marik.arm.OpCode.OpUtil;
import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;

public class STM_A8_664 extends ParseSupport {

	public static final STM_A8_664 INSTANCE = new STM_A8_664();

	@Override
	protected String getOpCode() {
		return "STM";
	}

	@Override
	protected String getRn(int data) {
		return OpUtil.parseRegister(OpUtil.getShiftInt(data, 8, 3)) + "!";
	}

	@Override
	protected String getRm(int data) {
		return OpUtil.parseRigisterBit(OpUtil.getShiftInt(data, 0, 8), -1);
	}

	@Override
	protected boolean isRmRegisterList() {
		return true;
	}

}