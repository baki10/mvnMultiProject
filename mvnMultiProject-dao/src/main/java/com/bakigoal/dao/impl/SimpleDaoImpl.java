package com.bakigoal.dao.impl;

import com.bakigoal.dao.SimpleDao;
import org.springframework.stereotype.Repository;

/**
 * Created by ilmir on 08.10.16.
 */
@Repository
public class SimpleDaoImpl extends BaseDaoImpl<Object> implements SimpleDao {

  public SimpleDaoImpl() {
    super(null);
  }
}
