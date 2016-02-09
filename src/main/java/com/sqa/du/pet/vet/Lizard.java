package com.sqa.du.pet.vet;

import com.sqa.du.util.helper.RequestInput;

public class Lizard extends Reptile {
	private boolean lostTail;

	private boolean changeColor;

	/**
	 * @param lostTail
	 * @param changeColor
	 */
	public Lizard() {
		super();
		this.lostTail = RequestInput.getBoolean("Did your " + this.getName() + " lost a tail? ");
		this.changeColor = RequestInput.getBoolean("Can your " + this.getName() + " change the color? ");
	}

	/**
	 * @param lostTail
	 * @param changeColor
	 */
	public Lizard(boolean lostTail, boolean changeColor) {
		super();
		this.lostTail = lostTail;
		this.changeColor = changeColor;
	}

	/**
	 * @param lostTail
	 * @param changeColor
	 */
	public Lizard(String name) {
		this(RequestInput.getBoolean("Did your " + name + " lost a tail? "),
				RequestInput.getBoolean("Can your " + name + " change the color? "));
	}

	public boolean canChangeColor() {
		return changeColor;
	}

	public boolean hasLostTail() {
		return lostTail;
	}

	public void setChangeColor(boolean changeColor) {
		this.changeColor = changeColor;
	}

	public void setLostTail(boolean lostTail) {
		this.lostTail = lostTail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", lostTail=");
		builder.append(lostTail);
		builder.append(", changeColor=");
		builder.append(changeColor);
		builder.append("]");
		return builder.toString();
	}

}
