package csye6200.neu.edu;

import java.util.List;

public class TimeSheet extends AbstractTimeSheet {

	 List<AbstractTask> tasks = null;
	@Override
	public void add(AbstractTask t) {
		// TODO Auto-generated method stub
		tasks.add(t);
		timesheetHours+=getTimesheetHours();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		tasks.remove(timesheetHours);
	}

//	public TimeSheet() {
//		super();
//		// TODO Auto-generated constructor stub
//	}


	@Override
	public void remove(String taskName) {
		// TODO Auto-generated method stub
		tasks.remove(taskName.indexOf(taskName));
	}
	@Override
	public void remove(AbstractTask task) {
		// TODO Auto-generated method stub
		tasks.remove(task);
		timesheetHours-=getTimesheetHours();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		for(AbstractTask task:tasks) {
			System.out.println(task);
		}
		
	}




}
