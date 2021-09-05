import java.io.Console;

public class Caesar {
  private String text;
  private int shiftKey;

  public Caesar (String text, int shiftKey){
    this.text=text;
    this.shiftKey=shiftKey;
  }

  public String getText(){
    return this.getText();
  }
  public int getShiftKey(){
    return this.getShiftKey();
  }

  public static String planTxt(String text, int shiftKey){
    final String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    text = text.toUpperCase();

    StringBuffer encryptText = new StringBuffer();
    for(int i = 0;i < text.length(); i++){
      if(!Character.isLetter(text.charAt(i))){
        encryptText.append(text.charAt(i));
      }
      else{
        int alphabetPosition = alphabets.indexOf(text.charAt(i));
        int keyShift = (alphabetPosition + shiftKey)%26;
        char encryptValue = alphabets.charAt(keyShift);
        encryptText.append(encryptValue);
      }
    }
    return encryptText.toString();
  }
}

