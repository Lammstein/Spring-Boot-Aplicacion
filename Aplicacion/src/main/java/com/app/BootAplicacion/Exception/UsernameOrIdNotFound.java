package com.app.BootAplicacion.Exception;

public class UsernameOrIdNotFound extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5234725796791632791L;

	public UsernameOrIdNotFound() {
		super("Usuario o Id no encontrado");
	}

	public UsernameOrIdNotFound(String message) {
		super(message);
	}
}