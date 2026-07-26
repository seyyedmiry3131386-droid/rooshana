package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class hk5 {
    public final List a;
    public final int b;

    public hk5(List list, int i) {
        this.a = list;
        this.b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder sbR = rm7.r(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        sbR.append(br9.x(list));
        sbR.append("'.");
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hk5.class != obj.getClass()) {
            return false;
        }
        hk5 hk5Var = (hk5) obj;
        return this.b == hk5Var.b && js3.i(this.a, hk5Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb.append(this.b);
        sb.append(", mergedHistory=");
        return dw1.t(sb, this.a, ')');
    }

    public hk5() {
        this(EmptyList.a, -1);
    }
}
