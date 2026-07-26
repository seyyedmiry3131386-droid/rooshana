package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class vc4 {
    public final Locale a;

    public vc4(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof vc4)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return js3.i(this.a.toLanguageTag(), ((vc4) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
