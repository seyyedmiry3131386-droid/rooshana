package androidx.datastore.migrations;

import android.content.Context;
import defpackage.c24;
import defpackage.js3;
import defpackage.ku7;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.xv3;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final SuspendLambda a;
    public final SuspendLambda b;
    public final Context c;
    public final String d;
    public final c24 e;
    public final Set f;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, String str, qp2 qp2Var, rp2 rp2Var) {
        LinkedHashSet linkedHashSet = ku7.a;
        js3.p(context, "context");
        js3.p(str, "sharedPreferencesName");
        js3.p(linkedHashSet, "keysToMigrate");
        xv3 xv3Var = new xv3(context, str, 22);
        this.a = (SuspendLambda) qp2Var;
        this.b = (SuspendLambda) rp2Var;
        this.c = context;
        this.d = str;
        this.e = kotlin.a.a(xv3Var);
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = (androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r6)
            r0.c = r3
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = r4.a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L48
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L48:
            c24 r5 = r4.e
            r6 = 0
            java.util.Set r0 = r4.f
            if (r0 != 0) goto L67
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.util.Map r5 = r5.getAll()
            java.lang.String r0 = "getAll(...)"
            defpackage.js3.o(r5, r0)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L65
            goto L93
        L65:
            r3 = r6
            goto L93
        L67:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L7d
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7d
            goto L65
        L7d:
            java.util.Iterator r0 = r0.iterator()
        L81:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L81
        L93:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.a.a(java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
