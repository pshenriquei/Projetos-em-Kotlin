package br.com.alura.list

val listaDeLivros = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = " Editora A"
    ),
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    Livro(
        titulo = "A arte da guerra",
        autor = "Sun Tzu",
        anoPublicacao = 1,
        editora = "Ideia Juridica"
    ),
    Livro(
        titulo = "Quem pensa enriquece",
        autor = "Napoleon Hill",
        anoPublicacao = 1978,
        editora = "Citadel"
    ),
    Livro(
        titulo = "+ Esperto que o Diabo",
        autor = "Napoleon Hill",
        anoPublicacao = 1938
    )
)

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = " Editora A"
    ),
    null,
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    null,
    Livro(
        titulo = "A arte da guerra",
        autor = "Sun Tzu",
        anoPublicacao = 1,
        editora = "Ideia Juridica"
    ),
    Livro(
        titulo = "Quem pensa enriquece",
        autor = "Napoleon Hill",
        anoPublicacao = 1978,
        editora = "Citadel"
    ),
    null,
    Livro(
        titulo = "+ Esperto que o Diabo",
        autor = "Napoleon Hill",
        anoPublicacao = 1938
    )
)