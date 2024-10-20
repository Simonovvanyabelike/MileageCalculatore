public class Main {
    public static void main(String[] args) {

        // Объявляем переменные для входных данных и параметров программы
        int ticketPrice = 13676; // стоимость билета в рублях
        int bonusMileCost = 20;   // количество рублей для одной бонусной мили

        // Рассчитываем количество накопленных миль
        int bonusMiles = ticketPrice / bonusMileCost;

        // Выводим результат на экран
        System.out.println("Начисленные бонусные мили: " + bonusMiles);
    }
}