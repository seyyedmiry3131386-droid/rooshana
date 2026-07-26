package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewTitleData;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class u55 extends qg5 {
    public final og5 w;
    public s55 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u55(View view, q15 q15Var) {
        super(view);
        js3.p(q15Var, "onShowAllClickListener");
        this.w = q15Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        MovieReviewTitleData movieReviewTitleData = (MovieReviewTitleData) myketRecyclerData;
        js3.p(movieReviewTitleData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner);
        s55 s55Var = this.x;
        if (s55Var == null) {
            js3.V("binding");
            throw null;
        }
        s55Var.v.setPadding(dimensionPixelSize, view.getResources().getDimensionPixelSize(pq6.space_m), dimensionPixelSize, view.getResources().getDimensionPixelSize(pq6.space_m));
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
        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().j, PorterDuff.Mode.MULTIPLY));
        s55 s55Var2 = this.x;
        if (s55Var2 == null) {
            js3.V("binding");
            throw null;
        }
        SmallBoldTextButton smallBoldTextButton = s55Var2.w;
        smallBoldTextButton.setPrimaryColor(sj8.b().j);
        smallBoldTextButton.setTextColor(sj8.b().j);
        smallBoldTextButton.setSmallIcon(drawable);
        s55 s55Var3 = this.x;
        if (s55Var3 == null) {
            js3.V("binding");
            throw null;
        }
        View view2 = s55Var3.l;
        js3.o(view2, "getRoot(...)");
        qg5.v(view2, this.w, this, movieReviewTitleData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof s55) {
            this.x = (s55) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
