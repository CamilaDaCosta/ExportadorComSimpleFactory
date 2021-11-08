package com.mycompany.exportadorcomsimplefactory.dao;

import static com.mycompany.exportadorcomsimplefactory.dao.AbstractExportadorListaProduto.TITULOS_COLUNAS;
import java.util.ArrayList;
import java.util.List;

public class ExportadorListaProdutoCSV extends AbstractExportadorListaProduto{

    @Override
    public String abrirTabela() {
        return "";
    }
 
    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public String abrirColuna(String valor) {
        return valor + ",";
    }

    @Override
    public String fecharColuna() {
        return "";
    }
    
}
