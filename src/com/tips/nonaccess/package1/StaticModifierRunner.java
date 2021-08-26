package com.tips.nonaccess.package1;

class Player {
	private String name;
	private static int count;

	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	static public int getCount() {
		return count;
	}

	public String getName() {
		System.out.println(count);
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldo");
		System.out.println(Player.getCount());

		Player player2 = new Player("Crishtina");
		System.out.println(Player.getCount());

	}

}
