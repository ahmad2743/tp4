package org.example.infrastructure;

import org.example.domain.kernel.Parser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InputParser implements Parser {


    public List<Integer> readNumber(String filepath) {
        List<Integer> myNumbers = new ArrayList<Integer>();
        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myNumbers.add(Integer.parseInt(data));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error !");
            e.printStackTrace();
        }
        return myNumbers;
    }

    public String readOperator(String operator) {
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")){
            return operator;
        }
        return "operator not valid";
    }
}
