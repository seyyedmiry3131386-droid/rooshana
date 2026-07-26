package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class t65 extends qg5 {
    public final View w;
    public final z65 x;
    public final lw8 y;
    public r65 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t65(View view, z65 z65Var) {
        super(view);
        js3.p(view, "view");
        this.w = view;
        this.x = z65Var;
        this.y = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof r65) {
            this.z = (r65) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void t(MovieSeasonFixedTitleData movieSeasonFixedTitleData) {
        Drawable drawable;
        js3.p(movieSeasonFixedTitleData, "data");
        View view = this.a;
        Context context = view.getContext();
        Resources resources = view.getResources();
        r65 r65Var = this.z;
        if (r65Var == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = r65Var.w.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(resources.getDimensionPixelSize(pq6.horizontal_space_inner) + resources.getDimensionPixelSize(pq6.horizontal_space_outer));
        r65 r65Var2 = this.z;
        if (r65Var2 == null) {
            js3.V("binding");
            throw null;
        }
        r65Var2.w.setText(resources.getString(movieSeasonFixedTitleData.e ? rs6.select_audio_label : rs6.select_season_label));
        r65 r65Var3 = this.z;
        if (r65Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = r65Var3.y;
        js3.o(myketTextView, "title");
        myketTextView.setVisibility(movieSeasonFixedTitleData.f ? 0 : 8);
        r65 r65Var4 = this.z;
        if (r65Var4 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = r65Var4.y;
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
        myketTextView2.setText(lw8.e(lw8Var, context.getString(rs6.seasons_selectors, Integer.valueOf(movieSeasonFixedTitleData.d + 1), Integer.valueOf(movieSeasonFixedTitleData.c.size()))));
        ViewGroup.LayoutParams layoutParams2 = myketTextView2.getLayoutParams();
        js3.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(resources.getDimensionPixelSize(pq6.horizontal_space_inner) + resources.getDimensionPixelSize(pq6.horizontal_space_outer));
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
        qg5.v(myketTextView2, this.x, this, movieSeasonFixedTitleData);
    }
}
