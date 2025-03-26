import java.util.Scanner;
class StringReverseWithoutStringBuilder{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter something:");
        String s = scan.nextLine();
        String s1 = "";
        for(int i = s.length()-1;i>=0;i-=1){
            s1+=s.charAt(i);
        }
        System.out.println(s1);
    }
}
