package ir.mservices.market.social.list.common.app.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.m93;
import defpackage.og5;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.sm7;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public final og5 x;
    public m93 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, og5 og5Var, sm7 sm7Var) {
        super(view);
        js3.p(og5Var, "onSelectClickListener");
        this.w = og5Var;
        this.x = sm7Var;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ProfileAppData profileAppData = (ProfileAppData) myketRecyclerData;
        js3.p(profileAppData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ProfileAppViewHolder$onAttach$1(profileAppData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ProfileAppData profileAppData = (ProfileAppData) myketRecyclerData;
        js3.p(profileAppData, "data");
        AppIconView appIconView = x().w;
        js3.o(appIconView, "icon");
        ApplicationDTO applicationDTO = profileAppData.b;
        AppIconView.setImageUrl$default(appIconView, applicationDTO.getIconPath(), null, false, 6, null);
        x().y.setText(applicationDTO.getTitle());
        x().x.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        MyketTextView myketTextView = x().v;
        String tagline = applicationDTO.getTagline();
        myketTextView.setText((tagline == null || f88.n0(tagline)) ? applicationDTO.getCategoryName() : applicationDTO.getTagline());
        ImageView imageView = x().z;
        js3.o(imageView, "trailing");
        qg5.v(imageView, this.w, this, profileAppData);
        ImageView imageView2 = x().x;
        js3.o(imageView2, "leading");
        qg5.v(imageView2, this.x, this, profileAppData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof m93) {
            this.y = (m93) a79Var;
        } else {
            lw.g(null, "incompatible data binding", null);
        }
    }

    public final m93 x() {
        m93 m93Var = this.y;
        if (m93Var != null) {
            return m93Var;
        }
        js3.V("binding");
        throw null;
    }
}
