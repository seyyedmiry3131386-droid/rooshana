package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l20 {
    public final String a;
    public final Integer b;
    public final o12 c;
    public final long d;
    public final long e;
    public final Map f;

    public l20(String str, Integer num, o12 o12Var, long j, long j2, HashMap map) {
        this.a = str;
        this.b = num;
        this.c = o12Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final on c() {
        on onVar = new on();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        onVar.a = str;
        onVar.b = this.b;
        o12 o12Var = this.c;
        if (o12Var == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        onVar.c = o12Var;
        onVar.d = Long.valueOf(this.d);
        onVar.e = Long.valueOf(this.e);
        onVar.f = new HashMap(this.f);
        return onVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l20) {
            l20 l20Var = (l20) obj;
            Integer num2 = l20Var.b;
            if (this.a.equals(l20Var.a) && ((num = this.b) != null ? num.equals(num2) : num2 == null) && this.c.equals(l20Var.c) && this.d == l20Var.d && this.e == l20Var.e && this.f.equals(l20Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
