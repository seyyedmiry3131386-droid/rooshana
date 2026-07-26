package defpackage;

import android.os.Process;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class fx implements Callable {
    public final /* synthetic */ int a;
    public Object[] b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fx(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                lx lxVar = (lx) obj;
                lxVar.e.set(true);
                Process.setThreadPriority(10);
                Object objA = lxVar.a(this.b);
                lxVar.d(objA);
                return objA;
            case 1:
                mx mxVar = (mx) obj;
                mxVar.e.set(true);
                Process.setThreadPriority(10);
                Object objA2 = mxVar.a(this.b);
                mxVar.e(objA2);
                return objA2;
            default:
                vl5 vl5Var = (vl5) obj;
                vl5Var.f.set(true);
                Process.setThreadPriority(10);
                Object objB = vl5Var.b(this.b);
                vl5.g.obtainMessage(1, new ul5(vl5Var, objB)).sendToTarget();
                return objB;
        }
    }
}
