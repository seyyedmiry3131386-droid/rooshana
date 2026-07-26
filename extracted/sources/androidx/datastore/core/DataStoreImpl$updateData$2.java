package androidx.datastore.core;

import defpackage.aa1;
import defpackage.bo5;
import defpackage.bt2;
import defpackage.ct2;
import defpackage.e71;
import defpackage.g51;
import defpackage.hp0;
import defpackage.hx0;
import defpackage.ip0;
import defpackage.jp0;
import defpackage.o77;
import defpackage.pt2;
import defpackage.qp2;
import defpackage.t48;
import defpackage.tb1;
import defpackage.tu4;
import defpackage.tx8;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {185}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$updateData$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d c;
    public final /* synthetic */ SuspendLambda d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$updateData$2(d dVar, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = dVar;
        this.d = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DataStoreImpl$updateData$2 dataStoreImpl$updateData$2 = new DataStoreImpl$updateData$2(this.c, this.d, g51Var);
        dataStoreImpl$updateData$2.b = obj;
        return dataStoreImpl$updateData$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$updateData$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        e71 e71Var = (e71) this.b;
        hx0 hx0VarB = ct2.b();
        d dVar = this.c;
        t48 t48VarM = dVar.h.m();
        if (t48VarM instanceof aa1) {
            t48VarM = new bo5(((aa1) t48VarM).a);
        }
        tu4 tu4Var = new tu4(this.d, hx0VarB, t48VarM, e71Var.getCoroutineContext());
        o77 o77Var = dVar.l;
        Object objO = ((kotlinx.coroutines.channels.a) o77Var.c).o(tu4Var);
        if (objO instanceof hp0) {
            Throwable thA = jp0.a(objO);
            if (thA == null) {
                throw new ClosedSendChannelException("Channel was closed normally");
            }
            throw thA;
        }
        if (objO instanceof ip0) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) ((pt2) o77Var.d).b).getAndIncrement() == 0) {
            bt2.G((e71) o77Var.a, null, null, new SimpleActor$offer$2(o77Var, null), 3);
        }
        this.a = 1;
        Object objS = hx0VarB.s(this);
        return objS == coroutineSingletons ? coroutineSingletons : objS;
    }
}
