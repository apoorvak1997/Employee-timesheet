package csye6200.neu.edu;

public abstract class AbstractTaskFactory {
	
	public abstract AbstractTask getObject();
	public abstract AbstractTask getObject(String csvData);
	//public abstract AbstractTask getObject(int id, int hours, String name, Stringdescription);
	
}
