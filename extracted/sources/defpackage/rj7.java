package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.o;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerApplicationData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerBannersData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerHeaderData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerMoviesData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerReelData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerReviewData;
import ir.mservices.market.common.shimmer.ui.recycler.ShimmerSingleAppData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryTagData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class rj7 extends l06 {
    public final /* synthetic */ int m = 1;
    public final Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj7(int i, GraphicUtils$Dimension graphicUtils$Dimension) {
        super(i);
        js3.p(graphicUtils$Dimension, "dimension");
        this.n = graphicUtils$Dimension;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        switch (this.m) {
            case 0:
                if (i == SearchHistoryTagData.c) {
                    return new pi7(view);
                }
                return null;
            default:
                GraphicUtils$Dimension graphicUtils$Dimension = (GraphicUtils$Dimension) this.n;
                if (i == ShimmerHeaderData.a) {
                    return new cv7(view, graphicUtils$Dimension.a, 1);
                }
                if (i == ShimmerApplicationData.d) {
                    return new cv7(view, this.l, 0);
                }
                if (i == ShimmerApplicationData.e) {
                    return new u62(view, this.l, 2);
                }
                if (i == ShimmerApplicationData.f) {
                    return new u62(view, this.l, 1);
                }
                if (i == ShimmerSingleAppData.b) {
                    return new cv7(view, graphicUtils$Dimension.a, 3);
                }
                if (i == ShimmerReviewData.b) {
                    return new cv7(view, this.l, 2);
                }
                if (i == ShimmerReelData.c) {
                    return new dv7(view, this.l, 10);
                }
                if (i == ShimmerReelData.d) {
                    return new dv7(view, this.l, 9);
                }
                if (i == ShimmerReelData.e) {
                    return new dv7(view, this.l, 8);
                }
                if (i == ShimmerReelData.b) {
                    return new dv7(view, this.l, 7);
                }
                if (i == ShimmerBannersData.d) {
                    return new dv7(view, this.l, 1);
                }
                if (i == ShimmerBannersData.e) {
                    return new dv7(view, this.l, 0);
                }
                if (i == ShimmerBannersData.c) {
                    return new dv7(view, this.l, 2);
                }
                if (i == ShimmerMoviesData.d) {
                    return new dv7(view, this.l, 5);
                }
                if (i == ShimmerMoviesData.e) {
                    return new dv7(view, this.l, 4);
                }
                if (i == ShimmerMoviesData.c) {
                    return new dv7(view, this.l, 6);
                }
                if (i == ShimmerMoviesData.f) {
                    return new dv7(view, this.l, 3);
                }
                return null;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    /* JADX INFO: renamed from: K */
    public void l(qg5 qg5Var, int i) {
        switch (this.m) {
            case 0:
                if (e(i) == SearchHistoryTagData.c) {
                    ((pi7) qg5Var).x = (og5) this.n;
                }
                super.l(qg5Var, i);
                break;
            default:
                super.l(qg5Var, i);
                break;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    public /* bridge */ /* synthetic */ void l(o oVar, int i) {
        switch (this.m) {
            case 0:
                l((qg5) oVar, i);
                break;
            default:
                super.l(oVar, i);
                break;
        }
    }

    public rj7(hi7 hi7Var) {
        super(1);
        this.n = hi7Var;
    }
}
