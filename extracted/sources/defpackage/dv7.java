package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerBannersData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerMoviesData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerReelData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.AlphaAnimationView;

/* JADX INFO: loaded from: classes3.dex */
public final class dv7 extends qg5 {
    public a79 A;
    public final /* synthetic */ int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv7(View view, int i, int i2) {
        super(view);
        this.w = i2;
        switch (i2) {
            case 1:
                super(view);
                this.x = i;
                int iE = t61.e(view.getResources(), pq6.item_space, 2, i);
                this.y = iE;
                this.z = (int) ((iE * 9.0f) / 16.0f);
                break;
            case 2:
                super(view);
                this.x = i;
                int iE2 = t61.e(view.getResources(), pq6.item_space, 2, i);
                this.y = iE2;
                this.z = (int) (iE2 * 0.5625f);
                break;
            case 3:
                super(view);
                this.x = i;
                int dimensionPixelSize = i - (view.getResources().getDimensionPixelSize(pq6.item_space) + (view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) * 2));
                this.y = dimensionPixelSize;
                this.z = (int) (((double) dimensionPixelSize) * 1.5d);
                break;
            case 4:
                super(view);
                this.x = i;
                int dimensionPixelSize2 = i - (view.getResources().getDimensionPixelSize(pq6.item_space) + (view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) * 2));
                this.y = dimensionPixelSize2;
                this.z = (int) (((double) dimensionPixelSize2) * 1.5d);
                break;
            case 5:
                super(view);
                this.x = i;
                int dimensionPixelSize3 = i - (view.getResources().getDimensionPixelSize(pq6.item_space) + (view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) * 2));
                this.y = dimensionPixelSize3;
                this.z = (int) (((double) dimensionPixelSize3) * 1.5d);
                break;
            case 6:
                super(view);
                this.x = i;
                int dimensionPixelSize4 = i - (view.getResources().getDimensionPixelSize(pq6.item_space) + (view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) * 2));
                this.y = dimensionPixelSize4;
                this.z = (int) (((double) dimensionPixelSize4) * 1.5d);
                break;
            case 7:
                super(view);
                this.x = i;
                int dimensionPixelSize5 = i - (view.getResources().getDimensionPixelSize(pq6.item_space) + (view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) * 2));
                this.y = dimensionPixelSize5;
                this.z = (int) (((double) dimensionPixelSize5) * 1.5d);
                break;
            case 8:
                super(view);
                this.x = i;
                int dimensionPixelSize6 = i - (view.getResources().getDimensionPixelSize(pq6.item_space) + (view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) * 2));
                this.y = dimensionPixelSize6;
                this.z = (int) (((double) dimensionPixelSize6) * 1.5d);
                break;
            case 9:
                super(view);
                this.x = i;
                int dimensionPixelSize7 = i - (view.getResources().getDimensionPixelSize(pq6.item_space) + (view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) * 2));
                this.y = dimensionPixelSize7;
                this.z = (int) (((double) dimensionPixelSize7) * 1.5d);
                break;
            case 10:
                super(view);
                this.x = i;
                int dimensionPixelSize8 = i - (view.getResources().getDimensionPixelSize(pq6.item_space) + (view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) * 2));
                this.y = dimensionPixelSize8;
                this.z = (int) (((double) dimensionPixelSize8) * 1.5d);
                break;
            default:
                this.x = i;
                int iE3 = t61.e(view.getResources(), pq6.item_space, 2, i);
                this.y = iE3;
                this.z = (int) ((iE3 * 9.0f) / 16.0f);
                break;
        }
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        switch (this.w) {
            case 0:
                ShimmerBannersData shimmerBannersData = (ShimmerBannersData) myketRecyclerData;
                js3.p(shimmerBannersData, "data");
                this.a.getLayoutParams().width = this.x;
                n33 n33Var = (n33) this.A;
                if (n33Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = n33Var.v.getLayoutParams();
                int i = this.y;
                layoutParams.width = i;
                layoutParams.height = this.z;
                n33 n33Var2 = (n33) this.A;
                if (n33Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                AlphaAnimationView alphaAnimationView = n33Var2.x;
                alphaAnimationView.getLayoutParams().width = i;
                alphaAnimationView.setVisibility(shimmerBannersData.b ? 0 : 8);
                return;
            case 1:
                ShimmerBannersData shimmerBannersData2 = (ShimmerBannersData) myketRecyclerData;
                js3.p(shimmerBannersData2, "data");
                this.a.getLayoutParams().width = this.x;
                z33 z33Var = (z33) this.A;
                if (z33Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams2 = z33Var.v.getLayoutParams();
                int i2 = this.y;
                layoutParams2.width = i2;
                layoutParams2.height = this.z;
                z33 z33Var2 = (z33) this.A;
                if (z33Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                AlphaAnimationView alphaAnimationView2 = z33Var2.x;
                alphaAnimationView2.getLayoutParams().width = i2;
                alphaAnimationView2.setVisibility(shimmerBannersData2.b ? 0 : 8);
                return;
            case 2:
                ShimmerBannersData shimmerBannersData3 = (ShimmerBannersData) myketRecyclerData;
                js3.p(shimmerBannersData3, "data");
                this.a.getLayoutParams().width = this.x;
                g93 g93Var = (g93) this.A;
                if (g93Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams3 = g93Var.v.getLayoutParams();
                int i3 = this.y;
                layoutParams3.width = i3;
                layoutParams3.height = this.z;
                g93 g93Var2 = (g93) this.A;
                if (g93Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                AlphaAnimationView alphaAnimationView3 = g93Var2.x;
                alphaAnimationView3.getLayoutParams().width = i3;
                alphaAnimationView3.setVisibility(shimmerBannersData3.b ? 0 : 8);
                return;
            case 3:
                js3.p((ShimmerMoviesData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                b93 b93Var = (b93) this.A;
                if (b93Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams4 = b93Var.v.getLayoutParams();
                layoutParams4.width = this.y;
                layoutParams4.height = this.z;
                return;
            case 4:
                js3.p((ShimmerMoviesData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                p33 p33Var = (p33) this.A;
                if (p33Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams5 = p33Var.v.getLayoutParams();
                int i4 = this.y;
                layoutParams5.width = i4;
                layoutParams5.height = this.z;
                p33 p33Var2 = (p33) this.A;
                if (p33Var2 != null) {
                    p33Var2.x.getLayoutParams().width = i4;
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 5:
                js3.p((ShimmerMoviesData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                b43 b43Var = (b43) this.A;
                if (b43Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams6 = b43Var.v.getLayoutParams();
                int i5 = this.y;
                layoutParams6.width = i5;
                layoutParams6.height = this.z;
                b43 b43Var2 = (b43) this.A;
                if (b43Var2 != null) {
                    b43Var2.x.getLayoutParams().width = i5;
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 6:
                js3.p((ShimmerMoviesData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                i93 i93Var = (i93) this.A;
                if (i93Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams7 = i93Var.v.getLayoutParams();
                int i6 = this.y;
                layoutParams7.width = i6;
                layoutParams7.height = this.z;
                i93 i93Var2 = (i93) this.A;
                if (i93Var2 != null) {
                    i93Var2.x.getLayoutParams().width = i6;
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 7:
                js3.p((ShimmerReelData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                j23 j23Var = (j23) this.A;
                if (j23Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams8 = j23Var.v.getLayoutParams();
                layoutParams8.width = this.y;
                layoutParams8.height = this.z;
                return;
            case 8:
                js3.p((ShimmerReelData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                r33 r33Var = (r33) this.A;
                if (r33Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams9 = r33Var.v.getLayoutParams();
                layoutParams9.width = this.y;
                layoutParams9.height = this.z;
                return;
            case 9:
                js3.p((ShimmerReelData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                d43 d43Var = (d43) this.A;
                if (d43Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams10 = d43Var.v.getLayoutParams();
                layoutParams10.width = this.y;
                layoutParams10.height = this.z;
                return;
            default:
                js3.p((ShimmerReelData) myketRecyclerData, "data");
                this.a.getLayoutParams().width = this.x;
                k93 k93Var = (k93) this.A;
                if (k93Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams11 = k93Var.v.getLayoutParams();
                layoutParams11.width = this.y;
                layoutParams11.height = this.z;
                return;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        switch (this.w) {
            case 0:
                if (!(a79Var instanceof n33)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.A = (n33) a79Var;
                }
                break;
            case 1:
                if (!(a79Var instanceof z33)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.A = (z33) a79Var;
                }
                break;
            case 2:
                if (!(a79Var instanceof g93)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.A = (g93) a79Var;
                }
                break;
            case 3:
                if (!(a79Var instanceof b93)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.A = (b93) a79Var;
                }
                break;
            case 4:
                if (!(a79Var instanceof p33)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.A = (p33) a79Var;
                }
                break;
            case 5:
                if (!(a79Var instanceof b43)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.A = (b43) a79Var;
                }
                break;
            case 6:
                if (!(a79Var instanceof i93)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.A = (i93) a79Var;
                }
                break;
            case 7:
                if (!(a79Var instanceof j23)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.A = (j23) a79Var;
                }
                break;
            case 8:
                if (!(a79Var instanceof r33)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.A = (r33) a79Var;
                }
                break;
            case 9:
                if (!(a79Var instanceof d43)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.A = (d43) a79Var;
                }
                break;
            default:
                if (!(a79Var instanceof k93)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.A = (k93) a79Var;
                }
                break;
        }
    }
}
