public class Deystvie {
    private float nO;
    private float nf;
    private float EI;
    private float ES;
    private float ei;
    private float es;

    public Deystvie(float nO,float nf,float ES,float EI,float es,float ei) {
        this.nO = nO;
        this.nf = nf;
        this.ES = ES;
        this.EI = EI;
        this.es = es;
        this.ei = ei;
        float resultES, resultEI, resultes, resultei, resultDops, resultdops, resultSmax, resultSmin, resultNmax, resultNmin, resultPmax, resultPmin;
        resultES = ES + nO;
        System.out.println("максимальный допуск отверстия:" + resultES);

        resultEI = EI + nO;
        System.out.println("минимальный допуск отверстия:" + resultEI);

        resultes = es + nf;
        System.out.println("максимальный допуск вала:" + resultes);

        resultei = ei + nf;
        System.out.println("минимальный допуск вала:" + resultei);

        resultDops = ES - EI;
        System.out.println("допуск отверстия:" + resultDops);

        resultdops = es - ei;
        System.out.println("допуск вала:" + resultdops);

        resultSmax = ES - ei;
        System.out.println("макс зазор:" + resultSmax);

        resultSmin = EI + es;
        System.out.println("мин зазор:" + resultSmin);

        resultNmax = es - EI;
        System.out.println("макс натяг:" + resultNmax);

        resultNmin = ei - ES;
        System.out.println("мин натяг:" + resultNmin);

        resultPmax = resultNmax;
        System.out.println("макс переход:" + resultPmax);

        resultPmin = resultNmin;
        System.out.println("мин переход:" + resultPmin);

        System.out.println("конец");

    }

}
