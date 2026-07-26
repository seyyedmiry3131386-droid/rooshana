package defpackage;

import androidx.media3.ui.AspectRatioFrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class jw implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jw(int i, Object obj, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                this.b = false;
                int i2 = AspectRatioFrameLayout.d;
                ((AspectRatioFrameLayout) obj).getClass();
                break;
            case 1:
                boolean z = this.b;
                i29.a();
                tx7 tx7Var = (tx7) ((d20) obj).b;
                boolean z2 = tx7Var.a;
                tx7Var.a = z;
                if (z2 != z) {
                    tx7Var.b.a(z);
                }
                break;
            default:
                ((vx7) obj).b.a(this.b);
                break;
        }
    }

    public jw(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.a = 0;
        this.c = aspectRatioFrameLayout;
    }
}
