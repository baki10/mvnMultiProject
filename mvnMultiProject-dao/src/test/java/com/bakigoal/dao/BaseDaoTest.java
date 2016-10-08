package com.bakigoal.dao;

import com.bakigoal.model.Account;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ilmir on 08.10.16.
 */
public class BaseDaoTest extends TestCase {

  public void testDao() {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
    AccountRepository accountRepository = context.getBean(AccountRepository.class);

    Account account = new Account("ilmirbakirov@gmail.com", "pswd", "ADMIN_ROLE");
    accountRepository.save(account);

    account = accountRepository.findByEmail("ilmirbakirov@gmail.com");

    System.out.println(account);

    account.setRole("USER_ROLE");
    accountRepository.update(account);

    Account newAccount = new Account("killmasher@mail.ru", "pass", "USER_ROLE");
    accountRepository.save(newAccount);

    accountRepository.getAll().forEach(System.out::println);
  }

}