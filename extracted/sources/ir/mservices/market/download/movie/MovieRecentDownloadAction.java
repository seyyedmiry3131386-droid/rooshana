package ir.mservices.market.download.movie;

import defpackage.js3;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface MovieRecentDownloadAction extends r50 {

    public static final class PauseAllDownloadAction implements MovieRecentDownloadAction {
        public static final PauseAllDownloadAction INSTANCE = new PauseAllDownloadAction();

        private PauseAllDownloadAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PauseAllDownloadAction);
        }

        public int hashCode() {
            return -358081272;
        }

        public String toString() {
            return "PauseAllDownloadAction";
        }
    }

    public static final class RefreshDoneAction implements MovieRecentDownloadAction {
        public static final RefreshDoneAction INSTANCE = new RefreshDoneAction();

        private RefreshDoneAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RefreshDoneAction);
        }

        public int hashCode() {
            return -478234956;
        }

        public String toString() {
            return "RefreshDoneAction";
        }
    }

    public static final class UpdateNotEnoughStorageFlowAction implements MovieRecentDownloadAction {
        private final String movieId;
        private final int quality;

        public UpdateNotEnoughStorageFlowAction(String str, int i) {
            js3.p(str, "movieId");
            this.movieId = str;
            this.quality = i;
        }

        public static /* synthetic */ UpdateNotEnoughStorageFlowAction copy$default(UpdateNotEnoughStorageFlowAction updateNotEnoughStorageFlowAction, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = updateNotEnoughStorageFlowAction.movieId;
            }
            if ((i2 & 2) != 0) {
                i = updateNotEnoughStorageFlowAction.quality;
            }
            return updateNotEnoughStorageFlowAction.copy(str, i);
        }

        public final String component1() {
            return this.movieId;
        }

        public final int component2() {
            return this.quality;
        }

        public final UpdateNotEnoughStorageFlowAction copy(String str, int i) {
            js3.p(str, "movieId");
            return new UpdateNotEnoughStorageFlowAction(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateNotEnoughStorageFlowAction)) {
                return false;
            }
            UpdateNotEnoughStorageFlowAction updateNotEnoughStorageFlowAction = (UpdateNotEnoughStorageFlowAction) obj;
            return js3.i(this.movieId, updateNotEnoughStorageFlowAction.movieId) && this.quality == updateNotEnoughStorageFlowAction.quality;
        }

        public final String getMovieId() {
            return this.movieId;
        }

        public final int getQuality() {
            return this.quality;
        }

        public int hashCode() {
            return (this.movieId.hashCode() * 31) + this.quality;
        }

        public String toString() {
            return "UpdateNotEnoughStorageFlowAction(movieId=" + this.movieId + ", quality=" + this.quality + ")";
        }
    }
}
