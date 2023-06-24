package Assignment2;

public class Department {
	protected String name;
	protected int numberOfWorker;
	public static int number;

	public String getName() {
		return name;
	}

	 
	public Department(String name, int numberOfEmployee) {
		this.name=name;
		this.numberOfWorker=numberOfEmployee;
	}
 
	@Override
	public boolean equals(Object obj) {
	    if (obj == this) {
	        return true;
	    }
	    if (!(obj instanceof Department)) {
	        return false;
	    }
	    Department dep = (Department) obj;
	    return name.equals(dep.name) && this.numberOfWorker == dep.numberOfWorker;
	}
	

	// Erase the content. Fill in the blanks. 
	@Override
	public String toString() {
		return name + "/" + "number of worker : " + numberOfWorker;
	}

}

