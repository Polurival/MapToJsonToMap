package ru.polurival.testjson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Widget implements Serializable {

    private int x;
    private String y;

    @JsonProperty("properties")
    private Map<String, Object> properties = new HashMap<String, Object>();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @JsonIgnore
    public Map<String, Object> getProperties() {
        return properties;
    }

    @JsonIgnore
    public void setProperty(String key, Object value) {
        properties.put(key, value);
    }

    @Override
    public String toString() {
        return "Widget{" +
                "x=" + x +
                ", y='" + y + '\'' +
                ", properties=" + properties +
                '}';
    }
}
