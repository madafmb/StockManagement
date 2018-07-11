package io.altar.upacademy.repositories;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import io.altar.upacademy.model.Entity;


@Transactional
public abstract class EntityRepository<T extends Entity> {

@PersistenceContext(unitName="database")
protected EntityManager em;

protected List<T> localList;
 
	public List<T> getLocalList() {
		return localList;
	}

	public void addEntity(Entity T) {
		em.persist(T);
		updateLocalList();
		
	}
	
	public void editEntity(Entity T) {
		em.merge(T);
		
	}

	public void removeEntity (Entity T) {
		em.remove(em.merge(T));
	}
	// tem de se por o merge pq está detached
	
	public T getEntity (Class<T> entityClass, long id) {
		T object =em.find(entityClass, id);
		return object;
		
	}
	
	public abstract void updateLocalList();
	
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
//public List<T> getAll(Class<T> entityClass) {
//Query query = em.createQuery("Select table from " + entityClass.getName() + " table");
//return query.getResultList();
//}
//public List<T> listEntity(Class<T> entClass) {
//return localList;
//}
