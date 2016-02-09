package com.sqa.du.pet.vet;

import com.sqa.du.util.helper.RequestInput;

public class Dog extends Mammal {
	private boolean performArtShow;

	private boolean wolfBreed;

	/**
	 * @param performArtShow
	 * @param wolfBreed
	 */
	public Dog() {
		super();
		this.performArtShow = RequestInput.getBoolean("Does your " + this.getName() + " can perform art show? ");
		this.wolfBreed = RequestInput.getBoolean("Is your " + this.getName() + " a woflbreed? ");
	}

	/**
	 * @param performArtShow
	 * @param wolfBreed
	 */
	public Dog(boolean performArtShow, boolean wolfBreed) {
		super();
		this.performArtShow = performArtShow;
		this.wolfBreed = wolfBreed;
	}

	/**
	 * @param performArtShow
	 * @param wolfBreed
	 */
	public Dog(String name) {
		this(RequestInput.getBoolean("Does your " + name + " can perform art show? "),
				RequestInput.getBoolean("Is your " + name + " a woflbreed? "));
	}

	public boolean doesPerformArtShow() {
		return performArtShow;
	}

	public boolean isWolfBreed() {
		return wolfBreed;
	}

	public void setPerformArtShow(boolean performArtShow) {
		this.performArtShow = performArtShow;
	}

	public void setWolfBreed(boolean wolfBreed) {
		this.wolfBreed = wolfBreed;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", performArtShow=");
		builder.append(performArtShow);
		builder.append(", wolfBreed=");
		builder.append(wolfBreed);
		builder.append("]");
		return builder.toString();
	}

}
