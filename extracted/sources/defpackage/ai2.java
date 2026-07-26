package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ai2 implements yz1 {
    public final Context a;
    public final zh2 b;
    public final cv c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public ct2 h;

    public ai2(Context context, zh2 zh2Var) {
        wu8.l(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = zh2Var;
        this.c = bi2.d;
    }

    @Override // defpackage.yz1
    public final void a(ct2 ct2Var) {
        synchronized (this.d) {
            this.h = ct2Var;
        }
        c();
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new v01("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new b7(26, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final hj2 d() {
        try {
            cv cvVar = this.c;
            Context context = this.a;
            zh2 zh2Var = this.b;
            cvVar.getClass();
            Object[] objArr = {zh2Var};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            di1 di1VarA = yh2.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i = di1VarA.a;
            if (i != 0) {
                throw new RuntimeException(bl4.q(i, "fetchFonts failed (", ")"));
            }
            hj2[] hj2VarArr = (hj2[]) di1VarA.b.get(0);
            if (hj2VarArr == null || hj2VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hj2VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
