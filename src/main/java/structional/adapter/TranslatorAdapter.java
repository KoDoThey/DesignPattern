package structional.adapter;

public class TranslatorAdapter implements VietnameseTarget{
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter (JapaneseAdaptee adaptee){
        this.adaptee = adaptee;
    }

    private String translate(String vietnameseWord){
        System.out.println("Translated!");
        return "こんにちは";
    }

    @Override
    public void send(String word){
        System.out.println("Reading word: " + word);
        String vietnameseWord  = this.translate(word);
        System.out.println("Sending word: ");
        adaptee.receive(vietnameseWord);
    }
}
