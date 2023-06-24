package Assignment2;

public class SoftwareDeveloper extends Employee{
	protected Department department;
	protected String projectName;

	
	public static int getNumber() {
		return number;
	}
	public SoftwareDeveloper(String name, int yearOfSeniority, String projectName, Department department) {
	    super(name, yearOfSeniority);
	    this.projectName = projectName;
	    this.department=department;
	}
	@Override
	public boolean equals(Object obj) {
	    if (obj == this) {
	        return true;
	    }
	    if (!(obj instanceof SoftwareDeveloper)) {
	        return false;
	    }
	    SoftwareDeveloper sd = (SoftwareDeveloper) obj;
	    return yearOfSeniority == yearOfSeniority && projectName.equals(sd.projectName);
	}

	@Override
	public String toString() {
	    return name + "@" + department.getName() + "-P:" + projectName + "-S:" + yearOfSeniority;
	}
	@Override
	public double calculateSalary() {
	    return 2000 + 30 * Math.pow(yearOfSeniority, 2);
	}
}
