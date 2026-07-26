package defpackage;

import android.text.TextUtils;
import ir.mservices.market.version2.webapi.responsedto.BindInfoDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class g4 {
    public ee a;
    public c5 b;

    public static void a(StringBuilder sb, int[] iArr, String str, char c) {
        if (TextUtils.isEmpty(str)) {
            sb.append(c);
            sb.append("0");
        } else {
            sb.append(c);
            sb.append("1");
            iArr[0] = iArr[0] + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r6 = this;
            c5 r0 = r6.b
            java.lang.String r0 = r0.a()
            r1 = 36
            r2 = 0
            if (r0 == 0) goto L15
            int r3 = r0.length()
            if (r3 <= r1) goto L15
            java.lang.String r0 = r0.substring(r2, r1)
        L15:
            ee r3 = r6.a
            r4 = 0
            if (r0 == 0) goto L2a
            r3.getClass()
            int r5 = r0.length()
            if (r5 > r1) goto L24
            goto L2a
        L24:
            java.lang.String r1 = "User ID length is too long"
            defpackage.lw.g(r4, r1, r0)
            goto L40
        L2a:
            java.util.List r1 = r3.a
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r1.next()
            fe r3 = (defpackage.fe) r3
            r3.c(r0)
            goto L30
        L40:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            c5 r1 = r6.b
            boolean r1 = r1.d()
            if (r1 != 0) goto L53
            java.lang.String r1 = "b0e0p0t0c0"
            r0.append(r1)
            goto L97
        L53:
            java.lang.String r1 = "b1"
            r0.append(r1)
            int[] r1 = new int[]{r2}
            c5 r3 = r6.b
            z4 r3 = r3.h
            java.lang.Object r3 = r3.e
            java.lang.String r3 = (java.lang.String) r3
            r5 = 101(0x65, float:1.42E-43)
            a(r0, r1, r3, r5)
            c5 r3 = r6.b
            z4 r3 = r3.h
            java.lang.Object r3 = r3.f
            java.lang.String r3 = (java.lang.String) r3
            r5 = 112(0x70, float:1.57E-43)
            a(r0, r1, r3, r5)
            c5 r3 = r6.b
            z4 r3 = r3.h
            java.lang.Object r3 = r3.g
            java.lang.String r3 = (java.lang.String) r3
            r5 = 116(0x74, float:1.63E-43)
            a(r0, r1, r3, r5)
            r3 = r1[r2]
            if (r3 <= 0) goto L89
            r3 = 1
            goto L8a
        L89:
            r3 = r2
        L8a:
            defpackage.lw.f(r4, r4, r3)
            java.lang.String r3 = "c"
            r0.append(r3)
            r1 = r1[r2]
            r0.append(r1)
        L97:
            ee r1 = r6.a
            java.lang.String r2 = "account_state"
            java.lang.String r0 = r0.toString()
            r1.c(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4.b():void");
    }

    public void onEvent(b5 b5Var) {
        this.a.b("account_logout", new String[0]);
    }

    public void onEvent(a5 a5Var) {
        b();
    }

    public void onEvent(y4 y4Var) {
        throw null;
    }

    public void onEvent(x4 x4Var) {
        int i = x4Var.c;
        int i2 = x4Var.b;
        String str = x4Var.a;
        if (i == 0) {
            lw.f(null, null, i2 > 0);
            String str2 = x4Var.d;
            lw.b(null, null, str.equals(BindInfoDTO.BIND_TYPE_EMAIL_OR_PHONE));
            this.a.b("account_login", "type", str.toLowerCase(), "label", str2.toLowerCase());
        } else if (i < i2) {
            lw.b(null, null, str.equals(BindInfoDTO.BIND_TYPE_EMAIL_OR_PHONE));
            this.a.b("account_bind", "type", str.toLowerCase());
        } else if (i > i2) {
            lw.b(null, null, str.equals(BindInfoDTO.BIND_TYPE_EMAIL_OR_PHONE));
            this.a.b("account_unbind", "type", str.toLowerCase());
        } else {
            lw.g(null, null, null);
        }
        b();
    }
}
