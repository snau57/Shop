package com.rachen0101.shop

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

/*Android Studio 4.1 必須手動增加的擴充外掛：
於 Gradle Scripts > build.gradle (Module:...app) 的最上方的 plugins區塊，
增加 id 'kotlin-kapt' 及 id 'kotlin-android-extensions' 並同步(Sync Now)*/

/*雲端電商App準備工作：
1.使用瀏覽器到 https://firebase.google.com 並從網站畫面右上角登入專案開發將使用的Google帳號
2.開啓 Android Studio 建立具有Material Design的 Basic Activity 新專案 (使用Kotlin語言，API 19以上)
3.等專案建置完成後，按畫面右上方的"人像登入圖示" Sign In 同一個專案開發Google帳號，並允許Android Studio的存取帳戶權限
4.使用上方功能列 Tools > Firebase 點選 Authentication 並依第1項步驟建立並連結 Firebase專案(以FirebaseShop為例)
5.接著點選第2項步驟，將Firebase會員認證的類別庫加入此App專案中
6.再使用瀏覽器搜尋 firebase gradle 連結到 Firebase文獻資料網站，並找到網頁中關於 build.gradle 設定的 com.google.gms:google-services:4.3.5(新版號)
  與 Authentication 設定的 com.google.firebase:firebase-auth:20.0.3(新版號)
7.開啓 Gradle Scripts > build.gradle(Project) 及 build.gradle(Module)，並依上列的設定修改為最新版本後，再按右上方 Sync Now 進行同步*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}