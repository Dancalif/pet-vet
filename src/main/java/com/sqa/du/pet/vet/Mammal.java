package com.sqa.du.pet.vet;

import com.sqa.du.util.helper.RequestInput;

public class Mammal extends Pet {
	private boolean RabiesShot;

	private boolean houseBroken;

	/**
	 * @param rabiesShot
	 * @param houseBroken
	 */
	public Mammal() {
		super();
		this.RabiesShot = RequestInput.getBoolean("Does your " + this.getName() + " has rabbies? ");
		this.houseBroken = RequestInput.getBoolean("Is " + this.getName() + " house broken pet? ");
	}

	/**
	 * @param rabiesShot
	 * @param houseBroken
	 */
	public Mammal(boolean rabiesShot, boolean houseBroken) {
		super();
		RabiesShot = rabiesShot;
		this.houseBroken = houseBroken;
	}

	/**
	 * @param rabiesShot
	 * @param houseBroken
	 */
	public Mammal(String name) {
		this(RequestInput.getBoolean("Does your " + name + " has rabbies? "),
				RequestInput.getBoolean("Is " + name + " house broken pet? "));
	}

	public boolean hasRabiesShot() {
		return RabiesShot;
	}

	public boolean isHouseBroken() {
		return houseBroken;
	}

	public void setHouseBroken(boolean houseBroken) {
		this.houseBroken = houseBroken;
	}

	public void setRabiesShot(boolean rabiesShot) {
		RabiesShot = rabiesShot;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", RabiesShot=");
		builder.append(RabiesShot);
		builder.append(", houseBroken=");
		builder.append(houseBroken);
		builder.append("]");
		return builder.toString();
	}

}
