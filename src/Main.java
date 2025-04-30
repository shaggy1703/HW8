import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        System.out.println();
        int[] payMonth = new int[]{55000, 45000, 35000, 60000, 90000};
        int sum = 0;
        for (int tot : payMonth) {
            sum += tot;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        System.out.println("Task2");
        System.out.println();
        int[] payWeek = new int[]{55000, 45000, 35000, 60000, 90000};
        int minPay = payWeek[0];
        int maxPay = payWeek[0];
        for (int pay : payWeek) {
            if (pay > maxPay) {
                maxPay = pay;
            }
            if (pay < minPay) {
                minPay = pay;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPay + " рублей. Максимальная сумма трат за неделю составила " + maxPay + " рублей");
        System.out.println();
        System.out.println("Task3");
        System.out.println();
        double avarageWeek = (double) sum / payMonth.length;

        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", avarageWeek) + " рублей");
        System.out.println();
        System.out.println("Task4");
        System.out.println();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print (reverseFullName[i]);
        }
        int point1 = 0;
        int point2 = reverseFullName.length-1;
        for (int i = 0; i < reverseFullName.length / 2; i++){
            char temp = reverseFullName[point1];
            reverseFullName[point1] = reverseFullName[point2];
            reverseFullName[point2]= temp;
            point1++;
            point2--;
        }







    }
}