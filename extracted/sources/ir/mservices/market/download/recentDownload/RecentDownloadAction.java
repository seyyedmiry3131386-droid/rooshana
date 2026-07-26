package ir.mservices.market.download.recentDownload;

import defpackage.js3;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface RecentDownloadAction extends r50 {

    public static final class UpdateRefreshAction implements RecentDownloadAction {
        private final Boolean refresh;

        public UpdateRefreshAction(Boolean bool) {
            this.refresh = bool;
        }

        public static /* synthetic */ UpdateRefreshAction copy$default(UpdateRefreshAction updateRefreshAction, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = updateRefreshAction.refresh;
            }
            return updateRefreshAction.copy(bool);
        }

        public final Boolean component1() {
            return this.refresh;
        }

        public final UpdateRefreshAction copy(Boolean bool) {
            return new UpdateRefreshAction(bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateRefreshAction) && js3.i(this.refresh, ((UpdateRefreshAction) obj).refresh);
        }

        public final Boolean getRefresh() {
            return this.refresh;
        }

        public int hashCode() {
            Boolean bool = this.refresh;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "UpdateRefreshAction(refresh=" + this.refresh + ")";
        }
    }
}
