package one.digitalinnovation.model.pilhas;

public class Pilha {

    private NoPilha refNoPilhaEntradaPilha;

    public Pilha() {
        this.refNoPilhaEntradaPilha = null;
    }

    public NoPilha pop(){
        if (!isEmpty()){
            NoPilha noPilhaPoped = refNoPilhaEntradaPilha;
            refNoPilhaEntradaPilha = refNoPilhaEntradaPilha.getRefNo();
            return noPilhaPoped;
        }
        return null;
    }

    public void push(NoPilha novoNoPilha){
        NoPilha refAuxiliar = refNoPilhaEntradaPilha;
        refNoPilhaEntradaPilha = novoNoPilha;
        refNoPilhaEntradaPilha.setRefNo(refAuxiliar);
    }

    public NoPilha top(){
        return refNoPilhaEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoPilhaEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "----------\n";
        stringRetorno+= "   Pilha\n";
        stringRetorno+= "----------\n";

        NoPilha noPilhaAuxiliar = refNoPilhaEntradaPilha;

        while (true) {
            if (noPilhaAuxiliar != null){
                stringRetorno += "[No{dado=" + noPilhaAuxiliar.getDado() + "}]\n";
                noPilhaAuxiliar = noPilhaAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "==========\n";
        return stringRetorno;
    }
}
