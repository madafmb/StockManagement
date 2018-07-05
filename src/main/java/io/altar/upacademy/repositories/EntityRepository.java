package io.altar.upacademy.repositories;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import io.altar.upacademy.model.Entity;


public abstract class EntityRepository<T extends Entity> {
	
	
	
//	public void editEntity(Entity T) {
//		em.merge(T);
//	}
//
//	public void removeEntity (Entity T, long id) {
//		em.find(Entity.class, id);
//		em.remove(T);
//	}
//	
//	public void getEntity (Entity T, long id) {
//		em.find(Entity.class, id);
//		
//	}
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
	

