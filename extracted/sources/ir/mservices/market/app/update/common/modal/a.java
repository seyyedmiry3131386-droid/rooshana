package ir.mservices.market.app.update.common.modal;

import defpackage.bt2;
import defpackage.dp3;
import defpackage.dx4;
import defpackage.ff5;
import defpackage.js3;
import defpackage.rq7;
import defpackage.up1;
import defpackage.vz8;
import defpackage.wt;
import defpackage.yt;
import ir.mservices.market.app.update.common.manager.b;
import ir.mservices.market.core.notification.PushMessage;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final dp3 a;
    public final b b;
    public final ir.mservices.market.app.update.common.manager.a c;
    public final wt d;
    public final dx4 e;
    public final ir.mservices.market.common.install.a f;

    public a(dp3 dp3Var, b bVar, ir.mservices.market.app.update.common.manager.a aVar, wt wtVar, dx4 dx4Var, ir.mservices.market.common.install.a aVar2) {
        js3.p(dp3Var, "installManager");
        js3.p(bVar, "inActiveAppUpdateManager");
        js3.p(aVar, "appUpdateManager");
        js3.p(wtVar, "appUpdateRepository");
        js3.p(dx4Var, "modelUtils");
        js3.p(aVar2, "installedAppsManager");
        this.a = dp3Var;
        this.b = bVar;
        this.c = aVar;
        this.d = wtVar;
        this.e = dx4Var;
        this.f = aVar2;
    }

    public final rq7 a(Object obj, String str, String str2, ff5 ff5Var, vz8 vz8Var, yt ytVar) {
        rq7 rq7Var = new rq7();
        bt2.G(js3.a(up1.a), null, null, new UpdateRefreshRepositoryImpl$fetchRefreshAllDataAsync$1(this, obj, str, str2, ff5Var, vz8Var, ytVar, rq7Var, null), 3);
        return rq7Var;
    }

    public final rq7 b(String str, int i, PushMessage pushMessage) {
        js3.p(str, "packageName");
        rq7 rq7Var = new rq7();
        bt2.G(js3.a(up1.a), null, null, new UpdateRefreshRepositoryImpl$fetchRefreshDataAsync$1(this, str, i, pushMessage, rq7Var, null), 3);
        return rq7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #2 {all -> 0x0079, blocks: (B:22:0x0067, B:42:0x00ef, B:44:0x00f5, B:27:0x008d, B:36:0x00cd, B:39:0x00d9, B:41:0x00e1), top: B:82:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f A[Catch: all -> 0x015c, TRY_LEAVE, TryCatch #5 {all -> 0x015c, blocks: (B:50:0x0144, B:46:0x00ff, B:53:0x015f), top: B:88:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [ir.mservices.market.app.update.common.manager.a] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [iz8] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [iz8] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [iz8] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [iz8] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0139 -> B:88:0x0144). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.Object r29, java.lang.String r30, java.lang.String r31, defpackage.ff5 r32, defpackage.vz8 r33, defpackage.iz8 r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.update.common.modal.a.c(java.lang.Object, java.lang.String, java.lang.String, ff5, vz8, iz8, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r25, int r26, ir.mservices.market.core.notification.PushMessage r27, java.lang.Object r28, java.lang.String r29, java.lang.String r30, ir.mservices.market.app.detail.update.b r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.update.common.modal.a.d(java.lang.String, int, ir.mservices.market.core.notification.PushMessage, java.lang.Object, java.lang.String, java.lang.String, ir.mservices.market.app.detail.update.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
