package ir.mservices.market.app.update.recycler;

import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.lz8;
import defpackage.og5;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.v48;
import defpackage.w91;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallEmptyLargeTextOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public final og5 w;
    public final lw8 x;
    public final d04 y;
    public lz8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, ir.mservices.market.app.update.a aVar) {
        super(view);
        js3.p(aVar, "onActionClickListener");
        this.w = aVar;
        w91 w91Var = (w91) qg5.r();
        this.x = (lw8) w91Var.E.get();
        this.y = (d04) w91Var.p.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        UpdateHeaderData updateHeaderData = (UpdateHeaderData) myketRecyclerData;
        js3.p(updateHeaderData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new UpdateHeaderViewHolder$onAttach$1(updateHeaderData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new UpdateHeaderViewHolder$onAttach$2(updateHeaderData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        UpdateHeaderData updateHeaderData = (UpdateHeaderData) myketRecyclerData;
        js3.p(updateHeaderData, "data");
        v48 v48Var = updateHeaderData.a;
        View view = x().l;
        d04 d04Var = this.y;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        view.setLayoutDirection(d04Var.c());
        SmallEmptyLargeTextOvalButton smallEmptyLargeTextOvalButton = x().y;
        boolean zBooleanValue = ((Boolean) updateHeaderData.b.getValue()).booleanValue();
        View view2 = this.a;
        smallEmptyLargeTextOvalButton.setText(zBooleanValue ? view2.getResources().getString(rs6.stop_apps) : view2.getResources().getString(rs6.update_all_title));
        lw8 lw8Var = this.x;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        String string = ((Number) v48Var.getValue()).intValue() > 0 ? view2.getResources().getString(rs6.update_all_header_title, lw8.e(lw8Var, String.valueOf(((Number) v48Var.getValue()).intValue()))) : view2.getResources().getString(rs6.update_all_default_desc);
        js3.m(string);
        x().v.setText(string);
        x().x.setText(view2.getResources().getString(rs6.half_price_txt));
        MyketTextView myketTextView = x().x;
        js3.o(myketTextView, "subtitle");
        myketTextView.setVisibility(updateHeaderData.c ? 0 : 8);
        SmallEmptyLargeTextOvalButton smallEmptyLargeTextOvalButton2 = x().y;
        js3.o(smallEmptyLargeTextOvalButton2, "updateAll");
        qg5.v(smallEmptyLargeTextOvalButton2, this.w, this, updateHeaderData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof lz8) {
            this.z = (lz8) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final lz8 x() {
        lz8 lz8Var = this.z;
        if (lz8Var != null) {
            return lz8Var;
        }
        js3.V("binding");
        throw null;
    }
}
