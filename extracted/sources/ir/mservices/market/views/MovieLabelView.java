package ir.mservices.market.views;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import defpackage.d04;
import defpackage.ea7;
import defpackage.js3;
import defpackage.pq6;
import defpackage.sj8;
import ir.mservices.market.movie.data.webapi.MovieLabelDto;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieLabelView extends Hilt_MovieLabelView {
    public d04 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        setPadding(context.getResources().getDimensionPixelSize(pq6.space_8), context.getResources().getDimensionPixelSize(pq6.space_2), context.getResources().getDimensionPixelSize(pq6.space_8), context.getResources().getDimensionPixelSize(pq6.space_2));
        setBold(true);
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.n;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final void setData(MovieLabelDto movieLabelDto) {
        int i;
        if (movieLabelDto != null) {
            setText(movieLabelDto.getText());
            setTextColor(Color.parseColor(movieLabelDto.getTextColor()));
            Context context = getContext();
            js3.o(context, "getContext(...)");
            ea7 ea7Var = new ea7(context);
            ea7Var.c(getContext().getResources().getDimensionPixelSize(pq6.movie_label_radius_size));
            ea7Var.b = Color.parseColor(movieLabelDto.getBgColor());
            ea7Var.p = sj8.b().N;
            i = 0;
            ea7Var.e = getLanguageHelper().f() ? getResources().getDimensionPixelSize(pq6.space_4) : 0;
            ea7Var.b();
            ea7Var.d = getLanguageHelper().f() ? 0 : getResources().getDimensionPixelSize(pq6.space_4);
            ea7Var.b();
            ea7Var.g = getLanguageHelper().f() ? 0 : getResources().getDimensionPixelSize(pq6.space_4);
            ea7Var.b();
            ea7Var.f = getLanguageHelper().f() ? getResources().getDimensionPixelSize(pq6.space_4) : 0;
            ea7Var.b();
            ea7Var.h = 0;
            setBackground(ea7Var.a());
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.n = d04Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MovieLabelView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
