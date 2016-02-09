/**
 * 
 */
package com.sqa.du.pet.vet;

import com.sqa.du.util.helper.RequestInput;

/**
 * @author dancalif
 *
 */
public class Reptile extends Pet {
	private boolean scales;

	private int heatLevel;
	private boolean poisonous;

	/**
	 * @param scales
	 * @param heatLevel
	 * @param poisonous
	 */
	public Reptile() {
		super();
		this.scales = RequestInput.getBoolean("Does " + this.getName() + " have scales?");
		this.heatLevel = RequestInput.getInt("Does your " + this.getClass().getSimpleName() + " require heat (0-5^):");
		this.poisonous = RequestInput.getBoolean("Is it poisonous?");
	}

	/**
	 * @param name
	 * @param injured
	 * @param male
	 * @param breed
	 * @param scales
	 * @param heatLevel
	 * @param poisonous
	 */
	public Reptile(String name, boolean injured, boolean male, String breed, boolean scales, int heatLevel,
			boolean poisonous) {
		super(name, injured, male, breed);
		this.scales = scales;
		this.heatLevel = heatLevel;
		this.poisonous = poisonous;
	}

	public int getHeatLevel() {
		return heatLevel;
	}

	public boolean hasScales() {
		return scales;
	}

	public boolean isPoisonous() {
		return poisonous;
	}

	public void setHeatLevel(int heatLevel) {
		this.heatLevel = heatLevel;
	}

	public void setPoisonous(boolean poisonous) {
		this.poisonous = poisonous;
	}

	public void setScales(boolean scales) {
		this.scales = scales;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", scales=");
		builder.append(scales);
		builder.append(", heatLevel=");
		builder.append(heatLevel);
		builder.append(", poisonous=");
		builder.append(poisonous);
		builder.append("]");
		return builder.toString();
	}

}
