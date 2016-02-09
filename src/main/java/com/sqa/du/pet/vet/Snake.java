package com.sqa.du.pet.vet;

import com.sqa.du.util.helper.RequestInput;

public class Snake extends Reptile {

	private int shedFrequency;

	/**
	 * @param shedFrequency
	 */
	public Snake() {
		super();
		this.shedFrequency = RequestInput.getInt("How often does " + this.getName() + " shed of skin?");
	}

	/**
	 * @param shedFrequency
	 */
	public Snake(int shedFrequency) {
		super();
		this.shedFrequency = shedFrequency;
	}

	public Snake(String name) {
		this(RequestInput.getInt("How often does " + name + " shed of skin?"));
	}

	public int getShedFrequency() {
		return shedFrequency;
	}

	public void setShedFrequency(int shedFrequency) {
		this.shedFrequency = shedFrequency;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", shedFrequency=");
		builder.append(shedFrequency);
		builder.append("]");
		return builder.toString();
	}

}
