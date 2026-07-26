package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import ir.myket.player.ui.audio.b;
import ir.myket.player.ui.client.c;
import ir.myket.player.ui.client.state.a;
import ir.myket.player.viewmodel.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a00 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ dl5 c;
    public final /* synthetic */ a d;
    public final /* synthetic */ ExoPlayer e;
    public final /* synthetic */ e f;
    public final /* synthetic */ dp2 g;

    public /* synthetic */ a00(hx4 hx4Var, dl5 dl5Var, a aVar, ExoPlayer exoPlayer, e eVar, dp2 dp2Var, int i, int i2) {
        this.a = i2;
        this.b = hx4Var;
        this.c = dl5Var;
        this.d = aVar;
        this.e = exoPlayer;
        this.f = eVar;
        this.g = dp2Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = hs9.W(391);
                b.a(this.b, this.c, this.d, this.e, this.f, this.g, (qz0) obj, iW);
                break;
            default:
                ((Integer) obj2).getClass();
                int iW2 = hs9.W(391);
                c.a(this.b, this.c, this.d, this.e, this.f, this.g, (qz0) obj, iW2);
                break;
        }
        return tx8.a;
    }
}
