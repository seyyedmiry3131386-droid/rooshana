package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.pika.send.recycler.InstalledAppData;

/* JADX INFO: loaded from: classes3.dex */
public final class tp3 extends qg5 {
    public final og5 w;
    public g33 x;
    public final d04 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp3(View view, up3 up3Var) {
        super(view);
        js3.p(up3Var, "onInstalledAppClickListener");
        this.w = up3Var;
        this.y = (d04) ((w91) qg5.r()).p.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        InstalledAppData installedAppData = (InstalledAppData) myketRecyclerData;
        js3.p(installedAppData, "data");
        g33 g33Var = this.x;
        if (g33Var == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = g33Var.y;
        d04 d04Var = this.y;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        imageView.setRotation(d04Var.f() ? 0.0f : 180.0f);
        g33 g33Var2 = this.x;
        if (g33Var2 == null) {
            js3.V("binding");
            throw null;
        }
        g33Var2.v.setImageDrawable(installedAppData.c);
        g33 g33Var3 = this.x;
        if (g33Var3 == null) {
            js3.V("binding");
            throw null;
        }
        g33Var3.w.setText(installedAppData.b);
        g33 g33Var4 = this.x;
        if (g33Var4 == null) {
            js3.V("binding");
            throw null;
        }
        g33Var4.x.setText(installedAppData.d);
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.w, this, installedAppData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof g33) {
            this.x = (g33) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
