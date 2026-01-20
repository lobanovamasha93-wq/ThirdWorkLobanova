public class BonusMilesService {

    public int calculate(int price) {
        final int  rublesPerMile = 20;
        return price / rublesPerMile;
    }
}