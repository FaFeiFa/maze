package com.user.mg.function;

import com.user.mg.pojo.mazeByFound;

import java.util.LinkedList;
import java.util.List;

public class mazeBFUtils {
    List<mazeByFound> mazeByFounds;
    private int size = 0;
    public mazeBFUtils(LinkedList<mazeByFound> mazeByFounds){
        this.mazeByFounds = mazeByFounds;
    }
    public int add(mazeByFound mazeByFoundI){
        int index = 0;
        for (mazeByFound mazeByFound : mazeByFounds){
            if(mazeByFound.getValue() > mazeByFoundI.getValue()){
                mazeByFounds.add(index,mazeByFoundI);
                break;
            }
            index++;
        }
        return index;
    }

}
