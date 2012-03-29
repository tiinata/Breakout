
public class Palikka {
    
    int x;          //x ja y ovat sijainnin koordinaatit
    int y;
    int leveys;
    int korkeus;
    Pallo pallo;
    
    //luo siis yhden palikan paikkaan (x,y)
    public Palikka(int x, int y, int leveys, int korkeus){
        this.x = x;
        this.y = y;
        this.leveys = leveys;
        this.korkeus = korkeus; 
        this.pallo = new Pallo(pallo.x, pallo.y);
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    
    //sama metodi kuin laudalla
    public boolean osuma(){
        if(getX() <= pallo.getX() && pallo.getX() <= (getX() + leveys)
           && getY() == pallo.getY())
            return true;
        else
            return false;
    }
    
}
