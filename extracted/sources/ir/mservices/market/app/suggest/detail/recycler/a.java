package ir.mservices.market.app.suggest.detail.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.h73;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.qg5;
import defpackage.sj8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public h73 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, ir.mservices.market.app.suggest.detail.ui.a aVar) {
        super(view);
        js3.p(aVar, "onSuggestClickListener");
        this.w = aVar;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        PlayAppSuggestData playAppSuggestData = (PlayAppSuggestData) myketRecyclerData;
        js3.p(playAppSuggestData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new PlayAppSuggestViewHolder$onAttach$1(playAppSuggestData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new PlayAppSuggestViewHolder$onAttach$2(playAppSuggestData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        PlayAppSuggestData playAppSuggestData = (PlayAppSuggestData) myketRecyclerData;
        js3.p(playAppSuggestData, "data");
        String str = playAppSuggestData.b;
        SmallFillOvalButton smallFillOvalButton = x().x;
        js3.o(smallFillOvalButton, "suggestButton");
        qg5.v(smallFillOvalButton, this.w, this, playAppSuggestData);
        if (playAppSuggestData.a) {
            x().v.setBackgroundColor(sj8.b().q);
            x().w.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
            x().y.setTextColor(sj8.b().n);
            x().y.setText(str);
            return;
        }
        x().v.setBackgroundColor(sj8.b().B);
        x().x.setVisibility(8);
        x().y.setText(str);
        x().y.setTextColor(sj8.b().C);
        x().w.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().C, PorterDuff.Mode.MULTIPLY));
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof h73) {
            this.x = (h73) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final h73 x() {
        h73 h73Var = this.x;
        if (h73Var != null) {
            return h73Var;
        }
        js3.V("binding");
        throw null;
    }
}
