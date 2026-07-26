package defpackage;

import androidx.compose.animation.core.h;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.compose.a;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.ui.client.ad.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y5 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ y5(hx4 hx4Var, String str, bi0 bi0Var, Integer num, bp2 bp2Var, int i, int i2) {
        this.a = 0;
        this.c = hx4Var;
        this.d = str;
        this.e = bi0Var;
        this.f = num;
        this.g = bp2Var;
        this.b = i2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                wu8.a((hx4) this.c, (String) this.d, (bi0) this.e, (Integer) this.f, (bp2) this.g, (qz0) obj, hs9.W(1), this.b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                b.b((ExoPlayer) this.c, (o9) this.d, (cb) this.e, (dp2) this.f, (dp2) this.g, (qz0) obj, hs9.W(this.b | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((wz) this.d).a((hx4) this.c, (dl5) this.e, (ExoPlayer) this.f, (PlayerMovieData) this.g, (qz0) obj, hs9.W(this.b | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((mt0) this.d).a((hx4) this.c, (dl5) this.e, (ExoPlayer) this.f, (PlayerMovieData) this.g, (qz0) obj, hs9.W(this.b | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                js3.b((hx4) this.c, (xc6) this.d, (PlayerMovieData) this.e, (dp2) this.f, (dl5) this.g, (qz0) obj, hs9.W(this.b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                a.b((gb6) this.d, (hx4) this.c, (dp2) this.e, (qp2) this.f, (qp2) this.g, (qz0) obj, hs9.W(this.b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                h.a((jr8) this.c, (fr8) this.d, this.e, this.f, (sc2) this.g, (qz0) obj, hs9.W(this.b | 1));
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ y5(Object obj, hx4 hx4Var, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.c = hx4Var;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = i;
    }

    public /* synthetic */ y5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.b = i;
    }
}
