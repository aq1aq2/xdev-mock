package fsoft.xdev.mock.dao;

import java.util.List;
/**
 *
 * @author hant21
 */
public interface BaseDao<E> {

    /**
     * add new entity
     * @param entity
     * @return
     */
    boolean add(E entity);

    /**
     * edit entity profile
     * @param entity
     * @return
     */
    boolean edit(E entity);

    /**
     * delete entity 
     * @param entity
     * @return
     */
    boolean remove(E entity);

    /**
     * Find one entity 
     * @param entity
     * @return
     */
    E find(E entity);

    /**
     * find all List
     * @return
     */
    List<E> findAll();

    /**
     * Find all generic entity
     * @param from
     * @param to
     * @return
     */
    List<E> findRange(int from, int to);
    /**
     * get record number
     * @param from
     * @param to
     * @return
     */
    int count();
    
    
}


