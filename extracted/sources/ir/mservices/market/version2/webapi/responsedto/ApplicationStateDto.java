package ir.mservices.market.version2.webapi.responsedto;

import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.data.DownloadSummeryApplicationDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ApplicationStateDto implements Serializable {
    public static final String STATE_HAS_COMMENT = "HasComment";
    public static final String STATE_NONE = "None";
    public static final String STATE_NO_COMMENT = "NoComment";
    private DownloadSummeryApplicationDto app;
    private String commentState;
    private boolean isInMyket;
    private String packageName;
    private ReviewDto userReview;

    public DownloadSummeryApplicationDto getApp() {
        return this.app;
    }

    public String getCommentState() {
        return this.commentState;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public ReviewDto getUserReview() {
        return this.userReview;
    }

    public boolean isInMyket() {
        return this.isInMyket;
    }

    public void setCommentState(String str) {
        this.commentState = str;
    }

    public void setUserReview(ReviewDto reviewDto) {
        this.userReview = reviewDto;
    }
}
