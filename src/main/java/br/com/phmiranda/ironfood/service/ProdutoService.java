/**
 * User: Pedro
 * Project: ironfood
 * Description: this class execute...!
 * Date: 24/05/2021
 */
package br.com.phmiranda.ironfood.service;

import br.com.phmiranda.ironfood.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;
}
