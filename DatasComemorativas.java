public class DatasComemorativas {
    DataComemorativa Datas[];
    int ct;

    public DatasComemorativas() {
        this.Datas[0] = new DataComemorativa("null",false,false,0,0);
        this.ct=0;
    }
    public void adiciona(DataComemorativa data) {
        this.Datas[this.ct]= data;
        this.ct++;
    }

    public int remove(String nome) {
        for(int i=0;i<ct;i++){
            if(Datas[i].nome==nome) {
                for(int j=i;j<Datas.length-1;j++)
                    Datas[j]=Datas[j+1];
                this.ct--;
                return 1;
            }
        }
        return 0;
    }

    public int horasNaoTrabalhadas() {
        int cont = 0;
        for(int i = 0;i<ct;i++)
            if(Datas[i].feriado)
                cont++;
        return cont*8;
    }
}