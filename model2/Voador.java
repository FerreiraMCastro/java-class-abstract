package model2;

public interface Voador {

    void decolar(int altitude);

    void pousar();

    default void emergencia(){
        System.out.println("Sistema de emergencia ativado");
    }
}
