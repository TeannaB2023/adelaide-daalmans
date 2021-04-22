package org.howard.edu.lsp.exam.question40.implementation;

public abstract class Animal {
	/**
	 * Print outs a message to indicate that the Animal is speaking
	 * */
	public void speak() {
		System.out.printf("This animal moves forward");
	}
	
	/**
	 * Print outs a message to indicate that the Animal is moving
	 * */
	public void move() {
		System.out.printf("This animal speaks");
	}
}
