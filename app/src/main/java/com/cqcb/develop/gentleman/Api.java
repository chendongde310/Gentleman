package com.cqcb.develop.gentleman;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by chen on 2017/3/16.
 */

public interface Api {

    @GET("data/Android/10/1")
    Observable<String> getRequest();



}
