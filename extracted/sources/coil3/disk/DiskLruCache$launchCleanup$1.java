package coil3.disk;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rf0;
import defpackage.sc0;
import defpackage.tb1;
import defpackage.tx8;
import java.io.IOException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$launchCleanup$1(a aVar, g51 g51Var) {
        super(2, g51Var);
        this.a = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new DiskLruCache$launchCleanup$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DiskLruCache$launchCleanup$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        a aVar = this.a;
        synchronized (aVar.h) {
            if (!aVar.m || aVar.n) {
                return tx8.a;
            }
            try {
                aVar.K();
            } catch (IOException unused) {
                aVar.o = true;
            }
            try {
                if (aVar.j >= 2000) {
                    aVar.R();
                }
            } catch (IOException unused2) {
                aVar.p = true;
                aVar.k = rf0.i(new sc0());
            }
            return tx8.a;
        }
    }
}
