package Esercizio1;

public class Dipartimento {

    private String nomeDipartimento;



    public Dipartimento (String nomeDipartimento){
        if ((!nomeDipartimento.equals("PRODUZIONE")) && (!nomeDipartimento.equals("AMMINISTRAZIONE")) && (!nomeDipartimento.equals("VENDITE"))){
        throw new IllegalArgumentException("Errore");
        }
        this.nomeDipartimento = nomeDipartimento;
    }

    public String getNomeDipartimento() {
        return this.nomeDipartimento;
    }

    public void setNomeDipartimento(String nomeDipartimento) {
        if ((!nomeDipartimento.equals("PRODUZIONE")) && (!nomeDipartimento.equals("AMMINISTRAZIONE")) && (!nomeDipartimento.equals("VENDITE"))){
            throw new IllegalArgumentException("Errore");
        }
        this.nomeDipartimento = nomeDipartimento;
    }
}

