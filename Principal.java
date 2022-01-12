public class Principal{
    public static void main(String[] args){
        // MinhaData a=new MinhaData(1,2,2002);
        // MinhaData b=new MinhaData("1/2/2002");
        // int c= a.Compara(b.toString());
        // {
        //     System.out.println(c);

        //     System.out.println(a.toString());
        //     a.addDia(31);
        //     System.out.println(a.toString());
        //     a.addMes(11);
        //     System.out.println(a.toString());
        //     a.addAno(20);
        //     System.out.println(a.toString());

        //     c= a.Compara(b.toString());
        //     System.out.println(c);
        // }

        {
            DataComemorativa data=new DataComemorativa("Aniversario", false, false, 14, 5);
            System.out.println(data.nome +" " + data.dia +"/"+  data.mes);
        }

        //{
            // DatasComemorativas data= new DatasComemorativas();
            // data.adiciona("Aniversario", false, false, 14, 5);
            // data.adiciona("Dia do Saci",true, false, 31,10);
            // System.out.println(data.Datas[0]);
            // System.out.println(data.Datas[1]);
            // data.remove("Dia do Saci");
            // System.out.println(data.Datas[0]);
        //}
    }
}

