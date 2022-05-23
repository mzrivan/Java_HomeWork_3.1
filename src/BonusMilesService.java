public class BonusMilesService {

    public int calculate(int price) {
        int mileCost = 20;        // количество рублей для одной бонусной милли
        int totalMiles = price / mileCost; //количество полученных бонусов
        return totalMiles;
    }
}
