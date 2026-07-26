package ir.myket.player.viewmodel;

import defpackage.g51;
import defpackage.js3;
import defpackage.ml9;
import defpackage.pj3;
import defpackage.pk7;
import defpackage.rp2;
import defpackage.sa7;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.OtherEpisodesViewModel$episodes$1", f = "OtherEpisodesViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class OtherEpisodesViewModel$episodes$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ pj3 a;
    public /* synthetic */ pk7 b;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        OtherEpisodesViewModel$episodes$1 otherEpisodesViewModel$episodes$1 = new OtherEpisodesViewModel$episodes$1(3, (g51) obj3);
        otherEpisodesViewModel$episodes$1.a = (pj3) obj;
        otherEpisodesViewModel$episodes$1.b = (pk7) obj2;
        return otherEpisodesViewModel$episodes$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pj3 pj3Var = this.a;
        pk7 pk7Var = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        String str = pk7Var.a;
        js3.p(pj3Var, "<this>");
        js3.p(str, "seasonId");
        pk7 pk7VarF = sa7.f(pj3Var, str);
        Iterable iterable = pk7VarF != null ? pk7VarF.c : null;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        return ml9.z(iterable);
    }
}
