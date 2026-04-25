//package com.jcaa.usersmanagement.domain.model;
//
//import lombok.Value;
//
//@Value
//public class EmailDestinationModel {
//
//  String destinationEmail;
//  String destinationName;
//  String subject;
//  String body;
//
//  public EmailDestinationModel(
//      final String destinationEmail,
//      final String destinationName,
//      final String subject,
//      final String body) {
//    this.destinationEmail = validateNotBlank(destinationEmail, "El email del destinatario es requerido.");
//    this.destinationName  = validateNotBlank(destinationName,  "El nombre del destinatario es requerido.");
//    this.subject          = validateNotBlank(subject,          "El asunto es requerido.");
//    this.body             = validateNotBlank(body,             "El cuerpo del mensaje es requerido.");
//  }
//
//  private static String validateNotBlank(final String value, final String errorMessage) {
//    // VIOLACIÓN Regla 4: se usa == null en lugar de Objects.requireNonNull() o Objects.isNull().
//    // Para objetos siempre debe usarse Objects.isNull/nonNull, nunca operadores == o !=.
//    if (value == null) {
//      throw new NullPointerException(errorMessage);
//    }
//    // VIOLACIÓN Regla 10: mensajes de error hardcodeados en el cuerpo del método,
//    // en lugar de definirse como constantes con nombre descriptivo.
//    if (value.trim().isEmpty()) {
//      throw new IllegalArgumentException(errorMessage);
//    }
//    return value;
//  }
//}
package com.jcaa.usersmanagement.domain.model;

import java.util.Objects;
import lombok.Value;

@Value
public class EmailDestinationModel {

    private static final String DESTINATION_EMAIL_REQUIRED =
            "El email del destinatario es requerido.";
    private static final String DESTINATION_NAME_REQUIRED =
            "El nombre del destinatario es requerido.";
    private static final String SUBJECT_REQUIRED =
            "El asunto es requerido.";
    private static final String BODY_REQUIRED =
            "El cuerpo del mensaje es requerido.";

    String destinationEmail;
    String destinationName;
    String subject;
    String body;

    public EmailDestinationModel(
            final String destinationEmail,
            final String destinationName,
            final String subject,
            final String body) {

        this.destinationEmail = validateNotBlank(destinationEmail, DESTINATION_EMAIL_REQUIRED);
        this.destinationName  = validateNotBlank(destinationName, DESTINATION_NAME_REQUIRED);
        this.subject          = validateNotBlank(subject, SUBJECT_REQUIRED);
        this.body             = validateNotBlank(body, BODY_REQUIRED);
    }

    private static String validateNotBlank(final String value, final String errorMessage) {
        final String normalized = Objects.requireNonNull(value, errorMessage).trim();

        if (normalized.isEmpty()) {
            throw new IllegalArgumentException(errorMessage);
        }
        return normalized;
    }
}// solucion
