import java.util.Scanner;
class Demo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some sentence:");
        StringBuilder s = new StringBuilder(scan.nextLine());
        StringBuilder s1 = new StringBuilder(s).reverse();
        if(s.toString().equals(s1.toString())){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
