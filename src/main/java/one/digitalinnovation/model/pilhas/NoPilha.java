package one.digitalinnovation.model.pilhas;

public class NoPilha {

    private int dado;
    private NoPilha refNoPilha = null;

    public NoPilha() {
    }

    public NoPilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilha getRefNo() {
        return refNoPilha;
    }

    public void setRefNo(NoPilha refNoPilha) {
        this.refNoPilha = refNoPilha;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
