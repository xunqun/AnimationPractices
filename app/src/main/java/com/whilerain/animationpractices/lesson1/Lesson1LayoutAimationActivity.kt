package com.whilerain.animationpractices.lesson1import android.os.Bundleimport android.support.v7.app.AppCompatActivityimport android.view.Viewimport android.widget.Buttonimport android.widget.LinearLayoutimport com.whilerain.animationpractices.Rclass Lesson1LayoutAimationActivity : AppCompatActivity() {    override fun onCreate(savedInstanceState: Bundle?) {        super.onCreate(savedInstanceState)        setContentView(R.layout.activity_lesson1_layout_aimation)        val list = findViewById<LinearLayout>(R.id.list)        val start = findViewById<Button>(R.id.start)        start.setOnClickListener { list.startLayoutAnimation() }    }}