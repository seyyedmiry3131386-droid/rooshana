package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.d04;
import defpackage.ea7;
import defpackage.js3;
import defpackage.pq6;
import defpackage.rs6;
import defpackage.sj8;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieNewTagView extends Hilt_MovieNewTagView {
    public d04 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieNewTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        js3.p(attributeSet, "attributeSet");
        setElevation(context.getResources().getDimensionPixelSize(pq6.movie_shadow_size) + 1);
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().j;
        ea7Var.d = getLanguageHelper().f() ? getResources().getDimensionPixelSize(pq6.space_4) : 0;
        ea7Var.b();
        ea7Var.e = getLanguageHelper().f() ? 0 : getResources().getDimensionPixelSize(pq6.space_4);
        ea7Var.b();
        ea7Var.f = getLanguageHelper().f() ? 0 : getResources().getDimensionPixelSize(pq6.space_4);
        ea7Var.b();
        ea7Var.g = getLanguageHelper().f() ? getResources().getDimensionPixelSize(pq6.space_4) : 0;
        ea7Var.b();
        ea7Var.h = 0;
        setBackground(ea7Var.a());
        setText(context.getResources().getString(rs6.new_badge));
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.n;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.n = d04Var;
    }
}
