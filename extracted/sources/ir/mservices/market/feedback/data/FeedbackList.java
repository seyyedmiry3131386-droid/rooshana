package ir.mservices.market.feedback.data;

import defpackage.js3;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackList {
    private final List<MyketRecyclerData> items;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackList(List<? extends MyketRecyclerData> list) {
        js3.p(list, "items");
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackList copy$default(FeedbackList feedbackList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = feedbackList.items;
        }
        return feedbackList.copy(list);
    }

    public final List<MyketRecyclerData> component1() {
        return this.items;
    }

    public final FeedbackList copy(List<? extends MyketRecyclerData> list) {
        js3.p(list, "items");
        return new FeedbackList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedbackList) && js3.i(this.items, ((FeedbackList) obj).items);
    }

    public final List<MyketRecyclerData> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return "FeedbackList(items=" + this.items + ")";
    }
}
