package com.mycompany.exportadorcomsimplefactory.dao;

//@author camila da costa

import com.mycompany.exportadorcomsimplefactory.entity.Produto;
import java.util.ArrayList;
import java.util.List;


public class Principal {
    public static void main(String[] args) {
        final List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("TV", "LG", "132-A", 120));
        produtos.add(new Produto("Notebook", "Asus", "New age", 341));
        produtos.add(new Produto("Smartphone", "Samsung", "Galaxy S10", 214));
        produtos.add(new Produto("Notebook","Asus","Predator",850));

        ExportadorListaProduto exportadorPadrao = ExportadorListaProduto.newInstance();
        System.out.println("Lista de Produtos em HTML\n");
        System.out.println(exportadorPadrao.exportar(produtos));

        ExportadorListaProduto exportadorMarkdown = ExportadorListaProduto.newInstance("md");
        System.out.println("Lista de Produtos em Markdown\n");
        System.out.println(exportadorMarkdown.exportar(produtos));
        
        ExportadorListaProduto exportadorCSV = ExportadorListaProduto.newInstance("csv");
        System.out.println("Lista de Produtos em CSV\n");
        System.out.println(exportadorCSV.exportar(produtos));
    }
}
