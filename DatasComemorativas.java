public class DatasComemorativas{
    DataComemorativa Datas[];
    private int ct;

    public DatasComemorativas(){
        this.ct=0;
    }
    public void adiciona(String nome, boolean feriado, boolean feriado_mundi, int dia, int mes){
        Datas[this.ct]= new DataComemorativa(nome, feriado, feriado_mundi, dia, mes);
        this.ct++;
    }

    public int remove(String nome){
        for(int i=0;i<Datas.length;i++){
            if(Datas[i].nome==nome){
                for(int j=i;j<Datas.length-1;j++){
                    Datas[j]=Datas[j+1];
                }
                return 1;
            }
        }
        return 0;
    }
}