package ir.mservices.market.myAccount.inbox.model;

import android.content.Context;
import defpackage.js3;
import defpackage.zl3;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final Context a;
    public final zl3 b;

    public a(Context context, zl3 zl3Var) {
        js3.p(zl3Var, "inboxSuspendableDao");
        this.a = context;
        this.b = zl3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ir.mservices.market.myAccount.inbox.model.InboxRepositoryImpl$loadAll$1
            if (r0 == 0) goto L13
            r0 = r6
            ir.mservices.market.myAccount.inbox.model.InboxRepositoryImpl$loadAll$1 r0 = (ir.mservices.market.myAccount.inbox.model.InboxRepositoryImpl$loadAll$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ir.mservices.market.myAccount.inbox.model.InboxRepositoryImpl$loadAll$1 r0 = new ir.mservices.market.myAccount.inbox.model.InboxRepositoryImpl$loadAll$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.b.b(r6)
            r0.c = r3
            zl3 r6 = r5.b
            r6.getClass()
            hk3 r2 = new hk3
            r3 = 2
            r2.<init>(r3, r6)
            java.lang.Object r6 = defpackage.y2.a(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            x38 r6 = (defpackage.x38) r6
            boolean r0 = r6 instanceof defpackage.w38
            if (r0 == 0) goto L56
            l99 r0 = new l99
            w38 r6 = (defpackage.w38) r6
            java.lang.Object r6 = r6.a
            r0.<init>(r6)
            return r0
        L56:
            boolean r0 = r6 instanceof defpackage.v38
            if (r0 == 0) goto L7d
            h99 r0 = new h99
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r1 = new ir.mservices.market.version2.webapi.responsedto.ErrorDTO
            v38 r6 = (defpackage.v38) r6
            java.sql.SQLException r6 = r6.a
            int r2 = r6.getErrorCode()
            java.lang.String r6 = r6.getMessage()
            android.content.Context r3 = r5.a
            android.content.res.Resources r3 = r3.getResources()
            int r4 = defpackage.rs6.inbox_error_cannot_load
            java.lang.String r3 = r3.getString(r4)
            r1.<init>(r2, r6, r3)
            r0.<init>(r1)
            return r0
        L7d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.myAccount.inbox.model.a.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
