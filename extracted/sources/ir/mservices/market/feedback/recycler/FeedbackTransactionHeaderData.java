package ir.mservices.market.feedback.recycler;

import defpackage.g32;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackTransactionHeaderData implements MyketRecyclerData, Serializable, g32 {
    public static final int a = js6.feedback_transaction_header;

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return a;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FeedbackTransactionHeaderData);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "header";
    }

    public final int hashCode() {
        return FeedbackTransactionHeaderData.class.hashCode();
    }
}
