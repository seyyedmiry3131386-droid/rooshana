package ir.mservices.market.pika.receive.model;

import defpackage.g51;
import defpackage.jp3;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.receive.model.InstallRepositoryImpl$getReceiveInstallResult$$inlined$transform$1$1", f = "InstallRepositoryImpl.kt", l = {39}, m = "emit", v = 1)
public final class InstallRepositoryImpl$getReceiveInstallResult$$inlined$transform$1$1$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jp3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallRepositoryImpl$getReceiveInstallResult$$inlined$transform$1$1$1(jp3 jp3Var, g51 g51Var) {
        super(g51Var);
        this.c = jp3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
