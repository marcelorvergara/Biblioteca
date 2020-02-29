package android.vergara.bibliotec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ter_tela.*

class TerTela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ter_tela)

        var valores = intent.getSerializableExtra("livro") as Note

        txtTitulo.text = valores.title
        txtDesc.text = valores.description
        txtAutor.text = valores.autor
        txtResumo.text = valores.resumo
        txtPagina.text = "Páginas: " + valores.paginas.toString()
    }
}
