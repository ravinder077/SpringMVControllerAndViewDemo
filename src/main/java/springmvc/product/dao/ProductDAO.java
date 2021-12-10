package springmvc.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import springmvc.product.entity.Product;

@Component
public class ProductDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void createProduct(Product product)
	{
		this.hibernateTemplate.save(product);
	}
	
	public List<Product> getProduct()
	{
		List<Product> products=this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	public void delete(int pid)
	{
	   Product product=this.hibernateTemplate.load(Product.class,pid);
	   this.hibernateTemplate.delete(product);
	   
	}
	
	
	
	
	
	
}
