import java.util.Scanner;

public class Calculator {
    static Converter converter = new Converter();

    public static void main(String[] args) {


        Scanner dm = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String vvod = dm.nextLine();

        char[] oper = new char[10];
        char operator = 0;
        for (int i = 0; i < vvod.length(); i++) {
            oper[i] = vvod.charAt(i);
            if (oper[i] == '+') {
                operator = '+';
            } else if (oper[i] == '-') {
                operator = '-';
            } else if (oper[i] == '*') {
                operator = '*';
            } else if (oper[i] == '/') {
                operator = '/';
            }
        }
        String[] qw = vvod.replaceAll(" ","").split("[+-/*]");
        String r1 = qw[0];
        String r2 = qw[1];
        int rim1 = converter.rimArab(r1);
        int rim2 = converter.rimArab(r2);
        int rezultat = 0;
        if (rim1 > 0 && rim1 <= 10 && rim2 <= 10 && rim2 > 0) {


                switch (operator) {
                    case '+':
                        rezultat = rim1 + rim2;
                        break;
                    case '-':
                        rezultat = rim1 - rim2;
                        break;
                    case '*':
                        rezultat = rim1 * rim2;
                        break;
                    case '/':
                        rezultat = rim1 / rim2;
                        break;
                    default:
                        System.out.println("Неверный символ");


                }
                if (rezultat > 0) {
                    System.out.println(ArabVrim.values()[rezultat]);

                } else {
                    System.out.println("В римском нет отрицательного результата");}
        } else {
            int arab1 = Integer.parseInt(qw[0]);
            int arab2 = Integer.parseInt(qw[1]);
           String rezultatAr = "";

            if (arab1 > 0 && arab1 <= 10 && arab2 > 0 && arab2 <= 10) {
                switch (operator) {
                    case '+':
                        rezultatAr = String.valueOf(arab1 + arab2);
                        break;
                    case '-':
                        rezultatAr = String.valueOf(arab1 - arab2);
                        break;
                    case '*':
                        rezultatAr = String.valueOf(arab1 * arab2);
                        break;
                    case '/':
                        rezultatAr = String.valueOf( arab1 / arab2);
                        break;
                    default:
                        rezultatAr = "Не верный знак";
                }
                System.out.println(rezultatAr);
            } else {
                System.out.println("Ввели цифру меньше одного или больше 10");}

        }


    }

}
