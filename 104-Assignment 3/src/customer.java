import java.util.ArrayList;
import java.util.List;

public class customer {
	private String id;
	private String surname;
	private String name;
	private String address;
	private String phoneNumber;
	private List<ArrayList<String>> order;
	
	public customer(String id,String name,String surname,String phoneNumber,String address) {
		this.setId(id);
		this.setSurname(surname);
		this.setName(name);
		this.setAddress(address);
		this.setPhoneNumber(phoneNumber);
	} 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<ArrayList<String>> getOrder() {
		return order;
	}
	public void setOrder(List<ArrayList<String>> list) {
		this.order = list;
	}




}







