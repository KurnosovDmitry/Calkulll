public class Converter {
    int rimArab(String rim) {
        try {
            if (rim.equals("I")) {
                return 1;
            }
            if (rim.equals("II")) {
                return 2;
            }
            if (rim.equals("III")) {
                return 3;
            }
            if (rim.equals("IV")) {
                return 4;
            }
            if (rim.equals("V")) {
                return 5;
            }
            if (rim.equals("VI")) {
                return 6;
            }
            if (rim.equals("VII")) {
                return 7;
            }
            if (rim.equals("VIII")) {
                return 8;
            }
            if (rim.equals("IX")) {
                return 9;
            }
            if (rim.equals("X")) {
                return 10;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
