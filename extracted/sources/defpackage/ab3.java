package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.home.ui.recycler.BaseHomeBannerAppData;

/* JADX INFO: loaded from: classes3.dex */
public final class ab3 extends l06 {
    public s82 m;
    public og5 n;
    public s82 o;
    public og5 p;
    public og5 q;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == BaseHomeBannerAppData.c) {
            return new wa3(this.l, view);
        }
        if (i == BaseHomeBannerAppData.d) {
            return new ya3(this.l, view);
        }
        if (i == BaseHomeBannerAppData.e) {
            return new va3(this.l, view);
        }
        if (i == BaseHomeBannerAppData.f) {
            return new xa3(this.l, view);
        }
        return null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    /* JADX INFO: renamed from: K */
    public final void l(qg5 qg5Var, int i) {
        int iE = e(i);
        if (iE == BaseHomeBannerAppData.c) {
            wa3 wa3Var = (wa3) qg5Var;
            og5 og5Var = this.n;
            if (og5Var == null) {
                js3.V("onBannerClickListenerInner");
                throw null;
            }
            wa3Var.w = og5Var;
            s82 s82Var = this.m;
            if (s82Var == null) {
                js3.V("onFastDownloadClickListener");
                throw null;
            }
            wa3Var.y = s82Var;
        } else if (iE == BaseHomeBannerAppData.d) {
            ya3 ya3Var = (ya3) qg5Var;
            og5 og5Var2 = this.p;
            if (og5Var2 == null) {
                js3.V("onOuterBannerClickListener");
                throw null;
            }
            ya3Var.w = og5Var2;
            s82 s82Var2 = this.o;
            if (s82Var2 == null) {
                js3.V("onOuterFastDownloadClickListener");
                throw null;
            }
            ya3Var.y = s82Var2;
            og5 og5Var3 = this.q;
            if (og5Var3 == null) {
                js3.V("onOuterAppClickListener");
                throw null;
            }
            ya3Var.z = og5Var3;
        } else if (iE == BaseHomeBannerAppData.e) {
            va3 va3Var = (va3) qg5Var;
            og5 og5Var4 = this.n;
            if (og5Var4 == null) {
                js3.V("onBannerClickListenerInner");
                throw null;
            }
            va3Var.w = og5Var4;
        } else if (iE == BaseHomeBannerAppData.f) {
            xa3 xa3Var = (xa3) qg5Var;
            og5 og5Var5 = this.p;
            if (og5Var5 == null) {
                js3.V("onOuterBannerClickListener");
                throw null;
            }
            xa3Var.w = og5Var5;
            og5 og5Var6 = this.q;
            if (og5Var6 == null) {
                js3.V("onOuterAppClickListener");
                throw null;
            }
            xa3Var.y = og5Var6;
        }
        super.l(qg5Var, i);
    }
}
