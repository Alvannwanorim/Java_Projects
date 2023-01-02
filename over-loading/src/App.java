public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inches and feet input " + convertToCentimeter(3, 4) + "cm");
        System.out.println("Inches input " + convertToCentimeter(12) + "cm");
    }

    public static double  convertToCentimeter(int inches) {
        return inches * 2.54;
        
    }

    public static double  convertToCentimeter(int feet, int inches) {
        int feetToInches = (feet * 12) + inches;
        return convertToCentimeter(feetToInches);
        
    }
}
