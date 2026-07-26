package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class aw7 implements ae9 {
    public static volatile aw7 c;
    public static final ReentrantLock d = new ReentrantLock();
    public final c72 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public aw7(yv7 yv7Var) {
        this.a = yv7Var;
        if (yv7Var != null) {
            yv7Var.d(new c35(12, this));
        }
    }

    @Override // defpackage.ae9
    public final void a(o31 o31Var) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                js3.o(it, "iterator(...)");
                while (it.hasNext()) {
                    zv7 zv7Var = (zv7) it.next();
                    if (zv7Var.c == o31Var) {
                        arrayList.add(zv7Var);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity2 = ((zv7) it2.next()).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((zv7) it3.next()).a.equals(activity2)) {
                                break;
                            }
                        }
                    }
                    c72 c72Var = this.a;
                    if (c72Var != null) {
                        ((yv7) c72Var).b(activity2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ae9
    public final void b(Context context, Executor executor, o31 o31Var) {
        Object next;
        WindowManager.LayoutParams attributes;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity2 = context instanceof Activity ? (Activity) context : null;
        if (activity2 == null) {
            o31Var.accept(new xf9(EmptyList.a));
            return;
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            c72 c72Var = this.a;
            if (c72Var == null) {
                o31Var.accept(new xf9(EmptyList.a));
                return;
            }
            boolean z = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            if ((copyOnWriteArrayList != null) == true && copyOnWriteArrayList.isEmpty()) {
                z = false;
            } else {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (((zv7) it.next()).a.equals(activity2)) {
                        break;
                    }
                }
                z = false;
            }
            zv7 zv7Var = new zv7(activity2, executor, o31Var);
            copyOnWriteArrayList.add(zv7Var);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (activity2.equals(((zv7) next).a)) {
                            break;
                        }
                    }
                }
                zv7 zv7Var2 = (zv7) next;
                xf9 xf9Var = zv7Var2 != null ? zv7Var2.d : null;
                if (xf9Var != null) {
                    zv7Var.d = xf9Var;
                    zv7Var.b.execute(new lo4(zv7Var, xf9Var, 25));
                }
            } else {
                yv7 yv7Var = (yv7) c72Var;
                Window window = activity2.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    yv7Var.c(iBinder, activity2);
                } else {
                    activity2.getWindow().getDecorView().addOnAttachStateChangeListener(new jl2(yv7Var, activity2));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
