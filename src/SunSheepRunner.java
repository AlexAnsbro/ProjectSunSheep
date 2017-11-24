import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SunSheepRunner {

	public static void main (String[] args) throws IOException {
		//create cards
		ArrayList<CardGenerator>cards = new ArrayList<CardGenerator>();
				
		cards.add(new CardGenerator("Bob", "Jim" ,12, "Male", "birthday"));
		cards.add(new CardGenerator("Timmy", "Jim" ,12, "Male", "christmas"));
		cards.add(new CardGenerator("Simon", "Jim" ,12, "Male", "birthday"));
		cards.add(new CardGenerator("Mary", "Jim" ,12, "Female", "christmas"));
		cards.add(new CardGenerator("Bopple", "Jim" ,12, "Male", "easter"));
		cards.add(new CardGenerator("Birtha", "Jim" ,12, "Female", "christmas"));
		cards.add(new CardGenerator("David", "Jim" ,12, "Male", "christmas"));
		cards.add(new CardGenerator("Bilbo", "Jim" ,12, "Male", "birthday"));
		cards.add(new CardGenerator("Danyal", "Jim" ,12, "Male", ""));
		cards.add(new CardGenerator("Jaeden", "Jim" ,12, "Male", "easter"));
		cards.add(new CardGenerator("Murphy", "Jim" ,12, "Male", "christmas"));
		cards.add(new CardGenerator("Matthew", "Jim" ,12, "Male", "easter"));
		cards.add(new CardGenerator("Will", "Jim" ,12, "Male", "christmas"));
		cards.add(new CardGenerator("Eren", "Jim" ,12, "Female", "christmas"));
		cards.add(new CardGenerator("Janine", "Jim" ,12, "Female", ""));
		cards.add(new CardGenerator("Raheem", "Jim" ,12, "Male", "birthday"));
		cards.add(new CardGenerator("Cooper", "Jim" ,12, "Male", "christmas"));
		
		
		final String outputFileName = "..\\ProjectSunSheep\\files\\card.txt";
	
		try {
			FileWriter fileWriter = new FileWriter(outputFileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);	
		
			for (CardGenerator temp : cards)
			{				
				bufferedWriter.write(temp.formatCardRaw());
				bufferedWriter.newLine();
				bufferedWriter.write("\n");
			}
			
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + outputFileName + "'");
		}
		
	}
}
