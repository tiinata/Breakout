
public class Pallo {
  
    int x;
    int y; 
    Lauta lauta;
    Pelilauta pelilauta;
    Pallo pallo; 
    
    //pallo on nyt yhden pisteen kokoinen
    public Pallo(int x, int y){
        this.x = x;
        this.y = y; 
    }
    
    //asettaa pallon x-koordinaatin
    public void setX(int x){
        this.x = x;
    }
    
    //palauttaa pallon x-koordinaatin
    public int getX() {
        return x;
    }

    //asettaa pallon y-koordinaatin
    public void setY(int y) {
        this.y = y;
    }

    //palauttaa pallon y-koordinaatin
    public int getY() {
        return y;
    }
    
    //pallo liikkuu tässä vaiheessa myötäpäivään ja tämä ei nyt vielä toimi. 
    public void palloLiikku(){
        if(lauta.osuma()){
            for(int i = getX(); i >= pelilauta.x; i--){
                x--;
                y++;   
            }
        }/*else if(pelilauta.osuma()){
            
        }    */  
    }
    
}
