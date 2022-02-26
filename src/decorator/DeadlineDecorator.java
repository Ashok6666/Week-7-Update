package decorator;

import factory.Activity;

public class DeadlineDecorator extends ActivityDecorator {

	public DeadlineDecorator(Activity decoratedActivity) {
		super(decoratedActivity);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void completionStatus() {
		// TODO Auto-generated method stub
		decoratedActivity.completionStatus();
		deadlineStatus(decoratedActivity);
	}
	private void deadlineStatus(Activity decoratedActivity) {
		System.out.println("Deadline passed! Work needs to be rescheduled");
		System.out.println("------------------------");
	}
}
