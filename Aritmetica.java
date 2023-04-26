public class Aritmetica implements ICalcMedia{
    @Override
    public double CalculaMedia(double p1, double p2) {
        return (p1+p2)/2;
    }

    @Override
    public String Situacao(double resultado) {
        return (resultado>5)?"Aprovado":"Reprovado";
    }
}
