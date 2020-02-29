package android.vergara.bibliotec


import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_ter_tela.view.*

/**
 * A simple [Fragment] subclass.
 */
class frag_Titulo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.fragment_frag__titulo, container, false)

        var livro_recyclerview =
            rootView.findViewById(R.id.livro_recyclerview) as RecyclerView // Add this

        livro_recyclerview.adapter = MainAdapter(notes()) { Note ->
            var tit = Note.title
            var des = Note.description
            //var aut = Note.autor
            //var res = Note.resumo
            //var pag = Note.paginas

            rootView.txtTitulo.text = tit
            rootView.txtDesc.text = des

            //Toast.makeText(Context = null,"${Note.title} clicked",Toast.LENGTH_LONG).show()
            //Log.i(ContentValues.TAG, "${tit} clicked")

        }

        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        livro_recyclerview.layoutManager = layoutManager

        return rootView

    }
    private fun notes(): List<Note> {
        return listOf(
            Note("Livro de Kotlin com Android",
                "Este livro ensina a desenvolver aplicativos Android com a linguagem Kotlin.","Autor: Nelson Glauber", "Resumo: O Android é a plataforma do Google para dispositivos móveis que se tornou líder absoluta no mercado mundial, e a quantidade de recursos disponibilizada para os desenvolvedores permite criar uma envolvente e estimulante interação do usuário com o dispositivo.",550))
    }

    }