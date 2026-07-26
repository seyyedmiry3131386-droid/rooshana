package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.ui.common.MovieHomeReelData;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class u35 extends qg5 {
    public final int A;
    public final int w;
    public og5 x;
    public n07 y;
    public final int z;

    public u35(int i, View view) {
        super(view);
        this.w = i;
        int dimensionPixelSize = i - (view.getResources().getDimensionPixelSize(pq6.item_space) + (view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) * 2));
        this.z = dimensionPixelSize;
        this.A = (int) (((double) dimensionPixelSize) * 1.5d);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MovieHomeReelData movieHomeReelData = (MovieHomeReelData) myketRecyclerData;
        js3.p(movieHomeReelData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_12);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        view.getLayoutParams().width = this.w;
        n07 n07Var = this.y;
        if (n07Var == null) {
            js3.V("binding");
            throw null;
        }
        ScreenshotView screenshotView = n07Var.z;
        float f = dimensionPixelSize2;
        screenshotView.setElevation(f);
        float f2 = dimensionPixelSize;
        screenshotView.setOutlineProvider(new r45(dimensionPixelSize2, f2));
        ScreenshotView.setStyle$default(screenshotView, null, Integer.valueOf(dimensionPixelSize), null, 5, null);
        screenshotView.setSize(this.z, this.A);
        screenshotView.c("", movieHomeReelData.a.getThumbnailUrl());
        n07 n07Var2 = this.y;
        if (n07Var2 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = n07Var2.v;
        js3.m(frameLayout);
        uy6.q(frameLayout, 0, Float.valueOf(f2), 1);
        frameLayout.setElevation(f);
        qg5.v(frameLayout, this.x, this, movieHomeReelData);
        n07 n07Var3 = this.y;
        if (n07Var3 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout2 = n07Var3.x;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{sj8.b().J.d, sj8.b().N});
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout2.setBackground(gradientDrawable);
        float f3 = f + 1;
        frameLayout2.setElevation(f3);
        n07 n07Var4 = this.y;
        if (n07Var4 != null) {
            n07Var4.y.setElevation(f3);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof n07) {
            this.y = (n07) a79Var;
        } else {
            s7.m("binding is incompatible");
            throw null;
        }
    }
}
