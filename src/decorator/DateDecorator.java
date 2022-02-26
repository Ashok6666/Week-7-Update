package decorator;

import factory.Activity;

public class DateDecorator extends ActivityDecorator {

	public DateDecorator(Activity decoratedActivity) {
		super(decoratedActivity);
		
	}

	@Override
	public void completionStatus() {
		// TODO Auto-generated method stub
		decoratedActivity.completionStatus();
		addDate(decoratedActivity);
	}
	private void addDate(Activity decoratedActivity) {
		System.out.println("Activity Completed today");
		System.out.println("------------------------");
	}
}
