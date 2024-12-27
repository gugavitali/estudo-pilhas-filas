package one.digitalinnovation.model.filas;

public class Fila<T> {

    private NoFila<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T objet){
        NoFila novoNo = new NoFila(objet);
        novoNo.setRefNoFila(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if (!isEmpty()){
            NoFila primeiroNoFila = refNoEntradaFila;

            while (true) {
                if (primeiroNoFila.getRefNoFila() != null) {
                    primeiroNoFila = primeiroNoFila.getRefNoFila();
                }else {
                    break;
                }
            }
            return (T) primeiroNoFila.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!isEmpty()){
            NoFila primeiroNoFila = refNoEntradaFila;
            NoFila noAuxiliar = refNoEntradaFila;

            while (true) {
                if (primeiroNoFila.getRefNoFila() != null) {
                    noAuxiliar = primeiroNoFila;
                    primeiroNoFila = primeiroNoFila.getRefNoFila();
                }else {
                    noAuxiliar.setRefNoFila(null);
                    break;
                }
            }
            return (T) primeiroNoFila.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNoFila() != null) {
                    noAuxiliar = noAuxiliar.getRefNoFila();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }
        return stringRetorno;
    }
}

