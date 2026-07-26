package ir.mservices.market.social.list.items.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.sm7;
import defpackage.v13;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public v13 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, sm7 sm7Var) {
        super(view);
        js3.p(sm7Var, "onClickListener");
        this.w = sm7Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ProfileListAddTitleData profileListAddTitleData = (ProfileListAddTitleData) myketRecyclerData;
        js3.p(profileListAddTitleData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ProfileListAddTitleViewHolder$onAttach$1(profileListAddTitleData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ProfileListAddTitleData profileListAddTitleData = (ProfileListAddTitleData) myketRecyclerData;
        js3.p(profileListAddTitleData, "data");
        v13 v13Var = this.x;
        if (v13Var == null) {
            js3.V("binding");
            throw null;
        }
        v13Var.v.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, profileListAddTitleData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof v13) {
            this.x = (v13) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
