package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService (var usuarios: MutableList<Usuario>) {

    init {
        val usuario = Usuario(
            id = 1,
            nome = "John Doe",
            email = "john@email.com.br"
        )

        usuarios = mutableListOf(usuario)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.first { it.id == id }
    }
}
