package ir.mservices.market.feedback.recycler;

import defpackage.g32;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackChooseTransactionData implements MyketRecyclerData, g32 {
    public static final int a = js6.feedback_transaction_view_item;

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return a;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && FeedbackChooseTransactionData.class.equals(obj.getClass());
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(FeedbackChooseTransactionData.class.hashCode());
    }

    public final int hashCode() {
        return FeedbackChooseTransactionData.class.hashCode();
    }
}
