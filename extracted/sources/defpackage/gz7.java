package defpackage;

import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class gz7 {
    public final long a;
    public final long b;
    public final int c;

    public gz7(long j, int i, long j2) {
        vy2.j(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gz7.class == obj.getClass()) {
            gz7 gz7Var = (gz7) obj;
            if (this.a == gz7Var.a && this.b == gz7Var.b && this.c == gz7Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = j29.a;
        Locale locale = Locale.US;
        StringBuilder sbS = rm7.s(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        sbS.append(this.b);
        sbS.append(", speedDivisor=");
        sbS.append(this.c);
        return sbS.toString();
    }
}
