package ir.mservices.market.intro;

import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface IntroAction extends r50 {

    public static final class NextStep implements IntroAction {
        public static final NextStep INSTANCE = new NextStep();

        private NextStep() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NextStep);
        }

        public int hashCode() {
            return 1643546071;
        }

        public String toString() {
            return "NextStep";
        }
    }

    public static final class PreviousStep implements IntroAction {
        public static final PreviousStep INSTANCE = new PreviousStep();

        private PreviousStep() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PreviousStep);
        }

        public int hashCode() {
            return 2073139163;
        }

        public String toString() {
            return "PreviousStep";
        }
    }
}
