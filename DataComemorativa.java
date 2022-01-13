public class DataComemorativa  {
    String nome;
    boolean feriado;
    boolean feriado_mundial;
    int dia;
    int mes;

    public DataComemorativa(String nome, boolean feriado, boolean feriado_mundial, int dia, int mes) {
        this.nome=nome;
        this.feriado=feriado;
        this.feriado_mundial=feriado_mundial;
        this.dia=dia;
        this.mes=mes;
    }

    public String toString(MinhaData Referencia) {
        return Integer.toString(this.dia)+ "/"+ Integer.toString(this.mes)+ "/"+ Integer.toString(Referencia.ano);
    }
}

