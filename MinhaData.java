public class MinhaData {
    int dia;
    int mes;
    int ano;

    public MinhaData(int dia, int mes, int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }

    public MinhaData(String data){
        String[] dt=(data.split("/"));
        this.dia=Integer.parseInt(dt[0]);
        this.mes=Integer.parseInt(dt[1]);
        this.ano=Integer.parseInt(dt[2]);
    }

    public String toString(){
        //return (this.dia).concat(String(this.mes).concat(String(this.ano)));
        return Integer.toString(this.dia)+ "/"+ Integer.toString(this.mes)+ "/"+ Integer.toString(this.ano);
    }

    public void addDia(int adDia){
        this.dia+=adDia;
        if(this.mes == 4 || this.mes == 6 || this.mes ==9 ||this.mes == 11) {
            if (this.dia > 30) {
                this.dia -= 30;
                this.mes++;
            }
        }
        else
            if(this.mes != 2) {
                if(this.dia > 31) {
                    this.dia -= 31;
                    this.mes++;
                }
            }
            else{
                if(this.dia > 29 && this.ano%4 == 0) {
                    this.dia -= 29;
                    this.mes++;
                }
                else
                    if(this.dia >28 && this.ano%4 != 0) {
                        this.dia -= 28;
                        this.mes++;
                    }
            }

        if(this.mes > 12) {
            this.mes -= 12;
            this.ano++;
        }
    }

    public void addMes(int adMes){
        this.mes+=adMes;
        if(this.mes>12){
            this.mes-=12;
            this.ano++;
        }
    }

    public void addAno(int adAno){
        this.ano+=adAno;
    }

    public int Compara(String data){
        String[] dat=data.split("/");
        int dt[]={Integer.parseInt(dat[0]),Integer.parseInt(dat[1]),Integer.parseInt(dat[2])};
        int ct=0;
        if(this.dia==dt[0]){
             ct+=0;
        }else{
            if(this.dia<dt[0]){
                ct-= 1;
            }else{
                ct+= 1;
            }
        }
        if(this.mes==dt[1]){
            ct+=0;
        }else{
            if(this.mes<dt[1]){
                ct-=2;
            }else{
                ct+=2;
            }
        }
        if(this.ano==dt[2]){
            ct+=0;
        }else{
            if(this.ano<dt[2]){
                ct-=3;
            }else{
                ct+=3;
            }
        }
        if(ct<0){
            return -1;
        }else if(ct==0){
            return 0;
        }else {
            return 1;
        }
     }
}