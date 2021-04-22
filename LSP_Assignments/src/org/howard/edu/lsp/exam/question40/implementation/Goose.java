package org.howard.edu.lsp.exam.question40.implementation;

public class Goose extends Animal implements Flying{
	public void speak() {
		System.out.printf("This Goose moves forward");
	}
	
	public void move() {
		System.out.printf("This Goose speaks");
	}
	
	public void fly() {
		System.out.printf("It's a bird, it's a plane... Actually it's a Goose flying, specifically.");
	}
}
