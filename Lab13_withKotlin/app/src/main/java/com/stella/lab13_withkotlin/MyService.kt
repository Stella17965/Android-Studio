package com.stella.lab13_withkotlin

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {
    private var channel = ""
    private lateinit var thread: Thread
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        //解析 Intent 取得字串訊息
        intent?.extras?.let {
            channel = it.getString("channel", "")
        }
        broadcast(
            when(channel) {
                "music" -> "歡迎來到音樂頻道"
                "new" -> "歡迎來到新聞頻道"
                "sport" -> "歡迎來到體育頻道"
                else -> "頻道發生錯誤"
            }
        )
        //若 thread 被初始化過且正在運行，則中斷它
        if (::thread.isInitialized && thread.isAlive)
            thread.interrupt()
        thread = Thread {
            try {
                Thread.sleep(2000) //延遲兩秒
                broadcast(
                    when(channel) {
                        "music" -> "即將為您播放本月 TOP10 日本"
                        "new" -> "即將為您提供獨家新聞"
                        "sport" -> "即將播報 2020世大運 賽事"
                        else -> "頻道發生錯誤"
                    }
                )
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
        thread.start() //啟動執行緒
        return START_STICKY
    }
    override fun onBind(intent: Intent): IBinder? = null
    //發送廣播
    private fun broadcast(msg: String) =
        sendBroadcast(Intent(channel).putExtra("msg", msg))
}