package cn.com.teacher.retrofitdemo.JsonDemo;

import cn.com.teacher.retrofitdemo.JsonDemo.entity.Tngou;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 作者：侯程月
 * 时间： 2016/12/5  11:10
 * 邮箱：437286343@qq.com
 */

public interface Service {
//    @GET("/api/{category}/list")//  category Path 路径 @Query
    @POST("/api/{category}/list")
    @FormUrlEncoded//用属性上传 @Field
    Call<Tngou> getCooks(@Path("category")String  category, @Field("id") int id, @Query("page") int page, @Query("rows") int rows);
}
