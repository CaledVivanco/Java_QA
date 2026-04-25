package com.jcaa.usersmanagement.application.port.out;

import com.jcaa.usersmanagement.domain.model.UserModel;
import java.util.List;

public interface GetAllUsersPort {
  //List<UserModel> getAll();//Nombre poco expresivo (getAll) Muy genérico
  List<UserModel> findAll();//findAll() es estándar (Spring / Clean Code)

}
