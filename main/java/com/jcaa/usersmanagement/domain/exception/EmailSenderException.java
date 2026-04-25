//package com.jcaa.usersmanagement.domain.exception;
//
//public final class EmailSenderException extends DomainException {
//
//  // VIOLACIÓN Regla 9 (Clean Code): constructores public en una excepción que debería usar
//  // factory methods con constructores privados para controlar cómo se instancia.
//  // Así cualquier clase puede crear excepciones con mensajes arbitrarios.
//  public EmailSenderException(final String message) {
//    super(message);
//  }
//
//  public EmailSenderException(final String message, final Throwable cause) {
//    super(message, cause);
//  }
//
//  public static EmailSenderException becauseSmtpFailed(
//      final String destinationEmail, final String smtpError) {
//    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
//    return new EmailSenderException(
//        String.format("No se pudo enviar el correo a '%s'. Error SMTP: %s", destinationEmail, smtpError));
//  }
//
//  public static EmailSenderException becauseSendFailed(final Throwable cause) {
//    // VIOLACIÓN Regla 10: texto hardcodeado directamente — debe ser una constante.
//    return new EmailSenderException("La notificación por correo no pudo ser enviada.", cause);
//  }
//}
package com.jcaa.usersmanagement.domain.exception;

public final class EmailSenderException extends DomainException {

    private static final String SMTP_FAILED_MESSAGE =
            "No se pudo enviar el correo a '%s'. Error SMTP: %s";

    private static final String SEND_FAILED_MESSAGE =
            "La notificación por correo no pudo ser enviada.";

    private EmailSenderException(final String message) {
        super(message);
    }

    private EmailSenderException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public static EmailSenderException becauseSmtpFailed(
            final String destinationEmail, final String smtpError) {

        return new EmailSenderException(
                String.format(SMTP_FAILED_MESSAGE, destinationEmail, smtpError));
    }

    public static EmailSenderException becauseSendFailed(final Throwable cause) {
        return new EmailSenderException(SEND_FAILED_MESSAGE, cause);
    }
} // solucion
