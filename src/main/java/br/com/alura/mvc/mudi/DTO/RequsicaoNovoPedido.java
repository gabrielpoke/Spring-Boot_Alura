package br.com.alura.mvc.mudi.DTO;

import br.com.alura.mvc.mudi.Models.Pedido;
import br.com.alura.mvc.mudi.Models.StatutsPedido;

import javax.validation.constraints.NotBlank;

public class RequsicaoNovoPedido {

    @NotBlank
    private String nomeProduto;

    @NotBlank
    private String urlProduto;

    @NotBlank
    private String urlImagem;

    private String descricao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {

        Pedido pedido = new Pedido();

        pedido.setNomeProduto(nomeProduto);

        pedido.setUrlProduto(urlProduto);

        pedido.setUrlImagem(urlImagem);

        pedido.setDescricao(descricao);

        pedido.setStatutsPedido(StatutsPedido.AGUARDANDO);

        return pedido;
    }
}
