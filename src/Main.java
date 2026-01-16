//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создаём объект сервиса для расчёта миль
        BonusMilesService service = new BonusMilesService();

        // Задаём стоимость билета (можно менять для проверки)
        int price = 15_444;

        // Вызываем метод расчёта и получаем количество миль
        int miles = service.calculate(price);

        // Выводим результат на экран
        System.out.println("Стоимость билета: " + price + " рублей");
        System.out.println("Начислено бонусных миль: " + miles);
    }
}