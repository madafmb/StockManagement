package io.altar.upacademy.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.RowEditEvent;

import io.altar.upacademy.control.ShelfControl;
import io.altar.upacademy.model.Shelf;


@Named("shelfBean")
@RequestScoped
public class ShelfBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject 
	private ShelfControl sc;
	private Shelf option;
	
	private Shelf shelf = new Shelf();
	
	public Shelf getShelf() {
		return shelf;
	}

	public void setShelf(Shelf s) {
		shelf = s ;
	}
	
	public String createShelf(Shelf s) {
		sc.criarShelf(s);
		return "index" + "? faces-redirect=true ";		
	}
	
	public Collection<Shelf> getAllShelf() {
		return sc.getShelf();	
	}
	public void onRowEdit(RowEditEvent editShelf) {

		FacesMessage msg = new FacesMessage("Shelf Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		Shelf s = (Shelf) editShelf.getObject();
    	sc.editarShelf(s);
	}


	public void onRowCancel(RowEditEvent editProduct) {
		FacesMessage msg = new FacesMessage("Edit Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void deleteShelf(Shelf s) {
		sc.removeShelf(s);
	}
	
	public Shelf getOption() {
        return option;
    }
 
    public void setOption(Shelf option) {
        this.option = option;
    }
    
    public void updateList() {
		sc.updateList();
	}

}
