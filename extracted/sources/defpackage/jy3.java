package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public final class jy3 {
    public static final jy3 c = new jy3("COMPOSITION");
    public final List a;
    public ky3 b;

    public jy3(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.a
            int r1 = r0.size()
            r2 = 0
            if (r8 < r1) goto Lb
            goto L91
        Lb:
            int r1 = r0.size()
            r3 = 1
            int r1 = r1 - r3
            if (r8 != r1) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r2
        L16:
            java.lang.Object r4 = r0.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "**"
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L54
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L35
            java.lang.String r9 = "*"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L33
            goto L35
        L33:
            r9 = r2
            goto L36
        L35:
            r9 = r3
        L36:
            if (r1 != 0) goto L51
            int r1 = r0.size()
            int r1 = r1 + (-2)
            if (r8 != r1) goto L91
            int r8 = r0.size()
            int r8 = r8 - r3
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L91
        L51:
            if (r9 == 0) goto L91
            goto L88
        L54:
            if (r1 != 0) goto L86
            int r4 = r8 + 1
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L86
            int r9 = r0.size()
            int r9 = r9 + (-2)
            if (r8 == r9) goto L88
            int r9 = r0.size()
            int r9 = r9 + (-3)
            if (r8 != r9) goto L91
            int r8 = r0.size()
            int r8 = r8 - r3
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L91
            goto L88
        L86:
            if (r1 == 0) goto L89
        L88:
            return r3
        L89:
            int r8 = r8 + r3
            int r1 = r0.size()
            int r1 = r1 - r3
            if (r8 >= r1) goto L92
        L91:
            return r2
        L92:
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy3.a(int, java.lang.String):boolean");
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals(Marker.ANY_MARKER);
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jy3.class == obj.getClass()) {
            jy3 jy3Var = (jy3) obj;
            if (!this.a.equals(jy3Var.a)) {
                return false;
            }
            ky3 ky3Var = this.b;
            ky3 ky3Var2 = jy3Var.b;
            if (ky3Var != null) {
                return ky3Var.equals(ky3Var2);
            }
            if (ky3Var2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ky3 ky3Var = this.b;
        return iHashCode + (ky3Var != null ? ky3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        return bl4.A(sb, this.b != null, '}');
    }

    public jy3(jy3 jy3Var) {
        this.a = new ArrayList(jy3Var.a);
        this.b = jy3Var.b;
    }
}
