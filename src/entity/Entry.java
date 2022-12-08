package entity;

public abstract class Entry {
    DataType dataType;
    Entry(DataType type) {
        this.dataType= type;
    }
}
