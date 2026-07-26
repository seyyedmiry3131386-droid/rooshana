package ir.mservices.market.feedback.recycler;

import defpackage.fu7;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackAttachContentData implements MyketRecyclerData, g32 {
    public static final int c = js6.feedback_attach_content_item;
    public final fu7 a;
    public final v48 b;

    public FeedbackAttachContentData(fu7 fu7Var, v48 v48Var) {
        js3.p(fu7Var, "removedScreenshotFlow");
        js3.p(v48Var, "feedbackUploadScreenshotFlow");
        this.a = fu7Var;
        this.b = v48Var;
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
        if (obj == null || !FeedbackAttachContentData.class.equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.b.getValue(), ((FeedbackAttachContentData) obj).b.getValue());
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        Object value = this.b.getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }
}
