package kotlinx.coroutines;

import defpackage.gm3;
import defpackage.iu3;
import defpackage.jm7;
import defpackage.rp2;
import defpackage.tx8;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements rp2 {
    static {
        new JobSupport$onJoin$1();
    }

    public JobSupport$onJoin$1() {
        super(3, c.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        Object obj4;
        tx8 tx8Var;
        c cVar = (c) obj;
        jm7 jm7Var = (jm7) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.a;
        cVar.getClass();
        do {
            obj4 = c.a.get(cVar);
            boolean z = obj4 instanceof gm3;
            tx8Var = tx8.a;
            if (!z) {
                jm7Var.e(tx8Var);
                return tx8Var;
            }
        } while (cVar.e0(obj4) < 0);
        jm7Var.c(a.i(cVar, true, new iu3(cVar, jm7Var, 1)));
        return tx8Var;
    }
}
