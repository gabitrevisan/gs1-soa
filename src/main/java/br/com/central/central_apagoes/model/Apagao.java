/**
 * Projeto GS - Central de Apagões
 * Desenvolvido por: Gabriela Trevisan e Rafael Franck
 * Entidade JPA que representa um registro de apagão.
 */
package br.com.central.central_apagoes.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Apagao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String local;
    private LocalDateTime dataHora;
    private String descricao;

    public Apagao() {}

    public Apagao(String local, LocalDateTime dataHora, String descricao) {
        this.local = local;
        this.dataHora = dataHora;
        this.descricao = descricao;
    }

    public Long getId() { return id; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }

    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
