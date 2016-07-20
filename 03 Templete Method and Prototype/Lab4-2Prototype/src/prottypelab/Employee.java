package prottypelab;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String Lastname;
	private String Firstname;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	private Employee supervisor;
	private Employee staff[];

	public Employee() {

	}

	public Employee(int id, String Firstname, String Lastname, String streetAddress, String city, String state,
			String zipcode, Employee supervisor, Employee[] staff) {
		super();
		this.id = id;
		this.Lastname = Lastname;
		this.Firstname = Firstname;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.supervisor = supervisor;
		this.staff = staff;
	}

	public Employee(Employee employee) {
		super();
		this.id = employee.id;
		this.Lastname = employee.Lastname;
		this.Firstname = employee.Firstname;
		this.streetAddress = employee.streetAddress;
		this.city = employee.city;
		this.state = employee.state;
		this.zipcode = employee.zipcode;
		this.supervisor = employee.supervisor;
		this.staff = employee.staff;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String Firstname) {
		this.Firstname = Firstname;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public Employee[] getStaff() {
		return staff;
	}

	public void setStaff(Employee[] staff) {
		this.staff = staff;
	}

	@Override
	protected Object clone() {
		Object employee;
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream;
		try {
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			objectOutputStream.writeObject(this);
			objectOutputStream.flush();
			objectOutputStream.close();
			byteArrayOutputStream.close();
			byte[] byteData = byteArrayOutputStream.toByteArray();

			// Restore your class from a stream of bytes:
			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteData);
			employee = new ObjectInputStream(byteArrayInputStream).readObject();
			return employee;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString() {
		String printData = "\n\nEmployee [id=" + id + ", firstname=" + Firstname + ", Lastname=" + Lastname
				+ ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ",  \n\nsupervisor=" +getSupervisorDetails(supervisor) + "]";
		if (staff != null) {
			printData += "\n ---------Staffs----------\n";
			for (Employee employee : staff) {
				printData += employee.toString();
			}
		}
		return printData;
	}

	public String getSupervisorDetails(Employee employee) {
		String supervisorData = "";
		if (employee != null) {
			supervisorData += "Employee [id=" + employee.id + ", firstname=" + employee.Firstname + ", lastname="
					+ employee.Lastname + ", streetAddress=" + employee.streetAddress + ", city=" + employee.city
					+ ", state=" + employee.state + ", zipcode=" + employee.zipcode + ", \n\nsupervisor="
					+ getSupervisorDetails(employee.getSupervisor()) + "]";
		}
		return supervisorData;
	}
}
