package io.altar.upacademy.model;

import java.io.Serializable;

import javax.persistence.ManyToOne;
import javax.persistence.PreRemove;
import javax.persistence.Table;

@javax.persistence.Entity

@Table(name="Shelves")
public class Shelf extends Entity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int shelfCapacidade; //Capacidade
	
	@ManyToOne
	private Product  shelfProduto; // Produto que alberga
	private float shelfPreco; // Pre�o de aluguer de localiza��o diario
	

	
	public int getShelfCapacidade() {
		return shelfCapacidade;
	}
	public void setShelfCapacidade(int shelfCapacidade) {
		this.shelfCapacidade = shelfCapacidade;
	}
	public Product getShelfProduto() {
		return shelfProduto;
	}
	public void setShelfProduto(Product shelfProduto) {
		this.shelfProduto = shelfProduto;
	}
	public float getShelfPreco() {
		return shelfPreco;
	}
	public void setShelfPreco(float shelfPreco) {
		this.shelfPreco = shelfPreco;
	}


	@Override
    public boolean equals(Object other) {
        return (other instanceof Entity) && (id != null)
            ? id.equals(((Entity) other).id)
            : (other == this);
    }

    @Override
    public int hashCode() {
        return (id != null)
            ? (this.getClass().hashCode() + id.hashCode())
            : super.hashCode();
    }

    @Override
    public String toString() {
    	
    	Long productId = getShelfProduto() == null ? null : getShelfProduto().getId();
    	
        return " ID: " + productId;
    }

	@PreRemove
	public void preRemove() {
		if (shelfProduto != null) {
		shelfProduto.getListaPrateleiras().remove(this);
		}
	}
    
    
//	@Override
//	public String toString() {
//		
//		Long productId = getShelfProduto() == null ? null : getShelfProduto().getId();
//		
//		return "ID: " + getId() + "\t" +  " Capacidade: " + getShelfCapacidade() + "\t" +  " Preço: " + getShelfPreco() + " € "+ "\t" +  " Produto: " + productId;
//	}

}
