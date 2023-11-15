package com.example.mypaintapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.mihir.drawingcanvas.drawingView

class MainActivity : AppCompatActivity() {

    private lateinit var btn_Redo: ImageButton
    private lateinit var btn_Undo: ImageButton
    private lateinit var btn_Color: ImageButton
    private lateinit var btn_Brush: ImageButton
    private lateinit var btn_Clear: ImageButton
    private lateinit var dr_view:drawingView

    //in onCreate()
    // textView = findViewById(R.id.textView)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btn_Brush = findViewById(R.id.btn_brush)
        btn_Color = findViewById(R.id.btn_base_color)
        btn_Undo = findViewById(R.id.btn_undo)
        btn_Redo = findViewById(R.id.btn_redo)
        btn_Clear=findViewById(R.id.btn_clear)
        dr_view=findViewById(R.id.drawing_view)

        btn_Undo.setOnClickListener {
            dr_view.undo()
        }
        btn_Redo.setOnClickListener {
            dr_view.redo()
        }
        btn_Color.setOnClickListener {
            dr_view.setBrushColor(R.color.white)
        }
//        btn_Brush.setOnClickListener {
//            dr_view.setSizeForBrush(27)
//            dr_view.setBrushAlpha(100)
//        }
        btn_Clear.setOnClickListener {
            dr_view.clearDrawingBoard()
        }



    }
}