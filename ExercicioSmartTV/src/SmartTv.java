public class SmartTv {
    // Início da estrutura básica da classe
    private boolean ligada;
    private int canal;
    private int volume;
    
    public SmartTv() {
        this.ligada = false;
        this.canal = 7;
        this.volume = 20;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    //Fim. 

    //Método para ligat a tv
    public void ligarTv(){
        if(this.ligada == false){
            this.ligada = true;
            System.out.println("Ligada!");
        }
    }    
    // Método para desligar a tv
    public void desligarTv(){
        if(this.ligada == true){
            this.ligada = false;
            System.out.println("Desligada!");
        }
    }
    // Método para aumentar volume
    public void aumentarVolume(){
        if(this.volume > -1 && this.volume < 101 ){
            this.volume = this.volume + 1;
            System.out.println("Volume: "+this.volume);

        }else 
            if(this.volume < 0){
                System.out.println("Volume mínimo!");
            }else if (this.volume > 100){
                System.out.println("Volume máximo!");

            }
        }
    // Método para diminuir volume    
    public void diminuirVolume(){
        if(this.volume > -1 && this.volume < 101 ){
            this.volume = this.volume - 1;
            System.out.println("Volume: "+this.volume);

        }else 
            if(this.volume < 0){
                System.out.println("Volume mínimo!");
            }else if (this.volume > 100){
                System.out.println("Volume máximo!");

            }
        }   
    // Método para mudar o canal 
    public void mudarCanal(int valorCanal){
        if(valorCanal > 0 && valorCanal <51){
            this.canal = valorCanal;
            System.out.println("Canal: "+this.canal);

        }else{
            System.out.println("Canal inexistente");
        }
    }

    }

