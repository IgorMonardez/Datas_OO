public class MinhaData {
    int dia;
    int mes;
    int ano;
    public constructor(int dia, int mes, int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }

    public constructor(String data){
        int[] dt=int(data.split("/"));
        this.dia=dt[0];
        this.mes=dt[1];
        this.ano=dt[2];
    }

    public toString(){
        return String(this.dia).concat(String(this.mes).concat(String(this.ano)));
    }
     public addDia(int adDia){
        this.dia+=adDia;
        if(this.dia>30){
            this.dia-=30;
            this.mes++;
        }
     }
     public addMes(int adMes){
        this.mes+=adMes;
        if(this.mes>12){
            this.mes-=12;
            this.ano++;
        }
     }
     public addAno(int adAno){
        this.ano+=adAno;
     }

     public Compara(String data){
         int[] dt=int(data.split("/"));
         int ct=0;
         if(this.dia==dt[0]){
             ct=0;
         }else{
             if(this.dia<dt[0]){
                 ct= -1;
             }else{
                 ct= +1;
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
