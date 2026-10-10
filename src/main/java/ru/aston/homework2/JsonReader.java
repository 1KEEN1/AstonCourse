package ru.aston.homework2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JsonReader {
        private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Student> readStudents(String filePath) throws IOException {
        try (InputStream is = JsonReader.class.getResourceAsStream(filePath)) {
            if (is == null) {
                throw new IllegalStateException("File not found: " + filePath);
            }
            return objectMapper.readValue(is, new TypeReference<List<Student>>() {});
        }
    }
}