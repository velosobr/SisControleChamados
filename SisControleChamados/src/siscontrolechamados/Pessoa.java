package siscontrolechamados;

/**
 *
 * @author Allan
 */
public class Pessoa implements IPessoa {

    private int codigo;
    private String nome;

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

}
