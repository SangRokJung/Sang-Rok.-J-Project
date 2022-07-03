package hello0616;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] card = new SutdaCard[CARD_NUM];

    
    SutdaDeck(){
        for(int i = 0; i < CARD_NUM; i++){
            int num = i % 10 + 1;
            boolean isKwang = ((i < 10) && (num == 1 || num == 3 || num == 8));

            card[i] = new SutdaCard(num, isKwang);
        }
    }

    //배열 card의 담긴 카드의 위치를 섞는 기능, 랜덤
    public void shuffle(){
        int index = 0; 

        for(int i = 0; i < card.length; i++){
            index = (int)(Math.random() * card.length);
            SutdaCard temp;

            temp = card[i];
            card[i] = card[index];
            card[index] = temp;
        }
    }

    //배열 card에 지정된 위치의 SutdaCard를 반환하는 기능.
    public SutdaCard pick(int index){
        if(index < 0 || index < card.length){
            return null;
        }
        return card[index];
    }

    //배열 card에서 임의의 위치의 SutdaCard를 반환하는 기능. 랜덤
    public SutdaCard pick(){
        int randomIndex = (int)(Math.random() * card.length);
        
        return card[randomIndex];

    }

}
