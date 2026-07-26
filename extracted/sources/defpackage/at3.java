package defpackage;

import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class at3 extends bt3 {
    public final List b;

    public at3(List list) {
        super("uid-mismatch-size(" + (list != null ? list.size() : 0) + ")-" + (list != null ? (String) a.q0(0, list) : null));
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof at3) && js3.i(this.b, ((at3) obj).b);
    }

    public final int hashCode() {
        List list = this.b;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "UidMismatch(packages=" + this.b + ")";
    }
}
