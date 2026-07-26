package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class mq8 {
    public static final mq8 e = new mq8(0, EmptyList.a);
    public final int[] a;
    public final List b;
    public final int c;
    public final List d;

    public mq8(int[] iArr, List list, int i, List list2) {
        js3.p(iArr, "originalPageOffsets");
        js3.p(list, "data");
        this.a = iArr;
        this.b = list;
        this.c = i;
        this.d = list2;
        if (iArr.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if (list2 == null || list2.size() == list.size()) {
            return;
        }
        StringBuilder sb = new StringBuilder("If originalIndices (size = ");
        js3.m(list2);
        sb.append(list2.size());
        sb.append(") is provided, it must be same length as data (size = ");
        sb.append(list.size());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mq8.class != obj.getClass()) {
            return false;
        }
        mq8 mq8Var = (mq8) obj;
        return Arrays.equals(this.a, mq8Var.a) && js3.i(this.b, mq8Var.b) && this.c == mq8Var.c && js3.i(this.d, mq8Var.d);
    }

    public final int hashCode() {
        int i = (rm7.i(Arrays.hashCode(this.a) * 31, 31, this.b) + this.c) * 31;
        List list = this.d;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.a));
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", hintOriginalPageOffset=");
        sb.append(this.c);
        sb.append(", hintOriginalIndices=");
        return dw1.t(sb, this.d, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mq8(int i, List list) {
        this(new int[]{i}, list, i, null);
        js3.p(list, "data");
    }
}
