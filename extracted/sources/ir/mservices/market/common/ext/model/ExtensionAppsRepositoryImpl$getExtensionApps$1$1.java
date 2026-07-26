package ir.mservices.market.common.ext.model;

import defpackage.g51;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wv8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.ext.model.ExtensionAppsRepositoryImpl$getExtensionApps$1$1", f = "ExtensionAppsRepositoryImpl.kt", l = {88}, m = "invokeSuspend", v = 1)
final class ExtensionAppsRepositoryImpl$getExtensionApps$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ boolean b;
    public final /* synthetic */ wv8 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionAppsRepositoryImpl$getExtensionApps$1$1(wv8 wv8Var, String str, Object obj, boolean z, g51 g51Var) {
        super(4, g51Var);
        this.c = wv8Var;
        this.d = str;
        this.e = obj;
        this.f = z;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Object obj5 = this.e;
        boolean z = this.f;
        ExtensionAppsRepositoryImpl$getExtensionApps$1$1 extensionAppsRepositoryImpl$getExtensionApps$1$1 = new ExtensionAppsRepositoryImpl$getExtensionApps$1$1(this.c, this.d, obj5, z, (g51) obj4);
        extensionAppsRepositoryImpl$getExtensionApps$1$1.b = zBooleanValue;
        return extensionAppsRepositoryImpl$getExtensionApps$1$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.ext.model.ExtensionAppsRepositoryImpl$getExtensionApps$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
