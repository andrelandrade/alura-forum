package br.com.alura.forum.model

object UsuarioTest {

    fun build() = Usuario(
        id = 1,
        nome = "john",
        email = "john@example.com",
        password = "123456"
    )
}
