package ir.mservices.market.common.comment.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;
import defpackage.yd1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CommentScenario implements Serializable {

    public static final class LikeOrDislikeReview extends CommentScenario {
        private final LikeOrDislikeData value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LikeOrDislikeReview(LikeOrDislikeData likeOrDislikeData) {
            super(null);
            js3.p(likeOrDislikeData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.value = likeOrDislikeData;
        }

        public static /* synthetic */ LikeOrDislikeReview copy$default(LikeOrDislikeReview likeOrDislikeReview, LikeOrDislikeData likeOrDislikeData, int i, Object obj) {
            if ((i & 1) != 0) {
                likeOrDislikeData = likeOrDislikeReview.value;
            }
            return likeOrDislikeReview.copy(likeOrDislikeData);
        }

        public final LikeOrDislikeData component1() {
            return this.value;
        }

        public final LikeOrDislikeReview copy(LikeOrDislikeData likeOrDislikeData) {
            js3.p(likeOrDislikeData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new LikeOrDislikeReview(likeOrDislikeData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LikeOrDislikeReview) && js3.i(this.value, ((LikeOrDislikeReview) obj).value);
        }

        public final LikeOrDislikeData getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "LikeOrDislikeReview(value=" + this.value + ")";
        }
    }

    public static final class RemoveComment extends CommentScenario {
        private final RemoveReviewData value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveComment(RemoveReviewData removeReviewData) {
            super(null);
            js3.p(removeReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.value = removeReviewData;
        }

        public static /* synthetic */ RemoveComment copy$default(RemoveComment removeComment, RemoveReviewData removeReviewData, int i, Object obj) {
            if ((i & 1) != 0) {
                removeReviewData = removeComment.value;
            }
            return removeComment.copy(removeReviewData);
        }

        public final RemoveReviewData component1() {
            return this.value;
        }

        public final RemoveComment copy(RemoveReviewData removeReviewData) {
            js3.p(removeReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new RemoveComment(removeReviewData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveComment) && js3.i(this.value, ((RemoveComment) obj).value);
        }

        public final RemoveReviewData getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "RemoveComment(value=" + this.value + ")";
        }
    }

    public static final class ReplyReview extends CommentScenario {
        private final ReplyReviewData value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReplyReview(ReplyReviewData replyReviewData) {
            super(null);
            js3.p(replyReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.value = replyReviewData;
        }

        public static /* synthetic */ ReplyReview copy$default(ReplyReview replyReview, ReplyReviewData replyReviewData, int i, Object obj) {
            if ((i & 1) != 0) {
                replyReviewData = replyReview.value;
            }
            return replyReview.copy(replyReviewData);
        }

        public final ReplyReviewData component1() {
            return this.value;
        }

        public final ReplyReview copy(ReplyReviewData replyReviewData) {
            js3.p(replyReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new ReplyReview(replyReviewData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReplyReview) && js3.i(this.value, ((ReplyReview) obj).value);
        }

        public final ReplyReviewData getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ReplyReview(value=" + this.value + ")";
        }
    }

    public static final class ReportReview extends CommentScenario {
        private final ReportReviewData value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReportReview(ReportReviewData reportReviewData) {
            super(null);
            js3.p(reportReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.value = reportReviewData;
        }

        public static /* synthetic */ ReportReview copy$default(ReportReview reportReview, ReportReviewData reportReviewData, int i, Object obj) {
            if ((i & 1) != 0) {
                reportReviewData = reportReview.value;
            }
            return reportReview.copy(reportReviewData);
        }

        public final ReportReviewData component1() {
            return this.value;
        }

        public final ReportReview copy(ReportReviewData reportReviewData) {
            js3.p(reportReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new ReportReview(reportReviewData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReportReview) && js3.i(this.value, ((ReportReview) obj).value);
        }

        public final ReportReviewData getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ReportReview(value=" + this.value + ")";
        }
    }

    public static final class SubmitDeveloperReview extends CommentScenario {
        private final SubmitReviewData value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitDeveloperReview(SubmitReviewData submitReviewData) {
            super(null);
            js3.p(submitReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.value = submitReviewData;
        }

        public static /* synthetic */ SubmitDeveloperReview copy$default(SubmitDeveloperReview submitDeveloperReview, SubmitReviewData submitReviewData, int i, Object obj) {
            if ((i & 1) != 0) {
                submitReviewData = submitDeveloperReview.value;
            }
            return submitDeveloperReview.copy(submitReviewData);
        }

        public final SubmitReviewData component1() {
            return this.value;
        }

        public final SubmitDeveloperReview copy(SubmitReviewData submitReviewData) {
            js3.p(submitReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new SubmitDeveloperReview(submitReviewData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitDeveloperReview) && js3.i(this.value, ((SubmitDeveloperReview) obj).value);
        }

        public final SubmitReviewData getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "SubmitDeveloperReview(value=" + this.value + ")";
        }
    }

    public static final class SubmitDeveloperStar extends CommentScenario {
        private final DeveloperSubmitReview value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitDeveloperStar(DeveloperSubmitReview developerSubmitReview) {
            super(null);
            js3.p(developerSubmitReview, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.value = developerSubmitReview;
        }

        public static /* synthetic */ SubmitDeveloperStar copy$default(SubmitDeveloperStar submitDeveloperStar, DeveloperSubmitReview developerSubmitReview, int i, Object obj) {
            if ((i & 1) != 0) {
                developerSubmitReview = submitDeveloperStar.value;
            }
            return submitDeveloperStar.copy(developerSubmitReview);
        }

        public final DeveloperSubmitReview component1() {
            return this.value;
        }

        public final SubmitDeveloperStar copy(DeveloperSubmitReview developerSubmitReview) {
            js3.p(developerSubmitReview, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new SubmitDeveloperStar(developerSubmitReview);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitDeveloperStar) && js3.i(this.value, ((SubmitDeveloperStar) obj).value);
        }

        public final DeveloperSubmitReview getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "SubmitDeveloperStar(value=" + this.value + ")";
        }
    }

    public static final class SubmitReview extends CommentScenario {
        private final SubmitReviewData value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitReview(SubmitReviewData submitReviewData) {
            super(null);
            js3.p(submitReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.value = submitReviewData;
        }

        public static /* synthetic */ SubmitReview copy$default(SubmitReview submitReview, SubmitReviewData submitReviewData, int i, Object obj) {
            if ((i & 1) != 0) {
                submitReviewData = submitReview.value;
            }
            return submitReview.copy(submitReviewData);
        }

        public final SubmitReviewData component1() {
            return this.value;
        }

        public final SubmitReview copy(SubmitReviewData submitReviewData) {
            js3.p(submitReviewData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new SubmitReview(submitReviewData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitReview) && js3.i(this.value, ((SubmitReview) obj).value);
        }

        public final SubmitReviewData getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "SubmitReview(value=" + this.value + ")";
        }
    }

    public /* synthetic */ CommentScenario(yd1 yd1Var) {
        this();
    }

    private CommentScenario() {
    }
}
