import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadOrder {
	private static Scanner file;
    static int rows;

	public static ArrayList<ArrayList<String>> orderList = new ArrayList<ArrayList<String>>();
	public static ArrayList<Integer> orderIndex = new ArrayList<Integer>(); 
	ReadOrder() throws FileNotFoundException{
	    file = new Scanner(new File("order.txt"));
	    
	    while (file.hasNextLine()) {

	        ArrayList<String> line = new ArrayList<String>(); 
	        
	        final String nextLine = file.nextLine();
	        final String[] items = nextLine.split(" ");
	        for (int i = 0; i < items.length; i++) { 
	            line.add(items[i]);
	        }

	        orderList.add(line);
	        rows++;
	        Arrays.fill(items, null);
	    }
	    for(int m = 0;m<orderList.size();m++) {
	    	if(orderList.get(m).get(0).equals("Order:")){
	    		orderIndex.add(m);
	    		
	    		
	    	}
	    }

	   }
	  
	}


