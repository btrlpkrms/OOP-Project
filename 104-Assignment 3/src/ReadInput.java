import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadInput {
	private static Scanner file;
    static int rows;
    public static ArrayList<ArrayList<String>> inputList = new ArrayList<ArrayList<String>>();
	ReadInput(String args) throws FileNotFoundException{
		file = new Scanner(new File(args)); 
		while (file.hasNextLine()) {
			ArrayList<String> line = new ArrayList<String>();     
	        final String nextLine = file.nextLine();
	        final String[] items = nextLine.split(" ");
	        for (int i = 0; i < items.length; i++) {
	            line.add(items[i]);
	        }
	        inputList.add(line);
	        rows++;
	        Arrays.fill(items, null);
	    }
		
		for(int i = 0;i<inputList.size();i++) {
				if(inputList.get(i).get(0).equals("AddCustomer")) {
					customer c = new customer(inputList.get(i).get(1), inputList.get(i).get(2), inputList.get(i).get(3), inputList.get(i).get(4),customerDaoImp.TakeAdress(inputList.get(i).subList(4, inputList.get(i).size()-1)));
					customerDaoImp.add(c);
					System.out.println("Customer"+" "+c.getId()+" "+c.getName()+" "+"added.");
				}
				else if(inputList.get(i).get(0).equals("RemoveCustomer")) {
					for(int k = 0;k<customerDaoImp.customerObjectArray.size();k++){
						if(order.idReturner(inputList.get(i).get(1)) == customerDaoImp.customerObjectArray.get(k)) {
							customerDaoImp.removeCustomer(k);
							System.out.println("Customer"+" "+customerDaoImp.customerObjectArray.get(k).getId()+" "+customerDaoImp.customerObjectArray.get(k).getName()+" "+"removed.");
						}
					}
					
					
				}
				else if(inputList.get(i).get(0).equals("CreateOrder")) {
					ArrayList<String> temp = new ArrayList();
					temp.add("Order:");
					temp.add(inputList.get(i).get(1));
					temp.add(inputList.get(i).get(2));
					ReadOrder.orderList.add(temp);
					System.out.println("Order"+" "+inputList.get(i).get(1)+" created.");
					
					
					
				}
				else if(inputList.get(i).get(0).equals("AddPizza")) {
					ArrayList<String> temp1 = new ArrayList();
					String s = "";
					for(int m=2;m<inputList.get(i).size();m++) {
						temp1.add(inputList.get(i).get(m));
					}
					ReadOrder.orderList.add(temp1);
					 System.out.println(inputList.get(i).get(2)+" pizza added to order "+inputList.get(i).get(1));
					
				}
				else if(inputList.get(i).get(0).equals("AddDrink")) {
					ArrayList<String> temp2 = new ArrayList();
					temp2.add("softdrink");
					ReadOrder.orderList.add(temp2);
					System.out.println("Drink added to order "+inputList.get(i).get(1));
					
					
				}
				
				else if(inputList.get(i).get(0).equals("List")) {
					customerDaoImp o = new customerDaoImp();
					o.getAll();
					
				}
			
		}
	   
	}

}
        


    


