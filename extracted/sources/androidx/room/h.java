package androidx.room;

import defpackage.a77;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.hr5;
import defpackage.js3;
import defpackage.mw7;
import ir.myket.persistent.db.MyketDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.builders.SetBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final MyketDatabase_Impl a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final dp2 e;
    public final String[] g;
    public final hr5 h;
    public final b i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public bp2 k = new mw7(16);
    public final LinkedHashMap f = new LinkedHashMap();

    public h(MyketDatabase_Impl myketDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, dp2 dp2Var) {
        String lowerCase;
        this.a = myketDatabase_Impl;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = dp2Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            js3.o(lowerCase2, "toLowerCase(...)");
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                js3.o(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            js3.o(lowerCase3, "toLowerCase(...)");
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                js3.o(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase4, kotlin.collections.b.J(linkedHashMap3, lowerCase3));
            }
        }
        this.h = new hr5(this.g.length);
        this.i = new b(this.g.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.room.h r4, defpackage.vh6 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r0.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.a
            java.util.Set r5 = (java.util.Set) r5
            kotlin.b.b(r4)
            return r5
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.Object r5 = r0.a
            vh6 r5 = (defpackage.vh6) r5
            kotlin.b.b(r4)
            goto L55
        L3e:
            kotlin.b.b(r4)
            lc8 r4 = new lc8
            r1 = 14
            r4.<init>(r1)
            r0.a = r5
            r0.d = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.d(r1, r4, r0)
            if (r4 != r6) goto L55
            goto L6c
        L55:
            java.util.Set r4 = (java.util.Set) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6d
            r0.a = r4
            r0.d = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.xa7.b(r5, r1, r0)
            if (r5 != r6) goto L6d
        L6c:
            return r6
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.a(androidx.room.h, vh6, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (defpackage.xa7.b(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        if (defpackage.xa7.b(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00db, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d9 -> B:28:0x00dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.room.h r17, defpackage.dq8 r18, int r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.b(androidx.room.h, dq8, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:19:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.room.h r8, defpackage.dq8 r9, int r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1
            if (r0 == 0) goto L16
            r0 = r11
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.h = r1
            goto L1b
        L16:
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.e
            int r9 = r0.d
            java.lang.String[] r10 = r0.c
            java.lang.String r2 = r0.b
            vh6 r4 = r0.a
            kotlin.b.b(r11)
            r11 = r10
            r10 = r4
            goto L85
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.b.b(r11)
            java.lang.String[] r8 = r8.g
            r8 = r8[r10]
            java.lang.String[] r10 = androidx.room.h.l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L50:
            if (r9 >= r8) goto L87
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = defpackage.rm7.m(r6, r5, r4)
            r0.a = r10
            r0.b = r2
            r0.c = r11
            r0.d = r9
            r0.e = r8
            r0.h = r3
            java.lang.Object r4 = defpackage.xa7.b(r10, r4, r0)
            if (r4 != r1) goto L85
            return r1
        L85:
            int r9 = r9 + r3
            goto L50
        L87:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.c(androidx.room.h, dq8, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            do3 r0 = r0.a
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L78
        L29:
            r8 = move-exception
            goto L93
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.b.b(r8)
            ir.myket.persistent.db.MyketDatabase_Impl r8 = r7.a
            do3 r2 = r8.g
            boolean r4 = r2.o()
            if (r4 == 0) goto L97
            java.util.concurrent.atomic.AtomicBoolean r4 = r7.j     // Catch: java.lang.Throwable -> L4f
            r5 = 0
            boolean r4 = r4.compareAndSet(r3, r5)     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L52
            kotlin.collections.EmptySet r8 = kotlin.collections.EmptySet.a     // Catch: java.lang.Throwable -> L4f
            r2.H()
            return r8
        L4f:
            r8 = move-exception
            r0 = r2
            goto L93
        L52:
            bp2 r4 = r7.k     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L4f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L4f
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L66
            kotlin.collections.EmptySet r8 = kotlin.collections.EmptySet.a     // Catch: java.lang.Throwable -> L4f
            r2.H()
            return r8
        L66:
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 r4 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1     // Catch: java.lang.Throwable -> L4f
            r6 = 0
            r4.<init>(r7, r6)     // Catch: java.lang.Throwable -> L4f
            r0.a = r2     // Catch: java.lang.Throwable -> L4f
            r0.d = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r8 = r8.j(r5, r4, r0)     // Catch: java.lang.Throwable -> L4f
            if (r8 != r1) goto L77
            return r1
        L77:
            r0 = r2
        L78:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L29
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L29
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L8f
            androidx.room.b r1 = r7.i     // Catch: java.lang.Throwable -> L29
            r1.b(r8)     // Catch: java.lang.Throwable -> L29
            dp2 r1 = r7.e     // Catch: java.lang.Throwable -> L29
            androidx.room.InvalidationTracker$implementation$1 r1 = (androidx.room.InvalidationTracker$implementation$1) r1     // Catch: java.lang.Throwable -> L29
            r1.invoke(r8)     // Catch: java.lang.Throwable -> L29
        L8f:
            r0.H()
            return r8
        L93:
            r0.H()
            throw r8
        L97:
            kotlin.collections.EmptySet r8 = kotlin.collections.EmptySet.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            do3 r0 = r0.a
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L53
        L29:
            r7 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            kotlin.b.b(r7)
            ir.myket.persistent.db.MyketDatabase_Impl r7 = r6.a
            do3 r2 = r7.g
            boolean r4 = r2.o()
            if (r4 == 0) goto L5d
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1 r4 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1     // Catch: java.lang.Throwable -> L57
            r5 = 0
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L57
            r0.a = r2     // Catch: java.lang.Throwable -> L57
            r0.d = r3     // Catch: java.lang.Throwable -> L57
            r3 = 0
            java.lang.Object r7 = r7.j(r3, r4, r0)     // Catch: java.lang.Throwable -> L57
            if (r7 != r1) goto L52
            return r1
        L52:
            r0 = r2
        L53:
            r0.H()
            goto L5d
        L57:
            r7 = move-exception
            r0 = r2
        L59:
            r0.H()
            throw r7
        L5d:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Pair f(String[] strArr) {
        js3.p(strArr, "names");
        SetBuilder setBuilder = new SetBuilder();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            js3.o(lowerCase, "toLowerCase(...)");
            Set set = (Set) this.c.get(lowerCase);
            if (set != null) {
                setBuilder.addAll(set);
            } else {
                setBuilder.add(str);
            }
        }
        String[] strArr2 = (String[]) a77.a(setBuilder).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            js3.o(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) this.f.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i] = num.intValue();
        }
        return new Pair(strArr2, iArr);
    }
}
