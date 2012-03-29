public class Harjoitus {

    public static void main(String[] args){
        
        
        Pallo pallo = new Pallo(29, 1200);
        Lauta lauta = new Lauta(50, 60, 200, 50, pallo);
        
        Pelilauta pelilauta = new Pelilauta(0, 600, 600, 600, pallo);
        

        System.out.println(pallo.getX());
        //pallo.palloLiikku();
        System.out.println(pallo.getX());
        
        if(lauta.osuma())
            System.out.println("osuu lautaan");
        else
            System.out.println("ei osu lautaan");   
        
        if(pelilauta.osuma())
            System.out.println("osuu pelialueen seinään");
        else
            System.out.println("ei osu seinään");
    }    
    
    
}
