package main;

public class Main {

	public static void main(String[] args) 
	{	
		Soldier A = new Soldier();
		Soldier B = new Soldier();
		
		Weapon Knife = new Knife();
		Weapon Gun = new Gun();
		Weapon Nothing = new Nothing();
		
		Defence NoDef = new NoDef();
		Defence Shield = new Shield();
		
		A.ChangeWeapon(Nothing);
		B.ChangeWeapon(Gun);
		A.SetDef(Shield);
		B.Attack(A); 
	}
}
