package com.mvcoder.dragger2demo.android.activity;

import android.os.Bundle;
import android.widget.Button;

import com.blankj.utilcode.util.LogUtils;
import com.mvcoder.dragger2demo.R;
import com.mvcoder.dragger2demo.android.bean.Presenter;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class InjectActivity extends AppCompatActivity {

    @Inject
    Presenter mPresenter;
    @BindView(R.id.btInject)
    Button btInject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        setContentView(R.layout.activity_inject);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btInject)
    public void onViewClicked() {
        if(mPresenter != null){
            mPresenter.print();
        }else{
            LogUtils.d("inject fail! presenter is null");
        }
    }
}
