package defpackage;

import android.content.Context;
import androidx.compose.foundation.lazy.b;
import androidx.compose.foundation.lazy.staggeredgrid.a;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.myket.network.server.c;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sy0 implements qp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ sy0(int i) {
        this.a = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        int i2 = 1;
        switch (i) {
            case 0:
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xq2.g(null, 0.0f, 0.0f, null, 0L, qz0Var, 0);
                } else {
                    qz0Var.U();
                }
                return tx8Var;
            case 1:
                lf7 lf7Var = (lf7) obj;
                js3.p(lf7Var, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new k21((Context) lf7Var.b(g27.a(Context.class), null, null));
            case 2:
                lf7 lf7Var2 = (lf7) obj;
                js3.p(lf7Var2, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new qu2((Context) lf7Var2.b(g27.a(Context.class), null, null));
            case 3:
                js3.p((lf7) obj, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new fw4();
            case 4:
                w61 w61Var = (w61) obj;
                u61 u61Var = (u61) obj2;
                js3.p(w61Var, "acc");
                js3.p(u61Var, "element");
                w61 w61VarP = w61Var.P(u61Var.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
                if (w61VarP == emptyCoroutineContext) {
                    return u61Var;
                }
                eq eqVar = eq.u;
                i51 i51Var = (i51) w61VarP.r0(eqVar);
                if (i51Var == null) {
                    combinedContext = new CombinedContext(u61Var, w61VarP);
                } else {
                    w61 w61VarP2 = w61VarP.P(eqVar);
                    if (w61VarP2 == emptyCoroutineContext) {
                        return new CombinedContext(i51Var, u61Var);
                    }
                    combinedContext = new CombinedContext(i51Var, new CombinedContext(u61Var, w61VarP2));
                }
                return combinedContext;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 6:
                return ((w61) obj).l0((u61) obj2);
            case 7:
                return ((w61) obj).l0((u61) obj2);
            case 8:
                tu4 tu4Var = (tu4) obj;
                Throwable cancellationException = (Throwable) obj2;
                js3.p(tu4Var, "msg");
                hx0 hx0Var = tu4Var.b;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                hx0Var.V(new rx0(cancellationException, false));
                return tx8Var;
            case 9:
                s30 s30Var = (s30) obj;
                s30 s30Var2 = (s30) obj2;
                if (NearbyRepository.SERVICE_ID.equals(s30Var.a.n)) {
                    i2 = 2;
                } else if (NearbyRepository.SERVICE_ID.equals(s30Var2.a.n)) {
                    i2 = -2;
                } else {
                    long j = s30Var.a.b;
                    long j2 = s30Var2.a.b;
                    if (j <= j2) {
                        i2 = j < j2 ? -1 : 0;
                    }
                }
                return Integer.valueOf(i2);
            case 10:
                return Boolean.valueOf(js3.i(obj, obj2));
            case 11:
                ((Integer) obj).getClass();
                kf0 kf0Var = (kf0) obj2;
                js3.p(kf0Var, "item");
                return kf0Var.a();
            case 12:
                js3.p((lf7) obj, "$this$single");
                js3.p((b26) obj2, "it");
                return new vo();
            case 13:
                b bVar = (b) obj2;
                return br9.C(Integer.valueOf(bVar.e.q()), Integer.valueOf(bVar.e.r()));
            case 14:
                Map mapD = ((c44) obj2).d();
                if (mapD.isEmpty()) {
                    return null;
                }
                return mapD;
            case 15:
                pa2 pa2Var = ((a) obj2).c;
                return br9.C((int[]) pa2Var.c, (int[]) pa2Var.b);
            case 16:
                lf7 lf7Var3 = (lf7) obj;
                Object objA = ((k87) lf7Var3.b(t61.f(lf7Var3, "$this$single", (b26) obj2, "<unused var>", k87.class), null, null)).a(z75.class);
                js3.o(objA, "create(...)");
                return (z75) objA;
            case 17:
                lf7 lf7Var4 = (lf7) obj;
                js3.p(lf7Var4, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new ws0((uk7) lf7Var4.b(g27.a(uk7.class), null, null));
            case 18:
                lf7 lf7Var5 = (lf7) obj;
                js3.p(lf7Var5, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new sr2((m85) lf7Var5.b(g27.a(m85.class), null, null));
            case 19:
                lf7 lf7Var6 = (lf7) obj;
                js3.p(lf7Var6, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new zr2();
            case 20:
                lf7 lf7Var7 = (lf7) obj;
                js3.p(lf7Var7, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new as2((uk7) lf7Var7.b(g27.a(uk7.class), null, null));
            case 21:
                lf7 lf7Var8 = (lf7) obj;
                js3.p(lf7Var8, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new bs2((d85) lf7Var8.b(g27.a(d85.class), null, null));
            case 22:
                lf7 lf7Var9 = (lf7) obj;
                js3.p(lf7Var9, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new cs2();
            case 23:
                lf7 lf7Var10 = (lf7) obj;
                js3.p(lf7Var10, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new ds2((m85) lf7Var10.b(g27.a(m85.class), null, null));
            case 24:
                js3.p((lf7) obj, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new qk7();
            case 25:
                lf7 lf7Var11 = (lf7) obj;
                js3.p(lf7Var11, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new fs2((uk7) lf7Var11.b(g27.a(uk7.class), null, null));
            case 26:
                lf7 lf7Var12 = (lf7) obj;
                js3.p(lf7Var12, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new lo3((m85) lf7Var12.b(g27.a(m85.class), null, null));
            case 27:
                lf7 lf7Var13 = (lf7) obj;
                js3.p(lf7Var13, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new no6((uk7) lf7Var13.b(g27.a(uk7.class), null, null));
            case 28:
                lf7 lf7Var14 = (lf7) obj;
                js3.p(lf7Var14, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new y15();
            default:
                lf7 lf7Var15 = (lf7) obj;
                js3.p(lf7Var15, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new e85((Context) lf7Var15.b(g27.a(Context.class), null, null), (z75) lf7Var15.b(g27.a(z75.class), null, null), (c) lf7Var15.b(g27.a(c.class), null, null));
        }
    }

    public /* synthetic */ sy0(rl3 rl3Var) {
        this.a = 16;
    }
}
