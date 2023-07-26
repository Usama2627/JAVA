package com.xworkz.encapsulation.app;

public class Calculator {

	private double result;
	private double memory;
	private double operand1;
	private double operand2;
	private char currentOperator;

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public double getOperand1() {
		return operand1;
	}

	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}

	public double getOperand2() {
		return operand2;
	}

	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}

	public char getCurrentOperator() {
		return currentOperator;
	}

	public void setCurrentOperator(char currentOperator) {
		this.currentOperator = currentOperator;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (" result "+this.result+" memory "+this.memory+" operand1 "+this.operand1+" operand2 "+this.operand2+" currentOperator "+this.currentOperator);
	}

}
