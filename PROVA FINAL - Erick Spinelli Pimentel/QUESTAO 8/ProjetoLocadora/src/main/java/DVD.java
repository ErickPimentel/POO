public class DVD {
    private int codigo;
    private String titulo;
    private Cliente cliente = null;

    public DVD() {
    }

    public DVD(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Cliente getCliente() { //REFERENCIA CLIENTE
        return cliente;
    }

    public void setCliente(Cliente cliente) { //GUARDACLIENTE
        this.cliente = cliente;
    }


}
