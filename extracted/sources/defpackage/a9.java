package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class a9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a9(p64 p64Var, Object obj, int i) {
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
            case 1:
                xy0 xy0Var = (xy0) this.b;
                xy0Var.a.f(false);
                xy0Var.b.i(false);
                break;
            default:
                ((o80) ((ExoPlayer) this.b)).b();
                break;
        }
    }
}
