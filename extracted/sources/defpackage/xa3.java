package defpackage;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ir.mservices.market.app.common.recycler.b;
import ir.mservices.market.app.home.ui.recycler.HomeBannerAppData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppDto;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class xa3 extends za3 {
    public b A;
    public final int x;
    public og5 y;
    public x23 z;

    public xa3(int i, View view) {
        super(view);
        this.x = i;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        HomeBannerAppData homeBannerAppData = (HomeBannerAppData) myketRecyclerData;
        js3.p(homeBannerAppData, "data");
        b bVar = this.A;
        if (bVar != null) {
            bVar.s(homeBannerAppData.i);
        } else {
            js3.V("applicationViewHolder");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        HomeBannerAppData homeBannerAppData = (HomeBannerAppData) myketRecyclerData;
        js3.p(homeBannerAppData, "data");
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.x;
        layoutParams.width = i;
        HomeBannerAppDto homeBannerAppDto = homeBannerAppData.a;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        int i2 = d95.B;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        d95 d95Var = (d95) fa1.c(layoutInflaterFrom, js6.multi_app_card_digested, null, false);
        js3.o(d95Var, "inflate(...)");
        x23 x23Var = this.z;
        if (x23Var == null) {
            js3.V("binding");
            throw null;
        }
        LinearLayout linearLayout = x23Var.v;
        linearLayout.removeAllViews();
        linearLayout.addView(d95Var.l);
        View viewFindViewById = view.findViewById(rr6.app_layout);
        js3.o(viewFindViewById, "findViewById(...)");
        b bVar = new b(-1, viewFindViewById);
        this.A = bVar;
        bVar.w = this.y;
        bVar.w(d95Var);
        bVar.t(homeBannerAppData.i);
        d95 d95Var2 = bVar.y;
        if (d95Var2 == null) {
            js3.V("binding");
            throw null;
        }
        View view2 = d95Var2.A;
        js3.o(view2, "space");
        view2.setVisibility(8);
        int dimensionPixelOffset = i - (view.getResources().getDimensionPixelOffset(pq6.space_8) + (view.getResources().getDimensionPixelOffset(pq6.horizontal_space_inner) * 2));
        int i3 = (int) (((double) dimensionPixelOffset) * 0.562d);
        x23 x23Var2 = this.z;
        if (x23Var2 == null) {
            js3.V("binding");
            throw null;
        }
        ScreenshotView screenshotView = x23Var2.w;
        js3.m(screenshotView);
        Object obj = lw8.b;
        String bannerBg = homeBannerAppDto.getBannerBg();
        int color = sj8.b().p;
        try {
            color = Color.parseColor(bannerBg);
        } catch (Exception unused) {
        }
        ScreenshotView.setStyle$default(screenshotView, Integer.valueOf(color), null, null, 6, null);
        screenshotView.setSize(dimensionPixelOffset, i3);
        screenshotView.c(homeBannerAppDto.getBlurUrl(), homeBannerAppDto.getBannerUrl());
        x23 x23Var3 = this.z;
        if (x23Var3 == null) {
            js3.V("binding");
            throw null;
        }
        x23Var3.v.getLayoutParams().width = i - view.getResources().getDimensionPixelOffset(pq6.space_8);
        x23 x23Var4 = this.z;
        if (x23Var4 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = x23Var4.x;
        js3.o(frameLayout, "clickableLayout");
        uy6.q(frameLayout, 0, Float.valueOf(view.getResources().getDimensionPixelSize(pq6.default_image_corner_radius)), 1);
        x23 x23Var5 = this.z;
        if (x23Var5 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout2 = x23Var5.x;
        js3.o(frameLayout2, "clickableLayout");
        qg5.v(frameLayout2, this.w, this, homeBannerAppData);
        x23 x23Var6 = this.z;
        if (x23Var6 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = x23Var6.w.getLayoutParams();
        js3.n(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams2).E = Double.valueOf(0.5d).floatValue();
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof x23) {
            this.z = (x23) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // defpackage.za3
    public final ImageView x() {
        b bVar = this.A;
        if (bVar != null) {
            return bVar.x();
        }
        js3.V("applicationViewHolder");
        throw null;
    }
}
