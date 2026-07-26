package ir.myket.player.viewmodel;

import defpackage.b32;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.m88;
import defpackage.pj3;
import defpackage.pk7;
import defpackage.rp2;
import defpackage.sa7;
import defpackage.tb1;
import defpackage.tx8;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.OtherEpisodesViewModel$currentSeason$1", f = "OtherEpisodesViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class OtherEpisodesViewModel$currentSeason$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ pj3 a;
    public /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherEpisodesViewModel$currentSeason$1(String str, g51 g51Var) {
        super(3, g51Var);
        this.c = str;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        OtherEpisodesViewModel$currentSeason$1 otherEpisodesViewModel$currentSeason$1 = new OtherEpisodesViewModel$currentSeason$1(this.c, (g51) obj3);
        otherEpisodesViewModel$currentSeason$1.a = (pj3) obj;
        otherEpisodesViewModel$currentSeason$1.b = (String) obj2;
        return otherEpisodesViewModel$currentSeason$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        pj3 pj3Var = this.a;
        String str = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        if (!f88.n0(str)) {
            return sa7.f(pj3Var, str);
        }
        js3.p(pj3Var, "<this>");
        String str2 = this.c;
        js3.p(str2, "playId");
        Iterator<E> it = pj3Var.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            pj3 pj3Var2 = ((pk7) next).c;
            int size = pj3Var2.size();
            for (int i = 0; i < size; i++) {
                if (m88.T(((b32) pj3Var2.get(i)).b, str2, true)) {
                    break loop0;
                }
            }
        }
        return (pk7) next;
    }
}
