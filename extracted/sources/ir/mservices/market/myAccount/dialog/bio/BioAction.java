package ir.mservices.market.myAccount.dialog.bio;

import defpackage.js3;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface BioAction extends r50 {

    public static final class DeleteBioAction implements BioAction {
        public static final DeleteBioAction INSTANCE = new DeleteBioAction();

        private DeleteBioAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DeleteBioAction);
        }

        public int hashCode() {
            return 146984910;
        }

        public String toString() {
            return "DeleteBioAction";
        }
    }

    public static final class UpdateBioAction implements BioAction {
        private final String bio;

        public UpdateBioAction(String str) {
            js3.p(str, "bio");
            this.bio = str;
        }

        public final String getBio() {
            return this.bio;
        }
    }
}
