package ru.karimov.pallindrome.model;

import java.util.HashSet;

/**
 * Created by 777 on 02.10.2019.
 */
public class User {
    private String name;
    private int poins = 0;
    private HashSet<String> pallindromes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoins() {
        return poins;
    }

    public void setPoins(int poins) {
        this.poins = poins;
    }

    public HashSet<String> getPallindromes() {
        return pallindromes;
    }

    public void setPallindromes(HashSet<String> pallindromes) {
        this.pallindromes = pallindromes;
    }
}
