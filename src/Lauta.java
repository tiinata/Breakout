
public class Lauta {
    
    int x;
    int y; 
    int leveys;
    int korkeus;
    Pallo pallo;
    Lauta lauta;
    Pelilauta pelilauta;
    
    public Lauta(){}
    
    public Lauta(int x, int y, int leveys, int korkeus, Pallo pallo){
        this.x = x;
        this.y = y;
        this.leveys = leveys; 
        this.korkeus = korkeus; 
        this.pallo = new Pallo(pallo.x, pallo.y);
    }
    
    //asettaa laudan vasemman reunan x-koordinaatin
    public void setX(int x){
        this.x = x;
    }
    
    //palauttaa laudan vasemman reunan x-koordinaatin
    public int getX() {
        return x;
    }

    //asettaa laudan yläreunan y-koordinaatin, aina sama
    public void setY(int y) {
        this.y = y;
    }

    //palauttaa laudan yläreunan y-koordinaatin
    public int getY() {
        return y;
    }
   
    //tarkistaa osuuko pallo lautaan, jos osuu true, muuten false.
    public boolean osuma(){
        if(getX() <= pallo.getX() && pallo.getX() <= (getX() + leveys)
           && getY() == pallo.getY())
            return true;
        else
            return false;       
    }
    
    public void lautaLiikku(){
        //liikkuu siis pelilauta.x ja pelilauta.x + pelilauta.leveys välillä
    }
    
    
    //älä nyt vielä ainakaan huomioi seuraavaa. vanhaa naputtelua.
    /*public void osuma(){
        if(y == pallo.y && x <= pallo.x && (x+leveys) >= pallo.x ){
            for(int i = 0; i <= (x+leveys); i++)
                pallo.x++;
            for(int j = y; j <= (y+korkeus); j++)
                pallo.y++;      
    }*/
    
}
