package csye6200.neu.edu;

public class TimeSheetFactory extends AbstractTimesheetFactory{
	
	private static TimeSheetFactory instance;
	private TimeSheetFactory(){
		instance=null;
	}
	
	public static synchronized TimeSheetFactory getInstance() {
		if(instance==null) {
			instance= new TimeSheetFactory();
		}
		return instance;
	}
	
	
	@Override
	public TimeSheet getObject() {
		// TODO Auto-generated method stub
		return new TimeSheet() ;
	}

	@Override
	public TimeSheet getObject(String csvData) {
		// TODO Auto-generated method stub
		return null;
	}

}
