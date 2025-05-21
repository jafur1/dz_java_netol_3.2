public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        float height = 1.87F;
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
