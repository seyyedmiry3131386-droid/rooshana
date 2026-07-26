package defpackage;

import androidx.compose.material3.n;
import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vw implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vw(bx bxVar, hx4 hx4Var, dp2 dp2Var, qd qdVar, q41 q41Var, tc0 tc0Var, int i, int i2) {
        this.a = 0;
        this.f = bxVar;
        this.b = hx4Var;
        this.c = dp2Var;
        this.g = qdVar;
        this.h = q41Var;
        this.i = tc0Var;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ml9.b((bx) this.f, this.b, (dp2) this.c, (qd) this.g, (q41) this.h, (tc0) this.i, (qz0) obj, hs9.W(this.d | 1), hs9.W(this.e));
                break;
            case 1:
                ((Integer) obj2).getClass();
                y40.e(this.b, (ve6) this.f, (n) this.g, (dl5) this.h, (dp2) this.c, (bp2) this.i, (qz0) obj, hs9.W(this.d | 1), this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ja1.c(this.b, (PlayerMovieData) this.f, (wd6) this.g, (String) this.h, (dp2) this.c, (dp2) this.i, (qz0) obj, hs9.W(this.d | 1), this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                js3.d(this.b, (String) this.f, (pj3) this.c, (bp2) this.g, (n) this.h, (rp2) this.i, (qz0) obj, hs9.W(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                l87.b(this.b, (af6) this.f, (n) this.g, (dl5) this.h, (bp2) this.i, (dp2) this.c, (qz0) obj, hs9.W(this.d | 1), this.e);
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ vw(hx4 hx4Var, af6 af6Var, n nVar, dl5 dl5Var, bp2 bp2Var, dp2 dp2Var, int i, int i2) {
        this.a = 4;
        this.b = hx4Var;
        this.f = af6Var;
        this.g = nVar;
        this.h = dl5Var;
        this.i = bp2Var;
        this.c = dp2Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ vw(hx4 hx4Var, Object obj, Object obj2, Object obj3, dp2 dp2Var, np2 np2Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = hx4Var;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.c = dp2Var;
        this.i = np2Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ vw(hx4 hx4Var, String str, pj3 pj3Var, bp2 bp2Var, n nVar, rp2 rp2Var, int i, int i2) {
        this.a = 3;
        this.b = hx4Var;
        this.f = str;
        this.c = pj3Var;
        this.g = bp2Var;
        this.h = nVar;
        this.i = rp2Var;
        this.d = i;
        this.e = i2;
    }
}
