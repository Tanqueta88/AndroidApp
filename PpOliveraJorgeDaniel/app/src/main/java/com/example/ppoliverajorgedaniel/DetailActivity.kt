package com.example.ppoliverajorgedaniel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    private lateinit var tvnombreDetail: TextView
    private lateinit var tvDificultad: TextView
    private lateinit var ivLogo: ImageView
    //private lateinit var tvIngredientesDetail: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val equipo = intent.getParcelableExtra<Receta>("equipo")

        tvnombreDetail = findViewById(R.id.tv_nombre_detail)
        tvDificultad = findViewById(R.id.tv_dificultad_detail)
        ivLogo = findViewById(R.id.iv_logo_detail)
        //tvIngredientesDetail = findViewById(R.id.tv_ingredientes_detail)


        tvnombreDetail.text = equipo?.nombre
        tvDificultad.text = equipo?.dificultad.toString()
        //tvIngredientesDetail = equipo?.ingredientes.toString()
        //tvIngredientesDetail.text = equipo?.ingredientes.toString()

        Glide.with(this).load(equipo?.logo).into(ivLogo)
    }
}