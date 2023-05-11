package ch16.Quiz.Quiz05;

public class Button {
	
	@FunctionalInterface
	public static interface ClickListener {
		
		public abstract void onClick();
	}
	
	
	private ClickListener clickListener;
	
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	
	public void click() {
		this.clickListener.onClick();
	}

}
