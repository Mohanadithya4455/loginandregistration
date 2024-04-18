package com.security.service;

import com.security.model.User;

public interface UserService {
 public User AddUser(User user);
 public boolean checkEmail(String email);
 public void removeSessionMessage();
 public boolean IsValidName(String str);
 public boolean IsValidEmail(String str);
 public boolean IsValidPassword(String str);
}
