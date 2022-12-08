package datastore;

import entity.DataType;
import entity.ListEntry;
import repository.DataStore;
import utils.Utils;

import javax.xml.crypto.Data;
import java.util.List;

public class ListDataStore {
    public void lAdd(String key, Object obj){
        if (DataStore.dataTypeMap.containsKey(key)) {
            ListEntry listEntry = DataStore.listEntryMap.get(key);
            listEntry.add(obj);
            System.out.println(listEntry.getList());
        }else {
            ListEntry listEntry = new ListEntry( Utils.getType(obj));
            listEntry.add(obj);
            DataStore.listEntryMap.put(key, listEntry);
            DataStore.dataTypeMap.put(key, DataType.LIST);
        }

    }
    public List<Object> get(String key){
        return DataStore.listEntryMap.get(key).getList();
    }
    public void delete(String key){
        if (DataStore.dataTypeMap.containsKey(key)) {
            DataStore.dataTypeMap.remove(key);
            DataStore.listEntryMap.remove(key);
        }
    }
}
