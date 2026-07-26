package defpackage;

import androidx.compose.material3.b;
import androidx.compose.runtime.internal.a;
import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class an0 implements qp2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ np2 h;

    public /* synthetic */ an0(bp2 bp2Var, hx4 hx4Var, boolean z, xr7 xr7Var, zm0 zm0Var, b bVar, a aVar, int i) {
        this.d = bp2Var;
        this.b = hx4Var;
        this.c = z;
        this.e = xr7Var;
        this.f = zm0Var;
        this.g = bVar;
        this.h = aVar;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = hs9.W(100666369);
                m91.a((bp2) this.d, this.b, this.c, (xr7) this.e, (zm0) this.f, (b) this.g, (a) this.h, (qz0) obj, iW);
                break;
            default:
                ((Integer) obj2).getClass();
                int iW2 = hs9.W(7);
                rf0.f(this.b, (wd6) this.d, (zl6) this.e, (PlayerMovieData) this.f, this.c, (rn5) this.g, (dp2) this.h, (qz0) obj, iW2);
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ an0(hx4 hx4Var, wd6 wd6Var, zl6 zl6Var, PlayerMovieData playerMovieData, boolean z, rn5 rn5Var, dp2 dp2Var, int i) {
        this.b = hx4Var;
        this.d = wd6Var;
        this.e = zl6Var;
        this.f = playerMovieData;
        this.c = z;
        this.g = rn5Var;
        this.h = dp2Var;
    }
}
