
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class WordBank {

    private ArrayList<String> wordList = new ArrayList<String>();

    public WordBank() throws Exception {
        		FileReader file = new FileReader("WordList");
                BufferedReader reader = new BufferedReader(file);

            String line = reader.readLine();
            while (line != null) {
                wordList.add(line);
            line = reader.readLine();
            }
        }
        
    

    public String wordRandomizer() {
        if (wordList.isEmpty()) return "DEFAULT";
        int random = (int)(Math.random() * 58110);
        return wordList.get(random);
    }
    
}