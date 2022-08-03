package com.mjgomes.pdvclient.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mjgomes.pdvclient.enums.EstadoPagamento;

import javax.persistence.Entity;
import javax.xml.crypto.Data;
import java.io.Serializable;

@Entity
@JsonTypeName("pagamentoComBoleto")
public class PagamentoComBoleto extends Pagamento implements Serializable {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Data dataVencimento;

    @JsonFormat(pattern = "dd/MM/yyyy")
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
