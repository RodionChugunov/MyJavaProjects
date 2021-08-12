package main;

public class Soldier 
{
	private Weapon thisWeapon;
	private int hp = 100;
	private Defence thisDefence;
	

	
	public void Attack (Soldier enemy)
	{
		thisWeapon.DecreseHP(enemy);
	}
	
	
	public void BeAttacted(int damage)
	{
		if (hp - damage <= 0)
		{
			System.out.println("he died...(");
		}
		hp = hp - damage;
		System.out.println("hp: " + hp);
	}
	
	
	public void ChangeWeapon(Weapon b)
	{
		thisWeapon = b;
	}
	
	
	public void SetDef(Defence d)
	{
		if (thisDefence == null)
		{
			thisDefence = d;
			hp = hp + thisDefence.GetDefPoints();
		}
	}
}
