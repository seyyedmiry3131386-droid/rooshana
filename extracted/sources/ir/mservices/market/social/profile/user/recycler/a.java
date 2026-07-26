package ir.mservices.market.social.profile.user.recycler;

import android.view.View;
import defpackage.a79;
import defpackage.aa3;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.ck4;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q19;
import defpackage.qg5;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.common.RelationView;
import ir.mservices.market.social.profile.data.ProfileMessagingDto;
import ir.mservices.market.social.profile.data.Relation;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public final og5 x;
    public aa3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, q19 q19Var, q19 q19Var2) {
        super(view);
        js3.p(q19Var, "messageClickListener");
        js3.p(q19Var2, "onRelationClickListener");
        this.w = q19Var;
        this.x = q19Var2;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        UserProfileActionData userProfileActionData = (UserProfileActionData) myketRecyclerData;
        js3.p(userProfileActionData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new UserProfileActionViewHolder$onAttach$1(userProfileActionData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new UserProfileActionViewHolder$onAttach$2(userProfileActionData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        UserProfileActionData userProfileActionData = (UserProfileActionData) myketRecyclerData;
        js3.p(userProfileActionData, "data");
        ProfileMessagingDto profileMessagingDto = userProfileActionData.a;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        view.setPaddingRelative(dimensionPixelSize, view.getPaddingTop(), dimensionPixelSize, view.getPaddingBottom());
        aa3 aa3Var = this.y;
        if (aa3Var == null) {
            js3.V("binding");
            throw null;
        }
        RelationView relationView = aa3Var.w;
        relationView.setAccountKey(userProfileActionData.c);
        relationView.setRelation(Relation.Companion.getByValue(userProfileActionData.b.getForward()));
        relationView.setOnRelationClickListener(new ck4(22, this));
        relationView.a();
        aa3 aa3Var2 = this.y;
        if (aa3Var2 == null) {
            js3.V("binding");
            throw null;
        }
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = aa3Var2.v;
        smallEmptyMediumTextOvalButton.setPadding(view.getResources().getDimensionPixelSize(pq6.space_24));
        smallEmptyMediumTextOvalButton.setText(profileMessagingDto.getTitle());
        Boolean boolIsEnabled = profileMessagingDto.isEnabled();
        smallEmptyMediumTextOvalButton.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        aa3 aa3Var3 = this.y;
        if (aa3Var3 == null) {
            js3.V("binding");
            throw null;
        }
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton2 = aa3Var3.v;
        js3.o(smallEmptyMediumTextOvalButton2, "message");
        qg5.v(smallEmptyMediumTextOvalButton2, this.w, this, userProfileActionData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof aa3) {
            this.y = (aa3) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }
}
