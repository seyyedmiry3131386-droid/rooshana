package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.b;
import defpackage.dp2;
import defpackage.f67;
import defpackage.li1;
import defpackage.pl0;
import defpackage.t61;
import defpackage.tx8;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static pl0 a(final li1 li1Var) {
        final b bVar = new b();
        bVar.c = new f67();
        pl0 pl0Var = new pl0(bVar);
        bVar.b = pl0Var;
        bVar.a = t61.class;
        try {
            li1Var.s0(new dp2() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) throws Throwable {
                    Throwable th = (Throwable) obj;
                    b bVar2 = bVar;
                    if (th == null) {
                        Object objF = li1Var.F();
                        bVar2.d = true;
                        pl0 pl0Var2 = bVar2.b;
                        if (pl0Var2 != null && pl0Var2.b.j(objF)) {
                            bVar2.a = null;
                            bVar2.b = null;
                            bVar2.c = null;
                        }
                    } else if (th instanceof CancellationException) {
                        bVar2.d = true;
                        pl0 pl0Var3 = bVar2.b;
                        if (pl0Var3 != null && pl0Var3.b.cancel(true)) {
                            bVar2.a = null;
                            bVar2.b = null;
                            bVar2.c = null;
                        }
                    } else {
                        bVar2.d = true;
                        pl0 pl0Var4 = bVar2.b;
                        if (pl0Var4 != null && pl0Var4.b.k(th)) {
                            bVar2.a = null;
                            bVar2.b = null;
                            bVar2.c = null;
                        }
                    }
                    return tx8.a;
                }
            });
            bVar.a = "Deferred.asListenableFuture";
            return pl0Var;
        } catch (Exception e) {
            pl0Var.b.k(e);
            return pl0Var;
        }
    }
}
