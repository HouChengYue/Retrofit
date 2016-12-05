package cn.com.teacher.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Retrofit 学习 (下载百度网页)
 * 1、建立接口（Service）
 * 2、jeson解析"http://www.tngou.net/api/cook/list'(菜谱JesonDome)
 */
public class MainActivity extends AppCompatActivity implements Callback<String> {

    private TextView mTvMain;
    private RelativeLayout mActivityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Retrofit lRetrofit = new Retrofit.Builder().baseUrl("http://www.baidu.com")
                .addConverterFactory(new Converter.Factory() {//(转换工厂)转换数据为String
                    @Override
                    public Converter<ResponseBody, ?>
                    responseBodyConverter(Type type,
                                          Annotation[] annotations, Retrofit retrofit) {
                        return new Converter<ResponseBody, String>() {//新建一个转换器转换为String
                            @Override
                            public String convert(ResponseBody value) throws IOException {
                                return value.string();
                            }
                        };
                    }
                }).build();
        Service service = lRetrofit.create(Service.class);//创建服务
        Call<String> call = service.getBaidu();
        call.enqueue(this);//异步请求
    }

    @Override
    public void onResponse(Call<String> call, Response<String> response) {
                mTvMain.setText(response.body());
    }

    //请求失败
    @Override
    public void onFailure(Call<String> call, Throwable t) {
        Toast.makeText(this, "请求失败！" + call.request().url(), Toast.LENGTH_SHORT).show();
        t.printStackTrace();//打印出错误栈
    }

    private void initView() {
        mTvMain = (TextView) findViewById(R.id.tv_main);
        mActivityMain = (RelativeLayout) findViewById(R.id.activity_main);
    }
}
