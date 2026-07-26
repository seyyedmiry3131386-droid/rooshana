package ir.myket.common.utils;

import android.content.Context;
import defpackage.e71;
import defpackage.eb1;
import defpackage.g51;
import defpackage.m88;
import defpackage.pb5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w0;
import defpackage.xe2;
import defpackage.z0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.common.utils.LocaleManager$getLanguage$1", f = "LocaleManager.kt", l = {54}, m = "invokeSuspend", v = 1)
final class LocaleManager$getLanguage$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleManager$getLanguage$1(Context context, g51 g51Var) {
        super(2, g51Var);
        this.b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new LocaleManager$getLanguage$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocaleManager$getLanguage$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            a.a.getClass();
            xe2 xe2VarB = ((eb1) a.d.a(this.b, a.b[0])).b();
            this.a = 1;
            obj = d.q(xe2VarB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        String str = (String) ((pb5) obj).c(a.c);
        Language language = Language.a;
        z0 z0Var = (z0) Language.c;
        z0Var.getClass();
        w0 w0Var = new w0(0, z0Var);
        while (true) {
            if (!w0Var.hasNext()) {
                next = null;
                break;
            }
            next = w0Var.next();
            if (m88.T(((Enum) next).name(), str, true)) {
                break;
            }
        }
        Enum r1 = (Enum) next;
        return r1 == null ? language : r1;
    }
}
