/**
 * 
 */
package com.sqa.du.pet.vet;

import com.sqa.du.util.helper.RequestInput;

/**
 * @author dancalif
 *
 */
public class Pet {

	private boolean alive;

	private String name;
	private boolean injured;
	private boolean male;
	private String breed;

	public Pet() {
		this(RequestInput.getString("What is your pet's name:"),
				RequestInput.getBoolean("Is your pet injured in any way?"), RequestInput.getBoolean("Is it a male?"),
				RequestInput.getString("What breed is your pet?"));
	}

	public Pet(String name) {
		this(name, false, true, "No Breed Specified");
	}

	/**
	 * @param alive
	 * @param name
	 * @param injured
	 * @param male
	 * @param breed
	 */
	public Pet(String name, boolean injured, boolean male, String breed) {
		super();
		this.setAlive(true);
		this.setName(name);
		this.setInjured(injured);
		this.setMale(male);
		this.setBreed(breed);
	}

	public String getBreed() {
		return breed;
	}

	public String getName() {
		return name;
	}

	public boolean isAlive() {
		return alive;
	}

	public boolean isInjured() {
		return injured;
	}

	public boolean isMale() {
		return male;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setInjured(boolean injured) {
		this.injured = injured;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(" [alive=");
		builder.append(alive);
		builder.append(", name=");
		builder.append(name);
		builder.append(", injured=");
		builder.append(injured);
		builder.append(", male=");
		builder.append(male);
		builder.append(", breed=");
		builder.append(breed);
		builder.append("]");
		return builder.toString();
	}

}
