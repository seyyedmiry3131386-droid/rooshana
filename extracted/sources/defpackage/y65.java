package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.ui.detail.recycler.MovieSeasonTitleData;
import ir.mservices.market.views.MyketTextView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y65 extends qg5 {
    public final View w;
    public final og5 x;
    public final lw8 y;
    public u53 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y65(View view, q15 q15Var) {
        super(view);
        js3.p(q15Var, "onClickListener");
        this.w = view;
        this.x = q15Var;
        this.y = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        MovieSeasonTitleData movieSeasonTitleData = (MovieSeasonTitleData) myketRecyclerData;
        js3.p(movieSeasonTitleData, "data");
        List list = movieSeasonTitleData.a;
        View view = this.a;
        Context context = view.getContext();
        Resources resources = view.getResources();
        u53 u53Var = this.z;
        if (u53Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = u53Var.v;
        Resources resources2 = view.getResources();
        boolean z = movieSeasonTitleData.b;
        myketTextView.setText(resources2.getString(!z ? rs6.select_season_label : rs6.select_audio_label));
        if (!z || list.size() > 1) {
            u53 u53Var2 = this.z;
            if (u53Var2 == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView2 = u53Var2.w;
            js3.m(context);
            ea7 ea7Var = new ea7(context);
            ea7Var.b = sj8.b().l;
            ea7Var.c(resources.getDimensionPixelSize(pq6.space_16));
            ea7Var.h = resources.getDimensionPixelSize(pq6.border_size);
            ea7Var.i = sj8.b().v;
            myketTextView2.setBackground(ea7Var.a());
            lw8 lw8Var = this.y;
            if (lw8Var == null) {
                js3.V("uiUtils");
                throw null;
            }
            myketTextView2.setText(lw8.e(lw8Var, context.getString(rs6.seasons_selectors, Integer.valueOf(movieSeasonTitleData.c + 1), Integer.valueOf(list.size()))));
            int i = yq6.ic_arrow_down;
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
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().m, PorterDuff.Mode.MULTIPLY));
            int dimensionPixelSize = resources.getDimensionPixelSize(pq6.arrow_size);
            drawableMutate.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            myketTextView2.setCompoundDrawablesRelative(null, null, drawableMutate, null);
            qg5.v(myketTextView2, this.x, this, movieSeasonTitleData);
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof u53) {
            this.z = (u53) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
