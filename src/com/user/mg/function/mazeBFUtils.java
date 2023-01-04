package com.user.mg.function;

import com.user.mg.pojo.mazeByFound;

import java.util.LinkedList;
import java.util.List;

public class mazeBFUtils {
    List<mazeByFound> mazeByFounds = new LinkedList<>();
    private int size = 0;
    public int add(mazeByFound mazeByFoundI){
        int index = 0;
        for (mazeByFound mazeByFound : mazeByFounds){
            if(mazeByFound.getValue() > mazeByFoundI.getValue()){
                mazeByFounds.add(index,mazeByFoundI);
                return index;
            }
            index++;
        }
        mazeByFounds.add(index,mazeByFoundI);
        return index;
    }
    public mazeByFound pull(){
        mazeByFound mazeByFound = mazeByFounds.get(0);
        mazeByFounds.remove(0);
        return mazeByFound;
    }

}
