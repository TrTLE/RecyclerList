package io.c.recyclerviewapp

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.c.recyclerviewapp.model.MDIcon
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    //@@@@@@@@@@@@@@@      DECLARATION DES TABLEAUX         @@@@@@@@@@@@@@@@@@@@@

    var mdArray = ArrayList<MDIcon>(8)


    val toto = ArrayList<MDIcon>(8)

    //var mdArray2 = MutableList<MDIcon>intersect (),

    //val nbArray = arrayOf(MDIcon("toto"), MDIcon("Titi"),"tutu")

    //val newArray = Array(3,{})

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seedItems()

        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        //@@@@@@@@@@@@@@@@       CREER INSTANCIER L'APADTATEUR      @@@@@@@@@@@@@@@@@
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@





    }

    private fun seedItems() {

        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        //@@@@@@@@@@@@@@        INITIALISATION DE L'ADAPATEUR        @@@@@@@@@@@@@@@@
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        val nameArray = resources.getStringArray(R.array.mdNameArray)

        for (name in nameArray){
            mdArray.add(MDIcon(name))

        }



        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    }
}
