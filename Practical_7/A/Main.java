package Practical_7.A;

abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}

class Flute extends Instrument {
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Guitar is playing tin tin tin tin");
    }
}

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];

        instruments[0] = new Piano();
        instruments[1] = new Flute();
        instruments[2] = new Guitar();
        instruments[3] = new Piano();
        instruments[4] = new Flute();
        instruments[5] = new Guitar();
        instruments[6] = new Piano();
        instruments[7] = new Flute();
        instruments[8] = new Guitar();
        instruments[9] = new Piano();

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}

