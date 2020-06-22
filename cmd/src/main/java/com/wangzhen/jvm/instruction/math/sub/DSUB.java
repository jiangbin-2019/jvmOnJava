package com.wangzhen.jvm.instruction.math.sub;

import com.wangzhen.jvm.instruction.base.NoOperandsInstruction;
import com.wangzhen.jvm.runtimeData.JFrame;
import com.wangzhen.jvm.runtimeData.OperandStack;

public class DSUB extends NoOperandsInstruction {
    @Override
    public void execute(JFrame frame) {
        OperandStack stack = frame.getOperandStack();
        double num1 = stack.popDouble();
        double num2 = stack.popDouble();
        double result = num2 - num1;
        stack.pushDouble(result);
    }
}