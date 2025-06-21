package org.example.trading;

import org.example.item.Item;
import org.example.subject.Player;

public interface Trade {
    boolean trade(Player buyer, Item item);
}
