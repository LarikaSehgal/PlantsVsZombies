package application;

public abstract class Zombie {
	int health ; int speed =1 ; int lane ;
	Zombie(int health,int speed, int lane){
		this.health = health ;
		this.speed = speed ;
		this.lane = lane ;
	}
}
