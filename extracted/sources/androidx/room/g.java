package androidx.room;

import defpackage.ze2;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ze2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ ze2 b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ int[] d;

    public g(Ref$ObjectRef ref$ObjectRef, ze2 ze2Var, String[] strArr, int[] iArr) {
        this.a = ref$ObjectRef;
        this.b = ze2Var;
        this.c = strArr;
        this.d = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r6.emit(r15, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r6.emit(r15, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ze2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(int[] r14, defpackage.g51 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            kotlin.jvm.internal.Ref$ObjectRef r3 = r13.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L31:
            int[] r14 = r0.a
            kotlin.b.b(r15)
            goto L93
        L37:
            kotlin.b.b(r15)
            java.lang.Object r15 = r3.a
            java.lang.String[] r2 = r13.c
            ze2 r6 = r13.b
            if (r15 != 0) goto L51
            java.util.Set r15 = defpackage.ew.b1(r2)
            r0.a = r14
            r0.d = r5
            java.lang.Object r15 = r6.emit(r15, r0)
            if (r15 != r1) goto L93
            goto L92
        L51:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r5 = r2.length
            r7 = 0
            r8 = r7
        L59:
            if (r7 >= r5) goto L7e
            r9 = r2[r7]
            int r10 = r8 + 1
            java.lang.Object r11 = r3.a
            if (r11 == 0) goto L76
            int[] r11 = (int[]) r11
            int[] r12 = r13.d
            r8 = r12[r8]
            r11 = r11[r8]
            r8 = r14[r8]
            if (r11 == r8) goto L72
            r15.add(r9)
        L72:
            int r7 = r7 + 1
            r8 = r10
            goto L59
        L76:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        L7e:
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L93
            java.util.Set r15 = kotlin.collections.a.T0(r15)
            r0.a = r14
            r0.d = r4
            java.lang.Object r15 = r6.emit(r15, r0)
            if (r15 != r1) goto L93
        L92:
            return r1
        L93:
            r3.a = r14
            tx8 r14 = defpackage.tx8.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.g.emit(int[], g51):java.lang.Object");
    }
}
