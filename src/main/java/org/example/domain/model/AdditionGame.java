package org.example.domain.model;

import org.example.domain.kernel.Game;

import java.util.ArrayList;
import java.util.List;

public class AdditionGame implements Game {
    private List<Integer> inputValue = new ArrayList<Integer>();
    private String operator;
    private int total = 0;

    public AdditionGame(List<Integer> input, String operator){
        this.inputValue = input;
        this.operator = operator;
    }

   public int getNumericalSequence(int number){
        int result = 0;
        for (int i = 1; i <= number; i++){
            result += i;
        }

        return result;
    }
    public String produceOutputWithAppropriateFormat(int number){
        int result = this.getNumericalSequence(number);
        return this.operator + Integer.toString(number) + " (=" + Integer.toString(result) + ") \n";
    }

    public StringBuilder run(){
        StringBuilder result = new StringBuilder("");
        for (int value: this.inputValue) {
            this.total += value;
            result.append(this.produceOutputWithAppropriateFormat(value));
        }
        result.append("----------------- \n");
        result.append("total = ").append(Integer.toString(this.total)).append("(addition").append(")");
        return result;
    }

    public int getSum(){
        return this.total;
    }

}
