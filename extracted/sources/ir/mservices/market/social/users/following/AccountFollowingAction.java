package ir.mservices.market.social.users.following;

import defpackage.bl4;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface AccountFollowingAction extends r50 {

    public static final class Refresh implements AccountFollowingAction {
        private final boolean isRefresh;

        public Refresh(boolean z) {
            this.isRefresh = z;
        }

        public static /* synthetic */ Refresh copy$default(Refresh refresh, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = refresh.isRefresh;
            }
            return refresh.copy(z);
        }

        public final boolean component1() {
            return this.isRefresh;
        }

        public final Refresh copy(boolean z) {
            return new Refresh(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Refresh) && this.isRefresh == ((Refresh) obj).isRefresh;
        }

        public int hashCode() {
            return this.isRefresh ? 1231 : 1237;
        }

        public final boolean isRefresh() {
            return this.isRefresh;
        }

        public String toString() {
            return bl4.x("Refresh(isRefresh=", ")", this.isRefresh);
        }
    }
}
