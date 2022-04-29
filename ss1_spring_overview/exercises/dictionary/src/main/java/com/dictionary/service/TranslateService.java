package com.dictionary.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TranslateService implements ITranlateService {

    @Override
    public String translate(String vietnamese) {
        Map<String, String> mapDictionary = new HashMap<>();
        mapDictionary.put("cho", "dog");
        mapDictionary.put("meo", "cat");
        mapDictionary.put("oto", "car");
        mapDictionary.put("khi", "monkey");
        mapDictionary.put("tien", "money");
        mapDictionary.put("yeu", "love");
        mapDictionary.put("di", "go");
        mapDictionary.put("dung", "stand");
        mapDictionary.put("phia duoi", "under");
        String[] vietnameseArr = vietnamese.split(" ");
        String english ="";
        for(int i=0; i<vietnameseArr.length; i++){
            for (Map.Entry<String, String> entry : mapDictionary.entrySet()) {
                if (entry.getKey().equals(vietnameseArr[i])) {
                    english += entry.getValue() + " ";
                }
            }
        }
        if (english == "") {
            english = "not found";
        }
        return english;
    }
}
