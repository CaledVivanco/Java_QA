//package com.jcaa.usersmanagement.domain.valueobject;
//
//import com.jcaa.usersmanagement.domain.exception.InvalidUserNameException;
//
//public record UserName(String value) {
//
//  // VIOLACIÓN Regla 10: se eliminó la constante MINIMUM_LENGTH — se usa magic number directamente
//  public UserName {
//    // VIOLACIÓN Regla 4: se usa == null en lugar de Objects.requireNonNull() o Objects.isNull().
//    // Para objetos siempre debe usarse Objects.isNull/nonNull, nunca operadores == o !=.
//    if (value == null) {
//      throw new NullPointerException("UserName cannot be null");
//    }
//    final String normalizedValue = value.trim();
//    validateNotEmpty(normalizedValue);
//    validateMinimumLength(normalizedValue);
//    value = normalizedValue;
//  }
//
//  private static void validateNotEmpty(final String normalizedValue) {
//    if (normalizedValue.isEmpty()) {
//      throw InvalidUserNameException.becauseValueIsEmpty();
//    }
//  }
//
//  private static void validateMinimumLength(final String normalizedValue) {
//    // VIOLACIÓN Regla 10: magic number 3 — debería usarse una constante con nombre descriptivo
//    if (normalizedValue.length() < 3) {
//      throw InvalidUserNameException.becauseLengthIsTooShort(3);
//    }
//  }
//
//  @Override
//  public String toString() {
//    return value;
//  }
//}
package com.jcaa.usersmanagement.domain.valueobject;

import com.jcaa.usersmanagement.domain.exception.InvalidUserNameException;
import java.util.Objects;

public record UserName(String value) {

    private static final int MINIMUM_LENGTH = 3;

    public UserName {
        final String normalized =
                Objects.requireNonNull(value, "UserName cannot be null").trim();

        validateNotEmpty(normalized);
        validateMinimumLength(normalized);

        value = normalized;
    }

    private static void validateNotEmpty(final String value) {
        if (value.isEmpty()) {
            throw InvalidUserNameException.becauseValueIsEmpty();
        }
    }

    private static void validateMinimumLength(final String value) {
        if (value.length() < MINIMUM_LENGTH) {
            throw InvalidUserNameException.becauseLengthIsTooShort(MINIMUM_LENGTH);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}//solucion
