package androidx.datastore.core;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {41, 43}, m = "invokeSuspend", v = 1)
final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements qp2 {
    public Iterator a;
    public androidx.datastore.migrations.a b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ List f;
    public final /* synthetic */ ArrayList g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2(List list, ArrayList arrayList, g51 g51Var) {
        super(2, g51Var);
        this.f = list;
        this.g = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.f, this.g, g51Var);
        dataMigrationInitializer$Companion$runMigrations$2.e = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v7, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r10.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r10.a
            java.lang.Object r4 = r10.e
            java.util.List r4 = (java.util.List) r4
            kotlin.b.b(r11)
            goto L3c
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r1 = r10.c
            androidx.datastore.migrations.a r4 = r10.b
            java.util.Iterator r5 = r10.a
            java.lang.Object r6 = r10.e
            java.util.List r6 = (java.util.List) r6
            kotlin.b.b(r11)
            r9 = r6
            r6 = r4
            r4 = r9
            goto L5e
        L2f:
            kotlin.b.b(r11)
            java.lang.Object r11 = r10.e
            java.util.List r1 = r10.f
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r10.g
        L3c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L95
            java.lang.Object r5 = r1.next()
            androidx.datastore.migrations.a r5 = (androidx.datastore.migrations.a) r5
            r10.e = r4
            r10.a = r1
            r10.b = r5
            r10.c = r11
            r10.d = r3
            java.lang.Object r6 = r5.a(r11, r10)
            if (r6 != r0) goto L59
            goto L90
        L59:
            r9 = r1
            r1 = r11
            r11 = r6
            r6 = r5
            r5 = r9
        L5e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L93
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r11 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r7 = 0
            r11.<init>(r6, r7)
            r4.add(r11)
            r10.e = r4
            r10.a = r5
            r10.b = r7
            r10.c = r7
            r10.d = r2
            kotlin.coroutines.jvm.internal.SuspendLambda r11 = r6.b
            mu7 r7 = new mu7
            c24 r8 = r6.e
            java.lang.Object r8 = r8.getValue()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.util.Set r6 = r6.f
            r7.<init>(r8, r6)
            java.lang.Object r11 = r11.a(r7, r1, r10)
            if (r11 != r0) goto L91
        L90:
            return r0
        L91:
            r1 = r5
            goto L3c
        L93:
            r11 = r1
            goto L91
        L95:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
