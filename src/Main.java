import datastore.ListDataStore;
import datastore.PrimitiveDataStore;
import datastore.SetDataStore;

public class Main {
    public static void main(String[] args) {

        PrimitiveDataStore dataStore = new PrimitiveDataStore();
        dataStore.set("Gourav", "Roy");
        dataStore.set("Gourav", "a");
        ListDataStore listDataStore = new ListDataStore();
        listDataStore.lAdd("abcd", 1);
        listDataStore.lAdd("abcd", 2);
        listDataStore.lAdd("abcd", 3);

        SetDataStore setDataStore = new SetDataStore();
        setDataStore.sAdd("key", 5);
        setDataStore.sAdd("key", 6);
        setDataStore.sAdd("key", 7);

        setDataStore.sDel("key", 6);

        System.out.println(setDataStore.sGet("key"));
        System.out.println(listDataStore.get("abcd"));
        System.out.println(dataStore.get("Gourav"));
    }
}