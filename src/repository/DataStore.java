package repository;

import entity.DataType;
import entity.ListEntry;
import entity.SetEntry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStore {

    // type map
    public static Map<String, Object> primitiveMap = new HashMap<>();
    public static Map<String, DataType> dataTypeMap = new HashMap<>();


    // actual storage
    public static Map<String, ListEntry> listEntryMap = new HashMap<>();
    public static Map<String, SetEntry> setEntryMap = new HashMap<>();

}
