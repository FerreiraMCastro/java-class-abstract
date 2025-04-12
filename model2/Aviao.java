package model2;

public class Aviao  implements Voador {

    private String modelo;
    private boolean emVoo;

    public Aviao(String modelo){
        this.modelo = modelo;
        this.emVoo = false;
    }


    public void decolar(int altitude){
        if (!emVoo){
            System.out.println(modelo + " decolando até " + altitude + " pés");
            emVoo = true;
        } else {
            System.out.println(modelo  + " já está no ar!");
        }
    }

    public void pousar(){
        if (emVoo){
            System.out.println(modelo + " pousando...");
            emVoo = false;
        } else{
            System.out.println(modelo + " já está no chão");
        }
    }
}
