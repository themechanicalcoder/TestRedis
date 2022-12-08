package entity;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class ListEntry extends Entry{
    List<Object> list;
    public DataType listEntryType;
    public ListEntry(DataType type){
        super(type);
        list = new ArrayList<>();
    }
    public void add(Object object){
        if (Utils.isValidDataType(this.dataType, object)){
            list.add(object);
        }else {
            throw new RuntimeException("Invalid DataType");
        }
    }
    public List<Object> getList(){
        return list;
    }
}
