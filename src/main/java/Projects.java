import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {
	
	@Id
	private int projNo;
	private String projName;
	
	@ManyToMany(mappedBy="plist")
	List<Employee> elist=new ArrayList<Employee>();
	
	public int getProjNo() {
		return projNo;
	}
	public List<Employee> getElist() {
		return elist;
	}
	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}

	public void setProjNo(int projNo) {
		this.projNo = projNo;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	
	public Projects(int projNo) {
		super();
		this.projNo = projNo;
	}
	@Override
	public String toString() {
		return "Projects [projNo=" + projNo + ", projName=" + projName + "]";
	}
	public Projects(int projNo, String projName) {
		super();
		this.projNo = projNo;
		this.projName = projName;
		
	}
	public Projects() {
		super();
	}
	 
	

}
