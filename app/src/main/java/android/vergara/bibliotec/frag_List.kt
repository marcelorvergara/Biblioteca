package android.vergara.bibliotec


import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.fragment_frag__titulo.view.*
import kotlinx.android.synthetic.main.video_row.*

/**
 * A simple [Fragment] subclass.
 */
class frag_List : Fragment() {

    var titulo_frag1: String? = ""
    var desc_frag1: String? = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.fragment_frag__list, container, false)

        var livro_recyclerview = rootView.findViewById(R.id.livro_recyclerview) as RecyclerView // Add this

        livro_recyclerview.adapter = MainAdapter(notes()) { Note ->
            var tit = Note.title
            var des = Note.description
            var aut = Note.autor
            var res = Note.resumo
            var pag = Note.paginas

            var intt = Intent(context,TerTela::class.java)
            var livro = Note(tit,des,aut,res,pag)
            intt.putExtra("livro",livro)
            startActivity(intt)

            //Toast.makeText(Context = null,"${Note.title} clicked",Toast.LENGTH_LONG).show()
            Log.i(TAG, "${tit} clicked")

        }

        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        livro_recyclerview.layoutManager = layoutManager

        return rootView


    }

    private fun notes(): List<Note> {
        return listOf(
            Note("Livro de Kotlin com Android",
                "Este livro ensina a desenvolver aplicativos Android com a linguagem Kotlin.","Autor: Nelson Glauber", "Resumo: O Android é a plataforma do Google para dispositivos móveis que se tornou líder absoluta no mercado mundial, e a quantidade de recursos disponibilizada para os desenvolvedores permite criar uma envolvente e estimulante interação do usuário com o dispositivo.",550),
            Note("Gestão de produtos de software",
                "Como aumentar as chances de sucesso do seu software","Autor: Joaquim Torres", "Resumo: Cuidar do andamento de um projeto de software é uma tarefa que requer diversos conhecimentos. Saber lidar com pressão de clientes, anseios do time de desenvolvimento, necessidades da equipe de vendas. Como negociar prazos? O que deve ser desenvolvido primeiro no roadmap do meu produto?",210),
            Note("Como sincronizar minha App com um Web Service",
                "Web Services REST com ASP .NET Web API e Windows Azure","Autor: Paulo Siécola", "Resumo: A utilização de serviços REST é uma tendência que vem crescendo muito nos últimos anos, principalmente em APIs públicas, e ASP.NET Web API é a plataforma ideal para a criação de aplicações RESTful sob a plataforma .NET da Microsoft.",320),
            Note("Dom Quixote, 1605",
                "Considerada a maior obra da literatura espanhola e o segundo livro mais lido da História","Autor: Miguel de Cervantes", "Resumo: Uma obra do escritor espanhol Miguel de Cervantes, publicada em duas partes. A primeira surgiu em 1605 e a segunda dez anos depois, em 1615. Quando o livro foi traduzido para inglês e francês obteve um êxito súbito, arrebatando leitores de diversas origens.",220),
            Note("Guerra e Paz, 1869",
            "É um romance histórico escrito pelo autor russo Liev Tolstói e publicado entre 1865 e 1869 no Russkii Vestnik, um periódico da época.","Autor: Liev Tolstói", "Resumo: Guerra e Paz é um romance histórico escrito pelo autor russo Liev Tolstói e publicado entre 1865 e 1869 no Russkii Vestnik, um periódico da época. É uma das obras mais volumosas da história da literatura universal. O livro narra a história da Rússia à época de Napoleão Bonaparte.",679),
            Note("Rede de Computadores - Topologias Avançadas",
            "Distributed Systems: Principles and Paradigms","Autor: Andrew S. Tanenbaum", "Resumo: Esse novo livro, em co-autoria com Maarten van Steen, aborda tanto os conceitos fundamentais quanto os paradigmas dos modernos sistemas distribuídos.",750),
            Note("Os lusíadas",
                "Esta obra é considerada a epopéia portuguesa por excelência","Autor: de Luís de Camões", "Resumo: O livro foi publicado pela primeira vez em 1572 no período literário do Classicismo, três anos após o regresso do autor do Oriente. Os lusíadas é composto de dez cantos, somando 1.102 estrofes, todas oitavas de decassílabos heróicos, obedecendo ao esquema rimático “abababcc” (rimas cruzadas, nos seis primeiros versos, e emparelhada, nos dois últimos). A ação central do poema é a descoberta do caminho marítimo para a Índia por Vasco da Gama, a volta da qual se vão descrevendo outros episódios da história de Portugal, glorificando o povo português.",433),
            Note("As flores do mal",
                "O poeta e crítico e francês Charles Baudelaire marcou as últimas da década de 19, influenciando a poesia internacional de tendência simbolista. De sua maneira de ser, originaram-se na França os poetas “malditos”.","Autor: Charles Baudelaire", "Resumo:  Baudelaire inventou uma nova estratégia de linguagem, incorporando a matéria da realidade grotesca à linguagem sublimada do Romantismo, dando base para a criação da poesia moderna.",98),
            Note("Vigiar e punir",
                "A lista também não poderia deixar de lado um dos principais filósofos do mundo","Autor: Foucault", "Resumo: Michel Foucault (1926-1984). Vigiar e punir é um estudo científico, documentado, sobre a evolução histórica da legislação penal e respectivos métodos coercitivos e punitivos, adotados pelo poder público na repressão da delinquência. Métodos que vão desde a violência física até instituições correcionais.",50),
            Note("Cem anos de solidão",
                "Neste livro, Gabriel García Márquez narra a história da família Buendía","Autor: Gabriel García Márquez", "Resumo: Uma estirpe de solitários que habitam a mítica aldeia de Macondo. A narrativa se desenvolve em torno dos integrantes dessa família, com a particularidade de que todas as gerações foram acompanhadas por Úrsula, uma personagem centenária e matriarca das mais conhecidas da história da literatura latino-americana.",320),
            Note("Moby Dick",
                "O nome deste livro é o do cachalote (um animal parecido com uma baleia) enfurecido","Autor: Herman Melville", "Resumo: Publicado inicialmente em 1851, Moby Dick foi revolucionário para a época, com descrições intrincadas e imaginativas das aventuras do narrador Ismael. O romance foi baseado no naufrágio do navio Essex, comandado pelo capitão George Pollard. Na ocasião, ele foi atingido por uma baleia e afundou.",342))
    }

}
