package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class InCompleteReviewResultDTO implements Serializable {
    private boolean completed;
    private List<InCompleteReviewDto> reviews;

    public List<InCompleteReviewDto> getInCompleteReviewDTOS() {
        return this.reviews;
    }

    public boolean isCompleted() {
        return this.completed;
    }
}
