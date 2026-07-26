package ir.mservices.market.download.app;

import defpackage.bl4;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface RecentDownloadAction extends r50 {

    public static final class PauseAllActiveDownload implements RecentDownloadAction {
        public static final PauseAllActiveDownload INSTANCE = new PauseAllActiveDownload();

        private PauseAllActiveDownload() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PauseAllActiveDownload);
        }

        public int hashCode() {
            return 885991141;
        }

        public String toString() {
            return "PauseAllActiveDownload";
        }
    }

    public static final class RemoveAllApps implements RecentDownloadAction {
        public static final RemoveAllApps INSTANCE = new RemoveAllApps();

        private RemoveAllApps() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveAllApps);
        }

        public int hashCode() {
            return -1191268221;
        }

        public String toString() {
            return "RemoveAllApps";
        }
    }

    public static final class RemoveAllMultiSelectedItems implements RecentDownloadAction {
        public static final RemoveAllMultiSelectedItems INSTANCE = new RemoveAllMultiSelectedItems();

        private RemoveAllMultiSelectedItems() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveAllMultiSelectedItems);
        }

        public int hashCode() {
            return -1077919363;
        }

        public String toString() {
            return "RemoveAllMultiSelectedItems";
        }
    }

    public static final class ShowMoreItemMenu implements RecentDownloadAction {
        private final boolean show;

        public ShowMoreItemMenu(boolean z) {
            this.show = z;
        }

        public static /* synthetic */ ShowMoreItemMenu copy$default(ShowMoreItemMenu showMoreItemMenu, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = showMoreItemMenu.show;
            }
            return showMoreItemMenu.copy(z);
        }

        public final boolean component1() {
            return this.show;
        }

        public final ShowMoreItemMenu copy(boolean z) {
            return new ShowMoreItemMenu(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowMoreItemMenu) && this.show == ((ShowMoreItemMenu) obj).show;
        }

        public final boolean getShow() {
            return this.show;
        }

        public int hashCode() {
            return this.show ? 1231 : 1237;
        }

        public String toString() {
            return bl4.x("ShowMoreItemMenu(show=", ")", this.show);
        }
    }
}
