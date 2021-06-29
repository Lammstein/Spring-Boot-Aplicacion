package com.app.BootAplicacion.Exception;

public class CustomeFieldValidationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8212346566258807482L;
	
private String fieldName;
	
	public CustomeFieldValidationException(String message, String fieldName) {
		super(message);
		this.fieldName = fieldName;
	}
	
	public String getFieldName() {
		return this.fieldName;
	}
}