//This program uses inheritance to display data of several people
//it then outputs it based on the input provided
import java.util.GregorianCalendar;

public class Q11_2 {
	public static void main(String[] args) {
		//makes person, student, employee, faculty, and staff
		Person person = new Person("Jovanni", "Forum park Drive", "8325763775", "jovanniochoa38@gmail.com");

		Student student = new Student("Maria", "Bissonet", "2817537254", "mompower44@gmail.com", Student.FRESHMAN);

		Employee employee = new Employee("Temoc", "Camp Bell Road", "2819874782", "Temoc@utdallas.edu", 420, 120000);
		
		Staff staff = new Staff("Garry", "Nort side", "8329379485", "Garry@utdallas.edu", 200, 20000, "Executive Assistant");

		Faculty faculty = new Faculty("Karen", "123 West Village", "7132543856", "sue28@aol.com", 103, 7000, "4pm to 6pm", "Professor");


		//calls person, student, employee, faculty, and staff to string
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}

class Person {
	private String name;
	private String address;
	private String phone;
	private String email;

	//makes person
	public Person() {
		this("?","?","?","?");
	}

	//makes person
	public Person(String tempname, String tempaddress, String tempphone, String tempemail) {
		name = tempname;
		address = tempaddress;
		phone = tempphone;
		email = tempemail;
	} 

	//gets name
	public String getName() {
		return name;
	}

	//gets adress
	public String getAddress() {
		return address;
	}

	//gets phone
	public String getPhone() {
		return phone;
	}

	//gets email
	public String getEmail() {
		return email;
	}

	//sets name
	public void setName(String tempname) {
		name = tempname;
	}

	//sets adress
	public void setAddress(String tempaddress) {
		address = tempaddress;
	}

	/** Set new phone number */
	public void setPhone(String tempphone) {
		phone = tempphone;
	}

	/** Set new email */
	public void setEmail(String tempemail) {
		email = tempemail;
	}

	/** Return a string description of the class */
	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail address: " + email;
	}
}

class Student extends Person {
	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;
	
	public Student(String name, String address,  
	String phone, String email, int status) {
	super(name, address, phone, email);
	this.status = status;
	}
	
	//gets status
	public String getStatus() {
	switch (status) {
		case 1 : return "freshman"; 
		case 2 : return "sophomore"; 
		case 3 : return "junior"; 
		case 4 : return "senior";
		default : return "Unknown"; 
	}
	}
	
	//sets status
	public void setStatus(int status) {
	this.status = status; 
	}
	
	
	//returns to string
	public String toString() {
	return super.toString() + "\nStatus: " + getStatus();
	}
}

//creates employee class
class Employee extends Person {
	private int office;
	private double salary;
	private MyDate dateHired;
	
	//creates empployee
	public Employee(String name, String address, String phone, String email, int tempoffice, double tempsalary) {
	super(name, address, phone, email);
	office = tempoffice;
	salary = tempsalary;
	this.dateHired = new MyDate();
	}
	
	//gets office
	public int getOffice() {
	return office;
	}
	
	//gets salary
	public String getSalary() {
	return String.format("%.2f", salary);
	}
	
	//gets hired
	public String getDateHired() {
	return dateHired.getMonth() + "/" + dateHired.getDay() 
			 + "/" + dateHired.getYear();
	}
	
	//sets new date
	public void setDateHired() {
		dateHired = new MyDate();
	}
	
	//sets office
	public void setOffice(int tempoffice) {
	office = tempoffice;
	}
	
	//sets salary
	public void setSalary(double tempsalary) {
	salary = tempsalary;
	}
	
	//to string
	public String toString() {
	return super.toString() + "\nOffice: " + office + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
}

class MyDate {
	// Data Fields
	private int year;
	private int month;
	private int day;

	//creates my date
	MyDate() {
		GregorianCalendar calander = new GregorianCalendar();
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}

	//creates my date in miliseconds
	MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}

	//creates my date and shows year month and day
	MyDate(int tempyear, int tempmonth, int tempday) {
		year = tempyear;
		month = tempmonth;
		day = tempday;
	}

	//gets day
	public String getDay() {
		String d = String.valueOf(day);
		if (day < 10) {
			return "0" + d;
		}
		else {
			return d;
		}
	}
	
	//gets month
	public String getMonth() {
		String m = String.valueOf(month + 1);
		if (month < 10) {
			return "0" + m;
		}
		else {
			return m;
		}
	}
	
	//gets year
	public int getYear() {
		return year;
	}

	//sets new date
	public void setDate(long elapsedTime) {
		GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
		month = calander.get(GregorianCalendar.MONTH);
		year = calander.get(GregorianCalendar.YEAR);
		
		
	} 
}

class Staff extends Employee {
	private String title;
	
	//staff member
	public Staff(String name, String address, String phone, String email, int office, double salary, String temptitle) {
	super(name, address, phone, email, office, salary);
	title = temptitle;
	}
	
	//gets title
	public String getTitle() {
	return title;
	}
	
	//sets title
	public void setTitle(String temptitle) {
	title = temptitle;
	}
	
	//converts to string
	public String toString() {
	return super.toString() + "\nTitle: " + title;
	}
}
	
	class Faculty extends Employee {
	private String officeHours;
	private String rank;
	
	//creates faculty
	public Faculty(String name, String address, String phone, String email, int office, double salary, String tempofficeHours, String temprank) {
	super(name, address, phone, email, office, salary);
	officeHours = tempofficeHours;
	rank = temprank;
	}
	
	//gets office hours
	public String getOfficeHours() {
	return officeHours;
	}
	
	//sets office hours
	public void setOfficeHours(String tempofficeHours) {
	officeHours = tempofficeHours;
	}
	
	//gets rank
	public String getRank() {
	return rank;
	}
	
	//sets rank
	public void setRank(String temprank) {
	rank = temprank;
	}
	
	//converts to string
	public String toString() {
	return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;
	}
}