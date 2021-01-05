package WordsCounter;

import java.util.*;

public class Locomotive {

    public static void main(String[] args) {
        String text = "Stoi na stacji lokomotywa,\n" +
                "Ciężka, ogromna i pot z niej spływa:\n" +
                "Tłusta oliwa.\n" +
                "Stoi i sapie, dyszy i dmucha,\n" +
                "Żar z rozgrzanego jej brzucha bucha:\n" +
                "Buch - jak gorąco!\n" +
                "Uch - jak gorąco!\n" +
                "Puff - jak gorąco!\n" +
                "Uff - jak gorąco!\n" +
                "Już ledwo sapie, już ledwo zipie,\n" +
                "A jeszcze palacz węgiel w nią sypie.\n" +
                "\n" +
                "↓\n" +
                "Wagony do niej podoczepiali\n" +
                "Wielkie i ciężkie, z żelaza, stali,\n" +
                "I pełno ludzi w każdym wagonie,\n" +
                "A w jednym krowy, a w drugim konie,\n" +
                "A w trzecim siedzą same grubasy,\n" +
                "Siedzą i jedzą tłuste kiełbasy,\n" +
                "A czwarty wagon pełen bananów,\n" +
                "A w piątym stoi sześć fortepianów,\n" +
                "W szóstym armata - o! jaka wielka!\n" +
                "Pod każdym kołem żelazna belka!\n" +
                "W siódmym dębowe stoły i szafy,\n" +
                "W ósmym słoń, niedźwiedź i dwie żyrafy,\n" +
                "W dziewiątym - same tuczone świnie,\n" +
                "W dziesiątym - kufry, paki i skrzynie.\n" +
                "A tych wagonów jest ze czterdzieści,\n" +
                "Sam nie wiem, co się w nich jeszcze mieści.\n" +
                "Lecz choćby przyszło tysiąc atletów\n" +
                "I każdy zjadłby tysiąc kotletów,\n" +
                "I każdy nie wiem jak się wytężał,\n" +
                "To nie udźwigną, taki to ciężar.\n" +
                "\n" +
                "↓\n" +
                "Nagle - gwizd!\n" +
                "Nagle - świst!\n" +
                "Para - buch!\n" +
                "Koła - w ruch!\n" +
                "\n" +
                "Najpierw - powoli - jak żółw – ociężale,\n" +
                "Ruszyła - maszyna - po szynach - ospale,\n" +
                "Szarpnęła wagony i ciągnie z mozołem,\n" +
                "I kręci się, kręci się koło za kołem,\n" +
                "I biegu przyspiesza, i gna coraz prędzej,\n" +
                "I dudni, i stuka, łomoce i pędzi,\n" +
                "A dokąd? A dokąd? A dokąd? Na wprost!\n" +
                "Po torze, po torze, po torze, przez most,\n" +
                "Przez góry, przez tunel, przez pola, przez las,\n" +
                "I spieszy się, spieszy, by zdążyć na czas,\n" +
                "Do taktu turkoce i puka, i stuka to:\n" +
                "Tak to to, tak to to , tak to to, tak to to.\n" +
                "Gładko tak, lekko tak toczy się w dal,\n" +
                "Jak gdyby to była piłeczka, nie stal,\n" +
                "Nie ciężka maszyna, zziajana, zdyszana,\n" +
                "Lecz fraszka, igraszka, zabawka blaszana.\n" +
                "\n" +
                "↓\n" +
                "A skądże to, jakże to, czemu tak gna?\n" +
                "A co to to, co to to, kto to tak pcha,\n" +
                "Że pędzi, że wali, że bucha buch, buch?\n" +
                "To para gorąca wprawiła to w ruch,\n" +
                "To para, co z kotła rurami do tłoków,\n" +
                "A tłoki kołami ruszają z dwóch boków\n" +
                "I gnają, i pchają, i pociąg się toczy,\n" +
                "Bo para te tłoki wciąż tłoczy i tłoczy,\n" +
                "I koła turkocą, i puka, i stuka to:\n" +
                "Tak to to, tak to to, tak to to, tak to to!…" ;

        System.out.println(wordsCounter(text));
    }


    static class Count{
      private  String word;
       private int count;

        public Count(String word, int count) {
            this.word = word;
            this.count = count;
        }

        public Count(int i, String ddd) {
        }

        public Count(String word) {
            this.word = word;
        }

        public String getWord() {
            return word;
        }

        public int getCount() {
            return count;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public void setCount(int count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return "|" +
                    "word= '" + word + '\'' +
                    ", Number of occurrences= " + count +
                    "|\n";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Count count1 = (Count) o;
            return count == count1.count &&
                    Objects.equals(word, count1.word);
        }

        @Override
        public int hashCode() {
            return Objects.hash(word, count);
        }
    }


    public static List wordsCounter(String text) {
        List<Count> cars = new ArrayList<>();
        Map<Integer, String> chuj = new HashMap<>();
        List<String> newText = new ArrayList<>(Arrays.asList(text.replaceAll("[^a-żA-Ż0-9]+", " ").toLowerCase().split(" ")));
        Set<String> finalText = new HashSet<>(newText);
        int i = 0;
        for (String word :finalText){
            cars.add(i, new Count(word));
            for (int j= 0; j < newText.size(); j++){
                if (cars.get(i).getWord().equals(newText.get(j))){
                    cars.get(i).setCount(cars.get(i).getCount() + 1);
                }
            }
            i++;
        }
        return cars;
    }
}








