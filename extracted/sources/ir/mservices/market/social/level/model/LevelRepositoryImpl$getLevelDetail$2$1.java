package ir.mservices.market.social.level.model;

import defpackage.dp2;
import defpackage.g51;
import defpackage.hh2;
import defpackage.n99;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.level.model.LevelRepositoryImpl$getLevelDetail$2$1", f = "LevelRepositoryImpl.kt", l = {31, 32}, m = "invokeSuspend", v = 1)
final class LevelRepositoryImpl$getLevelDetail$2$1 extends SuspendLambda implements dp2 {
    public n99 a;
    public int b;
    public final /* synthetic */ hh2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelRepositoryImpl$getLevelDetail$2$1(hh2 hh2Var, String str, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.c = hh2Var;
        this.d = str;
        this.e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new LevelRepositoryImpl$getLevelDetail$2$1(this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((LevelRepositoryImpl$getLevelDetail$2$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.level.model.LevelRepositoryImpl$getLevelDetail$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
