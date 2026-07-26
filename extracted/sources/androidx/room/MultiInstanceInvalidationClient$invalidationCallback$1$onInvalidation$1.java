package androidx.room;

import defpackage.ct2;
import defpackage.e71;
import defpackage.ew;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import java.util.Arrays;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", l = {87}, m = "invokeSuspend")
final class MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 extends SuspendLambda implements qp2 {
    public Set a;
    public int b;
    public final /* synthetic */ String[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(String[] strArr, ct2 ct2Var, g51 g51Var) {
        super(2, g51Var);
        this.c = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(this.c, null, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = this.a;
            kotlin.b.b(obj);
            js3.p(set, "tables");
            throw null;
        }
        kotlin.b.b(obj);
        String[] strArr = this.c;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        js3.p(objArrCopyOf, "elements");
        this.a = ew.b1(objArrCopyOf);
        this.b = 1;
        throw null;
    }
}
