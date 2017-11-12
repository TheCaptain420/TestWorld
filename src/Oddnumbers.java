public class Oddnumbers {
    //Declare variabler fra og til
    int from;
    int to;

    //Constructor til at
    Oddnumbers(int from, int to){
        this.from = from;
        this.to = to;

    }
    //printer alle ulige tal.
    public void printOdds(){
        while(from<=to){
            if(!(from%2==0)) {
                System.out.print(from+" - ");
            }
            from++;
        }
    }


    //loops til at printe det danske flag
    public void printFlag(){
        System.out.println("Hello Danemark");
        //linjerne man "tegner på" nedad
        for (int linjer = 1; linjer<6; linjer++){
            //så længe man ikk er på linje 3, går dette
            if (linjer < 3 || linjer > 3){
                //tegner henad
                for (int paalangs = 0; paalangs<20; paalangs++) {
                    //tenger det røde nedad.
                    if (paalangs<5||paalangs>5){
                        System.out.print("Ø");
                    //tegner "stregerne" nedad.
                    }else {
                        System.out.print("o");
                    }
                }
            }else {
                for(int hvorLangtHen =0; hvorLangtHen<20;hvorLangtHen++){
                    System.out.print("o");
                }
            }
            System.out.println(" ");
        }


    }

}
