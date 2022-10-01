package com.example.personal_project.mvp.Presenter;

public interface Contract {

    // View
    interface View {
        void showResult(int answer); //값을 보여줄 View 메소드 선언
    }

    // Presenter
    interface Presenter{
        void addNum(int num1, int num2);  //결과 값 구하기 위한 메소드 선언

        void saveData(int data); //
    }

}
