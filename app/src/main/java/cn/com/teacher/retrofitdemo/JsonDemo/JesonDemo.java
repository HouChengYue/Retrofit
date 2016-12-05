package cn.com.teacher.retrofitdemo.JsonDemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cn.com.teacher.retrofitdemo.JsonDemo.entity.Cook;
import cn.com.teacher.retrofitdemo.JsonDemo.entity.Tngou;
import cn.com.teacher.retrofitdemo.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者：侯程月
 * 时间： 2016/12/5  10:50
 * 邮箱：437286343@qq.com
 * jesondemo
 */

public class JesonDemo extends AppCompatActivity implements Callback<Tngou> {
    private ListView mLvActivitJsondome;
    private Cookadpter mCookadpter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsondome);
        initView();
        Retrofit lRetrofit = new Retrofit.Builder()
                .baseUrl("http://www.tngou.net")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Service lService = lRetrofit.create(Service.class);
        Call<Tngou> lCooks = lService.getCooks("cook", 0, 2, 20);
        lCooks.enqueue(this);
        mCookadpter = new Cookadpter(this, new ArrayList<Cook>());
        mLvActivitJsondome.setAdapter(mCookadpter);
    }

    @Override
    public void onResponse(Call<Tngou> call, Response<Tngou> response) {
        List<Cook> lCooks = response.body().getCooks();
        mCookadpter.addAll(lCooks);
    }

    @Override
    public void onFailure(Call<Tngou> call, Throwable t) {
        t.printStackTrace();
    }

    private void initView() {
        mLvActivitJsondome = (ListView) findViewById(R.id.lv_activit_jsondome);
    }
}
