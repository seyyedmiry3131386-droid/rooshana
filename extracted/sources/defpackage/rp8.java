package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rp8 {
    public static final rp8 b = new rp8(ImmutableList.q());
    public static final String c;
    public final ImmutableList a;

    static {
        String str = j29.a;
        c = Integer.toString(0, 36);
    }

    public rp8(List list) {
        this.a = ImmutableList.n(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i2 >= immutableList.size()) {
                return false;
            }
            qp8 qp8Var = (qp8) immutableList.get(i2);
            boolean[] zArr = qp8Var.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (qp8Var.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rp8.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((rp8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
