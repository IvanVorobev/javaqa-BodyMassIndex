public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double heightcent = 179.5;
        double masskg = 83.800;
        double bodymassindex = service.calculate(heightcent, masskg);
        System.out.println(bodymassindex);

    }
}