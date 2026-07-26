package ir.mservices.market.feedback;

import defpackage.js3;
import defpackage.n99;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface FeedbackAction extends r50 {

    public static final class RemoveImageAction implements FeedbackAction {
        public static final RemoveImageAction INSTANCE = new RemoveImageAction();

        private RemoveImageAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveImageAction);
        }

        public int hashCode() {
            return -518339335;
        }

        public String toString() {
            return "RemoveImageAction";
        }
    }

    public static final class SelectImageAction implements FeedbackAction {
        private final n99 selectedImage;

        public SelectImageAction(n99 n99Var) {
            this.selectedImage = n99Var;
        }

        public static /* synthetic */ SelectImageAction copy$default(SelectImageAction selectImageAction, n99 n99Var, int i, Object obj) {
            if ((i & 1) != 0) {
                n99Var = selectImageAction.selectedImage;
            }
            return selectImageAction.copy(n99Var);
        }

        public final n99 component1() {
            return this.selectedImage;
        }

        public final SelectImageAction copy(n99 n99Var) {
            return new SelectImageAction(n99Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectImageAction) && js3.i(this.selectedImage, ((SelectImageAction) obj).selectedImage);
        }

        public final n99 getSelectedImage() {
            return this.selectedImage;
        }

        public int hashCode() {
            n99 n99Var = this.selectedImage;
            if (n99Var == null) {
                return 0;
            }
            return n99Var.hashCode();
        }

        public String toString() {
            return "SelectImageAction(selectedImage=" + this.selectedImage + ")";
        }
    }
}
