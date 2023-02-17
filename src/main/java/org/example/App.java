package org.example;

import org.example.domain.kernel.Game;
import org.example.domain.kernel.Parser;
import org.example.domain.model.AdditionGame;
import org.example.infrastructure.InputParser;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length == 0 || args.length == 1){
            throw new IllegalArgumentException("we need 2 or 3 arguments !");
        }
        else if (args.length == 2){
            Parser inputParser = new InputParser();
            List<Integer> myListOfNumber = inputParser.readNumber(args[0]);
            String operator = inputParser.readOperator(args[1]);
            if (operator.equals("+")){
                Game additionGame = new AdditionGame(myListOfNumber, operator);
                System.out.println(additionGame.run());
            }
            if(operator.equals("-")){
                throw new NotImplementedException();
            }
            if (operator.equals("*")){
                throw new NotImplementedException();
            }
            else{
                throw new IllegalArgumentException("the second arguments must be +, - or * !");
            }
        }
        else if(args.length == 3){
            throw new NotImplementedException();
        }
        else {
            throw new IllegalArgumentException("Too much argument: " + args.length);
        }
    }
}
