package csye6200.neu.edu;

public class BreakJobTaskFactory extends AbstractTaskFactory{
	
	private static BreakJobTaskFactory instance;
	private BreakJobTaskFactory(){
		instance=null;
	}
	
	public static synchronized BreakJobTaskFactory getInstance() {
		if(instance==null) {
			instance= new BreakJobTaskFactory();
		}
		return instance;
	}
	
	

	@Override
	public AbstractTask getObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractTask getObject(String csvData) {
		// TODO Auto-generated method stub
		return null;
	}

}
