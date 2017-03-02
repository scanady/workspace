package org.validator;


public class FilterResult {

	private boolean vulgarity;
	private String mask;
	
	public void setVulgarity(boolean vulgarity) {
		this.vulgarity = vulgarity;
	}
	
	public boolean getVulgarity() {
		return vulgarity;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}
	
	public String getMask() {
		return this.mask;
	}

}
