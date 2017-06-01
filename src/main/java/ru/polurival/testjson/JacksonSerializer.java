package ru.polurival.testjson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.Serializable;

public class JacksonSerializer {

    private ObjectMapper objectMapper = new ObjectMapper();

    public String serialize(Serializable object) throws JsonProcessingException {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
    }

    public <T> T deserialize(String from, Class<T> fromClass) throws IOException {
        return objectMapper.readValue(from, fromClass);
    }
}
