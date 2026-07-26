package kotlinx.coroutines.sync;

import defpackage.fc5;
import defpackage.jm7;
import defpackage.js3;
import defpackage.rp2;
import defpackage.tv8;
import defpackage.tx8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements rp2 {
    static {
        new MutexImpl$onLock$1();
    }

    public MutexImpl$onLock$1() {
        super(3, a.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        int andDecrement;
        a aVar = (a) obj;
        jm7 jm7Var = (jm7) obj2;
        tx8 tx8Var = tx8.a;
        if (obj3 != null) {
            while (true) {
                if (!aVar.f()) {
                    break;
                }
                Object obj4 = a.h.get(aVar);
                if (obj4 != tv8.d) {
                    if (obj4 == obj3) {
                        jm7Var.e(tv8.e);
                        return tx8Var;
                    }
                }
            }
        } else {
            aVar.getClass();
        }
        js3.n(jm7Var, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
        fc5 fc5Var = new fc5(aVar, jm7Var, obj3);
        do {
            aVar.getClass();
            do {
                andDecrement = b.g.getAndDecrement(aVar);
            } while (andDecrement > aVar.a);
            if (andDecrement > 0) {
                fc5Var.e(tx8Var);
                return tx8Var;
            }
        } while (!aVar.c(fc5Var));
        return tx8Var;
    }
}
