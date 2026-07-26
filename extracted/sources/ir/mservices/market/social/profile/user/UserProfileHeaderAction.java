package ir.mservices.market.social.profile.user;

import defpackage.ja4;
import defpackage.js3;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface UserProfileHeaderAction extends r50 {

    public static final class FollowAction implements UserProfileHeaderAction {
        public static final FollowAction INSTANCE = new FollowAction();

        private FollowAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FollowAction);
        }

        public int hashCode() {
            return -151408773;
        }

        public String toString() {
            return "FollowAction";
        }
    }

    public static final class LoadAction implements UserProfileHeaderAction {
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

    public static final class RefreshAction implements UserProfileHeaderAction {
        public static final RefreshAction INSTANCE = new RefreshAction();

        private RefreshAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RefreshAction);
        }

        public int hashCode() {
            return 1874796861;
        }

        public String toString() {
            return "RefreshAction";
        }
    }

    public static final class ResetRelation implements UserProfileHeaderAction {
        public static final ResetRelation INSTANCE = new ResetRelation();

        private ResetRelation() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ResetRelation);
        }

        public int hashCode() {
            return -1909542729;
        }

        public String toString() {
            return "ResetRelation";
        }
    }

    public static final class UnfollowAction implements UserProfileHeaderAction {
        public static final UnfollowAction INSTANCE = new UnfollowAction();

        private UnfollowAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UnfollowAction);
        }

        public int hashCode() {
            return 915923860;
        }

        public String toString() {
            return "UnfollowAction";
        }
    }
}
