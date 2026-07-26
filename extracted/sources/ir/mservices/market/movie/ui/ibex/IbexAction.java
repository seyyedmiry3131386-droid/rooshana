package ir.mservices.market.movie.ui.ibex;

import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface IbexAction extends r50 {

    public static final class CallbackCalledAction implements IbexAction {
        public static final CallbackCalledAction INSTANCE = new CallbackCalledAction();

        private CallbackCalledAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CallbackCalledAction);
        }

        public int hashCode() {
            return 685169652;
        }

        public String toString() {
            return "CallbackCalledAction";
        }
    }

    public static final class ResetVideoDurationAction implements IbexAction {
        public static final ResetVideoDurationAction INSTANCE = new ResetVideoDurationAction();

        private ResetVideoDurationAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ResetVideoDurationAction);
        }

        public int hashCode() {
            return 2024284530;
        }

        public String toString() {
            return "ResetVideoDurationAction";
        }
    }
}
