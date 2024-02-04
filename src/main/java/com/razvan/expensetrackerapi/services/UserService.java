package com.razvan.expensetrackerapi.services;

import com.razvan.expensetrackerapi.domain.User;
import com.razvan.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
