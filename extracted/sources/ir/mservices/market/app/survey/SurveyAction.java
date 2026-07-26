package ir.mservices.market.app.survey;

import defpackage.bl4;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface SurveyAction extends r50 {

    public static final class Answer implements SurveyAction {
        private final int id;

        public Answer(int i) {
            this.id = i;
        }

        public static /* synthetic */ Answer copy$default(Answer answer, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = answer.id;
            }
            return answer.copy(i);
        }

        public final int component1() {
            return this.id;
        }

        public final Answer copy(int i) {
            return new Answer(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Answer) && this.id == ((Answer) obj).id;
        }

        public final int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id;
        }

        public String toString() {
            return bl4.q(this.id, "Answer(id=", ")");
        }
    }

    public static final class Cancel implements SurveyAction {
        public static final Cancel INSTANCE = new Cancel();

        private Cancel() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public int hashCode() {
            return -1815824229;
        }

        public String toString() {
            return "Cancel";
        }
    }

    public static final class Submit implements SurveyAction {
        public static final Submit INSTANCE = new Submit();

        private Submit() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Submit);
        }

        public int hashCode() {
            return -1339635143;
        }

        public String toString() {
            return "Submit";
        }
    }
}
