package io.altar.upacademy.repositories;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.upacademy.model.Entity;


@Transactional
public abstract class EntityRepository<T extends Entity> {

@PersistenceContext(unitName="database")
private EntityManager em;
	
private Class<T> aClass;
private String className;

public EntityRepository(Class<T> aClass) {
	this.aClass=aClass;
	className=aClass.getSimpleName();
}
 
	public void addEntity(Entity T ) {
		em.persist(T);
	}
	

	public List<T> getAll(Class<T> entityClass) {
	     Query query = em.createQuery("from " + entityClass.getName());
	    return query.getResultList();
	}

	public void editEntity(Entity T) {
		em.merge(T);
	}

	public void removeEntity (long id) {
		em.find(aClass, id);
		em.remove(id);
	}
	
	public T getEntity (long id) {
		T e=em.find(aClass, id);
		return e;
		
	}
}



//private Map<Long,T> map = new HashMap<>();
//	
//	private long maiorID = 1;
//	
//
//	public Long addEntity(T entity) {
//		map.put(maiorID, entity);
//		entity.setId(maiorID);
//		return maiorID++;
//	}
//	
//	public Collection<T> getEntity() {
//		return map.values();
//
//	}
//	public T getEntity(long id) {
//		T entity = map.get(id);
//		return entity;
//	}
//	
//	public void editEntity(T entity) {
//		map.put(entity.getId(), entity);
//	}
//
//	public void removeEntity(long id) {
//		map.remove(id);
//	}
//	
//	public boolean isEmpty() {
//		if(map.size()==0) {
//			return true;
//		} else {
//			return false;
//		}
//		
//	}
	

