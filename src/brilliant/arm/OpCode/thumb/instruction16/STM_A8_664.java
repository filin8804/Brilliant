/*-------------------------------
 Auto Generated By AutoGenetate.java
     Don't remove or modify
        License GPL/GNU
-------------------------------*/
package brilliant.arm.OpCode.thumb.instruction16;

import static brilliant.arm.OpCode.factory.OpUtil.getShiftInt;
import static brilliant.arm.OpCode.factory.OpUtil.parseRegister;
import static brilliant.arm.OpCode.factory.OpUtil.parseRegisterList;
import brilliant.arm.OpCode.thumb.instruction16.support.ParseSupport;

public class STM_A8_664 extends ParseSupport {

	public static final STM_A8_664 INSTANCE = new STM_A8_664();

	@Override
	protected String getOpCode(int data) {
		return "STM";
	}

	@Override
	protected String getRn(int data) {
		return parseRegister(getShiftInt(data, 8, 3)) + "!";
	}

	@Override
	protected String getRm(int data) {
		return parseRegisterList(getShiftInt(data, 0, 8), -1);
	}

	@Override
	protected boolean isRmRegisterList() {
		return true;
	}

	@Override
	public void performExecuteCommand(int data) {
	}

}
