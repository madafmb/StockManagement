package io.altar.upacademy.model;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Entity  {

	@Id
	@GeneratedValue
	protected Long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
