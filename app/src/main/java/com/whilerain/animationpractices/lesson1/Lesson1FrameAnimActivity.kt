package com.whilerain.animationpractices.lesson1import android.graphics.drawable.Animatableimport android.graphics.drawable.Drawableimport android.os.Bundleimport android.support.v7.app.AppCompatActivityimport android.view.Viewimport android.widget.ImageViewimport com.whilerain.animationpractices.Rclass Lesson1FrameAnimActivity : AppCompatActivity() {    override fun onCreate(savedInstanceState: Bundle?) {        super.onCreate(savedInstanceState)        setContentView(R.layout.activity_lesson1_frame_anim)        val img = findViewById<ImageView>(R.id.img)        img.setOnClickListener { v ->            val attackAnimation = v.background            if (attackAnimation is Animatable) {                (attackAnimation as Animatable).start()            }        }    }}