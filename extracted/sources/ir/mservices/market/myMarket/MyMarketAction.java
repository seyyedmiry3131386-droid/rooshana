package ir.mservices.market.myMarket;

import defpackage.bl4;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface MyMarketAction extends r50 {

    public static final class RefreshAction implements MyMarketAction {
        private final boolean refresh;

        public RefreshAction(boolean z) {
            this.refresh = z;
        }

        public static /* synthetic */ RefreshAction copy$default(RefreshAction refreshAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = refreshAction.refresh;
            }
            return refreshAction.copy(z);
        }

        public final boolean component1() {
            return this.refresh;
        }

        public final RefreshAction copy(boolean z) {
            return new RefreshAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshAction) && this.refresh == ((RefreshAction) obj).refresh;
        }

        public final boolean getRefresh() {
            return this.refresh;
        }

        public int hashCode() {
            return this.refresh ? 1231 : 1237;
        }

        public String toString() {
            return bl4.x("RefreshAction(refresh=", ")", this.refresh);
        }
    }
}
