package com.mycompany.exportadorcomsimplefactory.dao;

import com.mycompany.exportadorcomsimplefactory.entity.Produto;
import java.util.List;

/**
 *
 * @author camila
 */
public interface ExportadorListaProduto {
    String abrirTabela();
    String fecharTabela();
    String abrirLinha();
    String fecharLinha();
    String fecharLinhaTitulos();
    String abrirColuna(String valor);
    String fecharColuna();
    String exportar(List<Produto> produtos);
    
    static ExportadorListaProduto newInstance(){
        return newInstance("html");
    }
    static ExportadorListaProduto newInstance(String extensaoArquivoExportacao){
        switch (extensaoArquivoExportacao){
            case "html": return new ExportadorListaProdutoHtml();
            case "md": return new ExportadorListaProdutoMD();
            case "csv": return new ExportadorListaProdutoCSV();
            default: throw new UnsupportedOperationException("Formato de arquivo não suportado: " + extensaoArquivoExportacao);
        }
    }
}
