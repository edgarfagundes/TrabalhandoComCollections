import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
public class Lists {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<>();

        double soma = 0d;
        for (int i = 1; i <= 6; i++){
            System.out.println("Qual a temperatura do mês " + i + "?");
            double temp = scanner.nextDouble();
            temperatura.add(temp);
            soma += temp;
        }

        double media = soma/temperatura.size();

        System.out.println("Média temperaturas Semestral: " + media + " oC");
        System.out.println("----------");

        for (double temp : temperatura){
        if (temp > media){
            int index = temperatura.indexOf(temp);
            switch (index) {
                case 0:
                    System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                    break;
                case 1:
                    System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " oC");
                    break;
                case 2:
                    System.out.println((index + 1) + " - MARÇO: " + temp+ " oC");
                    break;
                case 3:
                    System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                    break;
                case 4:
                    System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                    break;
                case 5:
                    System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                    break;
                default:
                    break;
        }
    }


    }*/
       /*


        Scanner scanner = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        System.out.println("Perguntas: ");
        System.out.print("Telefonou para vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int contar = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()){
            String resp = contador.next();
            if (resp.equals("s")){
                contar ++;
            }
        }

        switch (contar){
            case 0:
                System.out.println("Totalmente inocente");
                break;
            case 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
                System.out.println("Sabe de algo");
                break;
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
        }

}
}
*/

