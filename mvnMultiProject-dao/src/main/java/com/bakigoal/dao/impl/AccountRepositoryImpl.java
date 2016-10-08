package com.bakigoal.dao.impl;

import com.bakigoal.dao.AccountRepository;
import com.bakigoal.model.Account;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ilmir on 08.10.16.
 */
@Repository
public class AccountRepositoryImpl extends BaseDaoImpl<Account> implements AccountRepository {

  public AccountRepositoryImpl() {
    super(Account.class);
  }

  public Account findByEmail(String email) {
    Query<Account> query = getSession().createQuery("from Account a where a.email = :email", Account.class);
    query.setParameter("email", email);
    List<Account> accounts = query.list();
    return accounts != null && !accounts.isEmpty() ? accounts.get(0) : null;
  }
}
