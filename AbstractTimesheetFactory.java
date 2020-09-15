package csye6200.neu.edu;

public abstract class AbstractTimesheetFactory {
	public abstract TimeSheet getObject();
	public abstract TimeSheet getObject(String csvData);
}
