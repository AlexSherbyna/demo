package com.alexs.Intresting;

public class Intresting {
    // static fabric
    private final int kg ;
    private final int gr ;
    private final double litr ;
    private final String text ;


    public static class Bilder {
        private final int kg;
        private final int gr;
        private  double litr = 0;
        private  String text = "";

        public Bilder(int kg, int gr) {
            this.kg = kg;
            this.gr = gr;
        }

        public Bilder litr(double val) {
            litr = val;
            return this;
        }

        public Bilder text(String str) {
            text = str;
            return this;
        }

        public Intresting bilder () {
            return new Intresting(this);
        }
    }

    private  Intresting(Bilder bilder) {
        kg = bilder.kg;
        gr = bilder.gr;
        litr = bilder.litr;
        text = bilder.text;
    }
}
