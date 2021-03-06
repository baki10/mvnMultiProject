package com.bakigoal.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ilmir on 08.10.16.
 */
public interface BaseDao<E> {

  void save(E e);

  E load(Serializable id);

  List<E> getAll();

  void update(E e);

  void remove(Serializable id);
}
