package com.example.nnguy637.voyage;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 * Created by nnguy637 on 10/23/2015.
 */
public class Project {

    private UUID mID;

    private String mProjectTitle;
    private String mProjectDescription;
    private Date mStartDate;
    private Date mEndDate;
    private ArrayList mProjectMilestones;

    public Project()
    {
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }

    public String getProjectTitle() {
        return mProjectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        mProjectTitle = projectTitle;
    }

    public String getProjectDescription() {
        return mProjectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        mProjectDescription = projectDescription;
    }

    public ArrayList getProjectMilestones() {
        return mProjectMilestones;
    }

    public void setProjectMilestones(ArrayList projectMilestones) {
        mProjectMilestones = projectMilestones;
    }

}
