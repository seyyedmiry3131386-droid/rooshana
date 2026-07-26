package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ni0 {
    public final String a;
    public final String b;
    public final String c;

    public ni0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ni0.class == obj.getClass()) {
                ni0 ni0Var = (ni0) obj;
                String str = ni0Var.a;
                String str2 = this.a;
                if (str2 == null ? str == null : str2.equals(str)) {
                    String str3 = ni0Var.b;
                    String str4 = this.b;
                    if (str4 == null ? str3 == null : str4.equals(str3)) {
                        String str5 = ni0Var.c;
                        String str6 = this.c;
                        if (str6 == null ? str5 == null : str6.equals(str5)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
