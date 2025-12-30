package usingEnum;

import java.util.function.BiFunction;

public enum OperationEnum {
    SUM(Integer::sum, "+"), // uso do método de reference
    SUBTRACTION((Integer v1, Integer v2) -> v1 - v2, "-"),
    MULTIPLY((Integer v1, Integer v2) -> v1 * v2, "x"),
    DIVISION((Integer v1, Integer v2) -> v1 / v2, "/");

    // atributos
    private final BiFunction<Integer, Integer, Integer> calculate;
    private final String symbol;

    // construtor
    OperationEnum(BiFunction<Integer, Integer, Integer> calculate, String symbol){
        this.calculate = calculate;
        this.symbol = symbol;
    }

    // getters
    public BiFunction<Integer, Integer, Integer> getCalculate() {
        return calculate;
    }

    public String getSymbol() {
        return symbol;
    }
}
