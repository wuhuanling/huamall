package com.huamall.biz;

import com.huamall.entity.Users;

public interface UsersBiz {
  Users checkLogin(String username ,String password);
  int regedit(Users u);

}
