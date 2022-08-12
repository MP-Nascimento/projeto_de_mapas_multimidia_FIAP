package com.example.mapandmultmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recupera_fotos.*

class RecuperaFotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recupera_fotos)

        val equipes = arrayOf("Leao","Pinguim","Urso","Girafa","Tigre","Rato")

        textView1.text = equipes[0]
        textView2.text = equipes[1]
        textView3.text = equipes[2]
        textView4.text = equipes[3]
        textView5.text = equipes[4]
        textView6.text = equipes[5]

        val i1 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTE3eLdY4sB32iOVeYgVRtyheyTXStPv0CWCQ&usqp=CAU"
        val i2 = "https://veja.abril.com.br/wp-content/uploads/2017/01/happyfeet_mat2.jpg?quality=70&strip=all"
        val i3 =
        val i4 =
        val i5 =
        val i6 =

    }

}