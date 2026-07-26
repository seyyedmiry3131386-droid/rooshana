package androidx.paging;

import defpackage.az5;
import defpackage.g88;
import defpackage.js3;
import defpackage.na4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends az5 {
    public final List a;
    public final na4 b;

    public j(List list, na4 na4Var) {
        js3.p(list, "data");
        this.a = list;
        this.b = na4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006b -> B:21:0x006f). Please report as a decompilation issue!!! */
    @Override // defpackage.az5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qp2 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.paging.PageEvent$StaticList$filter$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.paging.PageEvent$StaticList$filter$1 r0 = (androidx.paging.PageEvent$StaticList$filter$1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            androidx.paging.PageEvent$StaticList$filter$1 r0 = new androidx.paging.PageEvent$StaticList$filter$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.d
            java.util.Iterator r2 = r0.c
            java.util.Collection r4 = r0.b
            java.util.Collection r4 = (java.util.Collection) r4
            qp2 r5 = r0.a
            qp2 r5 = (defpackage.qp2) r5
            kotlin.b.b(r9)
            goto L6f
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.b.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r2 = r7.a
            java.util.Iterator r2 = r2.iterator()
            r4 = r9
        L4a:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L7c
            java.lang.Object r9 = r2.next()
            r5 = r8
            qp2 r5 = (defpackage.qp2) r5
            r0.a = r5
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            r0.b = r5
            r0.c = r2
            r0.d = r9
            r0.g = r3
            java.lang.Object r5 = r8.invoke(r9, r0)
            if (r5 != r1) goto L6b
            return r1
        L6b:
            r6 = r5
            r5 = r8
            r8 = r9
            r9 = r6
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7a
            r4.add(r8)
        L7a:
            r8 = r5
            goto L4a
        L7c:
            java.util.List r4 = (java.util.List) r4
            androidx.paging.j r8 = new androidx.paging.j
            na4 r9 = r7.b
            r8.<init>(r4, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.j.a(qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006a -> B:21:0x006d). Please report as a decompilation issue!!! */
    @Override // defpackage.az5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.qp2 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.paging.PageEvent$StaticList$flatMap$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.paging.PageEvent$StaticList$flatMap$1 r0 = (androidx.paging.PageEvent$StaticList$flatMap$1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            androidx.paging.PageEvent$StaticList$flatMap$1 r0 = new androidx.paging.PageEvent$StaticList$flatMap$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.util.Iterator r8 = r0.c
            java.util.Collection r2 = r0.b
            java.util.Collection r2 = (java.util.Collection) r2
            qp2 r4 = r0.a
            qp2 r4 = (defpackage.qp2) r4
            kotlin.b.b(r9)
            goto L6d
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.b.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r2 = r7.a
            java.util.Iterator r2 = r2.iterator()
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
        L4b:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L74
            java.lang.Object r4 = r8.next()
            r5 = r9
            qp2 r5 = (defpackage.qp2) r5
            r0.a = r5
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            r0.b = r5
            r0.c = r8
            r0.f = r3
            java.lang.Object r4 = r9.invoke(r4, r0)
            if (r4 != r1) goto L6a
            return r1
        L6a:
            r6 = r4
            r4 = r9
            r9 = r6
        L6d:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            kotlin.collections.a.b0(r9, r2)
            r9 = r4
            goto L4b
        L74:
            java.util.List r2 = (java.util.List) r2
            androidx.paging.j r8 = new androidx.paging.j
            na4 r9 = r7.b
            r8.<init>(r2, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.j.b(qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0075 -> B:21:0x0078). Please report as a decompilation issue!!! */
    @Override // defpackage.az5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qp2 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.paging.PageEvent$StaticList$map$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.paging.PageEvent$StaticList$map$1 r0 = (androidx.paging.PageEvent$StaticList$map$1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            androidx.paging.PageEvent$StaticList$map$1 r0 = new androidx.paging.PageEvent$StaticList$map$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.util.Collection r8 = r0.d
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r2 = r0.c
            java.util.Collection r4 = r0.b
            java.util.Collection r4 = (java.util.Collection) r4
            qp2 r5 = r0.a
            qp2 r5 = (defpackage.qp2) r5
            kotlin.b.b(r9)
            goto L78
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.b.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r2 = 10
            java.util.List r4 = r7.a
            int r2 = defpackage.wu0.V(r4, r2)
            r9.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
            r6 = r9
            r9 = r8
            r8 = r6
        L54:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r2.next()
            r5 = r9
            qp2 r5 = (defpackage.qp2) r5
            r0.a = r5
            r5 = r8
            java.util.Collection r5 = (java.util.Collection) r5
            r0.b = r5
            r0.c = r2
            r0.d = r5
            r0.g = r3
            java.lang.Object r4 = r9.invoke(r4, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r5 = r9
            r9 = r4
            r4 = r8
        L78:
            r8.add(r9)
            r8 = r4
            r9 = r5
            goto L54
        L7e:
            java.util.List r8 = (java.util.List) r8
            androidx.paging.j r9 = new androidx.paging.j
            na4 r0 = r7.b
            r9.<init>(r8, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.j.c(qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return js3.i(this.a, jVar.a) && js3.i(this.b, jVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        na4 na4Var = this.b;
        return (iHashCode + (na4Var == null ? 0 : na4Var.hashCode())) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
        List list = this.a;
        sb.append(list.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(kotlin.collections.a.p0(list));
        sb.append("\n                    |   last item: ");
        sb.append(kotlin.collections.a.v0(list));
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.b);
        sb.append(",\n                    |   placeholdersBefore: 0,\n                    |   placeholdersAfter: 0,\n                    ");
        return g88.P(sb.toString() + "|)");
    }
}
