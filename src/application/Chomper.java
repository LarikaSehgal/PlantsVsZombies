package application;

public class Chomper extends Plant{
	private int health = 150;
	private int attack = 50;
	private final int level = 3;
	private final int cost = 100 ;
	private int xcord ; 
	private int ycord ;
	Chomper(int x,int y){
		this.xcord = x ;
		this.ycord = y ;
	}
	public int attack() {
		return this.attack ;
	}
}
