package kotlinx.coroutines.channels;

import defpackage.lh0;
import defpackage.pw6;
import defpackage.tb1;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {514}, m = "toMap")
final class ChannelsKt__DeprecatedKt$toMap$2<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {
    public Map a;
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
            Map map = this.a;
            try {
                kotlin.b.b(obj);
                while (((Boolean) obj).booleanValue()) {
                    Pair pair = (Pair) lh0Var.f();
                    map.put(pair.a, pair.b);
                    this.a = map;
                    this.b = pw6Var2;
                    this.c = lh0Var;
                    this.e = 1;
                    obj = lh0Var.d(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                pw6Var2.g(null);
                return map;
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
