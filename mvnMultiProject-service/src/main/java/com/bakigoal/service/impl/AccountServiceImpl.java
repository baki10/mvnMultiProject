package com.bakigoal.service.impl;

import com.bakigoal.dao.AccountRepository;
import com.bakigoal.model.Account;
import com.bakigoal.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

/**
 * Created by ilmir on 08.10.16.
 */
@Transactional
@Service
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService{

  @PostConstruct
  public void setEntityClass() {
    super.setEntityClass(Account.class);
  }

  @Autowired
  private AccountRepository accountRepository;

  @Override
  public Account findByEmail(String email) {
    return accountRepository.findByEmail(email);
  }
}
