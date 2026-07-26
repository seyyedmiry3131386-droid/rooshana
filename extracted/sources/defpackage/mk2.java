package defpackage;

import android.os.Looper;
import androidx.fragment.app.d;

/* JADX INFO: loaded from: classes.dex */
public final class mk2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ mk2(int i, d dVar) {
        this.a = i;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                if (dVar.M != null && dVar.A().o) {
                    if (dVar.w == null) {
                        dVar.A().o = false;
                    } else if (Looper.myLooper() == dVar.w.u.getLooper()) {
                        dVar.v(true);
                    } else {
                        dVar.w.u.postAtFrontOfQueue(new mk2(1, dVar));
                    }
                    break;
                }
                break;
            default:
                this.b.v(false);
                break;
        }
    }
}
