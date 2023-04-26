// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Disciplina disc1 = new Disciplina(new Aritmetica(),"Denis",10,7);
        Disciplina disc2 = new Disciplina(new Geometrica(),"Thiago",7,8);

        disc1.CalcularMedia();
        disc2.CalcularMedia();

        System.out.println("Nome : "+disc1.getNome() +"\r\nMédia : " + disc1.getMedia() + "\r\nResultado : " + disc1.getSituacao());
        System.out.println("Nome : "+disc2.getNome() +"\r\nMédia : " + disc2.getMedia() + "\r\nResultado : " + disc2.getSituacao());
    }
}