import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int[] cashSpending = {123_456, 801_252, 155_267, 233_345, 158_348};
        int summarySpending = 0;
        for (int cash : cashSpending) {
            summarySpending += cash;
        }
        System.out.println("Итого траты составили " + summarySpending + " рублей");
        System.out.println();

        System.out.println("Задача №2");
        int[] cashSpending2 = {124_567, 802_333, 156_587, 133_355, 205_348};
        Arrays.sort(cashSpending2);
        System.out.println("Минимальная сумма трат за неделю составила " + cashSpending2[0] + " рублей. Максимальная сумма трат за неделю составила " + cashSpending2[cashSpending2.length - 1] + " рублей");
        System.out.println();

        System.out.println("Задача №3");
        int[] cashSpending3 = {130_567, 850_333, 170_587, 140_355, 230_344};
        float averageCashSpending;
        summarySpending = 0;
        for (int cash : cashSpending3) {
            summarySpending += cash;
        }
        averageCashSpending = (float) summarySpending / cashSpending3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCashSpending + " рублей");
        System.out.println();

        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char bufferChar;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            bufferChar = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = bufferChar;
        }
        for (char liter : reverseFullName) {
            System.out.print(liter);
        }
        System.out.println();
    }
}