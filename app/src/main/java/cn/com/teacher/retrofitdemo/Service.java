package cn.com.teacher.retrofitdemo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * 作者：侯程月
 * 时间： 2016/12/5  10:09
 * 邮箱：437286343@qq.com
 * 1.定义一个接口
 */

public interface Service {
    @GET("/")//网址下的子目录
    Call<String> getBaidu();//下载网页String的形式加载数据类型
}
