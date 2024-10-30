package studio7;

public class Studio7 {
	
	public class Fraction {
		private int numerator;
		private int denom;
		
		public Fraction (int numerator, int denom) {
			this.numerator = numerator;
			this.denom = denom;
		}
		
		public int getnumerator (){
			return this.numerator;
		}
		public int getdenom () {
			return this.denom;
		}
		public void setnumerator (int newNumerator) {
			this.numerator = newNumerator;
		}
		public void setdenom (int newDenom) {
			this.denom = newDenom;
		}
		public Fraction multiplyFractions (Fraction f) {
			Fraction newFraction = new Fraction ((f.getnumerator() * this.getnumerator()), (f.getdenom() * this.getdenom())); 
			return newFraction;
		}
		
		public Fraction addFractions (Fraction x) {
			Fraction newFraction = new Fraction (this.getnumerator()*x.getdenom() + x.getnumerator()*this.getdenom(), this.getdenom()*x.getdenom()); 
			return newFraction;
		}
	}

	public class Die {
		private int numSides;
		
		public Die (int sides) {
			this.numSides = sides;
		}
		public int getsides() {
			return this.numSides;
		}
		public void setsides(int newSides) {
			this.numSides = newSides;
		}
		public int rollDie() {
			return (int)(Math.random()+1)*(this.getsides()); 
		}
	}
	
	public class Rectangle {
		private double length;
		private double width;
		//after making class, make reconstructor and getter/setter methods
		//constructor
		public Rectangle (double length, double width) {
			this.length = length; 
			this.width = width; 
		}
		//Getter method 
		public double getlength() {
			return this.length;
		}
		public double getwidth() {
			return this.width; 
		}
		
		//Setter method 
		public void setlength(double newLength) {
			this.length = newLength;
		}
		public void setwidth(double newWidth) {
			this.width = newWidth;
		}
		
		//area method
		public double Area() {
			return this.getlength()*this.getwidth();
		}
		//perimeter method 
		public double Perimeter() {
			return 2*(this.getlength()+this.getwidth());
		}
		
		public boolean Square() {
			return this.getlength() == this.getwidth(); 
		}
		public boolean isSmaller(Rectangle r) {
			return r.Area() <= this.Area();

		}
	}
}


