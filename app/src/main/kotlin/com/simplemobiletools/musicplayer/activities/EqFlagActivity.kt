// FLAG: Lou / Equalizer — exported component (OWASP MASVS-PLATFORM-1)
// Launch with: adb shell am start -n com.simplemobiletools.musicplayer/.activities.EqFlagActivity
package com.simplemobiletools.musicplayer.activities

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class EqFlagActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val flag = getString(com.simplemobiletools.musicplayer.R.string.eq_exported_flag)
        setContentView(TextView(this).apply { text = flag })
        setResult(RESULT_OK, intent.putExtra("flag", flag))
    }
}