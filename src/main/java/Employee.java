
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Employee {
	
	public Employee(int eno) {
		super();
		this.eno = eno;
	}
	@Id
	private int eno;
	private String ename;
	private int sal;
	
	@OneToOne//(fetch=FetchType.LAZY)
	private Laptop laptop;
	
	public List<Vehicles> getVlist() {
		return vlist;
	}
	public void setVlist(List<Vehicles> vlist) {
		this.vlist = vlist;
	}
	public List<Projects> getPlist() {
		return plist;
	}
	public void setPlist(List<Projects> plist) {
		this.plist = plist;
	}
	@OneToMany(mappedBy="emp")
	List<Vehicles> vlist=new  ArrayList<Vehicles>();

	@ManyToMany
	List<Projects> plist=new  ArrayList<Projects>();
	public Employee(int eno, String ename, int sal, Laptop laptop) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employee(int eno, String ename, int sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", laptop=" + laptop + "]";
	}
	
	

}