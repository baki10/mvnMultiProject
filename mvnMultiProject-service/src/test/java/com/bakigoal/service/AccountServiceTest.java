package com.bakigoal.service;

import com.bakigoal.model.Account;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ilmir on 08.10.16.
 */
public class AccountServiceTest extends TestCase {

  public void testService() throws Exception {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-dao.xml", "applicationContext-service.xml");
    AccountService accountService = context.getBean(AccountService.class);

    System.out.println("-------------------Service Test Starts---------------------");
    System.out.println("Adding accounts:");
    for (int i = 0; i < 3; i++) {
      Account account = new Account("email " + i, "pswd " + i, i % 2 == 0 ? "USER_ROLE" : "ADMIN_ROLE");
      System.out.println("--adding: " + account);
      accountService.save(account);
    }

    System.out.println("All:");
    accountService.getAll().forEach(System.out::println);

    System.out.println("FindByEmail:");
    Account account = accountService.findByEmail("email 2");
    System.out.println(account);

    System.out.println("Update:");
    account.setEmail("Updated email");
    accountService.update(account);
    accountService.getAll().forEach(System.out::println);

    System.out.println("Remove:");
    accountService.remove(account.getId());
    accountService.getAll().forEach(System.out::println);

    System.out.println("-----------------------------------------------------------");
  }

}