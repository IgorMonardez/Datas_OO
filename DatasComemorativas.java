import DataComemorativa.java;

public class DatasComemorativas extends DataComemorativa{
    List<DataComemorativa> lista=new ArrayList<DatasComemorativa>();
    private int ct=0;

    public void adiciona(String nome, boolean feriado, boolean feriado_mundial, int dia , int mes){
        lista[this.ct]=new DatasComemorativa(nome,feriado,feriado_mundial,dia,mes);
    }
    public void remove(){
        
    }
}
