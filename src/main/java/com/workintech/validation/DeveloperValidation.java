package com.workintech.validation;

import com.workintech.model.Developer;

import java.util.Map;

public class DeveloperValidation {
    public static boolean isDeveloperExist(Map<Integer, Developer> developers, int id){
        return developers.containsKey(id);
    }
}
