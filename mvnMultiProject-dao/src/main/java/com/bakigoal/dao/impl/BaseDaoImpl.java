package com.bakigoal.dao.impl;

import com.bakigoal.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ilmir on 08.10.16.
 */
public class BaseDaoImpl<E> implements BaseDao<E> {

  private Class entityClass;

  public void setEntityClass(Class entityClass) {
    this.entityClass = entityClass;
  }

  public BaseDaoImpl(Class entityClass) {
    setEntityClass(entityClass);
  }

  @Autowired
  private SessionFactory sessionFactory;

  protected Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  @Override
  public void save(E e) {
    getSession().save(e);
  }

  @Override
  public E load(Serializable id) {
    return (E) getSession().load(entityClass, id);
  }

  @Override
  public List<E> getAll() {
    return getSession().createQuery("from " + entityClass.getSimpleName(), entityClass).list();
  }

  @Override
  public void update(E e) {
    getSession().update(e);
  }

  @Override
  public void remove(Serializable id) {
    Object o = getSession().get(entityClass, id);
    if (o == null) {
      return;
    }
    getSession().remove(o);
  }
}
