import java.io.Console;

public class App {
    public static void main(String[] args) {

        Console console = System.console();
        //prompt the user to enter the message to be encrypted
        System.out.println("select either :\n 1. encrypt \n 2. decrypt \n 3. Quit ");

        String Select = console.readLine();
        int selectChoice = Integer.parseInt(Select);

        if (selectChoice == 1) {
            System.out.println("what do you want encrypted?");
            String message = console.readLine();
            System.out.println("enter the shift key");
            int shiftKey = Integer.parseInt(console.readLine());
            System.out.println("the ecryption is:" + Caesar.planTxt(message,shiftKey));
        } else if (selectChoice == 2) {
            System.out.println("what do you want encrypted?");
            String message = console.readLine();
            System.out.println("enter the shift key");
            int shiftKey = Integer.parseInt(console.readLine());
           System.out.println("the dectryption key is:" + Decrypt.planTxt2(message,shiftKey));
        } else {
            System.out.println("exit");
        }
    }
}
