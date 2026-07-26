package ir.mservices.market.movie.download.core;

import defpackage.js3;
import defpackage.r50;
import defpackage.u25;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;

/* JADX INFO: loaded from: classes3.dex */
public interface DownloadAction extends r50 {

    public static final class ToggleDownloadAction implements DownloadAction {
        private final MovieDownloadMetaData movieDownloadMetaData;
        private final u25 movieDownloadState;

        public ToggleDownloadAction(u25 u25Var, MovieDownloadMetaData movieDownloadMetaData) {
            js3.p(u25Var, "movieDownloadState");
            js3.p(movieDownloadMetaData, "movieDownloadMetaData");
            this.movieDownloadState = u25Var;
            this.movieDownloadMetaData = movieDownloadMetaData;
        }

        public static /* synthetic */ ToggleDownloadAction copy$default(ToggleDownloadAction toggleDownloadAction, u25 u25Var, MovieDownloadMetaData movieDownloadMetaData, int i, Object obj) {
            if ((i & 1) != 0) {
                u25Var = toggleDownloadAction.movieDownloadState;
            }
            if ((i & 2) != 0) {
                movieDownloadMetaData = toggleDownloadAction.movieDownloadMetaData;
            }
            return toggleDownloadAction.copy(u25Var, movieDownloadMetaData);
        }

        public final u25 component1() {
            return this.movieDownloadState;
        }

        public final MovieDownloadMetaData component2() {
            return this.movieDownloadMetaData;
        }

        public final ToggleDownloadAction copy(u25 u25Var, MovieDownloadMetaData movieDownloadMetaData) {
            js3.p(u25Var, "movieDownloadState");
            js3.p(movieDownloadMetaData, "movieDownloadMetaData");
            return new ToggleDownloadAction(u25Var, movieDownloadMetaData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToggleDownloadAction)) {
                return false;
            }
            ToggleDownloadAction toggleDownloadAction = (ToggleDownloadAction) obj;
            return js3.i(this.movieDownloadState, toggleDownloadAction.movieDownloadState) && js3.i(this.movieDownloadMetaData, toggleDownloadAction.movieDownloadMetaData);
        }

        public final MovieDownloadMetaData getMovieDownloadMetaData() {
            return this.movieDownloadMetaData;
        }

        public final u25 getMovieDownloadState() {
            return this.movieDownloadState;
        }

        public int hashCode() {
            return this.movieDownloadMetaData.hashCode() + (this.movieDownloadState.hashCode() * 31);
        }

        public String toString() {
            return "ToggleDownloadAction(movieDownloadState=" + this.movieDownloadState + ", movieDownloadMetaData=" + this.movieDownloadMetaData + ")";
        }
    }
}
