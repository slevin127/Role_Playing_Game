package org.example.battle;

import java.util.Scanner;

import org.example.subject.Orc;
import org.example.subject.Player;
import org.example.subject.Skeleton;


public class Battle {
    private int quantityOfEnemy = 0;
    private int quantityOfDeaths = 0;
    private Player player;
    private Win game;
    private Scanner scanner = new Scanner(System.in);


    public Battle(Player player) {
        this.player = player;
        this.game = new Win(player);
    }

    public void start() {
        while (true) {
            // Запрашиваем первый ход
            System.out.print("Начало игры !" + "\nВаш ход" + player.getName() +
                "\n1. Пойти подраться" + "\n2. Пойти в магазин" + "\n 3. Выйти из игры");

            String action = scanner.next();  // Считываем операцию.
            if (action.equals("3")) {
                System.out.println("Выход из игры...");
                System.out.println("Статистика:");
                System.out.println("Убитых врагов " + quantityOfEnemy);
                System.out.println("Количество смертей " + quantityOfDeaths);

            }
            if (action.equals("1")) {
                System.out.println("Вы выбрали пункт подраться, куда пойдем драться, в 1. Лес " +
                    "или 2. Пещера");
                String location = scanner.next();

                if (location.equals("1")) {
                    System.out.println("Отлично, идем в лес к скелетам");
                    // запускаем два потока один на скелета, второй на пользователя,
                    // сражение
                    Skeleton skel01 = new Skeleton("Skellet", 1, 10, 50,
                        20, 30, 10);

                    // Тут должно быть сражение. Пока просто проверка:
                    if (player.getLive() <= 0) {
                        quantityOfDeaths++;
                    }

                    if (skel01.getLive() <= 0) {
                        game.giveReward(20, 10);
                        quantityOfEnemy++;
                    }
                } else if (location.equals("2")) {
                    System.out.println("Отлично, идем в пещеры к оркам");

                    Orc orc01 = new Orc("Орк", 1, 10, 50,
                        20, 30);

                    // Тут должно быть сражение. Пока просто проверка:
                    if (player.getLive() <= 0) {
                        quantityOfDeaths++;
                    }

                    if (orc01.getLive() <= 0) {
                        game.giveReward(20, 10);
                        quantityOfEnemy++;
                    }
                    // запускаем два потока один на орка, второй на пользователя,
                    // сражение
                } else {
                    System.out.println("Неверный выбор локации.");
                }
            } else {
                System.out.println("Неверная операция.");

            }
            if (action.equals("2")) {
                System.out.println("Вы выбрали пункт отправиться к торговцу, " +
                    "к какому пойдем? Есть 1. Торговец оружием и 2. Торговец зельями");
                String traders = scanner.next();
                if (traders.equals("1")) {
                    System.out.println("Перечень товаров " + );
                }

            }
        }
    }
}
