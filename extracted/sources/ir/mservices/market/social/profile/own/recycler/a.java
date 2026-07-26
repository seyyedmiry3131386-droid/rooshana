package ir.mservices.market.social.profile.own.recycler;

import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.m63;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.vx5;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.data.ProfileMessagingDto;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public final og5 x;
    public m63 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, vx5 vx5Var, vx5 vx5Var2) {
        super(view);
        js3.p(vx5Var, "messageClickListener");
        js3.p(vx5Var2, "editProfileClickListener");
        this.w = vx5Var;
        this.x = vx5Var2;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        OwnProfileActionData ownProfileActionData = (OwnProfileActionData) myketRecyclerData;
        js3.p(ownProfileActionData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new OwnProfileActionViewHolder$onAttach$1(ownProfileActionData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        OwnProfileActionData ownProfileActionData = (OwnProfileActionData) myketRecyclerData;
        js3.p(ownProfileActionData, "data");
        ProfileMessagingDto profileMessagingDto = ownProfileActionData.a;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        view.setPaddingRelative(dimensionPixelSize, view.getPaddingTop(), dimensionPixelSize, view.getPaddingBottom());
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_24);
        m63 m63Var = this.y;
        if (m63Var == null) {
            js3.V("binding");
            throw null;
        }
        m63Var.v.setPadding(dimensionPixelSize2);
        m63 m63Var2 = this.y;
        if (m63Var2 == null) {
            js3.V("binding");
            throw null;
        }
        m63Var2.w.setPadding(dimensionPixelSize2);
        m63 m63Var3 = this.y;
        if (m63Var3 == null) {
            js3.V("binding");
            throw null;
        }
        m63Var3.w.setText(profileMessagingDto.getTitle());
        m63 m63Var4 = this.y;
        if (m63Var4 == null) {
            js3.V("binding");
            throw null;
        }
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = m63Var4.w;
        Boolean boolIsEnabled = profileMessagingDto.isEnabled();
        smallEmptyMediumTextOvalButton.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        m63 m63Var5 = this.y;
        if (m63Var5 == null) {
            js3.V("binding");
            throw null;
        }
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton2 = m63Var5.v;
        js3.o(smallEmptyMediumTextOvalButton2, "editProfile");
        qg5.v(smallEmptyMediumTextOvalButton2, this.x, this, ownProfileActionData);
        m63 m63Var6 = this.y;
        if (m63Var6 == null) {
            js3.V("binding");
            throw null;
        }
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton3 = m63Var6.w;
        js3.o(smallEmptyMediumTextOvalButton3, "message");
        qg5.v(smallEmptyMediumTextOvalButton3, this.w, this, ownProfileActionData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof m63) {
            this.y = (m63) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }
}
