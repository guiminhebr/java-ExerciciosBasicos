/*
Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
Ligar o carro;
Desligar o carro;
Acelerar;
diminuir velocidade;
virar para esquerda/direita
verificar velocidade;
trocar a marcha

o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
A velocidade do carro deve respeitar os seguintes limites para cada velocidade
se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km

 */


public class Carro {
    private boolean ligado;
    private double velocidade;
    private int marcha;
    public Carro(){
        ligado = false;
        marcha = 0;
        velocidade = 0;
    }
    public void ligarCarro(){
        if(ligado == false){
            ligado = true;
            marcha = 1;
            System.out.println("Carro Ligado.");
        }else {
            System.out.println("Carro já está ligado.");
        }
    }
    public void acelerarCarro(){
        if(ligado == true){
            if(marcha >=1){
                if(velocidade == 120){
                    System.out.println("Velocidade máxima atingida.");
                }else {
                    velocidade = velocidade+1;
                    verificarVelocidadePraMarcha();
                    System.out.println("Você está a "+ velocidade +" Km e na marcha "+marcha);
                }
            }else {
                System.out.println("Marcha está no ponto morto.");
            }

        }else {
            System.out.println("Ligue o carro.");
        }
    }
    public void desacelerarCarro(){
        if(ligado == true){
            if (marcha >=1){
                if (velocidade == 0){
                    System.out.println("Você está parado. ");
                }else {
                    velocidade = velocidade-1;
                    verificarVelocidadePraMarcha();
                    System.out.println("Você está a "+ velocidade +" Km e na marcha "+marcha);

                }
            }else {
                System.out.println("Marcha está no ponto morto.");
            }


        }else {
            System.out.println("Ligue o carro.");
        }
    }
    public void desligarCarro(){
        if(ligado == true){
            if(marcha == 0 && velocidade == 0){
                System.out.println("Carro desligado.");
                ligado = false;
            }else {
                System.out.println("Impossivel desligar.");
            }

        }else {
            System.out.println("Carro já desligado.");
        }

    }
    public void virarCarroDireita(){
        if(ligado == true){
            if(velocidade >= 1 && velocidade <= 40){
                System.out.println("Você virou para Direita.");
            }
        }else {
            System.out.println("Ligue o carro primeiro.");
        }

    }
    public void virarCarroEsquerda(){
        if(ligado == true){
            if(velocidade >= 1 && velocidade <= 40){
                System.out.println("Você virou para Esquerda.");
            }
        }else {
            System.out.println("Ligue o carro primeiro.");
        }

    }
    public int verificarVelocidadePraMarcha() {
        if (velocidade == 0) {
            marcha = 0;
        } else if (velocidade <= 20) {
            marcha = 1;
        } else if (velocidade <= 40) {
            marcha = 2;
        } else if (velocidade <= 60) {
            marcha = 3;
        } else if (velocidade <= 80) {
            marcha = 4;
        } else if (velocidade <= 100) {
            marcha = 5;
        } else {
            marcha = 6;
        }
        return marcha;
    }
    public void mostrarEstado() {
        System.out.println("Ligado: " + ligado);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Marcha: " + marcha);
    }






}
