package io.c.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import io.c.recyclerviewapp.model.MyAdapter
import io.c.recyclerviewapp.model.MyDataClassQuiVaBien
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    //@@@@@@@@@@@@@@@      DECLARATION DES TABLEAUX         @@@@@@@@@@@@@@@@@@@@@

    var mdArray = ArrayList<MyDataClassQuiVaBien>(8)


    val toto = ArrayList<MyDataClassQuiVaBien>(8)

    //var mdArray2 = MutableList<MyDataClassQuiVaBien>intersect (),

    //val nbArray = arrayOf(MyDataClassQuiVaBien("toto"), MyDataClassQuiVaBien("Titi"),"tutu")

    //val newArray = Array(3,{})

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seedItems()

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
       // Spécifiez l’adaptateur pour l’objet


       //         toujours dans la méthode onCreate(), de l’Activity principale


        //Utiliser le LinearLayoutManager créer dans le XML de l'Activity Principale
        myVersionAdapteur.layoutManager = LinearLayoutManager(this)


        myVersionAdapteur.adapter = MyAdapter(mdArray)


    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    }

    //                          Récupération des données à afficher dans le RecyclerView (liste) dans l'Activity Principale
    private fun seedItems() {

        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        //@@@@@@@@@@@@@@        INITIALISATION DE L'ADAPATEUR        @@@@@@@@@@@@@@@@
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        val nameArray = resources.getStringArray(R.array.mdNameArray)

        for (name in nameArray){
            mdArray.add(MyDataClassQuiVaBien(name))

        }



        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    }
}
