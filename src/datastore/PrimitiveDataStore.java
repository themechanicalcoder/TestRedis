package datastore;

import entity.DataType;
import repository.DataStore;
import utils.Utils;

public class PrimitiveDataStore {

    public void set(String key, Object value) {
        DataType actualType = Utils.getType(value);
        if (actualType == null) {
            throw  new RuntimeException("Unknown datatype");
        }
        if (DataStore.primitiveMap.containsKey(key)) {
            DataType existingType = DataStore.dataTypeMap.get(key);
            if (actualType != existingType) {
                throw  new RuntimeException("Cannot change the type of a key");
            }
            DataStore.primitiveMap.put(key, value);
            }
        else {
            DataStore.dataTypeMap.put(key, actualType);
            DataStore.primitiveMap.put(key, value);
        }

    }

    public Object get(String key) {
        return DataStore.primitiveMap.get(key);
    }
}
