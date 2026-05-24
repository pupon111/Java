/*
6. Suppose that in Section 4.3.2, the Item.equals method uses an instanceof test.
Implement DiscountedItem.equals so that it compares only the superclass if
otherObject is an Item, but also includes the discount if it is a DiscountedItem. Show
that this method preserves symmetry but fails to be transitive—that is, find a
combination of items and discounted items so that x.equals(y) and y.equals(z), but
not x.equals(z).
 */

package org.example.chapter04.task06;

public class Main {
    static void main() {
        Item x = new Item("A", 100);
        DiscountedItem y = new DiscountedItem("A", 100, 10);
        DiscountedItem z = new DiscountedItem("A", 100, 20);

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(y.equals(z));
    }
}
