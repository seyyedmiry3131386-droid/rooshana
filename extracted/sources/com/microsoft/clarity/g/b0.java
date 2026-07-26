package com.microsoft.clarity.g;

import defpackage.bp2;
import defpackage.dp2;
import defpackage.ii;
import defpackage.js3;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {
    public final ThreadPoolExecutor a = new ThreadPoolExecutor(3, 3, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    public static /* synthetic */ void a(b0 b0Var, bp2 bp2Var, dp2 dp2Var, int i) {
        if ((i & 2) != 0) {
            dp2Var = null;
        }
        b0Var.a(bp2Var, dp2Var, null);
    }

    public static final void b(bp2 bp2Var, dp2 dp2Var, bp2 bp2Var2) {
        js3.p(bp2Var, "$logic");
        com.microsoft.clarity.q.g.a(bp2Var, dp2Var, bp2Var2, 2);
    }

    public final void a(bp2 bp2Var, dp2 dp2Var, bp2 bp2Var2) {
        js3.p(bp2Var, "logic");
        this.a.execute(new ii(bp2Var, dp2Var, bp2Var2, 20));
    }
}
