/**
 * Projeto GS - Central de Apagões
 * Desenvolvido por: Gabriela Trevisan e Rafael Franck
 * Interface de acesso a dados para a entidade Apagao.
 */
package br.com.central.central_apagoes.repository;

import br.com.central.central_apagoes.model.Apagao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApagaoRepository extends JpaRepository<Apagao, Long> {}
