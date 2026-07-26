package io.sentry.android.core;

import android.content.Context;
import io.sentry.b6;
import io.sentry.c6;
import io.sentry.g5;
import io.sentry.x4;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements io.sentry.b0 {
    public final Context a;
    public final SentryAndroidOptions b;
    public final j0 c;
    public final x4 d;
    public final io.sentry.cache.f e;
    public final List f = Collections.singletonList(new d0(this));

    public e0(Context context, j0 j0Var, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = sentryAndroidOptions;
        this.c = j0Var;
        this.e = sentryAndroidOptions.findPersistingScopeObserver();
        this.d = new x4(new io.sentry.t(sentryAndroidOptions, 2));
    }

    public final Object a(b6 b6Var, String str, Class cls) {
        io.sentry.cache.f fVar = this.e;
        if (fVar == null) {
            return null;
        }
        return fVar.b(b6Var, str, cls);
    }

    @Override // io.sentry.b0
    public final c6 b(c6 c6Var, io.sentry.h0 h0Var) {
        return c6Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:311|(1:313)(4:315|(1:317)|427|428)|314|487|318|(6:320|506|321|500|322|323)(2:336|337)|338|(1:340)|(0)(2:347|(2:351|421)(4:352|(1:354)(6:356|(4:359|(1:567)(4:565|362|(5:364|(2:365|(2:367|(1:571)(1:370))(2:572|371))|372|(2:374|570)(2:375|569)|376)|568)|566|357)|564|377|(0)(1:380)|(1:382)(7:383|(10:386|(3:388|(6:390|(1:392)(1:393)|394|(1:396)|397|559)(1:560)|398)|558|399|(4:402|(2:404|562)(1:563)|405|400)|561|406|(2:408|556)(1:557)|409|384)|555|410|(1:412)(1:413)|414|(2:416|(1:418)(1:419))(1:420)))|355|(0)(0)))|428) */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0701, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0702, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    @Override // io.sentry.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.w4 d(io.sentry.w4 r39, io.sentry.h0 r40) {
        /*
            Method dump skipped, instruction units count: 2905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.e0.d(io.sentry.w4, io.sentry.h0):io.sentry.w4");
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, io.sentry.h0 h0Var) {
        return d0Var;
    }

    @Override // io.sentry.b0
    public final g5 k(g5 g5Var) {
        return g5Var;
    }
}
