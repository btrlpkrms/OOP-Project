import java.util.ArrayList;

public class order {
	static customer obje;
	public ArrayList<Integer> orderID = new ArrayList();
	
	public static customer idReturner(String id){
		
		for(int i = 0;i<customerDaoImp.customerObjectArray.size();i++) { 
			if(id.equals(customerDaoImp.customerObjectArray.get(i).getId())) {
 
				 return customerDaoImp.customerObjectArray.get(i);
			}
		}
		
		return null;
	}




}



