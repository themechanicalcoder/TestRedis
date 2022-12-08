package entity;

import utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SetEntry extends Entry {
    HashSet<Object> set;
    public DataType setEntryType;
    public SetEntry(DataType type){
        super(type);
        set = new HashSet<>();
    }
    public void add(Object object){
        if (Utils.isValidDataType(this.dataType, object)){
            set.add(object);
        }else {
            throw new RuntimeException("Invalid DataType");
        }
    }
    public HashSet<Object> getHashSet(){
        return set;
    }
    public boolean contains(String obj){
        return set.contains(obj);
    }
    public void delete(Object obj){
        set.remove(obj);
    }
}
