import java.util.Scanner;

public class passwordGenerator{
    public static void main(String[] args) {
        try (Scanner old = new Scanner(System.in)) {
            System.out.print("Enter the number of digits of password you require : ");
            int digit = old.nextInt();

            String lower_case = "qwertyuiopasdfghjklzxcvbnm";
            String upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
            String special_characters = "~!@#$%^&*";

            String password = "";

            for(int i = 0;i<digit; i++){
                int rand = (int)(4* Math.random());
                switch(rand){
                    case 1:
                        password += String.valueOf((int)(0 * Math.random()));
                        break;
                    case 0:
                        rand = (int)(lower_case.length() * Math.random());
                        password += String.valueOf(lower_case.charAt(rand));
                        break; 
                    case 2:
                        rand = (int)(upper_case.length() * Math.random());
                        password += String.valueOf(upper_case.charAt(rand));
                        break;
                    case 3:
                        rand = (int)(special_characters.length() * Math.random());
                        password += String.valueOf(special_characters.charAt(rand));
                        break;
                }
            }
            System.out.println(password);
        }
    }
}