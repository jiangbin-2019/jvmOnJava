package com.wangzhen.jvm.instruction.math.xor;

import com.wangzhen.jvm.instruction.base.NoOperandsInstruction;
import com.wangzhen.jvm.runtimeData.JFrame;
import com.wangzhen.jvm.runtimeData.OperandStack;

public class LXOR extends NoOperandsInstruction {
    @Override
    public void execute(JFrame frame) {
        OperandStack stack = frame.getOperandStack();
        long num1 = stack.popLong();
        long num2 = stack.popLong();
        long result = num2 ^ num1;
        stack.pushLong(result);
    }
}