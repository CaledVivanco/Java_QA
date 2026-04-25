package com.jcaa.usersmanagement.application.port.in;

import com.jcaa.usersmanagement.domain.model.UserModel;
import java.util.List;

public interface GetAllUsersUseCase {
  //List<UserModel> execute();//problema
    //solucion
  public record UserResponse(
          String id,
          String name,
          String email,
          String role
  )
}
