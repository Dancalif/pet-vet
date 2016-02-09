package com.sqa.du.pet.vet;

import com.sqa.du.util.helper.RequestInput;

public class Cat extends Mammal {
	private boolean killingMice;

	private boolean claws;

	/**
	 * @param killingMice
	 * @param claws
	 */
	public Cat() {
		super();
		this.killingMice = RequestInput.getBoolean("Can " + this.getName() + " kill the mice? ");
		this.claws = RequestInput.getBoolean("Does  " + this.getName() + " have the claws? ");
	}

	/**
	 * @param killingMice
	 * @param claws
	 */
	public Cat(boolean killingMice, boolean claws) {
		super();
		this.killingMice = killingMice;
		this.claws = claws;
	}

	/**
	 * @param killingMice
	 * @param claws
	 */
	public Cat(String name) {
		this(RequestInput.getBoolean("Can " + name + " kill the mice? "),
				RequestInput.getBoolean("Does  " + name + " have the claws? "));
	}

	public boolean hasClaws() {
		return claws;
	}

	public boolean isKillingMice() {
		return killingMice;
	}

	public void setClaws(boolean claws) {
		this.claws = claws;
	}

	public void setKillingMice(boolean killingMice) {
		this.killingMice = killingMice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", killingMice=");
		builder.append(killingMice);
		builder.append(", claws=");
		builder.append(claws);
		builder.append("]");
		return builder.toString();
	}

}
