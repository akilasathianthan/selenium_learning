public class Employee {
	private String name;
	private int id;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return id;
	}
	public void setId(int age) {
		this.id = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Exmployee [name=" + name + ", age=" + id + ", salary=" + salary + "]";
	}
	
	
	
}