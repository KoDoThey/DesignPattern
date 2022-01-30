package structional.adapter;

public class JapaneseAdaptee {
    public void receive(String word){
        System.out.println("Receiving words from Translator Adapter: " + word);
    }
}
