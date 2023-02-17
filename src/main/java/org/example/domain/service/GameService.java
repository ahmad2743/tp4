package org.example.domain.service;

import org.example.domain.kernel.Game;
import org.example.domain.kernel.Parser;
import org.example.domain.model.AdditionGame;
import org.example.infrastructure.InputParser;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class GameService {
    private Game game;
    List<String> argumentsList;
    Parser inputParser;

    GameService(Game game, List<String> argumentsList, Parser parser){
        this.game = game;
        this.argumentsList = argumentsList;
        this.inputParser = parser;
    }

    void run(){
        if (this.argumentsList.size() == 0 || this.argumentsList.size() == 1){
            throw new IllegalArgumentException("we need 2 or 3 arguments !");
        }
        else if (this.argumentsList.size() == 2){
            Parser inputParser = new InputParser();
            List<Integer> myListOfNumber = inputParser.readNumber(this.argumentsList.get(0));
            String operator = inputParser.readOperator(this.argumentsList.get(1));
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
        else if(this.argumentsList.size() == 3){
            throw new NotImplementedException();
        }
        else {
            throw new IllegalArgumentException("Too much argument: " + this.argumentsList.size());
        }
    }
}
