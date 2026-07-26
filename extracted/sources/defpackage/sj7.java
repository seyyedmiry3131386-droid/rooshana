package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.search.history.ui.recycler.SearchTermData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class sj7 extends qg5 {
    public xf5 w;
    public hi7 x;
    public n83 y;

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        SearchTermData searchTermData = (SearchTermData) myketRecyclerData;
        js3.p(searchTermData, "data");
        String str = searchTermData.d;
        String str2 = searchTermData.b;
        int i = searchTermData.c;
        View view = this.a;
        js3.o(view, "itemView");
        qg5.v(view, this.x, this, searchTermData);
        n83 n83Var = this.y;
        if (n83Var == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = n83Var.v;
        js3.o(imageView, "icon");
        imageView.setVisibility(i > 0 ? 0 : 8);
        if (i > 0) {
            n83 n83Var2 = this.y;
            if (n83Var2 == null) {
                js3.V("binding");
                throw null;
            }
            ImageView imageView2 = n83Var2.v;
            imageView2.setImageResource(i);
            imageView2.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        if (f88.n0(str2) || str == null || f88.n0(str)) {
            return;
        }
        n83 n83Var3 = this.y;
        if (n83Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = n83Var3.w;
        if (this.w != null) {
            myketTextView.setText(xf5.g(str2, str));
        } else {
            js3.V("myketUIUtils");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof n83) {
            this.y = (n83) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
