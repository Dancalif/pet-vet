package com.sqa.du.pet.vet;

import org.junit.Test;

public class PetTest {
	@Test
	public void test() {
		Pet[] pets = new Pet[] { new Snake(), new Lizard(), new Dog(), new Cat() };
		// Pet[] pets = new Pet[] { new Reptile("Pedro", true, true, "Iguana",
		// true, 3, false), new Pet("Spot"), new Pet(),
		// new Reptile(), new Snake() };
		for (int i = 0, j = 1; i <= pets.length; i++, j++) {
			System.out.println("My Pet " + (i + 1) + ": " + pets[i]);
		}
	}
}