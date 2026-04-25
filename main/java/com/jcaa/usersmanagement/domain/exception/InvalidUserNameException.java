//package com.jcaa.usersmanagement.domain.exception;
//
//public final class InvalidUserNameException extends DomainException {
//
//  private InvalidUserNameException(final String message) {
//    super(message);
//  }
//
//  public static InvalidUserNameException becauseValueIsEmpty() {
//    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
//    return new InvalidUserNameException("The user name must not be empty.");
//  }
//
//  public static InvalidUserNameException becauseLengthIsTooShort(final int minimumLength) {
//    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
//    return new InvalidUserNameException(
//        String.format("The user name must have at least %d characters.", minimumLength));
//  }
//}
package com.jcaa.usersmanagement.domain.exception;

public final class InvalidUserNameException extends DomainException {

    private static final String EMPTY_NAME_MESSAGE =
            "The user name must not be empty.";

    private static final String NAME_TOO_SHORT_MESSAGE =
            "The user name must have at least %d characters.";

    private InvalidUserNameException(final String message) {
        super(message);
    }

    public static InvalidUserNameException becauseValueIsEmpty() {
        return new InvalidUserNameException(EMPTY_NAME_MESSAGE);
    }

    public static InvalidUserNameException becauseLengthIsTooShort(final int minimumLength) {
        return new InvalidUserNameException(
                String.format(NAME_TOO_SHORT_MESSAGE, minimumLength));
    }
}//solucion