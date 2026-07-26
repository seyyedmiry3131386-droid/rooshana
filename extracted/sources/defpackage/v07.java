package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.o;
import ir.mservices.market.reels.ui.recycler.ReelAdData;
import ir.mservices.market.reels.ui.recycler.ReelData;
import ir.mservices.market.reels.ui.recycler.b;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class v07 extends a {
    public b17 l;
    public b17 m;
    public b17 n;
    public ir.mservices.market.reels.ui.a o;
    public ir.mservices.market.reels.ui.a p;
    public b17 q;
    public b17 r;
    public b17 s;
    public b17 t;
    public b17 u;
    public b17 v;
    public b17 w;
    public b17 x;
    public ur4 y;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i != ReelData.i) {
            if (i != ReelAdData.e) {
                return null;
            }
            b17 b17Var = this.m;
            if (b17Var == null) {
                js3.V("onMuteClickListener");
                throw null;
            }
            b17 b17Var2 = this.v;
            if (b17Var2 == null) {
                js3.V("onAppInfoClickListener");
                throw null;
            }
            b17 b17Var3 = this.w;
            if (b17Var3 == null) {
                js3.V("onLinkInfoClickListener");
                throw null;
            }
            b17 b17Var4 = this.x;
            if (b17Var4 == null) {
                js3.V("onAnalyticsCallbackListener");
                throw null;
            }
            b17 b17Var5 = this.l;
            if (b17Var5 == null) {
                js3.V("onNextReelListener");
                throw null;
            }
            ur4 ur4Var = this.y;
            if (ur4Var != null) {
                return new ir.mservices.market.reels.ui.recycler.a(view, b17Var5, b17Var, b17Var2, b17Var3, b17Var4, ur4Var);
            }
            js3.V("onAdLikeClickListener");
            throw null;
        }
        b17 b17Var6 = this.n;
        if (b17Var6 == null) {
            js3.V("onProfileClickListener");
            throw null;
        }
        ir.mservices.market.reels.ui.a aVar = this.o;
        if (aVar == null) {
            js3.V("onLikeClickListener");
            throw null;
        }
        ir.mservices.market.reels.ui.a aVar2 = this.p;
        if (aVar2 == null) {
            js3.V("onDoubleTapLikeClickListener");
            throw null;
        }
        b17 b17Var7 = this.q;
        if (b17Var7 == null) {
            js3.V("onPauseAnalyticsListener");
            throw null;
        }
        b17 b17Var8 = this.r;
        if (b17Var8 == null) {
            js3.V("onStartAnalyticsListener");
            throw null;
        }
        b17 b17Var9 = this.s;
        if (b17Var9 == null) {
            js3.V("onFinishAnalyticsListener");
            throw null;
        }
        b17 b17Var10 = this.l;
        if (b17Var10 == null) {
            js3.V("onNextReelListener");
            throw null;
        }
        b17 b17Var11 = this.t;
        if (b17Var11 == null) {
            js3.V("onBackVisibilityChanged");
            throw null;
        }
        b17 b17Var12 = this.m;
        if (b17Var12 == null) {
            js3.V("onMuteClickListener");
            throw null;
        }
        b17 b17Var13 = this.u;
        if (b17Var13 != null) {
            return new b(view, b17Var10, b17Var12, b17Var6, aVar, aVar2, b17Var7, b17Var8, b17Var9, b17Var11, b17Var13);
        }
        js3.V("onDownloadClickListener");
        throw null;
    }

    @Override // androidx.recyclerview.widget.g
    public final void s(o oVar) {
        qg5 qg5Var = (qg5) oVar;
        js3.p(qg5Var, "holder");
        u80 u80Var = qg5Var instanceof u80 ? (u80) qg5Var : null;
        if (u80Var != null) {
            u80Var.A();
        }
    }
}
