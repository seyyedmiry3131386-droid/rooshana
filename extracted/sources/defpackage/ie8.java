package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ie8 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public ie8(int i, int i2, String str, String str2, String str3, boolean z) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, "type");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        js3.o(upperCase, "toUpperCase(...)");
        this.g = f88.c0(upperCase, "INT", false) ? 3 : (f88.c0(upperCase, "CHAR", false) || f88.c0(upperCase, "CLOB", false) || f88.c0(upperCase, "TEXT", false)) ? 2 : f88.c0(upperCase, "BLOB", false) ? 5 : (f88.c0(upperCase, "REAL", false) || f88.c0(upperCase, "FLOA", false) || f88.c0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ie8) {
                boolean z = this.d > 0;
                ie8 ie8Var = (ie8) obj;
                int i = ie8Var.f;
                if (z == (ie8Var.d > 0) && js3.i(this.a, ie8Var.a) && this.c == ie8Var.c) {
                    String str = ie8Var.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || o37.g(str2, str)) && ((i2 != 2 || i != 1 || str == null || o37.g(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : o37.g(str2, str))) && this.g == ie8Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return g88.N(g88.P(sb.toString()));
    }
}
