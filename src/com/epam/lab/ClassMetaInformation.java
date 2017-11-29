package com.epam.lab;

/**
* Simple class that would be used for 
* getting metainformation via reflection.
*/
public class ClassMetaInformation<T> {
    private String secretCode;
    private T metaField;

    public ClassMetaInformation(String secretCode, T metaField) {
        this.secretCode = secretCode;
        this.metaField = metaField;
    }

    public T getMetaField() {
        return metaField;
    }

    public void setMetaField(T metaField) {
        this.metaField = metaField;
    }

}
