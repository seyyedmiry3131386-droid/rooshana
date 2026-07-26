package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class pu2 extends lx {
    public final /* synthetic */ long i;
    public final /* synthetic */ lx j;
    public final /* synthetic */ cu2 k;
    public final /* synthetic */ qu2 l;

    public pu2(long j, ou2 ou2Var, cu2 cu2Var, qu2 qu2Var) {
        this.i = j;
        this.j = ou2Var;
        this.k = cu2Var;
        this.l = qu2Var;
    }

    @Override // defpackage.lx
    public final Object a(Object[] objArr) {
        js3.p((Void[]) objArr, "params");
        try {
            long j = this.i;
            lx lxVar = this.j;
            if (j <= 0) {
                Object obj = lxVar.b.get();
                js3.m(obj);
                return (String) obj;
            }
            Object obj2 = lxVar.b.get(j, TimeUnit.MILLISECONDS);
            js3.m(obj2);
            return (String) obj2;
        } catch (InterruptedException e) {
            lw.g(e, null, null);
            return "";
        } catch (ExecutionException e2) {
            lw.g(e2, null, null);
            return "";
        } catch (TimeoutException unused) {
            return "";
        }
    }

    @Override // defpackage.lx
    public final void c(Object obj) {
        String str = (String) obj;
        js3.p(str, "adId");
        this.k.s(this.l.a, str);
    }
}
