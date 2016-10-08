package com.bakigoal.service;

import com.bakigoal.model.Account;

/**
 * Created by ilmir on 08.10.16.
 */
public interface AccountService extends BaseService<Account>{

  Account findByEmail(String email);
}
