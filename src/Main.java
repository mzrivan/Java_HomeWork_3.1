public class Main {
    public static void main(String[] args) {

        int ticketCost = 20_000;   // стоимости билета
        int mileCost = 20;        // количество рублей для одной бонусной милли
        int totalMiles = ticketCost / mileCost; //количество полученных бонусов

        System.out.println("Начислено бонусов: " + totalMiles);
    }
}