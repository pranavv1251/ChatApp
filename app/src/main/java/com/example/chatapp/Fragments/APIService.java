package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA_L2CJdY:APA91bFrGArFikDu_9E-5t7DsGZlx-W4l3IuMDywPk1UobDwTqIyQBcgHWNNtE1KN9kGQ4tEsSQE74fuh6WWkX3boT9GVCePY6w6nbVfbuuY9Ha_Sdhqf4P-Zp37Fvn4O61jPJkocgJQ"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}