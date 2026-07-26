package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.o;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class vk6 extends a {
    public final /* synthetic */ int l;
    public final int m;
    public final int n;
    public og5 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk6(int i, int i2, int i3) {
        super(i2);
        this.l = i3;
        this.m = i;
        this.n = i2;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final int H() {
        switch (this.l) {
        }
        return this.n;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        switch (this.l) {
            case 0:
                if (i == AppNestedData.k) {
                    return new bq(this.m, view);
                }
                return null;
            default:
                if (i == MovieHomeMovieData.g) {
                    return new s35(this.m, view);
                }
                return null;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    /* JADX INFO: renamed from: K */
    public final void l(qg5 qg5Var, int i) {
        switch (this.l) {
            case 0:
                if (e(i) == AppNestedData.k) {
                    bq bqVar = (bq) qg5Var;
                    ts5 ts5Var = (ts5) this.o;
                    if (ts5Var == null) {
                        js3.V("onClickListener");
                        throw null;
                    }
                    bqVar.x = ts5Var;
                }
                super.l(qg5Var, i);
                return;
            default:
                if (e(i) == MovieHomeMovieData.g) {
                    s35 s35Var = (s35) qg5Var;
                    ts5 ts5Var2 = (ts5) this.o;
                    if (ts5Var2 == null) {
                        js3.V("onClickListener");
                        throw null;
                    }
                    s35Var.x = ts5Var2;
                }
                super.l(qg5Var, i);
                return;
        }
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    public final /* bridge */ /* synthetic */ void l(o oVar, int i) {
        switch (this.l) {
            case 0:
                l((qg5) oVar, i);
                break;
            default:
                l((qg5) oVar, i);
                break;
        }
    }
}
