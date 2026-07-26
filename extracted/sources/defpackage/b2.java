package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b2 {
    public abstract Set a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            return a().equals(((b2) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
