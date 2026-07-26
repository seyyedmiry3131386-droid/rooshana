package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.detail.ui.recycler.AppDownloadData;
import ir.mservices.market.app.detail.update.ui.recycler.InAppUpdateAppBarData;
import ir.mservices.market.feedback.recycler.FeedbackAttachContentData;
import ir.mservices.market.feedback.recycler.FeedbackBodyData;
import ir.mservices.market.feedback.recycler.FeedbackChooseTopicData;
import ir.mservices.market.feedback.recycler.FeedbackChooseTransactionData;
import ir.mservices.market.feedback.recycler.FeedbackChosenTransactionData;
import ir.mservices.market.feedback.recycler.FeedbackPhoneNumberData;
import ir.mservices.market.feedback.recycler.b;
import ir.mservices.market.feedback.recycler.c;
import ir.mservices.market.feedback.recycler.d;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class m92 extends a {
    public final /* synthetic */ int l;
    public og5 m;
    public og5 n;
    public og5 o;
    public og5 p;
    public og5 q;
    public og5 r;
    public og5 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m92(int i, int i2) {
        super(i);
        this.l = i2;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        switch (this.l) {
            case 0:
                if (i == FeedbackPhoneNumberData.b) {
                    return new b(1, view);
                }
                if (i == FeedbackChooseTopicData.b) {
                    p92 p92Var = (p92) this.m;
                    if (p92Var != null) {
                        return new c(view, p92Var);
                    }
                    js3.V("onChooseTopicItemClickListener");
                    throw null;
                }
                if (i == FeedbackChooseTransactionData.a) {
                    p92 p92Var2 = (p92) this.n;
                    if (p92Var2 != null) {
                        return new l92(view, p92Var2);
                    }
                    js3.V("onChooseTransactionItemClickListener");
                    throw null;
                }
                if (i == FeedbackBodyData.b) {
                    return new b(0, view);
                }
                if (i != FeedbackAttachContentData.c) {
                    if (i != FeedbackChosenTransactionData.c) {
                        return null;
                    }
                    p92 p92Var3 = (p92) this.s;
                    if (p92Var3 == null) {
                        js3.V("onCloseChosenTransactionClickListener");
                        throw null;
                    }
                    p92 p92Var4 = (p92) this.r;
                    if (p92Var4 != null) {
                        return new d(view, p92Var3, p92Var4);
                    }
                    js3.V("onEditChosenTransactionClickListener");
                    throw null;
                }
                p92 p92Var5 = (p92) this.o;
                if (p92Var5 == null) {
                    js3.V("onAttachButtonClickListener");
                    throw null;
                }
                p92 p92Var6 = (p92) this.p;
                if (p92Var6 == null) {
                    js3.V("onRemoveButtonClickListener");
                    throw null;
                }
                p92 p92Var7 = (p92) this.q;
                if (p92Var7 != null) {
                    return new ir.mservices.market.feedback.recycler.a(view, p92Var5, p92Var6, p92Var7);
                }
                js3.V("onEditButtonClickListener");
                throw null;
            default:
                if (i == InAppUpdateAppBarData.b) {
                    l5 l5Var = new l5(7, view);
                    qg5.r();
                    return l5Var;
                }
                if (i != AppDownloadData.q) {
                    return null;
                }
                vj3 vj3Var = (vj3) this.o;
                if (vj3Var == null) {
                    js3.V("onDownloadClickListener");
                    throw null;
                }
                ik3 ik3Var = (ik3) this.p;
                if (ik3Var == null) {
                    js3.V("onPauseClickListener");
                    throw null;
                }
                ik3 ik3Var2 = (ik3) this.q;
                if (ik3Var2 == null) {
                    js3.V("onInstallClickListener");
                    throw null;
                }
                ir.mservices.market.app.detail.update.a aVar = (ir.mservices.market.app.detail.update.a) this.r;
                if (aVar == null) {
                    js3.V("onUpdateClickListener");
                    throw null;
                }
                vj3 vj3Var2 = (vj3) this.m;
                if (vj3Var2 == null) {
                    js3.V("onRunClickListener");
                    throw null;
                }
                vj3 vj3Var3 = (vj3) this.n;
                if (vj3Var3 == null) {
                    js3.V("onIncompatibleClickListener");
                    throw null;
                }
                vj3 vj3Var4 = (vj3) this.s;
                if (vj3Var4 != null) {
                    return new ir.mservices.market.app.detail.ui.recycler.b(view, vj3Var, ik3Var, ik3Var2, aVar, vj3Var2, vj3Var3, vj3Var4);
                }
                js3.V("onButtonStateListener");
                throw null;
        }
    }
}
