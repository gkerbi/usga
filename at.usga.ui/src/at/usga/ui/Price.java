package at.usga.ui;

public class Price {

	private int eggs = 0;
	private int rabbits = 0;
	private double teiler;
	
	public Price(double teiler) {
		this.teiler = teiler;
		// 0-50 teiler
		eggs = 1;
		rabbits = 1;
		
		if(teiler > 50.0) {
			eggs = 0;
			rabbits = 1;
		}
		
		if(teiler > 100) {
			eggs = 2;
			rabbits = 0;
		}
		
		if(teiler > 150) {
			eggs = 1;
			rabbits = 0;
		}
		
		if(teiler > 250) {
			eggs = 0;
			rabbits = 0;
		}
	}
	
	@Override
	public String toString() {
		return teiler + "\t Hase: " + (rabbits > 0 ? rabbits : "-") + " | Ei(er): " + (eggs > 0 ? eggs : "-");
	}
	
}
