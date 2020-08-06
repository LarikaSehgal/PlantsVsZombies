package application;

public class Sunflower extends Plant{
	private int health = 75;
	private int attack = 0;
	private final int level = 1;
	private final int cost = 25 ;
	private int xcord ; 
	private int ycord ;
	Sunflower(int x,int y){
		this.xcord = x ;
		this.ycord = y ;
	}
	public int attack() {
		return this.attack ;
	}
}
