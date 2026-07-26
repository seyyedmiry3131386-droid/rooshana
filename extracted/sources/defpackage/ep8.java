package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ep8 {
    public static final String c;
    public static final String d;
    public final yo8 a;
    public final ImmutableList b;

    static {
        String str = j29.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public ep8(yo8 yo8Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= yo8Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = yo8Var;
        this.b = ImmutableList.n(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ep8.class == obj.getClass()) {
            ep8 ep8Var = (ep8) obj;
            if (this.a.equals(ep8Var.a) && this.b.equals(ep8Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
