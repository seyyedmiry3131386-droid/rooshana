package ir.mservices.market.movie.ui.player;

import defpackage.bl4;
import defpackage.js3;
import defpackage.r50;
import ir.mservices.market.version2.model.MovieWatchProgressModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface BaseMovieAction extends r50 {

    public static final class CanShowAdAction implements BaseMovieAction {
        private final boolean canShowAd;

        public CanShowAdAction(boolean z) {
            this.canShowAd = z;
        }

        public static /* synthetic */ CanShowAdAction copy$default(CanShowAdAction canShowAdAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = canShowAdAction.canShowAd;
            }
            return canShowAdAction.copy(z);
        }

        public final boolean component1() {
            return this.canShowAd;
        }

        public final CanShowAdAction copy(boolean z) {
            return new CanShowAdAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CanShowAdAction) && this.canShowAd == ((CanShowAdAction) obj).canShowAd;
        }

        public final boolean getCanShowAd() {
            return this.canShowAd;
        }

        public int hashCode() {
            return this.canShowAd ? 1231 : 1237;
        }

        public String toString() {
            return bl4.x("CanShowAdAction(canShowAd=", ")", this.canShowAd);
        }
    }

    public static final class FirstVideoDisplayAction implements BaseMovieAction {
        private final boolean isFirstVideoDisplay;

        public FirstVideoDisplayAction(boolean z) {
            this.isFirstVideoDisplay = z;
        }

        public static /* synthetic */ FirstVideoDisplayAction copy$default(FirstVideoDisplayAction firstVideoDisplayAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = firstVideoDisplayAction.isFirstVideoDisplay;
            }
            return firstVideoDisplayAction.copy(z);
        }

        public final boolean component1() {
            return this.isFirstVideoDisplay;
        }

        public final FirstVideoDisplayAction copy(boolean z) {
            return new FirstVideoDisplayAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FirstVideoDisplayAction) && this.isFirstVideoDisplay == ((FirstVideoDisplayAction) obj).isFirstVideoDisplay;
        }

        public int hashCode() {
            return this.isFirstVideoDisplay ? 1231 : 1237;
        }

        public final boolean isFirstVideoDisplay() {
            return this.isFirstVideoDisplay;
        }

        public String toString() {
            return bl4.x("FirstVideoDisplayAction(isFirstVideoDisplay=", ")", this.isFirstVideoDisplay);
        }
    }

    public static final class MoviePlayAction implements BaseMovieAction {
        private final boolean isMoviePlaying;

        public MoviePlayAction(boolean z) {
            this.isMoviePlaying = z;
        }

        public static /* synthetic */ MoviePlayAction copy$default(MoviePlayAction moviePlayAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = moviePlayAction.isMoviePlaying;
            }
            return moviePlayAction.copy(z);
        }

        public final boolean component1() {
            return this.isMoviePlaying;
        }

        public final MoviePlayAction copy(boolean z) {
            return new MoviePlayAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MoviePlayAction) && this.isMoviePlaying == ((MoviePlayAction) obj).isMoviePlaying;
        }

        public int hashCode() {
            return this.isMoviePlaying ? 1231 : 1237;
        }

        public final boolean isMoviePlaying() {
            return this.isMoviePlaying;
        }

        public String toString() {
            return bl4.x("MoviePlayAction(isMoviePlaying=", ")", this.isMoviePlaying);
        }
    }

    public static final class RemoveAdAction implements BaseMovieAction {
        private final int ad;

        public RemoveAdAction(int i) {
            this.ad = i;
        }

        public static /* synthetic */ RemoveAdAction copy$default(RemoveAdAction removeAdAction, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = removeAdAction.ad;
            }
            return removeAdAction.copy(i);
        }

        public final int component1() {
            return this.ad;
        }

        public final RemoveAdAction copy(int i) {
            return new RemoveAdAction(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveAdAction) && this.ad == ((RemoveAdAction) obj).ad;
        }

        public final int getAd() {
            return this.ad;
        }

        public int hashCode() {
            return this.ad;
        }

        public String toString() {
            return bl4.q(this.ad, "RemoveAdAction(ad=", ")");
        }
    }

    public static final class ScreenOrientationChangeAction implements BaseMovieAction {
        private final int screenOrientation;

        public ScreenOrientationChangeAction(int i) {
            this.screenOrientation = i;
        }

        public static /* synthetic */ ScreenOrientationChangeAction copy$default(ScreenOrientationChangeAction screenOrientationChangeAction, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = screenOrientationChangeAction.screenOrientation;
            }
            return screenOrientationChangeAction.copy(i);
        }

        public final int component1() {
            return this.screenOrientation;
        }

        public final ScreenOrientationChangeAction copy(int i) {
            return new ScreenOrientationChangeAction(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScreenOrientationChangeAction) && this.screenOrientation == ((ScreenOrientationChangeAction) obj).screenOrientation;
        }

        public final int getScreenOrientation() {
            return this.screenOrientation;
        }

        public int hashCode() {
            return this.screenOrientation;
        }

        public String toString() {
            return bl4.q(this.screenOrientation, "ScreenOrientationChangeAction(screenOrientation=", ")");
        }
    }

    public static final class UpdateAdTimeAction implements BaseMovieAction {
        private final List<Integer> adTimes;

        public UpdateAdTimeAction(List<Integer> list) {
            this.adTimes = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UpdateAdTimeAction copy$default(UpdateAdTimeAction updateAdTimeAction, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = updateAdTimeAction.adTimes;
            }
            return updateAdTimeAction.copy(list);
        }

        public final List<Integer> component1() {
            return this.adTimes;
        }

        public final UpdateAdTimeAction copy(List<Integer> list) {
            return new UpdateAdTimeAction(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateAdTimeAction) && js3.i(this.adTimes, ((UpdateAdTimeAction) obj).adTimes);
        }

        public final List<Integer> getAdTimes() {
            return this.adTimes;
        }

        public int hashCode() {
            List<Integer> list = this.adTimes;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "UpdateAdTimeAction(adTimes=" + this.adTimes + ")";
        }
    }

    public static final class WatchProgressModelAction implements BaseMovieAction {
        private final MovieWatchProgressModel movieWatchProgressModel;

        public WatchProgressModelAction(MovieWatchProgressModel movieWatchProgressModel) {
            this.movieWatchProgressModel = movieWatchProgressModel;
        }

        public static /* synthetic */ WatchProgressModelAction copy$default(WatchProgressModelAction watchProgressModelAction, MovieWatchProgressModel movieWatchProgressModel, int i, Object obj) {
            if ((i & 1) != 0) {
                movieWatchProgressModel = watchProgressModelAction.movieWatchProgressModel;
            }
            return watchProgressModelAction.copy(movieWatchProgressModel);
        }

        public final MovieWatchProgressModel component1() {
            return this.movieWatchProgressModel;
        }

        public final WatchProgressModelAction copy(MovieWatchProgressModel movieWatchProgressModel) {
            return new WatchProgressModelAction(movieWatchProgressModel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WatchProgressModelAction) && js3.i(this.movieWatchProgressModel, ((WatchProgressModelAction) obj).movieWatchProgressModel);
        }

        public final MovieWatchProgressModel getMovieWatchProgressModel() {
            return this.movieWatchProgressModel;
        }

        public int hashCode() {
            MovieWatchProgressModel movieWatchProgressModel = this.movieWatchProgressModel;
            if (movieWatchProgressModel == null) {
                return 0;
            }
            return movieWatchProgressModel.hashCode();
        }

        public String toString() {
            return "WatchProgressModelAction(movieWatchProgressModel=" + this.movieWatchProgressModel + ")";
        }
    }
}
