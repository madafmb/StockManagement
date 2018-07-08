package io.altar.upacademy.model;


import java.io.Serializable;
import java.util.ArrayList;

@javax.persistence.Entity
public class Product extends Entity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList <Shelf> listaPrateleiras = new ArrayList<Shelf>() ;

	private float produtoDesconto;
	
	private float produtoIVA;

	private float produtoPVP;
	 
	private String produtoNome;

	
	public ArrayList<Shelf> getListaPrateleiras() {
		return listaPrateleiras;
	}

	public void setListaPrateleiras(ArrayList<Shelf> listaPrateleiras) {
		this.listaPrateleiras = listaPrateleiras;
	}

	public void addToShelfList(Shelf s) {
		listaPrateleiras.add(s);
	}


	public float getProdutoDesconto() {
		return produtoDesconto;
	}

	public void setProdutoDesconto(float produtoDesconto) {
		
		this.produtoDesconto = produtoDesconto;
	}

	public float getProdutoIVA() {
		return produtoIVA;
	}

	public void setProdutoIVA(float produtoIVA) {
		this.produtoIVA = produtoIVA;
	}

	public float getProdutoPVP() {
		return produtoPVP;
	}

	public void setProdutoPVP(float produtoPVP) {
		this.produtoPVP = produtoPVP;
	}
	
	public String getProdutoNome() {
		return produtoNome;
	}

	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
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
    	String prateleiras="";
		for(Shelf s: listaPrateleiras) {
			prateleiras +=s.id  + " ";
			
			}
		
		return "ID: " + prateleiras; 
	
}
}
