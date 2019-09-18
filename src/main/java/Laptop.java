
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Override
	public String toString() {
		return "Laptop [code=" + code + ", brand=" + brand + ", price=" + price + "]";
	}
	@Id
	private int code;
	private String brand;
	private int price;
	
	@OneToOne(mappedBy="laptop")
	private Employee emp;
	
	public Laptop(int code, String brand, int price) {
		super();
		this.code = code;
		this.brand = brand;
		this.price = price;
	}
	public Laptop() {
		super();
	}
	
	public Laptop(int code) {
		super();
		this.code = code;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
}