package driver;
import factory.*;
import decorator.*;
import iterator.CalenderEvents;
import iterator.TaskManager;
public class DailyPlannerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActivityFactory activityFactory = new ActivityFactory();
		Activity party = activityFactory.getActivity("party");
		Activity shopping = activityFactory.getActivity("shopping");
		Activity tradeEvent = activityFactory.getActivity("tradeEvent");
		Activity sponsorShip = activityFactory.getActivity("sponsorShip");
		
		CalenderEvents calenderEvents = new CalenderEvents();
		
		calenderEvents.addActivity(new DateDecorator(sponsorShip));
		calenderEvents.addActivity(new DeadlineDecorator(tradeEvent));
		
		calenderEvents.addActivity(shopping);
		calenderEvents.addActivity(party);
		
		TaskManager taskManager = new TaskManager(calenderEvents);
		
		taskManager.printActivity();
	}

}
