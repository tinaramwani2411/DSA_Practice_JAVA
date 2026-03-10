import java.util.Scanner;
public class profit_loss_find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sp , cp ;
        System.out.println("Enter the Cost Price: ");
        cp = sc.nextInt();
        System.out.println("Enter the Selling Price: ");
        sp = sc.nextInt();
        if(sp>cp){
            System.out.println("Profit");
        }
        else{
            System.out.println("loss");
        }
    }
}
