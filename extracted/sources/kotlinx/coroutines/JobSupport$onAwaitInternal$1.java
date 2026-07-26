package kotlinx.coroutines;

import defpackage.at2;
import defpackage.gm3;
import defpackage.iu3;
import defpackage.jm7;
import defpackage.rp2;
import defpackage.rx0;
import defpackage.tx8;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class JobSupport$onAwaitInternal$1 extends FunctionReferenceImpl implements rp2 {
    static {
        new JobSupport$onAwaitInternal$1();
    }

    public JobSupport$onAwaitInternal$1() {
        super(3, c.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        jm7 jm7Var = (jm7) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.a;
        cVar.getClass();
        while (true) {
            Object objN0 = c.a.get(cVar);
            if (!(objN0 instanceof gm3)) {
                if (!(objN0 instanceof rx0)) {
                    objN0 = at2.n0(objN0);
                }
                jm7Var.e(objN0);
            } else if (cVar.e0(objN0) >= 0) {
                jm7Var.c(a.i(cVar, true, new iu3(cVar, jm7Var, 0)));
                break;
            }
        }
        return tx8.a;
    }
}
