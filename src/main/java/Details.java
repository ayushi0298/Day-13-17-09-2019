import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Details {
	SessionFactory sf = Util.getSF();

	public void insertProjects(Projects project) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(project);
		tr.commit();
		session.close();
	}

	public void insertVehicles(Vehicles vehicle) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		session.save(vehicle);
		tr.commit();
		session.close();
	}

	public void insertLaptop(Laptop laptop) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		session.save(laptop);
		tr.commit();
		session.close();

	}

	public void insertEmployee(Employee emp) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		session.save(emp);
		tr.commit();
		session.close();

	}

	public static void main(String[] args) {

		Details dt = new Details();
        //LAPTOP ENTRY
		Laptop l1 = new Laptop(100, "DELL", 20000);
		Laptop l2 = new Laptop(200, "HP", 30000);
		Laptop l3 = new Laptop(300, "LENOVO", 40000);
		/*
		 * dt.insertLaptop(l1); dt.insertLaptop(l2); dt.insertLaptop(l3);
		 */
        //PROJECTS ENTRY
		Projects p1 = new Projects(101, "ABC");
		Projects p2 = new Projects(201, "DEF");
		Projects p3 = new Projects(301, "GHI");

		/* dt.insertProjects(p1); dt.insertProjects(p2); dt.insertProjects(p3); */
		 //EMPLOYEES ENTRY
		Employee e1 = new Employee(10, "Ayushi", 100000, new Laptop(100));
		e1.getPlist().add(new Projects(101));
		e1.getPlist().add(new Projects(201));
		e1.getPlist().add(new Projects(301));

		Employee e2 = new Employee(20, "Adil", 200000, new Laptop(300));
		e2.getPlist().add(new Projects(101));
		e2.getPlist().add(new Projects(201));

		/*
		 * dt.insertEmployee(e1); dt.insertEmployee(e2);
		 */
        //VEHICLES ENTRY
		Vehicles v1 = new Vehicles(101, "ABC", "DEF", 10000, new Employee(10));
		Vehicles v2 = new Vehicles(201, "GEH", "IJK", 20000,new Employee(20));
		Vehicles v3 = new Vehicles(301, "LMN", "OPQ", 40000,new Employee(10));
		dt.insertVehicles(v1);
		dt.insertVehicles(v2);
		dt.insertVehicles(v3);

	}
}