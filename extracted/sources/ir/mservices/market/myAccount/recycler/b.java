package ir.mservices.market.myAccount.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a79;
import defpackage.bt2;
import defpackage.c5;
import defpackage.cc7;
import defpackage.dv2;
import defpackage.hc5;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.sc5;
import defpackage.sj8;
import defpackage.w91;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.LoadingView;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public hc5 A;
    public final og5 w;
    public final og5 x;
    public final c5 y;
    public final dv2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, sc5 sc5Var, sc5 sc5Var2) {
        super(view);
        js3.p(sc5Var, "onCameraClickListener");
        js3.p(sc5Var2, "onAvatarClickListener");
        this.w = sc5Var;
        this.x = sc5Var2;
        w91 w91Var = (w91) qg5.r();
        this.y = (c5) w91Var.L.get();
        this.z = (dv2) w91Var.q.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MyAccountHeaderData myAccountHeaderData = (MyAccountHeaderData) myketRecyclerData;
        js3.p(myAccountHeaderData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MyAccountHeaderViewHolder$onAttach$1(myAccountHeaderData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MyAccountHeaderData myAccountHeaderData = (MyAccountHeaderData) myketRecyclerData;
        js3.p(myAccountHeaderData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_3xl);
        x().A.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        y(myAccountHeaderData);
        ViewGroup.LayoutParams layoutParams = x().w.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.i = 0;
        layoutParams2.t = 0;
        dv2 dv2Var = this.z;
        if (dv2Var == null) {
            js3.V("graphicUtils");
            throw null;
        }
        if (dv2Var.c() != 2) {
            layoutParams2.v = 0;
        }
        LoadingView loadingView = x().x;
        js3.o(loadingView, "avatarProgressLoading");
        loadingView.setVisibility(8);
        Drawable background = x().z.getBackground();
        int i = sj8.b().d;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(new PorterDuffColorFilter(i, mode));
        x().y.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().c, mode));
        x().y.setColorFilter(new PorterDuffColorFilter(sj8.b().d, mode));
        ImageView imageView = x().y;
        js3.o(imageView, "cameraIcon");
        qg5.v(imageView, this.w, this, myAccountHeaderData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof hc5) {
            this.A = (hc5) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final hc5 x() {
        hc5 hc5Var = this.A;
        if (hc5Var != null) {
            return hc5Var;
        }
        js3.V("binding");
        throw null;
    }

    public final void y(MyAccountHeaderData myAccountHeaderData) {
        c5 c5Var = this.y;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        boolean z = false;
        c5Var.g(x().v, false);
        ImageView imageView = x().v;
        c5 c5Var2 = this.y;
        if (c5Var2 == null) {
            js3.V("accountManager");
            throw null;
        }
        if (c5Var2.e()) {
            ImageView imageView2 = x().v;
            js3.o(imageView2, "avatar");
            qg5.v(imageView2, this.x, this, myAccountHeaderData);
            z = true;
        }
        imageView.setEnabled(z);
    }
}
