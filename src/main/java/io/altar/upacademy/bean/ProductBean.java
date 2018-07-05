package io.altar.upacademy.bean;



import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.RowEditEvent;

import io.altar.upacademy.control.ProductControl;
import io.altar.upacademy.control.ShelfControl;
import io.altar.upacademy.model.Product;
import io.altar.upacademy.model.Shelf;


@Named("productBean")
@RequestScoped

public class ProductBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8688108795492111459L;


	@Inject 
	private ProductControl pc;



	private Product product = new Product();
	private Product option;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product p) {
		product = p;
	}


	public String createProduct(Product p) {
		pc.criarProduto(p);

		return "index" + "? faces-redirect=true ";	
	}
//
//	public Collection<Product> getAllProduct() {
//		return pc.getProduto();	
//	}
//
//	public void onRowEdit(RowEditEvent editProduct) {
//
//		FacesMessage msg = new FacesMessage("Product Edited");
//		FacesContext.getCurrentInstance().addMessage(null, msg);
//	}
//
//
//	public void onRowCancel(RowEditEvent editProduct) {
//		FacesMessage msg = new FacesMessage("Edit Cancelled");
//		FacesContext.getCurrentInstance().addMessage(null, msg);
//	}
//
//	public void deleteProduct(Product p) {
//		pc.removeProduto(p.getId());
//	}
//	
//
//    public Product getOption() {
//        return option;
//    }
// 
//    public void setOption(Product option) {
//        this.option = option;
//    }
//    
//    public String addShelf(Product p, Shelf s) {
//    	
//    	if(p.getListaPrateleiras().contains(s)) { return "index"; }
//    	if (s.getShelfProduto()!=null) {
//    		Product tempProduct= s.getShelfProduto();
//    		tempProduct.getListaPrateleiras().remove(s);
//    	}
//    	
//    		
//    	p.addToShelfList(s);
//    	s.setShelfProduto(p);
//    	pc.editarProduto(p);    
//       
//    	
//    	return "index" + "? faces-redirect=true ";	
//    	
//    	
//    }
       

    
   
 
	
}
