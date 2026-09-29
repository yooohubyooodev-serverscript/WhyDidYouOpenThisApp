package com.kkso882.whydidyouopen

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 96, 48, 48)
        }

        val question = TextView(this).apply {
            text = getString(R.string.question)
            textSize = 28f
        }

        val answer = TextView(this).apply {
            textSize = 20f
            setPadding(0, 48, 0, 48)
        }

        val dontKnow = Button(this).apply {
            text = getString(R.string.dont_know)
            setOnClickListener {
                answer.text = getString(R.string.answer)
            }
        }

        val exit = Button(this).apply {
            text = getString(R.string.exit)
            setOnClickListener {
                finish()
            }
        }

        root.addView(question)
        root.addView(answer)
        root.addView(dontKnow)
        root.addView(exit)

        setContentView(root)
    }
}
