package org.example.domain.kernel;
import java.util.List;
import java.util.Map;

public interface Parser {
    List<Integer> readNumber(String filepath);
    String readOperator(String operator);
}
