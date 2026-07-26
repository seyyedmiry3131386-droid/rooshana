package io.sentry;

import j$.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {
    public final String a;
    public final Pattern b;

    public f0(String str) {
        Pattern patternCompile;
        this.a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            h4.b().m().getLogger().i(SentryLevel.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.b = patternCompile;
    }

    public final boolean equals(Object obj) {
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((f0) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
