package io.altar.upacademy.model;


import java.util.ArrayList;



public class Product extends Entity{
	
	private ArrayList <Shelf> listaPrateleiras = new ArrayList<Shelf>() ; //Uma lista de prateleiras onde est� exposto

	private float produtoDesconto;
	
	private float produtoIVA;

	private float produtoPVP;
	
	private String produtoNome;

	public Product() {
		
	}


	public Product(String produtoNome,float produtoDesconto, float produtoIVA, float produtoPVP) {
		
		this.produtoNome=produtoNome;
		this.produtoDesconto = produtoDesconto;
		this.produtoIVA = produtoIVA;
		this.produtoPVP = produtoPVP;
	}

	
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
