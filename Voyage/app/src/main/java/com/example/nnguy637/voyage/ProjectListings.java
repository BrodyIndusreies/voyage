package com.example.nnguy637.voyage;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by nnguy637 on 11/1/2015.
 */
//singleton class to hold projects

public class ProjectListings {

    private static ProjectListings sProjectListings;
    private ArrayList<Project> mProjects;

    public static ProjectListings get(Context context) {
        if (sProjectListings == null) {
            //sProjectListings = new ProjectListings(context);
        }
        return sProjectListings;
    }

    public List<Project> getProjects() {
        return mProjects;
    }

    public Project getProject(UUID id) {
        for (Project project : mProjects) {
            if (project.getID().equals(id)) {
                return project;
            }
        }
        return null;
    }
}
