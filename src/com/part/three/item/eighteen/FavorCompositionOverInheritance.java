package com.part.three.item.eighteen;

/**
 * Item 18: Favor composition over inheritance.
 *
 * Inheritance can lead to fragile base class problems. Composition provides better flexibility and avoids issues
 * caused by changes in the base class.
 *
 * This class demonstrates a bad example using inheritance and a good example using composition.
 */
public class FavorCompositionOverInheritance {

    // Bad Example: Inheritance (fragile base class problem)
    static class BadInstrument {
        public void play() {
            System.out.println("Playing instrument");
        }
    }

    static class BadGuitar extends BadInstrument {
        @Override
        public void play() {
            System.out.println("Playing guitar");
        }
    }

    // Good Example: Composition
    static class MusicPlayer {
        private final BadInstrument instrument;

        public MusicPlayer(BadInstrument instrument) {
            this.instrument = instrument;
        }

        public void play() {
            instrument.play();
        }
    }

    public static void main(String[] args) {
        System.out.println("Favor Composition Over Inheritance\n");

        // Bad Example
        BadGuitar badGuitar = new BadGuitar();
        badGuitar.play();

        // Good Example
        BadInstrument guitar = new BadInstrument();
        MusicPlayer player = new MusicPlayer(guitar);
        player.play();
    }
}
