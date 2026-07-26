package defpackage;

import android.view.View;
import ir.mservices.market.app.detail.more.ui.recycler.MoreClickableData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class sx4 extends qg5 {
    public final og5 w;
    public f43 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx4(View view, qs3 qs3Var) {
        super(view);
        js3.p(qs3Var, "onClickListener");
        this.w = qs3Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MoreClickableData moreClickableData = (MoreClickableData) myketRecyclerData;
        js3.p(moreClickableData, "data");
        String str = moreClickableData.d;
        x().w.setText(moreClickableData.b);
        MyketTextView myketTextView = x().v;
        js3.o(myketTextView, "subtitle");
        myketTextView.setVisibility(!moreClickableData.a.equals("IN_APP") ? 0 : 8);
        if (str == null || f88.n0(str)) {
            x().v.setText(moreClickableData.c);
        } else {
            x().v.setText(str);
        }
        MyketTextView myketTextView2 = x().v;
        js3.o(myketTextView2, "subtitle");
        qg5.v(myketTextView2, this.w, this, moreClickableData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof f43) {
            this.x = (f43) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }

    public final f43 x() {
        f43 f43Var = this.x;
        if (f43Var != null) {
            return f43Var;
        }
        js3.V("binding");
        throw null;
    }
}
