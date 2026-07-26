package kotlinx.serialization.json.internal;

import defpackage.g51;
import defpackage.kv3;
import defpackage.pc1;
import defpackage.rp2;
import defpackage.t0;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements rp2 {
    public int b;
    public /* synthetic */ pc1 c;
    public final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(b bVar, g51 g51Var) {
        super(3, g51Var);
        this.d = bVar;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.d, (g51) obj3);
        jsonTreeReader$readDeepRecursive$1.c = (pc1) obj;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar = this.d;
        t0 t0Var = bVar.a;
        pc1 pc1Var = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            byte bZ = t0Var.z();
            if (bZ == 1) {
                return bVar.d(true);
            }
            if (bZ == 0) {
                return bVar.d(false);
            }
            if (bZ != 6) {
                if (bZ == 8) {
                    return bVar.c();
                }
                t0.t(t0Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.c = null;
            this.b = 1;
            obj = b.a(bVar, pc1Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return (kv3) obj;
    }
}
