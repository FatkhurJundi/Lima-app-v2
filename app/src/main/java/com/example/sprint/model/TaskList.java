package com.example.sprint.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by auzan on 10/22/2019.
 * Github: @auzanassdq
 */
public class TaskList {
    @SerializedName("results")
    private ArrayList<Task> results;

    public ArrayList<Task> getResults() {
        return results;
    }

    public void setResults(ArrayList<Task> results) {
        this.results = results;
    }
}
