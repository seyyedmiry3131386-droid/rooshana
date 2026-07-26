package defpackage;

import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myAccount.inbox.recycler.InboxHeaderData;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ml3 extends qg5 {
    public final og5 w;
    public kl3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml3(View view, vl3 vl3Var) {
        super(view);
        js3.p(vl3Var, "onSectionClickListener");
        this.w = vl3Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        InboxHeaderData inboxHeaderData = (InboxHeaderData) myketRecyclerData;
        js3.p(inboxHeaderData, "data");
        kl3 kl3Var = this.x;
        if (kl3Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = kl3Var.w;
        View view = this.a;
        myketTextView.setText(view.getResources().getString(rs6.inbox_all_messages, inboxHeaderData.a));
        kl3 kl3Var2 = this.x;
        if (kl3Var2 == null) {
            js3.V("binding");
            throw null;
        }
        SmallFillOvalButton smallFillOvalButton = kl3Var2.v;
        js3.o(smallFillOvalButton, "sectionAction");
        smallFillOvalButton.setVisibility(0);
        kl3 kl3Var3 = this.x;
        if (kl3Var3 == null) {
            js3.V("binding");
            throw null;
        }
        kl3Var3.v.setText(view.getResources().getString(rs6.inbox_remove_all_messages));
        kl3 kl3Var4 = this.x;
        if (kl3Var4 == null) {
            js3.V("binding");
            throw null;
        }
        SmallFillOvalButton smallFillOvalButton2 = kl3Var4.v;
        js3.o(smallFillOvalButton2, "sectionAction");
        qg5.v(smallFillOvalButton2, this.w, this, inboxHeaderData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof kl3) {
            this.x = (kl3) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
