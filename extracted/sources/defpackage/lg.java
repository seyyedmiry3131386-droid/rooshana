package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import coil3.a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class lg implements ComponentCallbacks2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 0:
                return;
            default:
                ai0 ai0Var = (ai0) this.b;
                synchronized (ai0Var) {
                    if (((a) ((WeakReference) ai0Var.b).get()) == null) {
                        ai0Var.y();
                        break;
                    }
                }
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                break;
            default:
                onTrimMemory(80);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        dw6 dw6VarC;
        switch (this.a) {
            case 0:
                if (i >= 40) {
                    ((ng) this.b).getClass();
                    return;
                }
                return;
            default:
                ai0 ai0Var = (ai0) this.b;
                synchronized (ai0Var) {
                    try {
                        a aVar = (a) ((WeakReference) ai0Var.b).get();
                        if (aVar != null) {
                            bw6 bw6Var = aVar.a;
                            if (i >= 40) {
                                dw6 dw6VarC2 = aVar.c();
                                if (dw6VarC2 != null) {
                                    dw6VarC2.a();
                                }
                            } else if (i >= 20) {
                                ((ci) ai0Var.c).a(bw6Var.a);
                            } else if (i >= 10 && (dw6VarC = aVar.c()) != null) {
                                dw6VarC.e(dw6VarC.b() / ((long) 2));
                            }
                        } else {
                            ai0Var.y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    private final void b() {
    }

    private final void a(Configuration configuration) {
    }
}
