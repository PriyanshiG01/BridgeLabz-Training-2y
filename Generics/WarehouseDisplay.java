package oops;
import java.util.*;

abstract class WarehouseItem {}
class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();
    public void add(T item) { items.add(item); }
}

class WarehouseDisplay {
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem w : items)
            System.out.println(w.getClass().getSimpleName());
    }
}
