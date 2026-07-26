package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class b9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b9(l64 l64Var, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                gb6 gb6Var = (ExoPlayer) ((wb5) this.b).getValue();
                if (gb6Var != null) {
                    ((o80) gb6Var).b();
                }
                break;
            default:
                ((o80) ((ExoPlayer) this.b)).b();
                break;
        }
    }
}
