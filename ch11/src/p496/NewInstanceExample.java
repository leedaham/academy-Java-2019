package p496;

import p495.Action;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("p495.SendAction");
			//Class clazz = Class.forName("p495.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
