package com.wangzhen.jvm.instruction.math.sub;

import com.wangzhen.jvm.instruction.base.NoOperandsInstruction;
import com.wangzhen.jvm.runtimeData.JFrame;
import com.wangzhen.jvm.runtimeData.OperandStack;

public class ISUB extends NoOperandsInstruction {
    @Override
    public void execute(JFrame frame) {
        OperandStack stack = frame.getOperandStack();
        int num1 = stack.popInt();
        int num2 = stack.popInt();
        int result = num2 - num1;
        stack.pushInt(result);
    }
}