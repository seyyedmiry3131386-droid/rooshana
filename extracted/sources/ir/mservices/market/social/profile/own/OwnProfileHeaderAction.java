package ir.mservices.market.social.profile.own;

import defpackage.bl4;
import defpackage.ja4;
import defpackage.js3;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface OwnProfileHeaderAction extends r50 {

    public static final class LoadAction implements OwnProfileHeaderAction {
        private final ja4 state;

        public LoadAction(ja4 ja4Var) {
            js3.p(ja4Var, "state");
            this.state = ja4Var;
        }

        public static /* synthetic */ LoadAction copy$default(LoadAction loadAction, ja4 ja4Var, int i, Object obj) {
            if ((i & 1) != 0) {
                ja4Var = loadAction.state;
            }
            return loadAction.copy(ja4Var);
        }

        public final ja4 component1() {
            return this.state;
        }

        public final LoadAction copy(ja4 ja4Var) {
            js3.p(ja4Var, "state");
            return new LoadAction(ja4Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadAction) && js3.i(this.state, ((LoadAction) obj).state);
        }

        public final ja4 getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "LoadAction(state=" + this.state + ")";
        }
    }

    public static final class RefreshAction implements OwnProfileHeaderAction {
        private final boolean isRefresh;

        public RefreshAction(boolean z) {
            this.isRefresh = z;
        }

        public static /* synthetic */ RefreshAction copy$default(RefreshAction refreshAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = refreshAction.isRefresh;
            }
            return refreshAction.copy(z);
        }

        public final boolean component1() {
            return this.isRefresh;
        }

        public final RefreshAction copy(boolean z) {
            return new RefreshAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefreshAction) && this.isRefresh == ((RefreshAction) obj).isRefresh;
        }

        public int hashCode() {
            return this.isRefresh ? 1231 : 1237;
        }

        public final boolean isRefresh() {
            return this.isRefresh;
        }

        public String toString() {
            return bl4.x("RefreshAction(isRefresh=", ")", this.isRefresh);
        }
    }

    public static final class UnreadMessageAction implements OwnProfileHeaderAction {
        private final boolean isUnread;

        public UnreadMessageAction(boolean z) {
            this.isUnread = z;
        }

        public static /* synthetic */ UnreadMessageAction copy$default(UnreadMessageAction unreadMessageAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = unreadMessageAction.isUnread;
            }
            return unreadMessageAction.copy(z);
        }

        public final boolean component1() {
            return this.isUnread;
        }

        public final UnreadMessageAction copy(boolean z) {
            return new UnreadMessageAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnreadMessageAction) && this.isUnread == ((UnreadMessageAction) obj).isUnread;
        }

        public int hashCode() {
            return this.isUnread ? 1231 : 1237;
        }

        public final boolean isUnread() {
            return this.isUnread;
        }

        public String toString() {
            return bl4.x("UnreadMessageAction(isUnread=", ")", this.isUnread);
        }
    }
}
