import java.util.ArrayList;

public interface customerDAO {
	public void removeCustomer();
	public void listCustomer();
	public void payCheck() ;
	public Object getByID(int id);
	public Object deleteByID(int id);
	public void add(Object object);
	public  ArrayList<String> getAll();

	
}
