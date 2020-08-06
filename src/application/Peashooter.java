package application;

public class Peashooter extends Plant{
	private int health = 100;
	private int attack = 10;
	private final int level = 1;
	private final int cost = 50 ;
	private int xcord ; 
	private int ycord ;
	Peashooter(int x,int y){
		this.xcord = x ;
		this.ycord = y ;
	}
	public int attack() {
		return this.attack ;
	}	
}
