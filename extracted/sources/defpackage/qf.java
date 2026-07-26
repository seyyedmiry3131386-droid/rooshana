package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.core.c;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qf implements yp1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qf(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.yp1
    public final void a() throws Exception {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((rf) obj);
                return;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((sf) obj);
                return;
            case 2:
                i40 i40Var = (i40) obj2;
                xy0 xy0Var = (xy0) obj;
                if (i40Var.a != null) {
                    xy0Var.b.h();
                    return;
                } else {
                    if (i40Var.b == null) {
                        throw new IllegalStateException("Unreachable");
                    }
                    xy0Var.a.e();
                    return;
                }
            case 3:
                ((c) obj2).a.k((jn3) obj);
                return;
            case 4:
                ((c44) obj2).c.k(obj);
                return;
            case 5:
                ((g64) obj2).D().f((wx0) obj);
                return;
            case 6:
                ((cz0) obj2).h();
                ((lk5) obj).e = null;
                return;
            case 7:
                wb5 wb5Var = (wb5) obj2;
                rj6 rj6Var = (rj6) wb5Var.getValue();
                if (rj6Var != null) {
                    qj6 qj6Var = new qj6(rj6Var);
                    ab5 ab5Var = (ab5) obj;
                    if (ab5Var != null) {
                        ab5Var.b(qj6Var);
                    }
                    wb5Var.setValue(null);
                    return;
                }
                return;
            case 8:
                ((jr8) obj2).j.remove((jr8) obj);
                return;
            case 9:
                jr8 jr8Var = (jr8) obj2;
                yq8 yq8Var = (yq8) ((s08) ((zq8) obj).b).getValue();
                if (yq8Var != null) {
                    jr8Var.i.remove(yq8Var.a);
                    return;
                }
                return;
            case 10:
                ((jr8) obj2).i.remove((fr8) obj);
                return;
            default:
                rf9 rf9Var = (rf9) obj2;
                View view = (View) obj;
                int i2 = rf9Var.u - 1;
                rf9Var.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = q69.a;
                    h69.m(view, null);
                    q69.t(view, null);
                    view.removeOnAttachStateChangeListener(rf9Var.v);
                    return;
                }
                return;
        }
    }
}
