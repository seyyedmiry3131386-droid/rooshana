package kotlinx.coroutines.channels;

import defpackage.js3;
import defpackage.lh0;
import defpackage.pw6;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "lastIndexOf")
final class ChannelsKt__DeprecatedKt$lastIndexOf$1<E> extends ContinuationImpl {
    public Ref$IntRef a;
    public Ref$IntRef b;
    public pw6 c;
    public lh0 d;
    public /* synthetic */ Object e;
    public int f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        int i = (this.f | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        pw6 pw6Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            new Ref$IntRef().a = -1;
            new Ref$IntRef();
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lh0 lh0Var = this.d;
            pw6 pw6Var2 = this.c;
            Ref$IntRef ref$IntRef = this.b;
            Ref$IntRef ref$IntRef2 = this.a;
            try {
                kotlin.b.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    if (js3.i(null, lh0Var.f())) {
                        ref$IntRef2.a = ref$IntRef.a;
                    }
                    ref$IntRef.a++;
                    this.a = ref$IntRef2;
                    this.b = ref$IntRef;
                    this.c = pw6Var2;
                    this.d = lh0Var;
                    this.f = 1;
                    obj = lh0Var.d(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                pw6Var2.g(null);
                return new Integer(ref$IntRef2.a);
            } catch (Throwable th2) {
                th = th2;
                pw6Var = pw6Var2;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            b.b(pw6Var, th);
            throw th3;
        }
    }
}
