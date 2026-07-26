package ir.mservices.market.social.welcome.recycler;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.ea7;
import defpackage.ia3;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.rd9;
import defpackage.sj8;
import defpackage.yq2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myAccount.dialog.Gender;
import ir.mservices.market.theme.ThemeData;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public ia3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, rd9 rd9Var) {
        super(view);
        js3.p(rd9Var, "onGenderChangedListener");
        this.w = rd9Var;
        qg5.r();
    }

    public static final void x(a aVar, CardView cardView, boolean z) {
        View view = aVar.a;
        ThemeData themeDataB = sj8.b();
        cardView.setCardElevation(z ? view.getResources().getDimensionPixelSize(pq6.space_4) : 0.0f);
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = themeDataB.l;
        ea7Var.c(view.getResources().getDimensionPixelSize(pq6.space_16));
        ea7Var.i = z ? themeDataB.c : themeDataB.v;
        cardView.setBackground(ea7Var.a());
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        WelcomeGenderData welcomeGenderData = (WelcomeGenderData) myketRecyclerData;
        js3.p(welcomeGenderData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new WelcomeGenderViewHolder$onAttach$1(welcomeGenderData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        js3.p((WelcomeGenderData) myketRecyclerData, "data");
        if (yq2.n0(this.a.getContext())) {
            y().B.setGravity(17);
        }
        ImageView imageView = y().z;
        int i = sj8.b().n;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(i, mode));
        y().w.setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
        CardView cardView = y().y;
        js3.o(cardView, "male");
        Gender gender = Gender.e;
        og5 og5Var = this.w;
        qg5.v(cardView, og5Var, this, gender);
        CardView cardView2 = y().v;
        js3.o(cardView2, "female");
        qg5.v(cardView2, og5Var, this, Gender.f);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ia3) {
            this.x = (ia3) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final ia3 y() {
        ia3 ia3Var = this.x;
        if (ia3Var != null) {
            return ia3Var;
        }
        js3.V("binding");
        throw null;
    }
}
