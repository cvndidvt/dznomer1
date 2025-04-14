import java.util.Scanner; 
public class Main { 
    public static void main(String[] args)  { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Введите год: ");
        int year = scanner.nextInt(); 

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { 
            System.out.println("Количество дней в году: 366"); 
        } else { 
            System.out.println("Количество дней в году: 365"); 
        } 
    } 
}