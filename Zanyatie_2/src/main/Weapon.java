package main;

public abstract class Weapon 
{
	protected int damage;
	
	public Weapon(int damage)
	{
		this.damage = damage;
	}
	
	public void DecreseHP(Soldier Enemy)
	{
		Enemy.BeAttacted(damage);
	}
	
	public int GetDamage()
	{
		return damage;
	}
}
