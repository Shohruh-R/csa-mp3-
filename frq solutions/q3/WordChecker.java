import java.util.*;

public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    for(int i = 1; i < wordList.size(); i++){
      String currentWord = wordList.get(i);
      String previousWord = wordList.get(i-1);

      boolean found = false;
      for (int j = 0; j <= currentWord.length() - previousWord.length(); j++) {
          if (currentWord.substring(j, j + previousWord.length()).equals(previousWord)) {
              found = true;
              break;
          }
      }
      if (!found) {
          return false;
      }
    }

    return true;
  }


  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();

    for(String word : wordList){
      if(word.indexOf(target) == 0){
        String modifiedWord = word.substring(target.length());
        result.add(modifiedWord);
      }
    }
    return result;             
  }

  
}
