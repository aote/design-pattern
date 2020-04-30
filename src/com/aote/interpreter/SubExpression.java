package com.aote.interpreter;

import java.util.HashMap;

/**
 * @author: Weicf
 * @date: 2020-04-29 11:55
 * @description:
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left 和 right 表达式相减后的结果
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }

}
