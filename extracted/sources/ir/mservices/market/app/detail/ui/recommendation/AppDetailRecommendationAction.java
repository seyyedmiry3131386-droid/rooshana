package ir.mservices.market.app.detail.ui.recommendation;

import defpackage.js3;
import defpackage.pw6;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface AppDetailRecommendationAction extends r50 {

    public static final class UpdateListDataAction implements AppDetailRecommendationAction {
        private final pw6 appRecommendationChannel;

        public UpdateListDataAction(pw6 pw6Var) {
            js3.p(pw6Var, "appRecommendationChannel");
            this.appRecommendationChannel = pw6Var;
        }

        public static /* synthetic */ UpdateListDataAction copy$default(UpdateListDataAction updateListDataAction, pw6 pw6Var, int i, Object obj) {
            if ((i & 1) != 0) {
                pw6Var = updateListDataAction.appRecommendationChannel;
            }
            return updateListDataAction.copy(pw6Var);
        }

        public final pw6 component1() {
            return this.appRecommendationChannel;
        }

        public final UpdateListDataAction copy(pw6 pw6Var) {
            js3.p(pw6Var, "appRecommendationChannel");
            return new UpdateListDataAction(pw6Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateListDataAction) && js3.i(this.appRecommendationChannel, ((UpdateListDataAction) obj).appRecommendationChannel);
        }

        public final pw6 getAppRecommendationChannel() {
            return this.appRecommendationChannel;
        }

        public int hashCode() {
            return this.appRecommendationChannel.hashCode();
        }

        public String toString() {
            return "UpdateListDataAction(appRecommendationChannel=" + this.appRecommendationChannel + ")";
        }
    }
}
