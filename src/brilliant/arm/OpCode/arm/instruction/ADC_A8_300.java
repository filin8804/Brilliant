/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.arm.instruction;

import static brilliant.arm.OpCode.factory.OpUtil.armExpandImm;
import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import brilliant.arm.OpCode.arm.instruction.support.ParseSupport;

public class ADC_A8_300 extends ParseSupport {

	public static final ADC_A8_300 INSTANCE = new ADC_A8_300();

	@Override
	protected String getOpCode(int data) {
		return "ADC";
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
		return -1;
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
		return armExpandImm(getShiftInt(data, 0, 12));
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}