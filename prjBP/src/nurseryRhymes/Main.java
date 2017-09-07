package nurseryRhymes;
import nurseryRhymes.oldMacdonald.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

		public static void main(String[] args) {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader newInput = new BufferedReader(input); 

			Song.songIntro();
			
			do {
				try {
					String animal = newInput.readLine().toLowerCase();
					new Song(animal);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (Song.hasAnimal);
			
		}
			
	}




