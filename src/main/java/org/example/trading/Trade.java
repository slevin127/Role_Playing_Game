package org.example.trading;

import org.example.item.Items;
import org.example.subjects.Player;

public interface Trade {
    boolean trade(Player buyer, Items item);
}
