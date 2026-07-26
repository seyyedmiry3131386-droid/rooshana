package ir.mservices.market.app.update;

import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface UpdateAction extends r50 {

    public static final class FinishedUpdateAction implements UpdateAction {
        public static final FinishedUpdateAction INSTANCE = new FinishedUpdateAction();

        private FinishedUpdateAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FinishedUpdateAction);
        }

        public int hashCode() {
            return 225203506;
        }

        public String toString() {
            return "FinishedUpdateAction";
        }
    }
}
