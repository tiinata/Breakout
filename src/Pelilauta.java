
public class Pelilauta {
    
    int x;  //koordinaatit johon pelilauta asetetaan
    int y;
    int korkeus; 
    int leveys; 
    Pallo pallo;
    Lauta lauta;
    Pelilauta pelilauta;
    
    public Pelilauta(int x, int y, int leveys, int korkeus){
       this.x = x;
        this.y = y;
        this.leveys = leveys;
        this.korkeus = korkeus; 
    }

    public Pelilauta(int x, int y, int leveys, int korkeus, Pallo pallo){
        this.x = x;
        this.y = y;
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.pallo = new Pallo(pallo.x, pallo.y);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    //oletetaan, että pallo ei voi mennä pois pelialueelta y-suunnassa. 
    public boolean osuma(){
        if(pallo.x == x || pallo.x == (x+leveys) || pallo.y == (y+korkeus))
            return true;
        else 
            return false;
    }
    
    /*osumaräpellys. 
     * public void osuma(){
        if(x == pallo.getX() && x == 0 && 
                pallo.getY() < (y+korkeus)){
            for(int i = 0; i <= (x+leveys); i++)
                pallo.x++;
            for(int j = y; j <= (y+korkeus); j++)
                pallo.y++;
        }else if((x+leveys) == pallo.getX() && pallo.getY() < y+korkeus){
            for(int i = 0; i >= (x+leveys); i++)
                pallo.x--;
            for(int j = y; j <= (y+korkeus); j++)
                pallo.y++;
        }else if((x+leveys) > pallo.getX() && pallo.getY() == y+korkeus){
            for(int i = 0; i >= (x+leveys); i++)
                pallo.x--;
            for(int j = y; j >= y; j++)
                pallo.y--;
        }
    
    
    }*/
}
