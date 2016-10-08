package com.bakigoal.dao;

/**
 * Created by ilmir on 08.10.16.
 */
public interface SimpleDao extends BaseDao<Object> {

  void setEntityClass(Class entityClass);

}
