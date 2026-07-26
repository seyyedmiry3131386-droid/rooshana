package ir.mservices.market.feedback.recycler;

import defpackage.ca2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackChooseTopicData implements MyketRecyclerData, g32 {
    public static final int b = js6.feedback_choose_topoic_item;
    public final v48 a;

    public FeedbackChooseTopicData(v48 v48Var) {
        js3.p(v48Var, "topicFlow");
        this.a = v48Var;
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
        if (obj == null || !FeedbackChooseTopicData.class.equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.a.getValue(), ((FeedbackChooseTopicData) obj).a.getValue());
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return ((ca2) this.a.getValue()).hashCode();
    }
}
