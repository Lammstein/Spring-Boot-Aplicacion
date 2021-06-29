package com.app.BootAplicacion.Exception;

public class UsernameOrIdNotFound extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1168105973312737843L;
	
	public UsernameOrIdNotFound() {
		super("Usuario o Id no encontrado");
	}
	
	public UsernameOrIdNotFound(String message) {
		super(message);
	}	
}