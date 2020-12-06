//Referred in script-main.main.kts
//All these dependencies have to be added to the main script as well
@file:Repository("https://repo.maven.apache.org/maven2")
@file:Repository("https://jcenter.bintray.com")
@file:DependsOn("com.squareup.retrofit2:retrofit:2.9.0")
@file:DependsOn("com.squareup.retrofit2:converter-gson:2.9.0")

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import kotlin.system.exitProcess

val greeting = "Hello, World!"

val fetch = {
    try {
        val client = OkHttpClient.Builder().build()
        val request = Request.Builder().url("https://jsonplaceholder.typicode.com/todos/1").build()
        val response: Response = client.newCall(request).execute()
        println(response.body()?.string())
    } catch (e: Exception) {
        print(e.message)
    }
}
//fetch()
//exitProcess(0)

//kotlinc -cp kotlin-main-kts.jar -script common.main.kts