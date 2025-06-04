/**
 * Projeto GS - Central de Apagões
 * Desenvolvido por: Gabriela Trevisan e Rafael Franck
 * Camada de serviço responsável pela lógica de negócio da entidade Apagao.
 */
package br.com.central.central_apagoes.service;

import br.com.central.central_apagoes.model.Apagao;
import br.com.central.central_apagoes.repository.ApagaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApagaoService {

    @Autowired
    private ApagaoRepository apagaoRepository;

    public List<Apagao> listarTodos() {
        return apagaoRepository.findAll();
    }

    public Optional<Apagao> buscarPorId(Long id) {
        return apagaoRepository.findById(id);
    }

    public Apagao salvar(Apagao apagao) {
        return apagaoRepository.save(apagao);
    }

    public void deletar(Long id) {
        apagaoRepository.deleteById(id);
    }

    public Apagao atualizar(Long id, Apagao dadosAtualizados) {
        return apagaoRepository.findById(id)
                .map(apagao -> {
                    apagao.setLocal(dadosAtualizados.getLocal());
                    apagao.setDataHora(dadosAtualizados.getDataHora());
                    apagao.setDescricao(dadosAtualizados.getDescricao());
                    return apagaoRepository.save(apagao);
                })
                .orElseThrow(() -> new RuntimeException("Apagão não encontrado"));
    }
}
