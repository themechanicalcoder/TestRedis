package utils;

import entity.DataType;
import repository.DataStore;

public class Utils {
    public static DataType getType(Object object) {
        if (object instanceof Integer) {
            return DataType.INTEGER;
        }
        if (object instanceof Boolean) {
            return DataType.BOOLEAN;
        }
        if (object instanceof String) {
            return DataType.STRING;
        }
        return null;
    }

    public static boolean isValidDataType(DataType existingDataType, Object object){
        DataType receivedDatatype = getType(object);
        return receivedDatatype.equals(existingDataType);
    }
}
