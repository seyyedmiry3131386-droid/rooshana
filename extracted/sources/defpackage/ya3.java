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
import ir.mservices.market.app.common.recycler.c;
import ir.mservices.market.app.home.ui.recycler.HomeBannerAppData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppDto;
import ir.mservices.market.views.ScreenshotView;

/* JADX INFO: loaded from: classes3.dex */
public final class ya3 extends za3 {
    public v23 A;
    public c B;
    public final int x;
    public s82 y;
    public og5 z;

    public ya3(int i, View view) {
        super(view);
        this.x = i;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        HomeBannerAppData homeBannerAppData = (HomeBannerAppData) myketRecyclerData;
        js3.p(homeBannerAppData, "data");
        c cVar = this.B;
        if (cVar != null) {
            cVar.s(homeBannerAppData.i);
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
        int i2 = b95.C;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        b95 b95Var = (b95) fa1.c(layoutInflaterFrom, js6.multi_app_card, null, false);
        js3.o(b95Var, "inflate(...)");
        v23 v23Var = this.A;
        if (v23Var == null) {
            js3.V("binding");
            throw null;
        }
        LinearLayout linearLayout = v23Var.v;
        linearLayout.removeAllViews();
        linearLayout.addView(b95Var.l);
        View viewFindViewById = view.findViewById(rr6.app_layout);
        js3.o(viewFindViewById, "findViewById(...)");
        c cVar = new c(-1, viewFindViewById);
        this.B = cVar;
        cVar.y = this.y;
        cVar.w = this.z;
        cVar.w(b95Var);
        cVar.t(homeBannerAppData.i);
        b95 b95Var2 = cVar.z;
        if (b95Var2 == null) {
            js3.V("binding");
            throw null;
        }
        View view2 = b95Var2.B;
        js3.o(view2, "space");
        view2.setVisibility(8);
        int dimensionPixelOffset = i - (view.getResources().getDimensionPixelOffset(pq6.space_8) + (view.getResources().getDimensionPixelOffset(pq6.horizontal_space_inner) * 2));
        int i3 = (int) (((double) dimensionPixelOffset) * 0.562d);
        v23 v23Var2 = this.A;
        if (v23Var2 == null) {
            js3.V("binding");
            throw null;
        }
        ScreenshotView screenshotView = v23Var2.w;
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
        v23 v23Var3 = this.A;
        if (v23Var3 == null) {
            js3.V("binding");
            throw null;
        }
        v23Var3.v.getLayoutParams().width = i - view.getResources().getDimensionPixelOffset(pq6.space_8);
        v23 v23Var4 = this.A;
        if (v23Var4 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = v23Var4.x;
        js3.o(frameLayout, "clickableLayout");
        uy6.q(frameLayout, 0, Float.valueOf(view.getResources().getDimensionPixelSize(pq6.default_image_corner_radius)), 1);
        v23 v23Var5 = this.A;
        if (v23Var5 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout2 = v23Var5.x;
        js3.o(frameLayout2, "clickableLayout");
        qg5.v(frameLayout2, this.w, this, homeBannerAppData);
        v23 v23Var6 = this.A;
        if (v23Var6 == null) {
            js3.V("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = v23Var6.w.getLayoutParams();
        js3.n(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams2).E = Double.valueOf(0.5d).floatValue();
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof v23) {
            this.A = (v23) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // defpackage.za3
    public final ImageView x() {
        c cVar = this.B;
        if (cVar != null) {
            return cVar.x();
        }
        js3.V("applicationViewHolder");
        throw null;
    }
}
