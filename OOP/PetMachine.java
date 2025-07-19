public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;


    public void takeAShower(){

        if(this.pet == null){
            System.out.println("Coloque o pet na máquina pra iniciar o banho.");
        }
        this.water -= 10;
        this.shampoo -= 2;

        this.pet.setClean(true);
        System.out.println(pet.getName()+" Está LImpo.");
    }
    public void addWater(){
        if(water == 30){
            System.out.println("A capacidade de água da máquina está no máximo");
        }
        water +=2;
    }
    public void addShampoo(){
        if(shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo");
        }
        shampoo +=2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }
    public boolean hasPet(){
        return pet !=null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja para colocar o pet é necessario limpar-la");
        }
        if(hasPet()){
            System.out.println("O pet "+ pet.getName()+" Está na máquina");
        }
        this.pet = pet;
    }
    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("o pet "+this.pet.getName()+" Está limpo");
        this.pet = null;
    }
    public void wash(){
        this.water -= 10;
        this.shampoo -=2;
        this.clean = true;
        System.out.println("A máquina esta limpa.");
    }

}
