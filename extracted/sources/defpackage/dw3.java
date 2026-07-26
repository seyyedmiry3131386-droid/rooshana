package defpackage;

import com.google.gson.internal.LinkedTreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class dw3 extends lv3 {
    public final LinkedTreeMap a = new LinkedTreeMap(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof dw3) && ((dw3) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
