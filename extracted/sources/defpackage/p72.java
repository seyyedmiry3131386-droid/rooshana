package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.a;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class p72 extends a {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public p72(WindowLayoutComponent windowLayoutComponent, ql4 ql4Var) {
        super(windowLayoutComponent, ql4Var);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.extensions.a, defpackage.o72, defpackage.ae9
    public final void a(o31 o31Var) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(o31Var);
            if (context == null) {
                return;
            }
            da5 da5Var = (da5) linkedHashMap.get(context);
            if (da5Var == null) {
                return;
            }
            ReentrantLock reentrantLock2 = da5Var.b;
            reentrantLock2.lock();
            try {
                da5Var.d.remove(o31Var);
                reentrantLock2.unlock();
                linkedHashMap2.remove(o31Var);
                if (da5Var.d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(da5Var);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.adapter.extensions.a, defpackage.o72, defpackage.ae9
    public final void b(Context context, Executor executor, o31 o31Var) {
        LinkedHashMap linkedHashMap = this.h;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            da5 da5Var = (da5) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (da5Var != null) {
                da5Var.a(o31Var);
                linkedHashMap2.put(o31Var, context);
            } else {
                da5 da5Var2 = new da5(context);
                linkedHashMap.put(context, da5Var2);
                linkedHashMap2.put(o31Var, context);
                da5Var2.a(o31Var);
                this.a.addWindowLayoutInfoListener(context, da5Var2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
