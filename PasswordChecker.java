import java.util.Scanner;
class Demo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your password:");
        String pwd = scan.nextLine();
        
        
        if(pwd.length() <=7 || pwd.length() >=34){
            System.out.println("false");
        }
        if(pwd.toLowerCase().contains("password")){
            System.out.println("false");
        }
        boolean hasCapital = false;
        boolean hasPunctuation = false;
        boolean hasNumber = false;
        
        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?`~+-*/=";
        
        for(char c:pwd.toCharArray()){
            if(Character.isUpperCase(c)){
                hasCapital = true;
            }
            if(specialChars.indexOf(c)!=-1){
                hasPunctuation = true;
            }
            if(Character.isDigit(c)){
                hasNumber = true;
            }
        }
        if(hasCapital && hasPunctuation && hasNumber){
            System.out.println("true");
        }
        System.out.println("false");
    }
}
