package springmvc.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	
	public Product(Integer iD, String name, String desc, String price) {
		ID = iD;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer ID;
	
	@Column
	String name;
	
	@Column
	String desc;
	
	@Column
	String price;
	
}
