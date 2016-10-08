package com.bakigoal.dao;

import com.bakigoal.model.Account;

/**
 * Created by ilmir on 08.10.16.
 */
public interface AccountRepository extends BaseDao<Account> {

  Account findByEmail(String email);
}
