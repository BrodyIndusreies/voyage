package com.example.nnguy637.voyage;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by nnguy637 on 11/12/2015.
 */
public class ProjectFragment extends Fragment
{
    private Project mProject;

public void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    mProject = new Project();
}

public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
{
    View v = inflater.inflate(R.layout.fragment_project, container, false);
    return v;

}
}
