package com.example.personal_project.mvp.Model;

import com.example.personal_project.mvp.Presenter.Contract;

//Model
public class MainModel {
    public int data = 0;

    Contract.Presenter presenter;

    public MainModel(Contract.Presenter presenter){
        this.presenter = presenter;
    }

    public void saveData (int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

}
