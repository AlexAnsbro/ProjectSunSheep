import java.util.ArrayList;
import java.util.Random;

public class CardGenerator {
	
	private String nameOfSender = "";
	private String name;
	private int age;
	private String gender;
	private String type;

	private final String middleFileName = "..\\ProjectSunSheep\\files\\lines.txt";
	private final String greetingFileName = "..\\ProjectSunSheep\\files\\seasonsgreeting.txt";
	private final String signOffFileName = "..\\ProjectSunSheep\\files\\signoff.txt";
	
	private final String outputFileName = "..\\ProjectSunSheep\\files\\card.txt";
	
	public CardGenerator(String name, String nameOfSender ,int age, String gender,String type) {
		super();
		this.name = name;
		this.nameOfSender = nameOfSender;
		this.age = age;
		this.gender = gender;
		this.type = type;
	}
	
	public void formatCard() {
		ArrayList<String> output = new ArrayList<String>();
		FileParser parse = new FileParser();
		output.add(genHeading());
		output.add(greeting());
		output.add(genMiddle());
		output.add(genSignOff());
		output.add(nameOfSender());
		parse.writeArrayToFile(outputFileName, output);
	}
	
	public String formatCardRaw() {
		return genHeading() + "\r\n" + greeting() + "\r\n" + genMiddle() + "\r\n" + genSignOff() + "\r\n" + nameOfSender() + "\r\n ";	
	}

	private String genHeading() {
			
		return "Dear " + this.name + ",";		
	}
	
	private String greeting() {
		FileParser parse = new FileParser();
		ArrayList<String> season = parse.readIntoArray(greetingFileName);
		
		if (this.type.equals("christmas")) {
			return season.get(0);
		}else if (this.type.equals("easter")) {
			return season.get(1);
		}else if (this.type.equals("birthday")) {
			return season.get(2);
		}else {
			return "Hello there!";
		}
	}
	
	private String genMiddle() {
		FileParser parse = new FileParser();
		Random rand = new Random();
		ArrayList<String> quote = parse.readIntoArray(middleFileName);
		quote.get(rand.nextInt(quote.size()));
		return quote.get(rand.nextInt(quote.size()));
	}
	
	private String genSignOff() {
		FileParser parse = new FileParser();
		Random rand = new Random();
		ArrayList<String> quote = parse.readIntoArray(signOffFileName);
		quote.get(rand.nextInt(quote.size()));
		return quote.get(rand.nextInt(quote.size()));
	}
	
	private String nameOfSender() {
		return nameOfSender;
	}
}
