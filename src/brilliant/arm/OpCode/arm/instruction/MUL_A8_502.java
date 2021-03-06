/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.arm.instruction;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import brilliant.arm.OpCode.arm.instruction.support.ParseSupport;

public class MUL_A8_502 extends ParseSupport {

	public static final MUL_A8_502 INSTANCE = new MUL_A8_502();

	@Override
	protected String getOpCode(int data) {
		return "MUL";
	}

	@Override
	protected int getRd(int data) {
		return getShiftInt(data, 16, 4);
	}

	@Override
	protected int getRn(int data) {
		return getShiftInt(data, 0, 4);
	}

	@Override
	protected int getRm(int data) {
		return getShiftInt(data, 8, 4);
	}

	@Override
	protected int getS(int data) {
		return getShiftInt(data, 20, 1);
	}

	@Override
	protected int getType(int data) {
		return -1;
	}

	@Override
	protected int getShift(int data) {
		return 0;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}