public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Inches and feet input " + convertToCentimeter(3, 4) + "cm");
        // System.out.println("Inches input " + convertToCentimeter(12) + "cm");
        // switchStatement();
        // forStatement();
        System.out.println(sumDigits(123455));
    }

    public static double  convertToCentimeter(int inches) {
        return inches * 2.54;
        
    }

    public static double  convertToCentimeter(int feet, int inches) {
        int feetToInches = (feet * 12) + inches;
        return convertToCentimeter(feetToInches);
        
    }

    public static void switchStatement(){
        int num = 7;

        switch(num){
            case 1 -> System.out.println("Value is 1 ");
            case 2, 3 -> {
                System.out.println("value is 2 or 2");
                System.out.println("The exact value is" + num);
            }
            case 4, 5 -> {
                System.out.println("value is 4 or 5");
                System.out.println("The exact value is" + num);
            }
            default -> System.out.println("Default value is " + num);
        }
    }

    public static String switchMonths(String name){
        switch (name.toUpperCase()) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "Ist";

        }

        return "invalid";
    }
    public static String switchMonthsUpdated(String name){
        return switch (name.toUpperCase()) {
            case "JANUARY", "FEBRUARY", "MARCH" ->  "1st";
            default -> "invalid";
        };
    }

    public static void forStatement(){
        for(int i =0; i< 10; i += 1){
            System.out.println(i);
        }

        for(double i = 1.3; i > 0.2; i-= 0.2){
            System.out.println(i);
        }
    }

    public static int sumDigits(int number){
        int sum = 0;

        if (number < 0) return -1;
        while (number > 9){
            sum += number % 10;
            number = number / 10;
        }
        sum += number;
        return sum ;

    }
}
