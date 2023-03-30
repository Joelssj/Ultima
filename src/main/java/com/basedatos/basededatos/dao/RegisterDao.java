package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.RegisterModel;
import com.basedatos.basededatos.models.UserModel;

import java.util.List;

public interface RegisterDao {

    List<RegisterModel> getAll();

    RegisterModel get( long id);

    RegisterModel register( RegisterModel registerModel);

    RegisterModel update( RegisterModel registerModel);

    void delete(  long id);

}
