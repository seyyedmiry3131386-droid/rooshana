package ir.mservices.market.app.detail.more.ui.recycler;

import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.g43;
import defpackage.js3;
import defpackage.lw;
import defpackage.qg5;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public g43 w;

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MoreSizeData moreSizeData = (MoreSizeData) myketRecyclerData;
        js3.p(moreSizeData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MoreSizeViewHolder$onAttach$1(null, moreSizeData, this), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        int paintFlags;
        MoreSizeData moreSizeData = (MoreSizeData) myketRecyclerData;
        js3.p(moreSizeData, "data");
        String str = moreSizeData.a;
        lw.c(str, null);
        MyketTextView myketTextView = x().v;
        myketTextView.setText(str);
        l lVar = (l) moreSizeData.c;
        if (((Boolean) lVar.getValue()).booleanValue()) {
            x().w.setText(moreSizeData.b);
            paintFlags = myketTextView.getPaintFlags() | 16;
        } else {
            paintFlags = myketTextView.getPaintFlags() & (-17);
        }
        myketTextView.setPaintFlags(paintFlags);
        MyketTextView myketTextView2 = x().w;
        js3.o(myketTextView2, "diffSize");
        myketTextView2.setVisibility(((Boolean) lVar.getValue()).booleanValue() ? 0 : 8);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof g43) {
            this.w = (g43) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }

    public final g43 x() {
        g43 g43Var = this.w;
        if (g43Var != null) {
            return g43Var;
        }
        js3.V("binding");
        throw null;
    }
}
