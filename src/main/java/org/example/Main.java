package org.example;


import org.example.item.DamagPotion;
import org.example.item.HealingPotion;
import org.example.subjects.Player;
import org.example.subjects.Tradesman;
import org.example.weapon.Axe;
import org.example.weapon.Sword;

public class Main {
    public static void main(String[] args) {



        //Торговцы
        Tradesman trader01 = new Tradesman("Торговец оружием", "Аркадий", 1000);
        Tradesman trader02 = new Tradesman("Торговец зельями", "Ефим", 1000);



        //топоры
        Axe axe01 = new Axe("Боевое оружие", "Топор варвара",
            (byte)12,160, 20 );
        Axe axe02 = new Axe("Боевое оружие", "Топор рыцаря",
            (byte)18,190, 26 );
        Axe axe03 = new Axe("Боевое оружие", "Топор гнома",
            (byte)21,300, 15 );
        Axe axe04 = new Axe("Орудие", "Топор лесника",
            (byte)8,140, 40 );
        Axe axe05 = new Axe("Орудие", "Топор мясника",
            (byte)30,210, 10 );


        //мечи
        Sword SwordOfSorrow = new Sword("Боевое оружие", "Меч - Печаль владельца",
            (byte)13, 250, 20  );
        Sword sword02 = new Sword("Боевое оружие", "Меч - Проклятого Стива",
            (byte)17, 260, 17  );
        Sword sword03 = new Sword("Боевое оружие", "Меч - Дарующий спокойствие",
            (byte)15, 250, 30  );
        Sword sword04 = new Sword("Боевое оружие", "Меч - Поцелуй дракона",
            (byte)100, 700, 1  );
        Sword sword05 = new Sword("Боевое оружие", "Тренировочный меч",
            (byte)7, 100, 40  );


        //зелья

        DamagPotion PotionOfFury01 = new DamagPotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagPotion PotionOfFury02 = new DamagPotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagPotion PotionOfFury03 = new DamagPotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagPotion PotionOfFury04 = new DamagPotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagPotion PotionOfFury05 = new DamagPotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagPotion PotionOfFury06 = new DamagPotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagPotion PotionOfFury07 = new DamagPotion("Зелья характеристик",
            "Зелье ярости", 100, 10);

        HealingPotion healingPotion01 = new HealingPotion("Зелья характеристик",
            "Зелье лечения", 200, 30);
        HealingPotion healingPotion02 = new HealingPotion("Зелья характеристик",
            "Зелье лечения", 200, 30);
        HealingPotion healingPotion03 = new HealingPotion("Зелья характеристик",
            "Зелье лечения", 200, 30);
        HealingPotion healingPotion04 = new HealingPotion("Зелья характеристик",
            "Зелье лечения", 200, 30);
        HealingPotion healingPotion05 = new HealingPotion("Зелья характеристик",
            "Зелье лечения", 200, 30);
        HealingPotion healingPotion06 = new HealingPotion("Зелья характеристик",
            "Зелье лечения", 200, 30);
        HealingPotion healingPotion07 = new HealingPotion("Зелья характеристик",
            "Зелье лечения", 200, 30);
        HealingPotion healingPotion08 = new HealingPotion("Зелья характеристик",
            "Зелье лечения", 200, 30);
        HealingPotion healingPotion09 = new HealingPotion("Зелья характеристик",
            "Зелье лечения", 200, 30);
        HealingPotion healingPotion10 = new HealingPotion("Зелья характеристик",
            "Зелье лечения", 200, 30);
        HealingPotion healingPotion11 = new HealingPotion("Зелья характеристик",
            "Зелье лечения", 200, 30);

        Player User01 = new Player("User", 1, 0,
            100,10, 10, 150);


    }
}
