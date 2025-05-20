public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        float height = 1.87F;
        float bmi = service.calculate(weight, height);
        Integer bmi1 = (int) bmi;
        System.out.println(bmi1);
    }
}