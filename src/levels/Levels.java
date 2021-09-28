package levels;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Levels {
	
	public static final Level[] levels = new Level[] {
		new Level1(),
		new Level2(),
		new Level3(),
		new Level4(),
		new Level5(),
		new Level6(),
		new Level7(),
		new Level8(),
		new Level9(),
		new Level10(),
		new Level11(),
		new Level12(),
		new Level13(),
		new Level14(),
		new Level15(),
		new Level16()
	};
	
	public static int getCurrentLevel() {
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File("assets/LevelSave.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String line = null;
		
		while (sc.hasNextLine()) {
			
			line = sc.nextLine();
			
		}
		
		return Integer.parseInt(line) + 1;
		
	}

}
