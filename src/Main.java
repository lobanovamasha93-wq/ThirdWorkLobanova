//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int price = 13_745;

        int miles = service.calculate(price);

        // Выводим результат на экран
        System.out.println("Стоимость билета: " + price + " рублей");
        System.out.println("Начислено бонусных миль: " + miles);
    }
}