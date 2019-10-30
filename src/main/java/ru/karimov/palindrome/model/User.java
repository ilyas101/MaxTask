package ru.karimov.palindrome.model;

import java.util.HashSet;

/**
 * Created by 777 on 02.10.2019.
 */
public class User  {

    public User(String name) {
        this.name = name;
    }

    private String name;
    private int poins = 0;
    private HashSet<String> pallindromes = new HashSet<>();

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

    @Override
    public String toString() {
        return "User{" + "poins=" + poins + ", name='" + name + '\'' + '}';
    }
}
