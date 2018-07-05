package io.altar.upacademy.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.altar.upacademy.model.Entity;



public abstract class EntityRepository<T extends Entity> {

private Map<Long,T> map = new HashMap<>();
	
	private long maiorID = 1;
	

	public Long addEntity(T entity) {
		map.put(maiorID, entity);
		entity.setId(maiorID);
		return maiorID++;
	}
	
	public Collection<T> getEntity() {
		return map.values();

	}
	public T getEntity(long id) {
		T entity = map.get(id);
		return entity;
	}
	
	public void editEntity(T entity) {
		map.put(entity.getId(), entity);
	}

	public void removeEntity(long id) {
		map.remove(id);
	}
	
	
	
	
	public boolean isEmpty() {
		if(map.size()==0) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
