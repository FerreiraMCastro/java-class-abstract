package model2;

public class Drone implements Voador {
    private String modelo;
    private int bateria;
    private boolean emVoo;

    public Drone(String modelo, int bateriaInicial){
        this.modelo = modelo;
        this.bateria = bateriaInicial;
        this.emVoo = false;
    }

    public int bateriaRestante(){
        return bateria;
    }
    public void decolar(int altitude){
        if(!emVoo && bateria > 10){
            System.out.println(modelo + " decolando até "+ altitude +" pés! Bateria: "+bateria + "%");
            emVoo = true;
            bateria -= 5;
        } else if(bateria <= 10) {
            System.out.println(modelo + "não pode decolar! Bateria crítica: "+ bateria + "%");
        }else{
            System.out.println(modelo + "já esta no ar!");
        }
    }

    public void pousar(){
        if(emVoo && bateria > 5){
            System.out.println(modelo + " pousando... Bateria restante: "+ bateria+"%");
            emVoo = false;
        }else if (bateria <=5) {
            System.out.println(modelo + " não pode pousar! Bateria insuficiente: "+ bateria+ "%");

        }else{
            System.out.println(modelo + " já está no chão!");
        }
    }
    public void carregar(){
        bateria = 100;
        System.out.println(modelo + "carregado! Bateria: 100%");
    }
}
