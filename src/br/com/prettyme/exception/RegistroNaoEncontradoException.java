package br.com.prettyme.exception;


public class RegistroNaoEncontradoException extends Exception{
	
	public RegistroNaoEncontradoException() {
		super();

	}
	public RegistroNaoEncontradoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}
	public RegistroNaoEncontradoException(String message, Throwable cause) {
		super(message, cause);

	}
	public RegistroNaoEncontradoException(String message) {
		super(message);
	}
	public RegistroNaoEncontradoException(Throwable cause) {
		super(cause);
	}
}