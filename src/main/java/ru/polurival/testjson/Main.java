package ru.polurival.testjson;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        JacksonSerializer jacksonSerializer = new JacksonSerializer();

        Widget widget = new Widget();
        widget.setX(5);
        widget.setY("this is y");
        widget.setProperty("key1", "value1");
        widget.setProperty("key2", 3);
        widget.setProperty("key3", 3.67d);
        widget.setProperty("key4", false);
        widget.setProperty("key5", null);
        System.out.println(widget);

        String json = jacksonSerializer.serialize(widget);
        System.out.println(json);

        Widget sameWidget = jacksonSerializer.deserialize(json, Widget.class);
        System.out.println(sameWidget);

        String sameJson = jacksonSerializer.serialize(sameWidget);
        System.out.println(sameJson);
    }
}
