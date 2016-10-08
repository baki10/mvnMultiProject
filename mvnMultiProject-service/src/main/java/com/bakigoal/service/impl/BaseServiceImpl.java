package com.bakigoal.service.impl;

import com.bakigoal.dao.SimpleDao;
import com.bakigoal.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ilmir on 08.10.16.
 */
@Transactional
@Service
public abstract class BaseServiceImpl<E> implements BaseService<E> {

  @Autowired
  private SimpleDao simpleDao;

  public void setEntityClass(Class entityClass) {
    simpleDao.setEntityClass(entityClass);
  }

  @Override
  public void save(E e) {
    simpleDao.save(e);
  }

  @Override
  public E load(Serializable id) {
    return (E) simpleDao.load(id);
  }

  @Override
  public List<E> getAll() {
    return (List<E>) simpleDao.getAll();
  }

  @Override
  public void update(E e) {
    simpleDao.update(e);
  }

  @Override
  public void remove(Serializable id) {
    simpleDao.remove(id);
  }
}
