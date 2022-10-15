package com.biblioteca.spring.login.payload.response;

public class MensajeRespuesta {
	private String message;

	public MensajeRespuesta(String message) {
	    this.message = message;
	  }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
