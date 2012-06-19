package org.springframework.security.acls.mongodb.exception;

public class ObjectClassNotExistException extends RuntimeException {

	private static final long serialVersionUID = 6093973902790409262L;

	public ObjectClassNotExistException(String objectClass) {
		super("The Object Class with Id or Class name '" + objectClass + "' does not exist");
	}
}
