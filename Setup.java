import java.util.Arrays;


public class Setup {
	
	static char[][] arena = new char[10][10];
	
	public static void buildArena() {
		
		for(char[] row : arena) {
			
			Arrays.fill(row, '*');
				
		}
		
	}
	public static void redrawArena() {
		int k = 1;
		while(k <= 30){System.out.print('-'); k++; }
		System.out.println();
		for(int i = 0; i < arena.length; i++) {
			 
			for(int j = 0; j < arena[i].length; j++)  {
				System.out.print("|" + arena[i][j] + "|");
			}
			System.out.println();
		}
		k = 1;
		while (k <= 30) {System.out.print('-'); k++; }
		System.out.println(); 
	}
	
	public final String death = "Here lies a knocked out player.";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private boolean alive = true;
	
	public int xPosition = 0;
	public int yPosition = 0;
	public char firstLetter = 'B';
	public String name = "Big Boy Joe";
	public static int numbOplayers = 0;
	
	public int getHealth() {
		return health;
	}
	public int getAttack() {
		return attack;
	}
	public int getMovement() {
		return movement; 
	}
	public boolean getAlive() {
		return alive;
	}
	public void setHealth(int decreasedHealth) {
		health = health - decreasedHealth;
		if (health < 0) {
			alive = false;
		}
	}
	public void setHealth(double decreasedHealth) {
		int IDH = (int)decreasedHealth;
		health = health - IDH;
		if (health < 0) {
			alive = false;
		}
	}
	public Setup(int newHealth, int newAttack, int newMovement, String name) {
		health = newHealth;
		attack = newAttack;
		movement = newMovement;
		this.name = name;
		
		int maxXBoardSpace = arena.length - 1;
		int maxYBoardSpace = arena[0].length - 1;
		
		int randomX, randomY;
		do {
			randomX = (int)(Math.random() * maxXBoardSpace);
			randomY = (int)(Math.random() * maxYBoardSpace);
		} while (arena[randomX][randomY] != '*');
		
		this.xPosition = randomX;
		this.yPosition = randomY;
		this.firstLetter = this.name.charAt(0); 
		
		arena[this.yPosition][this.xPosition] = this.firstLetter;
		numbOplayers++; 
	}
	//Will be default
	public Setup() {
		numbOplayers++;
	}
	public static void main(String[] args) {
		
	}
}