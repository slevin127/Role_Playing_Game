package org.example;


import org.example.battle.Battle;

import org.example.item.DamagePotion;
import org.example.item.DexterityPotion;
import org.example.item.HealingPotion;
import org.example.subject.Player;
import org.example.subject.Tradesman;
import org.example.weapon.Axe;
import org.example.weapon.Sword;

import java.util.List;

public class Main {
    public static void main(String[] args) {




        //топоры
        Axe axe01 = new Axe("Боевое оружие", "Топор варвара",
            (byte) 12, 160, 20);
        Axe axe02 = new Axe("Боевое оружие", "Топор рыцаря",
            (byte) 18, 190, 26);
        Axe axe03 = new Axe("Боевое оружие", "Топор гнома",
            (byte) 21, 300, 15);
        Axe axe04 = new Axe("Орудие", "Топор лесника",
            (byte) 8, 140, 40);
        Axe axe05 = new Axe("Орудие", "Топор мясника",
            (byte) 30, 210, 10);


        //мечи
        Sword SwordOfSorrow = new Sword("Боевое оружие", "Меч - Печаль владельца",
            (byte) 13, 250, 20);
        Sword sword02 = new Sword("Боевое оружие", "Меч - Проклятого Стива",
            (byte) 17, 260, 17);
        Sword sword03 = new Sword("Боевое оружие", "Меч - Дарующий спокойствие",
            (byte) 15, 250, 30);
        Sword sword04 = new Sword("Боевое оружие", "Меч - Поцелуй дракона",
            (byte) 100, 700, 1);
        Sword sword05 = new Sword("Боевое оружие", "Тренировочный меч",
            (byte) 7, 100, 40);


        //зелья

        DamagePotion potionOfFury01 = new DamagePotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagePotion potionOfFury02 = new DamagePotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagePotion potionOfFury03 = new DamagePotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagePotion potionOfFury04 = new DamagePotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagePotion potionOfFury05 = new DamagePotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagePotion potionOfFury06 = new DamagePotion("Зелья характеристик",
            "Зелье ярости", 100, 10);
        DamagePotion potionOfFury07 = new DamagePotion("Зелья характеристик",
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


        DexterityPotion dexterityPotion01 = new DexterityPotion("Зелья характеристик",
            "Зелье ловкости", 100, 10);
        DexterityPotion dexterityPotion02 = new DexterityPotion("Зелья характеристик",
            "Зелье ловкости", 100, 10);
        DexterityPotion dexterityPotion03 = new DexterityPotion("Зелья характеристик",
            "Зелье ловкости", 100, 10);
        DexterityPotion dexterityPotion04 = new DexterityPotion("Зелья характеристик",
            "Зелье ловкости", 100, 10);
        DexterityPotion dexterityPotion05 = new DexterityPotion("Зелья характеристик",
            "Зелье ловкости", 100, 10);
        DexterityPotion dexterityPotion06 = new DexterityPotion("Зелья характеристик",
            "Зелье ловкости", 100, 10);
        DexterityPotion dexterityPotion07 = new DexterityPotion("Зелья характеристик",
            "Зелье ловкости", 100, 10);
        DexterityPotion dexterityPotion08 = new DexterityPotion("Зелья характеристик",
            "Зелье ловкости", 100, 10);
        DexterityPotion dexterityPotion09 = new DexterityPotion("Зелья характеристик",
            "Зелье ловкости", 100, 10);
        DexterityPotion dexterityPotion10 = new DexterityPotion("Зелья характеристик",
            "Зелье ловкости", 100, 10);


        //Торговцы
        Tradesman traderWeapon = new Tradesman("Торговец оружием", "Аркадий", 1000);
        traderWeapon.getInventory().addAll(List.of(axe01, axe02, axe03, axe04, axe05,
            SwordOfSorrow, sword02, sword03, sword04, sword05));




        Tradesman traderPotion = new Tradesman("Торговец зельями", "Ефим", 1000);
        traderPotion.getInventory().addAll(List.of(potionOfFury01, potionOfFury02,potionOfFury03, potionOfFury04, potionOfFury05,
            potionOfFury06, potionOfFury07, dexterityPotion01, dexterityPotion02, dexterityPotion03, dexterityPotion04
        , dexterityPotion05, dexterityPotion06, dexterityPotion07, dexterityPotion08, dexterityPotion08, dexterityPotion09, dexterityPotion10,
            healingPotion01, healingPotion02, healingPotion03, healingPotion04, healingPotion05, healingPotion06, healingPotion07,
            healingPotion07, healingPotion08, healingPotion09, healingPotion10));




        Player User01 = new Player("User", 1, 0,
            100, 10, 10, 150);

        Battle battle = new Battle(User01);
        battle.start();


    }
}
