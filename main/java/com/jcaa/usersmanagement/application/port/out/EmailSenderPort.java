package com.jcaa.usersmanagement.application.port.out;

import com.jcaa.usersmanagement.domain.model.EmailDestinationModel;

public interface EmailSenderPort {
 // void send(EmailDestinationModel destination);//Estás usando un Model del dominio (EmailDestinationModel) Eso puede acoplar capas innecesariamente
 void send(String to, String subject, String body);

}
