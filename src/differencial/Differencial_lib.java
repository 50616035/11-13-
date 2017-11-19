package differencial;

public class Differencial_lib implements Differencial_if{
	private double a, h;
	
	public Differencial_lib(double a, double h) {
		this.a = a;
		this.h = h;
	}
	
	
    @Override
	public double getDX(){
    	// TODO Auto-generated method stub
		return ((Math.pow((this.a)+(this.h), 2)-Math.pow(this.a, 2))/h);

	}
	@Override
	public double getRX() {
		// TODO Auto-generated method stub
		return 2*this.a;
	}
	public double getAnswer() {
		double D = ((Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/this.h);
		double R = getRX();
		
		
		return Math.abs(R-D)/R*100;
		}
	

}
