import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class bc1025{
    public static boolean finish(String input){
        return input.equals("0 0");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 1;
        
        while(!finish(input)){
            List<Integer> numbers = new ArrayList<>();
            String[] options = input.split(" ");
            int in1 = Integer.parseInt(options[0]);
            int in2 = Integer.parseInt(options[1]);
            for(int i = 0; i<in1; i++){
                int numberInput = sc.nextInt();
                numbers.add(numberInput);
            }
            System.out.println("CASE# "+count++ +":");
            for(int j = 0;j <in2; j++){
                int numberContain = sc.nextInt();
                boolean contain = numbers.contains(numberContain);
                if(contain){
                    int pos = numbers.indexOf(numberContain)+1;
                    System.out.println(numberContain + " found at "+pos);
                } else{
                    System.out.println(numberContain + " not found");
                }
            }
            sc.nextLine();
            input = sc.nextLine();
        }
        sc.close();
    }
}