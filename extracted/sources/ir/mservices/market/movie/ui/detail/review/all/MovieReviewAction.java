package ir.mservices.market.movie.ui.detail.review.all;

import defpackage.dw1;
import defpackage.js3;
import defpackage.r50;
import defpackage.x55;

/* JADX INFO: loaded from: classes3.dex */
public interface MovieReviewAction extends r50 {

    public static final class InitAction implements MovieReviewAction {
        private final boolean isTvDevice;
        private final int maxSpan;
        private final String minutesAgoString;

        public InitAction(boolean z, int i, String str) {
            js3.p(str, "minutesAgoString");
            this.isTvDevice = z;
            this.maxSpan = i;
            this.minutesAgoString = str;
        }

        public static /* synthetic */ InitAction copy$default(InitAction initAction, boolean z, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = initAction.isTvDevice;
            }
            if ((i2 & 2) != 0) {
                i = initAction.maxSpan;
            }
            if ((i2 & 4) != 0) {
                str = initAction.minutesAgoString;
            }
            return initAction.copy(z, i, str);
        }

        public final boolean component1() {
            return this.isTvDevice;
        }

        public final int component2() {
            return this.maxSpan;
        }

        public final String component3() {
            return this.minutesAgoString;
        }

        public final InitAction copy(boolean z, int i, String str) {
            js3.p(str, "minutesAgoString");
            return new InitAction(z, i, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitAction)) {
                return false;
            }
            InitAction initAction = (InitAction) obj;
            return this.isTvDevice == initAction.isTvDevice && this.maxSpan == initAction.maxSpan && js3.i(this.minutesAgoString, initAction.minutesAgoString);
        }

        public final int getMaxSpan() {
            return this.maxSpan;
        }

        public final String getMinutesAgoString() {
            return this.minutesAgoString;
        }

        public int hashCode() {
            return this.minutesAgoString.hashCode() + ((((this.isTvDevice ? 1231 : 1237) * 31) + this.maxSpan) * 31);
        }

        public final boolean isTvDevice() {
            return this.isTvDevice;
        }

        public String toString() {
            boolean z = this.isTvDevice;
            int i = this.maxSpan;
            String str = this.minutesAgoString;
            StringBuilder sb = new StringBuilder("InitAction(isTvDevice=");
            sb.append(z);
            sb.append(", maxSpan=");
            sb.append(i);
            sb.append(", minutesAgoString=");
            return dw1.s(sb, str, ")");
        }
    }

    public static final class UpdateReviewUiState implements MovieReviewAction {
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
