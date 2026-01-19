public class BonusMilesService {

    public int calculate(int price) {
        final int RublesPerMile = 20;
        return price / RublesPerMile;
    }
}