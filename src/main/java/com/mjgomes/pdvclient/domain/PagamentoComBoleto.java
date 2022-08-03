package com.mjgomes.pdvclient.domain;

import com.mjgomes.pdvclient.enums.EstadoPagamento;

import javax.xml.crypto.Data;
import java.io.Serializable;

public class PagamentoComBoleto extends Pagamento implements Serializable {

    private Data dataVencimento;
    private Data dataPagamento;

    public PagamentoComBoleto() {
    }

    public PagamentoComBoleto(Long id, EstadoPagamento estado, Pedido pedido, Data dataVencimento, Data dataPagamento) {
        super(id, estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Data getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Data dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Data getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Data dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
