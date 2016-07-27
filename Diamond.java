/**
 * Created by dullus on 7/27/2016.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Diamond {
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> words = playDiamond(3);
        for(String i : words)
        {
            System.out.println(i);
        }
    }
    public static ArrayList<String> playDiamond(int level)
    {
        ArrayList<String> dictionary = new ArrayList<>();


        if( level == 3) {
            try {
                FileReader fileReader = new FileReader("C:\\Users\\dullus\\Documents\\Books\\sowpods.txt");
                BufferedReader bufferReader = new BufferedReader(fileReader);
                String line = "";
                while ((line = bufferReader.readLine()) != null) {
                    String word = line;
                    if(word.length() == 3 )
                        dictionary.add(word);
                }


            }catch (Exception e) {

            }
        }
        return dictionary;
    }
}
