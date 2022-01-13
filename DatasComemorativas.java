import java.util.ArrayList;
public class DatasComemorativas {
    ArrayList<DataComemorativa> Datas;

    public DatasComemorativas() {
        this.Datas=new ArrayList<DataComemorativa>();
    }
    public void adiciona(DataComemorativa data) {
        Datas.add(data);
    }

    public int remove(String nome) {
        for(int i=0;i<Datas.size();i++){
            if(Datas.get(i).nome==nome) {
                Datas.remove(i);
                return 1;
            }
        }
        return 0;
    }

    public int horasNaoTrabalhadas() {
        int cont = 0;
        for(int i = 0;i<Datas.size();i++){
            if(Datas.get(i).feriado){
                cont++;
            }
        }
        return cont*8;
    }
}