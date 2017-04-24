package com.marik.arm.OpCode.thumb16.instruction;

import com.marik.arm.OpCode.OpUtil;
import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;

public class STR_A8_672 extends ParseSupport {

	public static final STR_A8_672 INSTANCE = new STR_A8_672();

	@Override
	public String parse(int data) {

		int head = OpUtil.getShiftInt(data, 11, 5);
		if (head == 0b01100)
			return EncodingT1(data);

		if (head == 0b10010)
			return EncodingT2(data);

		throw new IllegalArgumentException("Unable to decode instrucion " + Integer.toBinaryString(data));

	}

	private String EncodingT2(int data) {
		return null;
	}

	private String EncodingT1(int data) {

		StringBuilder sb = new StringBuilder("STR ");

		int imm = OpUtil.getShiftInt(data, 6, 5);
		sb.append(OpUtil.parseRegister(OpUtil.getShiftInt(data, 0, 3))).append(" , [");

		if (imm > 0)
			sb.append(OpUtil.parseRegister(OpUtil.getShiftInt(data, 3, 3)) + " , #" + OpUtil.zeroExtend(imm, 2));
		else
			sb.append(OpUtil.parseRegister(OpUtil.getShiftInt(data, 3, 3)));

		sb.append("]");
		return sb.toString();
	}

	@Override
	protected String getOpCode() {
		return null;
	}

	@Override
	protected String getRn(int data) {
		return null;
	}

	@Override
	protected String getRm(int data) {

		return null;
	}

}
