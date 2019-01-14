import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Beta {
	
	public static void main(String[] args) {
		
		Setup.buildArena();
		
		char[][] temporaryArena = new char[10][10];
		
		Setup[] Player = new Setup[7];
		
		Player[0] = new Setup(1000, 20, 1, "Bob");
		Player[1] = new Setup(500, 40, 2, "Jones");
		Player[2] = new Setup(1000, 20, 1, "Gabriel");
		Player[3] = new Setup(1000, 20, 1, "Elise");
		Player[4] = new Setup(1000, 20, 1, "Anastasia");
		Player[5] = new Setup(1000, 20, 1, "Laura");
		Player[6] = new Setup(1000, 20, 1, "Chloe");
		
		
		Setup.redrawArena();
		 
	}
}