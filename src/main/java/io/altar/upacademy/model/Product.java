package io.altar.upacademy.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@javax.persistence.Entity

public class Product extends Entity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "shelfProduto", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
	//MERGE = Realiza a operação merge em cascata. Quando o MERGE é executado, ele também persiste os filhos caso eles ainda não tenham sido persistidos.
	//REFRESH não salva, mas atualiza a entidade com as informações do banco.
	//Persist - realiza a operação de persist em cada cascata.
//	Oposto ao Lazy Loading, o Eager Loading carrega os dados mesmo que você não vá utilizá-los, mas é óbvio que você só utilizará esta técnica se de fato você for precisar com muita frequência dos dados carregados.
	
	private List <Shelf> listaPrateleiras = new ArrayList<Shelf>() ;

	private float produtoDesconto;
	
	private float produtoIVA;

	private float produtoPVP;
	 
	private String produtoNome;

	
	public List<Shelf> getListaPrateleiras() {
		return listaPrateleiras;
	}

	public void setListaPrateleiras(List<Shelf> listaPrateleiras) {
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
