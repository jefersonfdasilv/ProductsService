package br.com.silva.store.products.core.errorhandling;

import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class ErrorMessage {

	private final OffsetDateTime timestamp;
	private final String message;
	
	public ErrorMessage(String message) {
		this.message = message;
		this.timestamp = OffsetDateTime.now();
	}
}
