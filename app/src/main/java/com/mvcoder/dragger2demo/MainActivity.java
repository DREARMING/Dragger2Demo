package com.mvcoder.dragger2demo;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mvcoder.dragger2demo.inherit.bean.Son;
import com.mvcoder.dragger2demo.simple.bean.Man;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btInject)
    Button btInject;
    @BindView(R.id.btQualifier)
    Button btQualifier;
    @BindView(R.id.btLazy)
    Button btLazy;
    @BindView(R.id.bScope)
    Button bScope;
    @BindView(R.id.btDependency)
    Button btDependency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btInject, R.id.btQualifier, R.id.btLazy, R.id.bScope, R.id.btDependency})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btInject:
                btSimpleInject();
                break;
            case R.id.btQualifier:
                btQualifierInject();
                break;
            case R.id.btLazy:
                testInhert();
                break;
            case R.id.bScope:
                testScope();
                break;
            case R.id.btDependency:
                testDependency();
                break;
        }
    }

    private void btSimpleInject(){
        Man man = new Man();
        man.getCar().go();
    }

    private void btQualifierInject(){
        com.mvcoder.dragger2demo.qualifier.bean.Man man = new com.mvcoder.dragger2demo.qualifier.bean.Man();
        man.getCar().go();
    }

    private void testScope(){
        com.mvcoder.dragger2demo.scope.bean.Man man = new com.mvcoder.dragger2demo.scope.bean.Man();
        man.getCar().go();
    }

    private void testDependency(){
        com.mvcoder.dragger2demo.dependency.bean.Man man = new com.mvcoder.dragger2demo.dependency.bean.Man();
        man.getCar().go();
    }

    private void testInhert(){
        Son son = new Son();
        son.drive();
    }

}
