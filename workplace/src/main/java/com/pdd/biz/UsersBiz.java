package com.pdd.biz;

import com.pdd.entity.Users;

public interface UsersBiz {
  Users checkLogin(String username ,String password);
  int regedit(Users u);
  
}
