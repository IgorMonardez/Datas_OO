public class Principal {
    public static void main(String[] args) {
        // MinhaData a = new MinhaData(1, 2, 2002);
        // MinhaData b = new MinhaData("1/2/2002");
        // int c = a.Compara(b.toString());
        // System.out.println(c);
        // System.out.println(a.toString());
        // a.addDia(31);
        // System.out.println(a.toString());
        // a.addMes(11);
        // System.out.println(a.toString());
        // a.addAno(20);
        // System.out.println(a.toString());
        // c = a.Compara(b.toString());
        // System.out.println(c);
        DataComemorativa data = new DataComemorativa("Aniversario", false, false, 14, 5);
        System.out.println(data.nome + " " + data.dia + "/" + data.mes);
        DatasComemorativas dataCom = new DatasComemorativas();
        dataCom.adiciona(data);
        DataComemorativa data1 = new DataComemorativa("Dia do Saci",true, false, 31,10);
        dataCom.adiciona(data1);
        for(int i = 0;i<dataCom.Datas.size();i++) {
            System.out.println(dataCom.Datas.get(i).nome + " " + dataCom.Datas.get(i).dia + "/" + dataCom.Datas.get(i).mes);
        }

    }
}

