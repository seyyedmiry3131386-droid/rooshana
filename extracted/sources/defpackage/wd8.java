package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wd8 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public wd8(Handler handler) {
        this.a = handler;
    }

    public static vd8 b() {
        vd8 vd8Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                vd8Var = arrayList.isEmpty() ? new vd8() : (vd8) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return vd8Var;
    }

    public final vd8 a(int i, Object obj) {
        vd8 vd8VarB = b();
        vd8VarB.a = this.a.obtainMessage(i, obj);
        return vd8VarB;
    }

    public final boolean c(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void d(int i) {
        vy2.j(i != 0);
        this.a.removeMessages(i);
    }

    public final boolean e(int i) {
        return this.a.sendEmptyMessage(i);
    }
}
