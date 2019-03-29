import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;







public class Main {
	public static String TakeOrder(List<ArrayList<String>> list)
{     
    StringBuilder builder = new StringBuilder(list.size());
    for(ArrayList<String> ch: list)
    {
        builder.append(ch); 
    }
    return builder.toString().replace("[","").replace("]"," ").replace(",",""); 
}
	
	 
	public static ArrayList<Integer> orderIndex12 = new ArrayList();
	
	public static void main(String[] args) throws IOException {
		PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
		System.setOut(out);
		ArrayList<Integer> orderID = new ArrayList();
		
		customerDaoImp x = new customerDaoImp();
		x.readCustomer();
		
		ReadOrder orderList = new ReadOrder();
		ReadInput inputList = new ReadInput(args[0]);
		for(int m = 0;m<ReadOrder.orderList.size();m++) {
	    	if(ReadOrder.orderList.get(m).get(0).equals("Order:")){
	    		orderIndex12.add(m);
	    		
	    		
	    	}
	    }
	for(int i = 0;i<ReadInput.inputList.size();i++) {
		if(ReadInput.inputList.get(i).get(0).equals("PayCheck")) {
			
			List<ArrayList<String>> partOrder = new ArrayList();
			System.out.println("Pay Check for order"+" "+ReadInput.inputList.get(i).get(1));
			int a = Integer.parseInt(ReadInput.inputList.get(i).get(1));
			try {
				partOrder = ReadOrder.orderList.subList(Main.orderIndex12.get(a-1)+1, Main.orderIndex12.get(a));
				for(int l = 0;l<partOrder.size();l++) {
					for(int m = 1;m<partOrder.get(l).size();m++) {
					if(partOrder.get(l).get(0).startsWith("A")){
						AmericanPan american = new AmericanPan();
						System.out.print("AmericanPanPizza");
						if(partOrder.get(l).get(m).startsWith("Salam")) {
							american.addTopping(new Salami());
							System.out.print(" salami");
							}
						else if(partOrder.get(l).get(m).startsWith("H")) {
							american.addTopping(new HotPepper());
							System.out.println(" pepper");
						}
						else if(partOrder.get(l).get(m).startsWith("O")) {
							american.addTopping(new Onion());
							System.out.print(" onion");
						}
						else if(partOrder.get(l).get(m).startsWith("Soud")) {
							american.addTopping(new Soudjuk());
							System.out.print(" soudjuk ");
						}
						else if(partOrder.get(l).get(m).startsWith("soft")) {
							american.addDrink();
						}
						System.out.println(american.cost()+"$");
						
					}
					
					
				}
					for(int m = 1;m<partOrder.get(l).size();m++) {
						if(partOrder.get(l).get(0).startsWith("N")){
							Neapolitan napolitan = new Neapolitan();
							System.out.print("NapolitaPizza");
							if(partOrder.get(l).get(m).startsWith("Salam")) {
								napolitan.addTopping(new Salami());
								System.out.print(" salami ");
								}
							else if(partOrder.get(l).get(m).startsWith("H")) {
								napolitan.addTopping(new HotPepper());
								System.out.println(" pepper ");
							}
							else if(partOrder.get(l).get(m).startsWith("O")) {
								napolitan.addTopping(new Onion());
								System.out.print(" onion ");
							}
							else if(partOrder.get(l).get(m).startsWith("Soud")) {
								napolitan.addTopping(new Soudjuk());
								System.out.print(" soudjuk ");
							}
							else if(partOrder.get(l).get(m).startsWith("soft")) {
								napolitan.addDrink();
							}
							System.out.println(napolitan.cost()+"$");
							
						}
					}
					
					
				}
			
			}

			catch(IndexOutOfBoundsException e){
				partOrder = ReadOrder.orderList.subList(Main.orderIndex12.get(a-1)+1, ReadOrder.orderList.size());
				for(int l = 0;l<partOrder.size();l++) {
					for(int m = 1;m<partOrder.get(l).size();m++) {
					if(partOrder.get(l).get(0).startsWith("A")){
						AmericanPan american = new AmericanPan();
						System.out.print("AmericanPanPizza");
						if(partOrder.get(l).get(m).startsWith("Salam")) {
							american.addTopping(new Salami());
							System.out.print(" salami");
							}
						else if(partOrder.get(l).get(m).startsWith("H")) {
							american.addTopping(new HotPepper());
							System.out.println(" pepper");
						}
						else if(partOrder.get(l).get(m).startsWith("O")) {
							american.addTopping(new Onion());
							System.out.print(" onion");
						}
						else if(partOrder.get(l).get(m).startsWith("Soud")) {
							american.addTopping(new Soudjuk());
							System.out.print(" soudjuk ");
						}
						else if(partOrder.get(l).get(m).startsWith("soft")) {
							american.addDrink();
						}
						System.out.println(american.cost()+"$");
						
					}
					
					
				}
					for(int m = 1;m<partOrder.get(l).size();m++) {
						if(partOrder.get(l).get(0).startsWith("N")){
							Neapolitan napolitan = new Neapolitan();
							System.out.print("NapolitaPizza");
							if(partOrder.get(l).get(m).startsWith("Salam")) {
								napolitan.addTopping(new Salami());
								System.out.print(" salami ");
								}
							else if(partOrder.get(l).get(m).startsWith("H")) {
								napolitan.addTopping(new HotPepper());
								System.out.println(" pepper ");
							}
							else if(partOrder.get(l).get(m).startsWith("O")) {
								napolitan.addTopping(new Onion());
								System.out.print(" onion ");
							}
							else if(partOrder.get(l).get(m).startsWith("Soud")) {
								napolitan.addTopping(new Soudjuk());
								System.out.print(" soudjuk ");
							}
							else if(partOrder.get(l).get(m).startsWith("soft")) {
								napolitan.addDrink();
							}
							System.out.println(napolitan.cost()+"$");
							
						}
					}
					
					
				}
			}
			
			
		}
	}
		
		
	
		
		order orderId = new order();
		
		for(int t =1;t<orderIndex12.size()+1;t++) {
			orderId.orderID.add(t);
		}
		
		
		
		
		
		
		int p = 0;
		while(orderIndex12.size()>p) {
			try {
			order.idReturner(ReadOrder.orderList.get(orderIndex12.get(p)).get(2)).setOrder(ReadOrder.orderList.subList(orderIndex12.get(p)+1, orderIndex12.get(p+1)));

			p++;
			}
			catch (Exception e) {
				order.idReturner(ReadOrder.orderList.get(orderIndex12.get(p)).get(2)).setOrder(ReadOrder.orderList.subList(orderIndex12.get(p)+1,ReadOrder.orderList.size()));
				
				break;
			}
			
		}
		
		

		
		
		}
	
	
}

