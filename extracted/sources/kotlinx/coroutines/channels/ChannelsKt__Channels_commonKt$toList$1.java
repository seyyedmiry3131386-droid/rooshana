package kotlinx.coroutines.channels;

import defpackage.br9;
import defpackage.lh0;
import defpackage.pw6;
import defpackage.tb1;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", l = {209}, m = "toList")
final class ChannelsKt__Channels_commonKt$toList$1<E> extends ContinuationImpl {
    public List a;
    public List b;
    public pw6 c;
    public lh0 d;
    public /* synthetic */ Object e;
    public int f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        int i = (this.f | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        pw6 pw6Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            br9.s();
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
            List list = this.b;
            List list2 = this.a;
            try {
                kotlin.b.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    list.add(lh0Var.f());
                    this.a = list2;
                    this.b = list;
                    this.c = pw6Var2;
                    this.d = lh0Var;
                    this.f = 1;
                    obj = lh0Var.d(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                pw6Var2.g(null);
                return br9.q(list2);
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
