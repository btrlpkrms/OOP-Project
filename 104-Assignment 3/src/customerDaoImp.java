import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class customerDaoImp implements customerDAO {
	
	public static ArrayList<customer> customerObjectArray = new ArrayList<customer>();
	private static Scanner file;
    static int rows;
    	public static void readCustomer() throws FileNotFoundException {
		ArrayList<ArrayList<String>> customerList = new ArrayList<ArrayList<String>>();
	    file = new Scanner(new File("customer.txt"));
	    
	    while (file.hasNextLine()) {
	        ArrayList<String> line = new ArrayList<String>();
	        final String nextLine = file.nextLine();
	        final String[] items = nextLine.split(" ");

	        for (int i = 0; i < items.length; i++)  {
	            line.add(items[i]);
	        }

	        customerList.add(line);
	        rows++;
	        Arrays.fill(items, null);
	    }

	    int col = customerList.get(0).size();
	    int j = 0;

	    for (int i = 0; i < rows; i++) {
	    		customer c = new customer(customerList.get(i).get(j), customerList.get(i).get(j+1),customerList.get(i).get(j+2),customerList.get(i).get(j+3), TakeAdress(customerList.get(i).subList(5, customerList.get(i).size())));
	            customerObjectArray.add(c);
	           }
	    
    	}
public static String TakeAdress(java.util.List<String> list) {
	String listString = "";

	for (String s : list)
	{
	    listString += s + " ";
	}

	return listString;
	
}
	public static void removeCustomer(int k) {
		customerDaoImp.customerObjectArray.remove(k);
	}

	public void listCustomer() {


	}

	public void createOrder() {


	}

	public static void payCheck(order order) {
		for(int y = 0;y<customerDaoImp.customerObjectArray.size();y++) {
			if(customerDaoImp.customerObjectArray.get(y).getOrder().get(0).get(0).startsWith("A")) {
				
				
			}
			else if(customerDaoImp.customerObjectArray.get(y).getOrder().get(0).get(0).startsWith("N")) {
				
			}
			else if(customerDaoImp.customerObjectArray.get(y).getOrder().get(0).get(0).startsWith("s")) {
				
			}
		}

	}

	public Object getByID(int id) {

		return null;
	}

	public Object deleteByID(int id) {

		return null;
	}

	public static void add(customer object) {
		customerDaoImp.customerObjectArray.add(object);

	}
	
	public ArrayList<String> getAll() {
		for (int i = 0; i < customerDaoImp.customerObjectArray.size(); i++) { 
//				if(Integer.parseInt(customerDaoImp.customerObjectArray.get(i).getId()) <  Integer.parseInt(customerDaoImp.customerObjectArray.get(i+1).getId())) {
//					customer x = new customer(customerDaoImp.customerObjectArray.get(i).getId(), customerDaoImp.customerObjectArray.get(i).getName(), customerDaoImp.customerObjectArray.get(i).getSurname(), customerDaoImp.customerObjectArray.get(i).getPhoneNumber(), customerDaoImp.customerObjectArray.get(i).getAddress());
//					customerDaoImp.customerObjectArray.set(i, customerDaoImp.customerObjectArray.get(i+1));
//					customerDaoImp.customerObjectArray.set(i+1, x);
//				}
				
			
			
			System.out.println(customerDaoImp.customerObjectArray.get(i).getId()+ " " + customerDaoImp.customerObjectArray.get(i).getName()+ " " + customerDaoImp.customerObjectArray.get(i).getSurname()+ " " + customerDaoImp.customerObjectArray.get(i).getPhoneNumber()+ " " + customerDaoImp.customerObjectArray.get(i).getAddress());
        }
		
		return null;
	}
	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeCustomer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void payCheck() {
		// TODO Auto-generated method stub
		
	}

}
