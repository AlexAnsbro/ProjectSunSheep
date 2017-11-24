import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileParser {

	public ArrayList <String> readIntoArray(String fileName) {
		ArrayList<String> temp = new ArrayList<String>();
		String line = null;

		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while ((line = bufferedReader.readLine()) != null) {
				temp.add(line);
			}
						
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}

		return temp; 
	}
	
	public void writeArrayToFile(String outputFileName, ArrayList<String> temp) {
		
		// This will reference one line at a time
		String line = null;

		try {
			FileWriter fileWriter = new FileWriter(outputFileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
						
			for (int i = 0; i < temp.size(); i++)
			{
				bufferedWriter.write(temp.get(i));
				bufferedWriter.newLine();
				bufferedWriter.write("\n");
			}
			bufferedWriter.close();
			
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + outputFileName + "'");
		}
	}
	
	public void writeToFile(String outputFileName, String output) {
		
		// This will reference one line at a time
		String line = null;

		try {
			FileWriter fileWriter = new FileWriter(outputFileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
						
				bufferedWriter.write(output);
				bufferedWriter.newLine();
				bufferedWriter.write("\n");
			
				
			bufferedWriter.close();
			
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + outputFileName + "'");
		}
	}
}
