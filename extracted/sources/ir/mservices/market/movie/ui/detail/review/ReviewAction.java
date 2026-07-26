package ir.mservices.market.movie.ui.detail.review;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;
import defpackage.r50;
import defpackage.s47;
import ir.mservices.market.movie.ui.detail.review.data.LikeOrDislikeData;
import ir.mservices.market.movie.ui.detail.review.data.OpenReportReviewData;
import ir.mservices.market.movie.ui.detail.review.data.SubmitMovieReviewData;

/* JADX INFO: loaded from: classes3.dex */
public interface ReviewAction extends r50 {

    public static final class CancelReportReviewAction implements ReviewAction {
        public static final CancelReportReviewAction INSTANCE = new CancelReportReviewAction();

        private CancelReportReviewAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelReportReviewAction);
        }

        public int hashCode() {
            return 199174065;
        }

        public String toString() {
            return "CancelReportReviewAction";
        }
    }

    public static final class EmitLikeOrDislikeEventAction implements ReviewAction {
        public static final EmitLikeOrDislikeEventAction INSTANCE = new EmitLikeOrDislikeEventAction();

        private EmitLikeOrDislikeEventAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EmitLikeOrDislikeEventAction);
        }

        public int hashCode() {
            return 191275405;
        }

        public String toString() {
            return "EmitLikeOrDislikeEventAction";
        }
    }

    public static final class OpenReportReviewAction implements ReviewAction {
        private final String loginDialogKey;
        private final OpenReportReviewData value;

        public OpenReportReviewAction(OpenReportReviewData openReportReviewData, String str) {
            js3.p(openReportReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            js3.p(str, "loginDialogKey");
            this.value = openReportReviewData;
            this.loginDialogKey = str;
        }

        public static /* synthetic */ OpenReportReviewAction copy$default(OpenReportReviewAction openReportReviewAction, OpenReportReviewData openReportReviewData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                openReportReviewData = openReportReviewAction.value;
            }
            if ((i & 2) != 0) {
                str = openReportReviewAction.loginDialogKey;
            }
            return openReportReviewAction.copy(openReportReviewData, str);
        }

        public final OpenReportReviewData component1() {
            return this.value;
        }

        public final String component2() {
            return this.loginDialogKey;
        }

        public final OpenReportReviewAction copy(OpenReportReviewData openReportReviewData, String str) {
            js3.p(openReportReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            js3.p(str, "loginDialogKey");
            return new OpenReportReviewAction(openReportReviewData, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenReportReviewAction)) {
                return false;
            }
            OpenReportReviewAction openReportReviewAction = (OpenReportReviewAction) obj;
            return js3.i(this.value, openReportReviewAction.value) && js3.i(this.loginDialogKey, openReportReviewAction.loginDialogKey);
        }

        public final String getLoginDialogKey() {
            return this.loginDialogKey;
        }

        public final OpenReportReviewData getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.loginDialogKey.hashCode() + (this.value.hashCode() * 31);
        }

        public String toString() {
            return "OpenReportReviewAction(value=" + this.value + ", loginDialogKey=" + this.loginDialogKey + ")";
        }
    }

    public static final class ReportReviewAction implements ReviewAction {
        private final s47 value;

        public ReportReviewAction(s47 s47Var) {
            js3.p(s47Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.value = s47Var;
        }

        public static /* synthetic */ ReportReviewAction copy$default(ReportReviewAction reportReviewAction, s47 s47Var, int i, Object obj) {
            if ((i & 1) != 0) {
                s47Var = reportReviewAction.value;
            }
            return reportReviewAction.copy(s47Var);
        }

        public final s47 component1() {
            return this.value;
        }

        public final ReportReviewAction copy(s47 s47Var) {
            js3.p(s47Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new ReportReviewAction(s47Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReportReviewAction) && js3.i(this.value, ((ReportReviewAction) obj).value);
        }

        public final s47 getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ReportReviewAction(value=" + this.value + ")";
        }
    }

    public static final class RunPreviousAction implements ReviewAction {
        public static final RunPreviousAction INSTANCE = new RunPreviousAction();

        private RunPreviousAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RunPreviousAction);
        }

        public int hashCode() {
            return 850208899;
        }

        public String toString() {
            return "RunPreviousAction";
        }
    }

    public static final class SendLikeOrDislikeAction implements ReviewAction {
        private final String loginDialogKey;
        private final LikeOrDislikeData value;

        public SendLikeOrDislikeAction(LikeOrDislikeData likeOrDislikeData, String str) {
            js3.p(likeOrDislikeData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            js3.p(str, "loginDialogKey");
            this.value = likeOrDislikeData;
            this.loginDialogKey = str;
        }

        public static /* synthetic */ SendLikeOrDislikeAction copy$default(SendLikeOrDislikeAction sendLikeOrDislikeAction, LikeOrDislikeData likeOrDislikeData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                likeOrDislikeData = sendLikeOrDislikeAction.value;
            }
            if ((i & 2) != 0) {
                str = sendLikeOrDislikeAction.loginDialogKey;
            }
            return sendLikeOrDislikeAction.copy(likeOrDislikeData, str);
        }

        public final LikeOrDislikeData component1() {
            return this.value;
        }

        public final String component2() {
            return this.loginDialogKey;
        }

        public final SendLikeOrDislikeAction copy(LikeOrDislikeData likeOrDislikeData, String str) {
            js3.p(likeOrDislikeData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            js3.p(str, "loginDialogKey");
            return new SendLikeOrDislikeAction(likeOrDislikeData, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SendLikeOrDislikeAction)) {
                return false;
            }
            SendLikeOrDislikeAction sendLikeOrDislikeAction = (SendLikeOrDislikeAction) obj;
            return js3.i(this.value, sendLikeOrDislikeAction.value) && js3.i(this.loginDialogKey, sendLikeOrDislikeAction.loginDialogKey);
        }

        public final String getLoginDialogKey() {
            return this.loginDialogKey;
        }

        public final LikeOrDislikeData getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.loginDialogKey.hashCode() + (this.value.hashCode() * 31);
        }

        public String toString() {
            return "SendLikeOrDislikeAction(value=" + this.value + ", loginDialogKey=" + this.loginDialogKey + ")";
        }
    }

    public static final class SubmitMovieReviewAction implements ReviewAction {
        private final String loginDialogKey;
        private final SubmitMovieReviewData value;

        public SubmitMovieReviewAction(SubmitMovieReviewData submitMovieReviewData, String str) {
            js3.p(submitMovieReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            js3.p(str, "loginDialogKey");
            this.value = submitMovieReviewData;
            this.loginDialogKey = str;
        }

        public static /* synthetic */ SubmitMovieReviewAction copy$default(SubmitMovieReviewAction submitMovieReviewAction, SubmitMovieReviewData submitMovieReviewData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                submitMovieReviewData = submitMovieReviewAction.value;
            }
            if ((i & 2) != 0) {
                str = submitMovieReviewAction.loginDialogKey;
            }
            return submitMovieReviewAction.copy(submitMovieReviewData, str);
        }

        public final SubmitMovieReviewData component1() {
            return this.value;
        }

        public final String component2() {
            return this.loginDialogKey;
        }

        public final SubmitMovieReviewAction copy(SubmitMovieReviewData submitMovieReviewData, String str) {
            js3.p(submitMovieReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            js3.p(str, "loginDialogKey");
            return new SubmitMovieReviewAction(submitMovieReviewData, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitMovieReviewAction)) {
                return false;
            }
            SubmitMovieReviewAction submitMovieReviewAction = (SubmitMovieReviewAction) obj;
            return js3.i(this.value, submitMovieReviewAction.value) && js3.i(this.loginDialogKey, submitMovieReviewAction.loginDialogKey);
        }

        public final String getLoginDialogKey() {
            return this.loginDialogKey;
        }

        public final SubmitMovieReviewData getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.loginDialogKey.hashCode() + (this.value.hashCode() * 31);
        }

        public String toString() {
            return "SubmitMovieReviewAction(value=" + this.value + ", loginDialogKey=" + this.loginDialogKey + ")";
        }
    }
}
