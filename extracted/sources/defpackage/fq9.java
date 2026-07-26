package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.nearby.zzhk;
import io.sentry.android.core.t0;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fq9 {
    public final ExecutorService a;
    public final fw7 b;
    public volatile boolean c;
    public final fw7 d;
    public final fw7 e;

    public fq9() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(6, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new fw7(0);
        this.c = false;
        this.d = new fw7(0);
        this.e = new fw7(0);
    }

    public static /* bridge */ /* synthetic */ void a(ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream, boolean z, long j) {
        try {
            try {
                autoCloseOutputStream.write(z ? 1 : 0);
            } catch (IOException e) {
                t0.n("NearbyConnections", String.format("Unable to deliver status for Payload %d", Long.valueOf(j)), e);
            }
        } finally {
            yq2.O(autoCloseOutputStream);
        }
    }

    public final synchronized void b(long j) {
        fw7 fw7Var = this.b;
        Long lValueOf = Long.valueOf(j);
        yq2.O((Closeable) fw7Var.get(lValueOf));
        this.b.remove(lValueOf);
        yq2.O((Closeable) this.d.get(lValueOf));
        this.d.remove(lValueOf);
        zzhk zzhkVar = (zzhk) this.e.remove(lValueOf);
        if (zzhkVar != null) {
            yq2.N(zzhkVar.d);
            yq2.N(zzhkVar.g);
        }
    }

    public final synchronized void c() {
        fw7 fw7Var;
        fw7 fw7Var2;
        try {
            this.c = true;
            this.a.shutdownNow();
            int i = 0;
            int i2 = 0;
            while (true) {
                fw7Var = this.b;
                if (i2 >= fw7Var.c) {
                    break;
                }
                yq2.O((Closeable) fw7Var.j(i2));
                i2++;
            }
            fw7Var.clear();
            int i3 = 0;
            while (true) {
                fw7Var2 = this.d;
                if (i3 >= fw7Var2.c) {
                    break;
                }
                yq2.O((Closeable) fw7Var2.j(i3));
                i3++;
            }
            fw7Var2.clear();
            while (true) {
                fw7 fw7Var3 = this.e;
                if (i < fw7Var3.c) {
                    zzhk zzhkVar = (zzhk) fw7Var3.j(i);
                    yq2.N(zzhkVar.d);
                    yq2.N(zzhkVar.g);
                    i++;
                } else {
                    fw7Var3.clear();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
