package br.com.alura.forum.service

import br.com.alura.forum.model.Resposta
import br.com.alura.forum.repository.RespostaRepository
import org.springframework.stereotype.Service

@Service
class RespostaService(
    private val respostaRepository: RespostaRepository
) {

    fun salvar(resposta: Resposta) = respostaRepository.save(resposta)
}