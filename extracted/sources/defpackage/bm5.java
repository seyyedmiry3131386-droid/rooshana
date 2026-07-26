package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class bm5 {
    public static final ex d;
    public final int a;
    public final int b;
    public final ThreadPoolExecutor c;

    static {
        eh5.a("NeneInstanceThreadPool");
        d = new ex(3);
    }

    public bm5(int i, int i2) {
        this.b = i;
        this.a = i2;
        vl5.g.getLooper();
        zl5.a.getLooper();
        int i3 = i * i2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i3, i3, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), d);
        this.c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }
}
