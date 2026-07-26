package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannerData;
import ir.mservices.market.views.MyketTextView;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class b45 extends qg5 {
    public final og5 w;
    public final int x;
    public x53 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b45(View view, GraphicUtils$Dimension graphicUtils$Dimension, og5 og5Var) {
        super(view);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(og5Var, "onBannerClickListener");
        this.w = og5Var;
        this.x = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        MovieHomeBannerData movieHomeBannerData = (MovieHomeBannerData) myketRecyclerData;
        js3.p(movieHomeBannerData, "data");
        HomeMovieBannerDto homeMovieBannerDto = movieHomeBannerData.a;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.margin_default_v2);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        x53 x53Var = this.y;
        if (x53Var == null) {
            js3.V("binding");
            throw null;
        }
        float f = dimensionPixelSize2;
        x53Var.A.setElevation(2 + f);
        x53 x53Var2 = this.y;
        if (x53Var2 == null) {
            js3.V("binding");
            throw null;
        }
        x53Var2.w.setElevation(f + 3);
        x53 x53Var3 = this.y;
        if (x53Var3 == null) {
            js3.V("binding");
            throw null;
        }
        View view2 = x53Var3.z;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().J.e;
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = 0;
        view2.setBackground(ea7Var.a());
        x53 x53Var4 = this.y;
        if (x53Var4 == null) {
            js3.V("binding");
            throw null;
        }
        View view3 = x53Var4.l;
        int i = this.x;
        view3.setPadding(i, 0, i, 0);
        x53 x53Var5 = this.y;
        if (x53Var5 == null) {
            js3.V("binding");
            throw null;
        }
        x53Var5.C.setText(homeMovieBannerDto.getHeaderTitle());
        x53 x53Var6 = this.y;
        if (x53Var6 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = x53Var6.B;
        js3.o(myketTextView, "secondaryTitle");
        MyketTextView.setTextFromHtml$default(myketTextView, homeMovieBannerDto.getSecondaryTitle(), 2, null, null, false, 28, null);
        x53 x53Var7 = this.y;
        if (x53Var7 == null) {
            js3.V("binding");
            throw null;
        }
        x53Var7.v.setText(homeMovieBannerDto.getActionText());
        x53 x53Var8 = this.y;
        if (x53Var8 == null) {
            js3.V("binding");
            throw null;
        }
        x53Var8.v.setPrimaryColor(sj8.b().d);
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i2 = yq6.ic_arrow_end;
        try {
            drawable = q39.a(resources, i2, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i2, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().I.a, PorterDuff.Mode.MULTIPLY));
        x53 x53Var9 = this.y;
        if (x53Var9 == null) {
            js3.V("binding");
            throw null;
        }
        x53Var9.v.setSmallIcon(drawable);
        x53 x53Var10 = this.y;
        if (x53Var10 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = x53Var10.A;
        js3.o(frameLayout, "clickableLayout");
        uy6.q(frameLayout, 0, Float.valueOf(dimensionPixelSize), 1);
        x53 x53Var11 = this.y;
        if (x53Var11 == null) {
            js3.V("binding");
            throw null;
        }
        x53Var11.x.c("", homeMovieBannerDto.getBannerUrl());
        x53 x53Var12 = this.y;
        if (x53Var12 == null) {
            js3.V("binding");
            throw null;
        }
        x53Var12.y.c("", homeMovieBannerDto.getBannerBlurUrl());
        x53 x53Var13 = this.y;
        if (x53Var13 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout2 = x53Var13.A;
        js3.o(frameLayout2, "clickableLayout");
        og5 og5Var = this.w;
        qg5.v(frameLayout2, og5Var, this, movieHomeBannerData);
        x53 x53Var14 = this.y;
        if (x53Var14 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout3 = x53Var14.w;
        js3.o(frameLayout3, "actionClick");
        qg5.v(frameLayout3, og5Var, this, movieHomeBannerData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof x53) {
            this.y = (x53) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
