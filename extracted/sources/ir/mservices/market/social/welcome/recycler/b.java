package ir.mservices.market.social.welcome.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import defpackage.a79;
import defpackage.bt2;
import defpackage.c5;
import defpackage.cc7;
import defpackage.js3;
import defpackage.ka3;
import defpackage.lw;
import defpackage.og5;
import defpackage.qg5;
import defpackage.rd9;
import defpackage.sj8;
import defpackage.w91;
import defpackage.yq2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public final og5 w;
    public final c5 x;
    public ka3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, rd9 rd9Var) {
        super(view);
        js3.p(rd9Var, "imageClickListener");
        this.w = rd9Var;
        this.x = (c5) ((w91) qg5.r()).L.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        WelcomeImageData welcomeImageData = (WelcomeImageData) myketRecyclerData;
        js3.p(welcomeImageData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new WelcomeImageViewHolder$onAttach$1(welcomeImageData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new WelcomeImageViewHolder$onAttach$2(welcomeImageData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new WelcomeImageViewHolder$onAttach$3(welcomeImageData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        WelcomeImageData welcomeImageData = (WelcomeImageData) myketRecyclerData;
        js3.p(welcomeImageData, "data");
        if (yq2.n0(this.a.getContext())) {
            x().x.setGravity(17);
        }
        ImageView imageView = x().y;
        js3.o(imageView, "userIcon");
        qg5.v(imageView, this.w, this, welcomeImageData);
        x().x.setTextColor(sj8.b().m);
        x().w.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof ka3) {
            this.y = (ka3) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final ka3 x() {
        ka3 ka3Var = this.y;
        if (ka3Var != null) {
            return ka3Var;
        }
        js3.V("binding");
        throw null;
    }
}
