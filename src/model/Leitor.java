package model;

/**
 * @author: Lucas Lourenço 
 * @date: 13/12/2018 
 * @location: Ciarama Máquinas Ltda.
 */
public class Leitor {

    private String id_xml;
    private String produto;
    private int quantidade;
    private String cnpj;
    private String local;

    public String getId_xml() {
        return id_xml;
    }

    public void setId_xml(String id_xml) {
        this.id_xml = id_xml;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
