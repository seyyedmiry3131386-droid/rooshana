package ir.mservices.market.social.profile.list.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.gl6;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.z13;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends qg5 {
    public final og5 w;
    public z13 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, gl6 gl6Var) {
        super(view);
        js3.p(gl6Var, "onAddClickListener");
        this.w = gl6Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ProfileListEmptyData profileListEmptyData = (ProfileListEmptyData) myketRecyclerData;
        js3.p(profileListEmptyData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ProfileListEmptyViewHolder$onAttach$1(profileListEmptyData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ProfileListEmptyData profileListEmptyData = (ProfileListEmptyData) myketRecyclerData;
        js3.p(profileListEmptyData, "data");
        boolean z = profileListEmptyData.c;
        x().w.setColorFilter(new PorterDuffColorFilter(sj8.b().H, PorterDuff.Mode.MULTIPLY));
        SmallFillOvalButton smallFillOvalButton = x().v;
        smallFillOvalButton.setMinimumWidth(smallFillOvalButton.getResources().getDimensionPixelSize(pq6.custom_list_empty_button_width));
        smallFillOvalButton.setText(smallFillOvalButton.getContext().getString(rs6.profile_list_add_list));
        smallFillOvalButton.b(sj8.b().c);
        smallFillOvalButton.setBgColor(sj8.b().e);
        smallFillOvalButton.setButtonTextColor(sj8.b().i);
        boolean z2 = profileListEmptyData.b;
        smallFillOvalButton.setVisibility(z2 ? 0 : 8);
        x().x.setText((z2 && z) ? rs6.profile_list_app_empty_title : (!z2 || z) ? (z2 || !z) ? rs6.profile_list_movie_user_empty_title : rs6.profile_list_app_user_empty_title : rs6.profile_list_movie_empty_title);
        SmallFillOvalButton smallFillOvalButton2 = x().v;
        js3.o(smallFillOvalButton2, "addList");
        qg5.v(smallFillOvalButton2, this.w, this, profileListEmptyData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof z13) {
            this.x = (z13) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final z13 x() {
        z13 z13Var = this.x;
        if (z13Var != null) {
            return z13Var;
        }
        js3.V("binding");
        throw null;
    }
}
