/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.thumb16.instruction;

import com.marik.arm.OpCode.thumb16.instruction.factory.ParseSupport;
import static com.marik.arm.OpCode.OpUtil.*;

public class SUB_A8_708 extends ParseSupport {

	public static final SUB_A8_708 INSTANCE = new SUB_A8_708();

	@Override
	public String parse(int data) {

		int head = getShiftInt(data, 11, 5);
		if (head == 0b00111)
			return super.parse(data);
		head = getShiftInt(data, 9, 7);
		if (head == 0b0001111)
			return EncodingT1(data);

		return error(data);
	}

	private String EncodingT1(int data) {
		int Rd = getShiftInt(data, 0, 3);
		int Rn = getShiftInt(data, 3, 3);
		int imm3 = getShiftInt(data, 6, 3);

		StringBuilder sb = new StringBuilder("SUBS ");
		sb.append(parseRegister(Rd)).append(" , ").append(parseRegister(Rn)).append(" , #").append(imm3);
		return sb.toString();
	}

	@Override
	protected String getOpCode() {
		return "SUBS";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 8, 3));
	}

	@Override
	protected String getRm(int data) {
		return "#" + getShiftInt(data, 0, 8);
	}

}