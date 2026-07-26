package androidx.paging;

import defpackage.az5;
import defpackage.br9;
import defpackage.g88;
import defpackage.ia4;
import defpackage.js3;
import defpackage.ml9;
import defpackage.mq8;
import defpackage.na4;
import defpackage.rm7;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends az5 {
    public static final i g;
    public final LoadType a;
    public final List b;
    public final int c;
    public final int d;
    public final na4 e;
    public final na4 f;

    static {
        List listB = br9.B(mq8.e);
        ia4 ia4Var = ia4.c;
        ia4 ia4Var2 = ia4.b;
        g = ml9.d(listB, 0, 0, new na4(ia4Var, ia4Var2, ia4Var2), null);
    }

    public i(LoadType loadType, List list, int i, int i2, na4 na4Var, na4 na4Var2) {
        this.a = loadType;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = na4Var;
        this.f = na4Var2;
        if (loadType != LoadType.c && i < 0) {
            throw new IllegalArgumentException(rm7.n(i, "Prepend insert defining placeholdersBefore must be > 0, but was ").toString());
        }
        if (loadType != LoadType.b && i2 < 0) {
            throw new IllegalArgumentException(rm7.n(i2, "Append insert defining placeholdersAfter must be > 0, but was ").toString());
        }
        if (loadType == LoadType.a && list.isEmpty()) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008b -> B:18:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00e6 -> B:26:0x00f5). Please report as a decompilation issue!!! */
    @Override // defpackage.az5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qp2 r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i.a(qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010c A[LOOP:0: B:29:0x0102->B:31:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0088 -> B:18:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00e4 -> B:26:0x00ef). Please report as a decompilation issue!!! */
    @Override // defpackage.az5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.qp2 r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i.b(qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:18:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00d4 -> B:24:0x00e0). Please report as a decompilation issue!!! */
    @Override // defpackage.az5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qp2 r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.i.c(qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && js3.i(this.b, iVar.b) && this.c == iVar.c && this.d == iVar.d && js3.i(this.e, iVar.e) && js3.i(this.f, iVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((((rm7.i(this.a.hashCode() * 31, 31, this.b) + this.c) * 31) + this.d) * 31)) * 31;
        na4 na4Var = this.f;
        return iHashCode + (na4Var == null ? 0 : na4Var.hashCode());
    }

    public final String toString() {
        List list;
        List list2;
        List list3 = this.b;
        Iterator it = list3.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((mq8) it.next()).b.size();
        }
        int i = this.c;
        String strValueOf = i != -1 ? String.valueOf(i) : "none";
        int i2 = this.d;
        String strValueOf2 = i2 != -1 ? String.valueOf(i2) : "none";
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.a);
        sb.append(", with ");
        sb.append(size);
        sb.append(" items (\n                    |   first item: ");
        mq8 mq8Var = (mq8) kotlin.collections.a.p0(list3);
        Object objV0 = null;
        sb.append((mq8Var == null || (list2 = mq8Var.b) == null) ? null : kotlin.collections.a.p0(list2));
        sb.append("\n                    |   last item: ");
        mq8 mq8Var2 = (mq8) kotlin.collections.a.v0(list3);
        if (mq8Var2 != null && (list = mq8Var2.b) != null) {
            objV0 = kotlin.collections.a.v0(list);
        }
        sb.append(objV0);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(strValueOf);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(strValueOf2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.e);
        sb.append("\n                    ");
        String string = sb.toString();
        na4 na4Var = this.f;
        if (na4Var != null) {
            string = string + "|   mediatorLoadStates: " + na4Var + '\n';
        }
        return g88.P(string + "|)");
    }
}
