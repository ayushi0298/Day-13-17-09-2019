

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vehicles {
	@Id
	private int regno;
	private String brand;
	private String model;
	private int price;
	
	@ManyToOne
	private Employee emp;

	public int getRegno() {
		return regno;
	}

	public Vehicles(int regno) {
		super();
		this.regno = regno;
	}

	public Vehicles(int regno, String brand, String model, int price, Employee emp) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.emp = emp;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Vehicles(int regno, String brand, String model, int price) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public Vehicles() {
		super();
	}

	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}

}
