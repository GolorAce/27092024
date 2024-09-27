import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите цену: ");
        float pr = sc.nextFloat(), x = 1;

        System.out.print("Введите промокод: ");
        int sl = sc.nextInt();
        if (sl == 1010){
            x = 0.9f;
        } else if (sl == 2020 || sl == 2024 || sl == 2030) {
            x = 0.8f;
        } else if (sl == 3030 || sl == 3333) {
            x = 0.7f;
        }

        pr *= x;
        System.out.print("Итоговая цена: ");
        System.out.print(pr);
        sc.close();
    }
}
