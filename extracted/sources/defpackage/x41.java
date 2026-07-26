package defpackage;

import android.content.Context;
import android.os.Looper;
import io.sentry.u1;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class x41 implements nt2 {
    public final Object a;
    public volatile Object b;

    public /* synthetic */ x41(Object obj) {
        this.a = obj;
    }

    public yo1 a() {
        if (((yo1) this.b) == null) {
            synchronized (this) {
                try {
                    if (((yo1) this.b) == null) {
                        File cacheDir = ((vr3) ((r79) this.a).b).a.getCacheDir();
                        op1 op1Var = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            op1Var = new op1();
                            op1Var.d = new do3(24);
                            op1Var.c = file;
                            op1Var.a = 262144000L;
                            op1Var.b = new rn6(2);
                        }
                        this.b = op1Var;
                    }
                    if (((yo1) this.b) == null) {
                        this.b = new gv(14);
                    }
                } finally {
                }
            }
        }
        return (yo1) this.b;
    }

    public Object b(Context context) {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = ((u1) this.a).f(context);
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public void c(z27 z27Var) {
        ((sw2) this.a).execute(new zh9(this, z27Var, 0));
    }

    @Override // defpackage.nt2
    public Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Object obj = ((nt2) this.a).get();
                        ok4.p(obj, "Argument must not be null");
                        this.b = obj;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public x41(Looper looper, Object obj, String str) {
        this.a = new sw2(looper);
        rq4.o(obj, "Listener must not be null");
        rq4.k(str);
        this.b = new o94(obj, str);
    }

    public x41(u1 u1Var) {
        this.b = null;
        this.a = u1Var;
    }

    public x41() {
        this.a = new CopyOnWriteArraySet();
    }
}
