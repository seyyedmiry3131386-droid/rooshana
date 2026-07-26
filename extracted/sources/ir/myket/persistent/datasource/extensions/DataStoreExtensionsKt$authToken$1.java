package ir.myket.persistent.datasource.extensions;

import defpackage.e71;
import defpackage.eb1;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.persistent.datasource.extensions.DataStoreExtensionsKt$authToken$1", f = "DataStoreExtensions.kt", l = {18}, m = "invokeSuspend", v = 1)
final class DataStoreExtensionsKt$authToken$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ eb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreExtensionsKt$authToken$1(eb1 eb1Var, g51 g51Var) {
        super(2, g51Var);
        this.b = eb1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new DataStoreExtensionsKt$authToken$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreExtensionsKt$authToken$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            o4 o4Var = new o4(this.b.b(), 5);
            this.a = 1;
            obj = d.q(o4Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        String str = (String) obj;
        return str == null ? "" : str;
    }
}
