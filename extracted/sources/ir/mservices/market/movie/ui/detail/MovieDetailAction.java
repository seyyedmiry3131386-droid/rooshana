package ir.mservices.market.movie.ui.detail;

import defpackage.bl4;
import defpackage.dw1;
import defpackage.js3;
import defpackage.r50;
import defpackage.rm7;
import defpackage.x55;

/* JADX INFO: loaded from: classes3.dex */
public interface MovieDetailAction extends r50 {

    public static final class InitAction implements MovieDetailAction {
        private final boolean isTvDevice;
        private final Integer maxSpan;
        private final String reviewDate;
        private final String reviewSubtitle;

        public InitAction(boolean z, Integer num, String str, String str2) {
            js3.p(str, "reviewSubtitle");
            js3.p(str2, "reviewDate");
            this.isTvDevice = z;
            this.maxSpan = num;
            this.reviewSubtitle = str;
            this.reviewDate = str2;
        }

        public static /* synthetic */ InitAction copy$default(InitAction initAction, boolean z, Integer num, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = initAction.isTvDevice;
            }
            if ((i & 2) != 0) {
                num = initAction.maxSpan;
            }
            if ((i & 4) != 0) {
                str = initAction.reviewSubtitle;
            }
            if ((i & 8) != 0) {
                str2 = initAction.reviewDate;
            }
            return initAction.copy(z, num, str, str2);
        }

        public final boolean component1() {
            return this.isTvDevice;
        }

        public final Integer component2() {
            return this.maxSpan;
        }

        public final String component3() {
            return this.reviewSubtitle;
        }

        public final String component4() {
            return this.reviewDate;
        }

        public final InitAction copy(boolean z, Integer num, String str, String str2) {
            js3.p(str, "reviewSubtitle");
            js3.p(str2, "reviewDate");
            return new InitAction(z, num, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitAction)) {
                return false;
            }
            InitAction initAction = (InitAction) obj;
            return this.isTvDevice == initAction.isTvDevice && js3.i(this.maxSpan, initAction.maxSpan) && js3.i(this.reviewSubtitle, initAction.reviewSubtitle) && js3.i(this.reviewDate, initAction.reviewDate);
        }

        public final Integer getMaxSpan() {
            return this.maxSpan;
        }

        public final String getReviewDate() {
            return this.reviewDate;
        }

        public final String getReviewSubtitle() {
            return this.reviewSubtitle;
        }

        public int hashCode() {
            int i = (this.isTvDevice ? 1231 : 1237) * 31;
            Integer num = this.maxSpan;
            return this.reviewDate.hashCode() + rm7.k(this.reviewSubtitle, (i + (num == null ? 0 : num.hashCode())) * 31, 31);
        }

        public final boolean isTvDevice() {
            return this.isTvDevice;
        }

        public String toString() {
            boolean z = this.isTvDevice;
            Integer num = this.maxSpan;
            String str = this.reviewSubtitle;
            String str2 = this.reviewDate;
            StringBuilder sb = new StringBuilder("InitAction(isTvDevice=");
            sb.append(z);
            sb.append(", maxSpan=");
            sb.append(num);
            sb.append(", reviewSubtitle=");
            return dw1.p(str, ", reviewDate=", str2, ")", sb);
        }
    }

    public static final class ShowTrailerReplayIcon implements MovieDetailAction {
        private final boolean show;

        public ShowTrailerReplayIcon(boolean z) {
            this.show = z;
        }

        public static /* synthetic */ ShowTrailerReplayIcon copy$default(ShowTrailerReplayIcon showTrailerReplayIcon, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = showTrailerReplayIcon.show;
            }
            return showTrailerReplayIcon.copy(z);
        }

        public final boolean component1() {
            return this.show;
        }

        public final ShowTrailerReplayIcon copy(boolean z) {
            return new ShowTrailerReplayIcon(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowTrailerReplayIcon) && this.show == ((ShowTrailerReplayIcon) obj).show;
        }

        public final boolean getShow() {
            return this.show;
        }

        public int hashCode() {
            return this.show ? 1231 : 1237;
        }

        public String toString() {
            return bl4.x("ShowTrailerReplayIcon(show=", ")", this.show);
        }
    }

    public static final class UpdateReviewUiState implements MovieDetailAction {
        private final x55 movieReviewUiState;

        public UpdateReviewUiState(x55 x55Var) {
            js3.p(x55Var, "movieReviewUiState");
            this.movieReviewUiState = x55Var;
        }

        public static /* synthetic */ UpdateReviewUiState copy$default(UpdateReviewUiState updateReviewUiState, x55 x55Var, int i, Object obj) {
            if ((i & 1) != 0) {
                x55Var = updateReviewUiState.movieReviewUiState;
            }
            return updateReviewUiState.copy(x55Var);
        }

        public final x55 component1() {
            return this.movieReviewUiState;
        }

        public final UpdateReviewUiState copy(x55 x55Var) {
            js3.p(x55Var, "movieReviewUiState");
            return new UpdateReviewUiState(x55Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateReviewUiState) && js3.i(this.movieReviewUiState, ((UpdateReviewUiState) obj).movieReviewUiState);
        }

        public final x55 getMovieReviewUiState() {
            return this.movieReviewUiState;
        }

        public int hashCode() {
            return this.movieReviewUiState.hashCode();
        }

        public String toString() {
            return "UpdateReviewUiState(movieReviewUiState=" + this.movieReviewUiState + ")";
        }
    }
}
