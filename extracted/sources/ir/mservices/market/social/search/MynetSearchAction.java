package ir.mservices.market.social.search;

import defpackage.bl4;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface MynetSearchAction extends r50 {

    public static final class FirstCallAction implements MynetSearchAction {
        private final boolean firstCall;

        public FirstCallAction(boolean z) {
            this.firstCall = z;
        }

        public static /* synthetic */ FirstCallAction copy$default(FirstCallAction firstCallAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = firstCallAction.firstCall;
            }
            return firstCallAction.copy(z);
        }

        public final boolean component1() {
            return this.firstCall;
        }

        public final FirstCallAction copy(boolean z) {
            return new FirstCallAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FirstCallAction) && this.firstCall == ((FirstCallAction) obj).firstCall;
        }

        public final boolean getFirstCall() {
            return this.firstCall;
        }

        public int hashCode() {
            return this.firstCall ? 1231 : 1237;
        }

        public String toString() {
            return bl4.x("FirstCallAction(firstCall=", ")", this.firstCall);
        }
    }
}
