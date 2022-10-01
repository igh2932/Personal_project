package com.example.personal_project.mvp.Presenter;

import com.example.personal_project.mvp.Model.MainModel;

public class MainPresenter implements Contract.Presenter{
    Contract.View view;
    MainModel mainModel;

    public MainPresenter(Contract.View view){
        this.view = view;                   //Activty View정보 가져와 통신
        mainModel = new MainModel(this);    //Model 객체 생성
    }

    //Presenter를 상속하고 addNum 구현
    @Override
    public void addNum(int num1, int num2){
        int num3 = 0;
        num3 = num1 + num2;
        saveData(num3);
        view.showResult(num3 + mainModel.getData());
    }

    @Override
    public void saveData(int data) {
        mainModel.saveData(data);
    }

}
