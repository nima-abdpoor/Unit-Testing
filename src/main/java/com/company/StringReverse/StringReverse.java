package com.company.StringReverse;


import java.util.ArrayList;
import java.util.List;

public class StringReverse {
    List<String> tempArray;
    StringBuilder reversedString;

    public String Reverse(String s) {
        tempArray = new ArrayList<String>(s.length());
        for (int i = 0; i < s.length(); ++i)
            tempArray.add(s.substring(i, i + 1));
        reversedString = new StringBuilder();
        for (int i = tempArray.size() - 1; i >= 0; i--)
            reversedString.append(tempArray.get(i));
        return reversedString.toString();
    }
}
