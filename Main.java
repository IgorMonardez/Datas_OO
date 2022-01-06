import java.io.IOException;

class Data{
    int d,m,a;
    public Data(int dia,int mes,int ano) {
        d = dia; m = mes; a = ano;
    }

    public Data(String a) {
        int dt[] = int(data.split('/'));
        d = dt[0];
        m = dt[1];
        a = dt[2];
    }

}

class dataComemorativa extends Data{
    int d,m,a;
    public dataComemorativa(int dia,int mes,int ano) {
        d = dia; m = mes; a = ano;
    }

    public dataComemorativa(String a) {
        int dt[] = int(dataComemorativa.split('/'));
        d = dt[0];
        m = dt[1];
        a = dt[2];
    }
}

public class Main{
    public static void main(String[] args) {
        Data a = new Data(1,2,2002);
        Data b[];
        b[0] = new dataComemorativa(1,5,2021);

    }
}