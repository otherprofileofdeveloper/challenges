import java.util.HashMap;
import java.util.Map;

public class Program {
  public static void main(String[] args) {
    String textTranslated = translateText("Hello world, 123");

    System.out.println(textTranslated);
  }

  private static String translateText(String inputText) {
    Map<Character, String> leetDictionary = new HashMap<Character, String>();

    leetDictionary.put('A', "4");
    leetDictionary.put('B', "|3");
    leetDictionary.put('C', "[");
    leetDictionary.put('D', ")");
    leetDictionary.put('E', "3");
    leetDictionary.put('F', "|=");
    leetDictionary.put('G', "&");
    leetDictionary.put('H', "#");
    leetDictionary.put('I', "1");
    leetDictionary.put('J', ",_|");
    leetDictionary.put('K', ">|");
    leetDictionary.put('L', "|_");
    leetDictionary.put('M', "/\\/\\");
    leetDictionary.put('N', "^/");
    leetDictionary.put('O', "0");
    leetDictionary.put('P', "|*");
    leetDictionary.put('Q', "(_,)");
    leetDictionary.put('R', "|2");
    leetDictionary.put('S', "5");
    leetDictionary.put('T', "7");
    leetDictionary.put('U', "(_)");
    leetDictionary.put('V', "\\/");
    leetDictionary.put('W', "\\/\\/");
    leetDictionary.put('X', "><");
    leetDictionary.put('Y', "`/");
    leetDictionary.put('Z', "2");
    leetDictionary.put('1', "L");
    leetDictionary.put('2', "R");
    leetDictionary.put('3', "E");
    leetDictionary.put('4', "A");
    leetDictionary.put('5', "S");
    leetDictionary.put('6', "b");
    leetDictionary.put('7', "T");
    leetDictionary.put('8', "B");
    leetDictionary.put('9', "g");
    leetDictionary.put('0', "()");

    String textTranslated = inputText
        .chars()
        .mapToObj(c -> leetDictionary.containsKey(Character.toUpperCase((char) c))
            ? leetDictionary.get(Character.toUpperCase((char) c))
            : (char) c)
        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
        .toString();

    return textTranslated;
  }
}
