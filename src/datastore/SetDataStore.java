package datastore;

import entity.DataType;
import entity.ListEntry;
import entity.SetEntry;
import repository.DataStore;
import utils.Utils;

import java.util.HashSet;

public class SetDataStore {
    public void sAdd(String key, Object value){
        if (DataStore.dataTypeMap.containsKey(key)) {
            SetEntry setEntry = DataStore.setEntryMap.get(key);
            setEntry.add(value);
            System.out.println(setEntry.getHashSet());
        }else {
            SetEntry setEntry = new SetEntry( Utils.getType(value));
            setEntry.add(value);
            DataStore.setEntryMap.put(key, setEntry);
            DataStore.dataTypeMap.put(key, DataType.SET);
        }
    }
    public HashSet<Object> sGet(String key){
        return DataStore.setEntryMap.get(key).getHashSet();
    }

    public boolean sDel (String key, Object value) {
        if (DataStore.dataTypeMap.containsKey(key)) {
            SetEntry setEntry = DataStore.setEntryMap.get(key);
            setEntry.delete(value);
            System.out.println(setEntry.getHashSet());
            return true;
        }
        return false;
    }
}
