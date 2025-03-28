
public class Aluno {
    String Nome;
    double Nota1, Nota2;

    public Aluno(String Nome, double Nota1, double Nota2) {
        this.Nome = Nome;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
    }

    public String getNome() {
        return Nome;
    }

    public double getNota1() {
        return Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome=" + Nome + ", Nota1=" + Nota1 + ", Nota2=" + Nota2 + '}';
    }
    public double calcularMedia(){
        return (Nota1 + Nota2)/2;
    }  
}
