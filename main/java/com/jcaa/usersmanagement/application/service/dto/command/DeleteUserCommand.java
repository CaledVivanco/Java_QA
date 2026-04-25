package com.jcaa.usersmanagement.application.service.dto.command;

import jakarta.validation.constraints.NotBlank;

//public record DeleteUserCommand(
// Uso innecesario de message   @NotBlank(message = "id must not be blank") String id
//) {
//
//}
public record DeleteUserCommand(
        @NotBlank String id
) {}