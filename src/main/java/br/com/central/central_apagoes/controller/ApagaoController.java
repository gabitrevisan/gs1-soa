/**
 * Projeto GS - Central de Apagões
 * Desenvolvido por: Gabriela Trevisan e Rafael Franck
 * Camada de Controller responsável pelos endpoints REST.
 */
package br.com.central.central_apagoes.controller;

import br.com.central.central_apagoes.model.Apagao;
import br.com.central.central_apagoes.service.ApagaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apagao")
public class ApagaoController {

    @Autowired
    private ApagaoService apagaoService;

    @GetMapping
    public List<Apagao> listarTodos() {
        return apagaoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Apagao buscarPorId(@PathVariable Long id) {
        return apagaoService.buscarPorId(id).orElseThrow(() -> new RuntimeException("Apagão não encontrado"));
    }

    @PostMapping
    public Apagao salvar(@RequestBody Apagao apagao) {
        return apagaoService.salvar(apagao);
    }

    @PutMapping("/{id}")
    public Apagao atualizar(@PathVariable Long id, @RequestBody Apagao apagao) {
        return apagaoService.atualizar(id, apagao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        apagaoService.deletar(id);
    }
}
