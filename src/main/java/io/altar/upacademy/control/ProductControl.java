package io.altar.upacademy.control;




import javax.enterprise.context.RequestScoped;



import io.altar.upacademy.model.Product;
import io.altar.upacademy.model.Shelf;
import io.altar.upacademy.repositories.EntityRepository;
import io.altar.upacademy.repositories.ProductRepository;
import java.io.Serializable;
import java.util.Collection;

@RequestScoped
public class ProductControl implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final EntityRepository<Product> dbp = ProductRepository.getInstance();
	
	
	public void criarProduto(Product p) {
		
		dbp.addEntity(p);
	
	}
	
	
	public void editarProduto(Product p) {
		dbp.editEntity(p);
		
	}
	
	public static Product getProduto(long id) {
		Product p= dbp.getEntity(id);
		return p;
	}
	
	public  void removeProduto(long id) {

		Product p = ProductControl.getProduto(id);
		if(p.getListaPrateleiras()!=null){
			
			for(Shelf s: p.getListaPrateleiras()) {
				s.setShelfProduto(null);
			}
		}
		
		dbp.removeEntity(id);
	}
	
	public  Collection<Product> getProduto() {
		return dbp.getEntity();
		
	}
	
	
	
}
