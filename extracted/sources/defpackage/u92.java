package defpackage;

import ir.mservices.market.data.SpinnerItem;
import ir.mservices.market.feedback.data.FeedbackList;
import ir.mservices.market.feedback.recycler.FeedbackAttachContentData;
import ir.mservices.market.feedback.recycler.FeedbackBodyData;
import ir.mservices.market.feedback.recycler.FeedbackChooseTopicData;
import ir.mservices.market.feedback.recycler.FeedbackChooseTransactionData;
import ir.mservices.market.feedback.recycler.FeedbackChosenTransactionData;
import ir.mservices.market.feedback.recycler.FeedbackPhoneNumberData;
import ir.mservices.market.version2.ApplicationLauncher;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u92 extends c16 {
    public final xb5 c;
    public final v48 d;
    public final xb5 e;
    public final ub5 f;
    public final v48 g;
    public final v48 h;
    public final String i;
    public final v48 j;
    public final boolean k;
    public final c5 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u92(xb5 xb5Var, v48 v48Var, xb5 xb5Var2, ub5 ub5Var, v48 v48Var2, v48 v48Var3, String str, v48 v48Var4, boolean z) {
        super(1);
        js3.p(xb5Var, "phoneNumberFlow");
        js3.p(v48Var, "topicFlow");
        js3.p(xb5Var2, "bodyContent");
        js3.p(ub5Var, "removedScreenshotFlow");
        js3.p(v48Var2, "feedbackUploadScreenshotFlow");
        js3.p(v48Var3, "selectedTopic");
        js3.p(v48Var4, "transactionData");
        this.c = xb5Var;
        this.d = v48Var;
        this.e = xb5Var2;
        this.f = ub5Var;
        this.g = v48Var2;
        this.h = v48Var3;
        this.i = str;
        this.j = v48Var4;
        this.k = z;
        this.l = (c5) ((w91) ApplicationLauncher.o.b()).L.get();
    }

    @Override // defpackage.c16
    public final Object d() {
        String value;
        ArrayList arrayList = new ArrayList();
        SpinnerItem spinnerItem = (SpinnerItem) this.h.getValue();
        boolean z = false;
        if (spinnerItem != null && (value = spinnerItem.getValue()) != null && value.equalsIgnoreCase(this.i)) {
            z = true;
        }
        c5 c5Var = this.l;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        String str = (String) c5Var.h.f;
        if (str == null || f88.n0(str)) {
            arrayList.add(new FeedbackPhoneNumberData(this.c));
        }
        arrayList.add(new FeedbackChooseTopicData(this.d));
        v48 v48Var = this.j;
        if (v48Var.getValue() != null) {
            arrayList.add(new FeedbackChosenTransactionData(v48Var, this.k));
        } else if (z) {
            arrayList.add(new FeedbackChooseTransactionData());
        }
        arrayList.add(new FeedbackBodyData(this.e));
        arrayList.add(new FeedbackAttachContentData(this.f, this.g));
        return new FeedbackList(arrayList);
    }
}
