package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import ir.mservices.market.app.detail.ui.recycler.ReviewsMoreTitleRowData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class f97 extends qg5 {
    public final og5 w;
    public c97 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f97(View view, ap apVar) {
        super(view);
        js3.p(apVar, "onMoreClickListener");
        this.w = apVar;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        ReviewsMoreTitleRowData reviewsMoreTitleRowData = (ReviewsMoreTitleRowData) myketRecyclerData;
        js3.p(reviewsMoreTitleRowData, "data");
        View view = this.a;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_arrow_end;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        c97 c97Var = this.x;
        if (c97Var == null) {
            js3.V("binding");
            throw null;
        }
        c97Var.w.setSmallIcon(drawable);
        c97 c97Var2 = this.x;
        if (c97Var2 == null) {
            js3.V("binding");
            throw null;
        }
        c97Var2.x.setText(view.getResources().getString(reviewsMoreTitleRowData.a));
        c97 c97Var3 = this.x;
        if (c97Var3 == null) {
            js3.V("binding");
            throw null;
        }
        c97Var3.x.setTextColor(sj8.b().m);
        c97 c97Var4 = this.x;
        if (c97Var4 == null) {
            js3.V("binding");
            throw null;
        }
        c97Var4.w.setVisibility(0);
        view.setEnabled(true);
        qg5.v(view, this.w, this, reviewsMoreTitleRowData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof c97) {
            this.x = (c97) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
