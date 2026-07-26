package ir.myket.network.server;

import defpackage.ap7;
import defpackage.br9;
import defpackage.gf2;
import defpackage.hs9;
import defpackage.jp7;
import defpackage.k7;
import defpackage.ps;
import defpackage.rp7;
import defpackage.tv3;
import defpackage.up7;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final ir.myket.persistent.datasource.a a;
    public final tv3 b;
    public final ps c;
    public final gf2 d;

    public a(String str, ir.myket.persistent.datasource.a aVar) throws AppServersModel$AppServersParseException {
        this.a = aVar;
        tv3 tv3VarL = hs9.l(new k7(18));
        this.b = tv3VarL;
        jp7 jp7Var = (jp7) tv3VarL.a(jp7.Companion.serializer(), str);
        ps psVar = new ps();
        psVar.a = null;
        psVar.b = null;
        if (jp7Var == null) {
            throw new AppServersModel$AppServersParseException("Given ServerUrlDto is null");
        }
        psVar.a = new ap7(-1, ps.b(new AppServersModel$1(1, psVar, ps.class, "checkServerUrl", "checkServerUrl(Ljava/lang/String;)Ljava/lang/String;", 0), jp7Var.a));
        List list = jp7Var.b;
        if (list != null && !list.isEmpty()) {
            psVar.b = new ArrayList(list.size());
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    br9.P();
                    throw null;
                }
                up7 up7Var = (up7) obj;
                ArrayList arrayListB = ps.b(new AppServersModel$2$serviceList$1(1, psVar, ps.class, "checkServiceUrl", "checkServiceUrl(Ljava/lang/String;)Ljava/lang/String;", 0), up7Var.a);
                ap7 ap7Var = new ap7(i, ps.b(new AppServersModel$2$serverList$1(1, psVar, ps.class, "checkServerUrl", "checkServerUrl(Ljava/lang/String;)Ljava/lang/String;", 0), up7Var.b));
                List list2 = psVar.b;
                if (list2 != null) {
                    list2.add(new rp7(arrayListB, ap7Var));
                }
                i = i2;
            }
        }
        this.c = psVar;
        this.d = new gf2(d.w(this.a.l, new AppServersStorage$appServersModelFlow$1(this, null)), new AppServersStorage$appServersModelFlow$2(this, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r8, int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ir.myket.network.server.AppServersStorage$saveServerListIndex$1
            if (r0 == 0) goto L13
            r0 = r10
            ir.myket.network.server.AppServersStorage$saveServerListIndex$1 r0 = (ir.myket.network.server.AppServersStorage$saveServerListIndex$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ir.myket.network.server.AppServersStorage$saveServerListIndex$1 r0 = new ir.myket.network.server.AppServersStorage$saveServerListIndex$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 2
            tx8 r4 = defpackage.tx8.a
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            kotlin.b.b(r10)
            return r4
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            int r9 = r0.b
            int r8 = r0.a
            kotlin.b.b(r10)
            goto L4f
        L3c:
            kotlin.b.b(r10)
            r0.a = r8
            r0.b = r9
            r0.e = r5
            gf2 r10 = r7.d
            java.lang.Object r10 = kotlinx.coroutines.flow.d.u(r10, r0)
            if (r10 != r1) goto L4f
            goto Lb6
        L4f:
            ps r10 = (defpackage.ps) r10
            r2 = -1
            r6 = 0
            if (r8 != r2) goto L5c
            if (r10 == 0) goto L5a
            ap7 r2 = r10.a
            goto L6c
        L5a:
            r2 = r6
            goto L6c
        L5c:
            if (r10 == 0) goto L5a
            java.util.List r2 = r10.b
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r2.get(r8)
            rp7 r2 = (defpackage.rp7) r2
            if (r2 == 0) goto L5a
            ap7 r2 = r2.b
        L6c:
            if (r2 == 0) goto Lb7
            r2.b = r9
            if (r9 < 0) goto L7b
            java.util.List r2 = r2.c
            int r2 = r2.size()
            if (r9 >= r2) goto L7b
            goto L7c
        L7b:
            r5 = 0
        L7c:
            defpackage.lw.f(r6, r6, r5)
            r0.a = r8
            r0.b = r9
            r0.e = r3
            defpackage.lw.d(r6, r6, r10)
            tv3 r8 = r7.b     // Catch: kotlinx.serialization.SerializationException -> Laf
            r8.getClass()     // Catch: kotlinx.serialization.SerializationException -> Laf
            ls r9 = defpackage.ps.Companion     // Catch: kotlinx.serialization.SerializationException -> Laf
            px3 r9 = r9.serializer()     // Catch: kotlinx.serialization.SerializationException -> Laf
            px3 r9 = defpackage.ct2.n(r9)     // Catch: kotlinx.serialization.SerializationException -> Laf
            px3 r9 = (defpackage.px3) r9     // Catch: kotlinx.serialization.SerializationException -> Laf
            java.lang.String r8 = r8.c(r9, r10)     // Catch: kotlinx.serialization.SerializationException -> Laf
            ol3 r9 = ir.myket.persistent.datasource.a.m
            r9.getClass()
            bj6 r9 = ir.myket.persistent.datasource.a.v
            ir.myket.persistent.datasource.a r10 = r7.a
            java.lang.Object r8 = r10.a(r9, r8, r0)
            if (r8 != r1) goto Lad
            goto Lb4
        Lad:
            r8 = r4
            goto Lb4
        Laf:
            r8 = move-exception
            defpackage.lw.g(r8, r6, r6)
            goto Lad
        Lb4:
            if (r8 != r1) goto Lb7
        Lb6:
            return r1
        Lb7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.network.server.a.a(int, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
