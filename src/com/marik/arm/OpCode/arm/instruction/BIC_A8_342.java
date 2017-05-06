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

public class BIC_A8_342 extends ParseSupport {

	public static final BIC_A8_342 INSTANCE = new BIC_A8_342();


	@Override
	protected String getOpCode() {
		return "BIC";
	}
	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 12, 4);
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