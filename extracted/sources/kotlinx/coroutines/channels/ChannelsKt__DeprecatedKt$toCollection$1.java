package kotlinx.coroutines.channels;

import defpackage.lh0;
import defpackage.pw6;
import defpackage.tb1;
import java.util.Collection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "toCollection")
final class ChannelsKt__DeprecatedKt$toCollection$1<E, C extends Collection<? super E>> extends ContinuationImpl {
    public Collection a;
    public pw6 b;
    public lh0 c;
    public /* synthetic */ Object d;
    public int e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        int i = (this.e | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.e = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        pw6 pw6Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lh0 lh0Var = this.c;
            pw6 pw6Var2 = this.b;
            Collection collection = this.a;
            try {
                kotlin.b.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    collection.add(lh0Var.f());
                    this.a = collection;
                    this.b = pw6Var2;
                    this.c = lh0Var;
                    this.e = 1;
                    obj = lh0Var.d(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                pw6Var2.g(null);
                return collection;
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
