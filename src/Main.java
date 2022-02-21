import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Введите размер списка, числом");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите верхнюю границу значений элементов в списке");
        int m = Integer.parseInt(scanner.nextLine());

        logger.log("Создаём и заполняем список");

        List<Integer> sourse = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sourse.add(new Random().nextInt(m));
        }

        System.out.println("Вот случайный список: " + sourse);
        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите нижнюю границу фильтрации, числом");
        int f = Integer.parseInt(scanner.nextLine());
        Filter filter = new Filter(f);

        logger.log("Выводим результат на экран");

        System.out.println(filter.filterOut(sourse));

    }

}
