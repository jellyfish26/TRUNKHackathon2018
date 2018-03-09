package joken.ac.jp.omoroic

import io.reactivex.android.plugins.RxAndroidPlugins
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Util class
 */

class ApiBuilder{
    fun apiBuild() :Retrofit{
        return Retrofit.Builder()
                .baseUrl("https://trompot.mydns.jp/hack/api")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }
}
