package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p59 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;
    public final /* synthetic */ hx4 c;
    public final /* synthetic */ ExoPlayer d;
    public final /* synthetic */ int e;

    public /* synthetic */ p59(pg0 pg0Var, hx4 hx4Var, ExoPlayer exoPlayer, int i, int i2) {
        this.a = i2;
        this.b = pg0Var;
        this.c = hx4Var;
        this.d = exoPlayer;
        this.e = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        qz0 qz0Var = (qz0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ib7.c(this.b, this.c, this.d, qz0Var, hs9.W(this.e | 1));
                break;
            default:
                ib7.b(this.b, this.c, this.d, qz0Var, hs9.W(this.e | 1));
                break;
        }
        return tx8.a;
    }
}
