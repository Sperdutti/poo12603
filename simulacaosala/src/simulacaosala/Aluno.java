
package simulacaosala;

public class Aluno extends Pessoa{
    
   
    boolean vontade_de_ir_ao_banheiro, duvida, interesse;

    public boolean isVontade_de_ir_ao_banheiro() {
        return vontade_de_ir_ao_banheiro;
    }

    public void setVontade_de_ir_ao_banheiro(boolean vontade_de_ir_ao_banheiro) {
        this.vontade_de_ir_ao_banheiro = vontade_de_ir_ao_banheiro;
    }

    public boolean isDuvida() {
        return duvida;
    }

    public void setDuvida(boolean duvida) {
        this.duvida = duvida;
    }

    public boolean isInteresse() {
        return interesse;
    }

    public void setInteresse(boolean interesse) {
        this.interesse = interesse;
    }

    
    
    
}
