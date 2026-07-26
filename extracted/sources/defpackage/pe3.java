package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import retrofit2.a;

/* JADX INFO: loaded from: classes4.dex */
public final class pe3 extends qe3 {
    public final fl0 d;
    public final boolean e;

    public pe3(k57 k57Var, cl0 cl0Var, l51 l51Var, fl0 fl0Var, boolean z) {
        super(k57Var, cl0Var, l51Var);
        this.d = fl0Var;
        this.e = z;
    }

    @Override // defpackage.qe3
    public final Object a(fs5 fs5Var, Object[] objArr) {
        dl0 dl0Var = (dl0) this.d.n(fs5Var);
        g51 g51Var = (g51) objArr[objArr.length - 1];
        try {
            if (!this.e) {
                return a.a(dl0Var, g51Var);
            }
            js3.n(dl0Var, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            return a.b(dl0Var, g51Var);
        } catch (LinkageError e) {
            throw e;
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (VirtualMachineError e3) {
            throw e3;
        } catch (Throwable th) {
            a.c(th, g51Var);
            return CoroutineSingletons.a;
        }
    }
}
