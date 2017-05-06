/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package com.marik.arm.OpCode.arm.instruction;

import com.marik.arm.OpCode.arm.instruction.factory.ParseSupport;

import static com.marik.vm.OS.*;
import static com.marik.vm.Register.*;
import static com.marik.arm.OpCode.OpUtil.*;

public class TEQ_A8_740 extends ParseSupport {

	public static final TEQ_A8_740 INSTANCE = new TEQ_A8_740();

	@Override
	protected String getOpCode() {
		return "TEQ";
	}
	@Override
	protected int getRd(int data) {
		return -1;
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
		return -1;
	}
	@Override
	protected int getType(int data) {
		return getShiftInt(data, 5, 2);
	}
	@Override
	protected int getShift(int data) {
		return getShiftInt(data, 7, 5);
	}
	@Override
	public void performExecuteCommand(int data) {
	}

}