public class BonusMilesService {

    public int calculate(int price) {
        final int RUBLES_PER_MILE = 20;  // Константа: рублей за 1 милю
        return price / RUBLES_PER_MILE;
    }
}