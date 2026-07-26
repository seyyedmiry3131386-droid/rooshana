package ir.mservices.market.feedback.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackChosenTransactionData implements MyketRecyclerData, g32 {
    public static final int c = js6.feedback_dialog_transition;
    public final v48 a;
    public final boolean b;

    public FeedbackChosenTransactionData(v48 v48Var, boolean z) {
        js3.p(v48Var, "transactionData");
        this.a = v48Var;
        this.b = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !FeedbackChosenTransactionData.class.equals(obj.getClass())) {
            return false;
        }
        FeedbackChosenTransactionData feedbackChosenTransactionData = (FeedbackChosenTransactionData) obj;
        return js3.i(this.a.getValue(), feedbackChosenTransactionData.a.getValue()) && this.b == feedbackChosenTransactionData.b;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        Object value = this.a.getValue();
        return ((value != null ? value.hashCode() : 0) * 31) + (this.b ? 1231 : 1237);
    }
}
