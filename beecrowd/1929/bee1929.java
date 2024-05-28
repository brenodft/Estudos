import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class bee1929 {

    public static boolean abc(int a,int b,int c){
        return((a+b > c) && (a+c > b) && (b+c>a));
    }
    public static boolean check(List<Integer> numbers){
        boolean resp = false;
        int n = numbers.size();
        for(int i = 0; i< n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    int a = numbers.get(i);
                    int b = numbers.get(j);
                    int c = numbers.get(k);
                    if(abc(a,b,c)){
                        resp = true;
                    }
                }
            }
        }
        return resp;
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> numbers = new ArrayList<>();
        String options[] = input.split(" ");
        for(String option : options){
            numbers.add(Integer.parseInt(option));
        }
        System.out.println(check(numbers) ? "S":"N");
        sc.close();
    }
}
