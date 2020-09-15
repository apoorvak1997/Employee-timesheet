package csye6200.neu.edu;

public class Employee extends Person{
	  private int employeeId;
	  private double wage;

	  private AbstractTaskFactory taskFactory = null;
	  private AbstractTimesheetFactory timesheetFactory = null;
	  private TimeSheet timeSheet = null;
	  
	  public Employee(String string) {
		  String[] tokens = string.split(",");
		  
		  
		// TODO Auto-generated constructor stub
	}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public double getWage() {
			return wage;
		}

		public void setWage(double wage) {
			this.wage = wage;
		}

		public AbstractTaskFactory getTaskFactory() {
			return taskFactory;
		}

		public void setTaskFactory(AbstractTaskFactory taskFactory) {
			this.taskFactory = taskFactory;
		}

		public AbstractTimesheetFactory getTimesheetFactory() {
			return timesheetFactory;
		}

		public void setTimesheetFactory(AbstractTimesheetFactory timesheetFactory) {
			this.timesheetFactory = timesheetFactory;
		}

		public TimeSheet getTimeSheet() {
			return timeSheet;
		}

		public void setTimeSheet(TimeSheet timeSheet) {
			this.timeSheet = timeSheet;
		}
		
	public static void demo() {
		 
		  System.out.println("\n\t" + Employee.class.getName() + ".demo()...");
		   
		  Employee obj = new Employee("1,17,Dan,Peters,101,20.0");
		  System.out.println(obj);

		  // add employee Timesheet Factory (TimeSheetFactory) to Employee object...
		  System.out.println("add employee Timesheet Factory (TimeSheetFactory) to Employee object...");
/*		  newsheet TimeSheetFactory = null;
		  TimeSheetFactory = newsheet.getInstance();
		  newsheet.toString();
*/		  
		  // use Timesheet Factory to add employee Timesheet to Employee object... 
		  System.out.println("use Timesheet Factory to add employee Timesheet to Employee object...");

		  // add employee Task Factory  (BrakeJobTaskFactory) to Employee object...
		  System.out.println("add employee Task Factory  (BrakeJobTaskFactory) to Employee object...");
		  
		  // use employee Task factory to add all tasks to Employee Timesheet...
		  System.out.println("use employee Task factory to add all tasks to Employee Timesheet...");

		  // show employee timesheet...
		  System.out.println("\n show employee timesheet...");

		  // show employee productivity details...
		  System.out.println("\n show employee productivity details...");

/*		  System.out.println("TOTAL HOURS: " + totalTimesheetHours);
		  System.out.println("TOTAL EARNINGS: $" + totalTimesheetHours * employeeWage());
*/
		  System.out.println("\n\t" + Employee.class.getName() + ".demo()... done!");
		 }

}
