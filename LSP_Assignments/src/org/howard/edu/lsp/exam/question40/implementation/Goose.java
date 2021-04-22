package org.howard.edu.lsp.exam.question40.implementation;

public class Goose extends Animal implements Flying{
	/**
	 * Print outs a message to indicate that the Goose is speaking
	 * */
	public void speak() {
		System.out.printf("This Goose moves forward");
	}
	
	/**
	 * Print outs a message to indicate that the Goose is moving
	 * */
	public void move() {
		System.out.printf("This Goose speaks");
	}
	
	/**
	 * Printouts out a message to indicate the Goose is flying
	 * */
	public void fly() {
		System.out.printf("It's a bird, it's a plane... Actually it's a Goose flying, specifically.");
	}
}
