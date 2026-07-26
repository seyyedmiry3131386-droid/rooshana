package ir.mservices.market.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bp2;
import defpackage.f57;
import defpackage.f88;
import defpackage.fa1;
import defpackage.fo0;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw;
import defpackage.mw7;
import defpackage.ne5;
import defpackage.pq6;
import defpackage.r45;
import defpackage.sj8;
import defpackage.t61;
import defpackage.uv1;
import defpackage.v25;
import defpackage.xp8;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.activity.IbexData;
import ir.mservices.market.views.TrailerFinishedPlayingView;

/* JADX INFO: loaded from: classes3.dex */
public final class TrailerFinishedPlayingView extends Hilt_TrailerFinishedPlayingView {
    public static final /* synthetic */ int v = 0;
    public final xp8 s;
    public bp2 t;
    public bp2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrailerFinishedPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = xp8.C;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        final int i2 = 1;
        xp8 xp8Var = (xp8) fa1.c(layoutInflaterFrom, js6.trailer_finished_playing_view, this, true);
        js3.o(xp8Var, "inflate(...)");
        this.s = xp8Var;
        this.t = new mw7(14);
        this.u = new mw7(14);
        xp8Var.l.setBackgroundColor(sj8.b().J.a);
        final int i3 = 0;
        xp8Var.w.setOnClickListener(new View.OnClickListener(this) { // from class: wp8
            public final /* synthetic */ TrailerFinishedPlayingView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                TrailerFinishedPlayingView trailerFinishedPlayingView = this.b;
                switch (i4) {
                    case 0:
                        trailerFinishedPlayingView.u.invoke();
                        break;
                    default:
                        int i5 = TrailerFinishedPlayingView.v;
                        dw1.y("trailer_play");
                        trailerFinishedPlayingView.t.invoke();
                        break;
                }
            }
        });
        Drawable drawable = xp8Var.v.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().I.a, PorterDuff.Mode.MULTIPLY));
        }
        ScreenshotView screenshotView = xp8Var.y;
        int dimensionPixelSize = screenshotView.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        int dimensionPixelSize2 = screenshotView.getResources().getDimensionPixelSize(pq6.default_image_corner_radius);
        screenshotView.setElevation(dimensionPixelSize);
        screenshotView.setOutlineProvider(new r45(dimensionPixelSize, dimensionPixelSize2));
        screenshotView.setSize(screenshotView.getResources().getDimensionPixelSize(pq6.trailer_finished_playing_poster_width), screenshotView.getResources().getDimensionPixelSize(pq6.trailer_finished_playing_poster_height));
        ViewGroup.LayoutParams layoutParams = xp8Var.z.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).setMargins(0, -getResources().getDimensionPixelSize(pq6.space_m), 0, 0);
        BigFillOvalButton bigFillOvalButton = xp8Var.x;
        bigFillOvalButton.setBgColor(sj8.c(sj8.f).j);
        bigFillOvalButton.setButtonTextColor(sj8.c(sj8.f).k);
        bigFillOvalButton.setOnClickListener(new View.OnClickListener(this) { // from class: wp8
            public final /* synthetic */ TrailerFinishedPlayingView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                TrailerFinishedPlayingView trailerFinishedPlayingView = this.b;
                switch (i4) {
                    case 0:
                        trailerFinishedPlayingView.u.invoke();
                        break;
                    default:
                        int i5 = TrailerFinishedPlayingView.v;
                        dw1.y("trailer_play");
                        trailerFinishedPlayingView.t.invoke();
                        break;
                }
            }
        });
    }

    public final bp2 getBackButtonOnClickListener() {
        return this.u;
    }

    public final bp2 getPlayButtonOnClickListener() {
        return this.t;
    }

    public final void setBackButtonOnClickListener(bp2 bp2Var) {
        js3.p(bp2Var, "<set-?>");
        this.u = bp2Var;
    }

    public final void setData(IbexData ibexData) {
        f57 f57VarH;
        js3.p(ibexData, "ibexData");
        xp8 xp8Var = this.s;
        xp8Var.B.setText(ibexData.b);
        String str = ibexData.c;
        if (f88.n0(str)) {
            str = null;
        }
        if (str != null) {
            if (f88.n0(str)) {
                lw.g(null, "url is empty", null);
                str = "empty_url";
            }
            try {
                f57VarH = com.bumptech.glide.a.f(this).q(new ne5(str, null));
                js3.m(f57VarH);
            } catch (Exception unused) {
                f57VarH = t61.h(str, null, com.bumptech.glide.a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
            }
            ((f57) ((f57) f57VarH.W(uv1.b()).E(5)).G(new fo0())).P(xp8Var.A);
        }
        ScreenshotView screenshotView = xp8Var.y;
        screenshotView.setOnLoad(new v25(ibexData, this, 29));
        screenshotView.c("", ibexData.d);
    }

    public final void setPlayButtonOnClickListener(bp2 bp2Var) {
        js3.p(bp2Var, "<set-?>");
        this.t = bp2Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrailerFinishedPlayingView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
