package defpackage;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes.dex */
public final class yj extends c26 {
    public final /* synthetic */ int v;
    public final Animatable w;

    public /* synthetic */ yj(Animatable animatable, int i) {
        this.v = i;
        this.w = animatable;
    }

    @Override // defpackage.c26
    public final void N() {
        switch (this.v) {
            case 0:
                this.w.start();
                break;
            default:
                ((hk) this.w).start();
                break;
        }
    }

    @Override // defpackage.c26
    public final void O() {
        switch (this.v) {
            case 0:
                this.w.stop();
                break;
            default:
                ((hk) this.w).stop();
                break;
        }
    }
}
