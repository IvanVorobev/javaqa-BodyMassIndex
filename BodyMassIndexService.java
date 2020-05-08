public class BodyMassIndexService {
    public double calculate(double heightcent, double masskg) {
        double bodymassindex = masskg * 10000 / (heightcent*heightcent);
        return bodymassindex;
    }
}
