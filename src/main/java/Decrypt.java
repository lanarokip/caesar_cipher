import java.io.Console;


public class Decrypt {
    private String text;
    private int shiftKey;

public Decrypt (String text, int shiftKey){
    this.text=text;
    this.shiftKey=shiftKey;
}
    public String getText(){
        return this.getText();
    }
    public int getShiftKey(){
        return this.getShiftKey();
    }



public static String planTxt2(String text, int shiftKey){
        final String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        text = text.toUpperCase();

        StringBuffer encryptText = new StringBuffer();
        for(int i = 0;i < text.length(); i++){
            if(!Character.isLetter(text.charAt(i))){
                encryptText.append(text.charAt(i));
            }
            else{
                int charPosition = alphabets.indexOf(text.charAt(i));
                int keyshift =  (charPosition -shiftKey)%26;

                if (keyshift<0){
                    keyshift= alphabets.length()+keyshift;
                }
                char encryptValue = alphabets.charAt(keyshift);
                encryptText.append(encryptValue);
            }
        }
        return encryptText.toString();
    }

}

