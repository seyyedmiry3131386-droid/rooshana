package ir.mservices.market.feedback.recycler;

import defpackage.ca2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.xb5;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackBodyData implements MyketRecyclerData, g32 {
    public static final int b = js6.feedback_body_edit_text_item;
    public final xb5 a;

    public FeedbackBodyData(xb5 xb5Var) {
        js3.p(xb5Var, "bodyContentFlow");
        this.a = xb5Var;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeedbackBodyData) {
            return js3.i(((l) this.a).getValue(), ((l) ((FeedbackBodyData) obj).a).getValue());
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return ((ca2) ((l) this.a).getValue()).hashCode();
    }
}
