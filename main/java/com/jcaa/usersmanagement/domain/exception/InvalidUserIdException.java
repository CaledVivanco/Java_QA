//package com.jcaa.usersmanagement.domain.exception;
//
//public final class InvalidUserIdException extends DomainException {
//
//  private InvalidUserIdException(final String message) {
//    super(message);
//  }
//
//  public static InvalidUserIdException becauseValueIsEmpty() {
//    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
//    return new InvalidUserIdException("The user id must not be empty.");
//  }
//}
package com.jcaa.usersmanagement.domain.exception;

public final class InvalidUserIdException extends DomainException {

    private static final String EMPTY_ID_MESSAGE =
            "The user id must not be empty.";

    private InvalidUserIdException(final String message) {
        super(message);
    }

    public static InvalidUserIdException becauseValueIsEmpty() {
        return new InvalidUserIdException(EMPTY_ID_MESSAGE);
    }
}// solucion