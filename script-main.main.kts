@file:Repository("https://repo.maven.apache.org/maven2")
@file:Repository("https://jcenter.bintray.com")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-html-jvm:0.6.11")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.0")
@file:DependsOn("com.squareup.retrofit2:retrofit:2.9.0")
@file:DependsOn("com.squareup.retrofit2:converter-gson:2.9.0")
@file:Import("common.main.kts")

import kotlinx.html.*
import kotlinx.html.stream.*
import kotlin.system.exitProcess

println("Start")
args.forEach {
    println("- $it")
}
println(createHTML().html {
    body {
        h1 { +greeting }
    }
})

fetch()
println("End")
exitProcess(0)