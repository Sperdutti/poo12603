
package simulacaosala;


public class Aula {
    
    double inicio_da_aula;
    double fim_da_aula;
    boolean intervalo;
    Professor professor = new Professor();
    Aluno aluno = new Aluno();
    

   
    
    public double getInicio_da_aula() {
        return inicio_da_aula;
    }

    public void setInicio_da_aula(double inicio_da_aula) {
        this.inicio_da_aula = inicio_da_aula;
    }

    public double getFim_da_aula() {
        return fim_da_aula;
    }

    public void setFim_da_aula(double fim_da_aula) {
        this.fim_da_aula = fim_da_aula;
    }

    public boolean isIntervalo() {
        return intervalo;
    }

    public void setIntervalo(boolean intervalo) {
        this.intervalo = intervalo;
    }
    
   
   
    
}
