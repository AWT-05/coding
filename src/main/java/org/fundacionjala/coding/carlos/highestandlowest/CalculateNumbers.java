package org.fundacionjala.coding.carlos.highestandlowest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculateNumbers {

    public List<Integer> colectNumbers(String numbers) {
        List<Integer> numbersList = new ArrayList<>();
        String[] splitNumbers = numbers.split(" ");
        for (int i=0; i<splitNumbers.length; i++){
            numbersList.add(Integer.parseInt(splitNumbers[i]));
        }
        return numbersList;
    }

    public String highestAndLowest(String numbers) {
       if (numbers.length()<=1){
           return numbers;
       }
       List<Integer> numbersList = colectNumbers(numbers);
       Collections.sort(numbersList);
       int highest= numbersList.get(numbersList.size()-1);
       int lowest= numbersList.get(0);
       return highest+" "+lowest;
    }
}
