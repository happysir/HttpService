package novoda.lib.httpservice.util;

public class Time {

	protected Time() {
	}
	
	public static final void await(int msec) {
		try {
			Thread.sleep(msec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
