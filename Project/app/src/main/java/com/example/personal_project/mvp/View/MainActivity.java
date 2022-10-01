package com.example.personal_project.mvp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.personal_project.R;
import com.example.personal_project.mvp.Presenter.Contract;
import com.example.personal_project.mvp.Presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements Contract.View {
    private EditText number1;		//입력할 EditText
    private EditText number2;		//입력할 EditText
    private Button sumButton;
    private Contract.Presenter presenter;	//presenter와 통신하기 위해 객체 생성

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        presenter = new MainPresenter(this);
        init();
    }
    private void init(){
        sumButton = (Button)findViewById(R.id.sum);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);

        //버튼 클릭
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //결과 값 계산
                presenter.addNum(Integer.parseInt(number1.getText().toString()),
                        Integer.parseInt(number2.getText().toString()));
            }
        });
    }

    @Override
    public void showResult(int answer) {
        ((TextView)findViewById(R.id.result)).setText(Integer.toString(answer));
    }
}