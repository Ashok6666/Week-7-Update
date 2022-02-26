package decorator;
import factory.*;
public abstract class ActivityDecorator extends Activity {
	protected Activity decoratedActivity;

	public ActivityDecorator(Activity decoratedActivity) {
		this.decoratedActivity = decoratedActivity;
	}
	
	public  void completionStatus() {
		decoratedActivity.completionStatus();
	}
}
