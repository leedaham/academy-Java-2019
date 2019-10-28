package p402;

public class Button {
	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listner) {
		this.listener = listner;
	}
	
	public void touch() {
		listener.onClick();
	}
	
	public interface OnClickListener {
		public void onClick();
	}
}
