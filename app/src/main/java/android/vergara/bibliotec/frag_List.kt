package android.vergara.bibliotec


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

/**
 * A simple [Fragment] subclass.
 */
class frag_List : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.fragment_frag__list, container, false)

        var video_recyclerview = rootView.findViewById(R.id.video_recyclerview) as RecyclerView // Add this

        //video_recyclerview.layoutManager = LinearLayoutManager(activity)

        video_recyclerview.adapter = MainAdapter(notes())


        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)


        video_recyclerview.layoutManager = layoutManager

        return rootView
    }

    private fun notes(): List<Note> {
        return listOf(
            Note("Leitura",
                "Livro de Kotlin com Android"),
            Note("Pesquisa",
                "Como posso melhorar o código dos meus projetos"),
            Note("Estudo",
                "Como sincronizar minha App com um Web Service"),
            Note("Lazer",
                "Dom Quixote, Miguel de Cervantes, 1605"),
            Note("Lazer",
            "Guerra e Paz, Liev Tolstói, 1869"),
            Note("Estudo",
            "Rede de Computadores - Topologias Avançadas"),
            Note("Pesquisa",
                "AI - Estudo de Caso na INFNET e PUC"),
            Note("Lazer",
                "Ulisses, James Joyce, 1922"),
            Note("Leitura",
                "A Divina Comédia, Dante Alighieri, 1321"),
            Note("Pesquisa",
                "A Montanha Mágica, Thomas Mann, 1924"),
            Note("Estudo",
                "Em Busca do Tempo Perdido, Marcel Proust, 1913"))
    }
}
