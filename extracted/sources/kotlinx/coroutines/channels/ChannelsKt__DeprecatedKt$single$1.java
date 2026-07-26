package kotlinx.coroutines.channels;

import defpackage.lh0;
import defpackage.pw6;
import defpackage.tb1;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {166, 169}, m = "single")
final class ChannelsKt__DeprecatedKt$single$1<E> extends ContinuationImpl {
    public pw6 a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        pw6 pw6Var;
        this.c = obj;
        int i = (this.d | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.d = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        pw6 pw6Var2 = null;
        if (i != 0) {
            if (i == 1) {
                lh0 lh0Var = (lh0) this.b;
                pw6 pw6Var3 = this.a;
                try {
                    kotlin.b.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        throw new NoSuchElementException("ReceiveChannel is empty.");
                    }
                    Object objF = lh0Var.f();
                    this.a = pw6Var3;
                    this.b = objF;
                    this.d = 2;
                    Object objD = lh0Var.d(this);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = objF;
                    obj = objD;
                    pw6Var = pw6Var3;
                } catch (Throwable th) {
                    th = th;
                    pw6Var2 = pw6Var3;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.b;
                pw6Var = this.a;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    pw6Var2 = pw6Var;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                throw new IllegalArgumentException("ReceiveChannel has more than one element.");
            }
            pw6Var.g(null);
            return obj2;
        }
        kotlin.b.b(obj);
        try {
            throw null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            throw th;
        } catch (Throwable th4) {
            b.b(pw6Var2, th);
            throw th4;
        }
    }
}
