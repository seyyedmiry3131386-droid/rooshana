package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yp extends z {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    @Override // defpackage.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dr3 a(defpackage.er3 r19, defpackage.q0 r20) throws java.io.UnsupportedEncodingException {
        /*
            r18 = this;
            r0 = r20
            java.lang.String r1 = "intentFragmentFactory"
            r2 = r19
            defpackage.js3.p(r2, r1)
            java.util.List r1 = r0.d()
            java.lang.String r2 = "app"
            r3 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.indexOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L1c
        L1b:
            r1 = r3
        L1c:
            r4 = 1
            if (r1 == 0) goto L31
            int r1 = r1.intValue()
            java.util.List r5 = r0.e()
            if (r5 == 0) goto L31
            int r1 = r1 + r4
            java.lang.Object r1 = kotlin.collections.a.q0(r1, r5)
            java.lang.String r1 = (java.lang.String) r1
            goto L32
        L31:
            r1 = r3
        L32:
            if (r1 != 0) goto L53
            java.lang.String r5 = r0.c()
            if (r5 == 0) goto L53
            int r6 = defpackage.rs6.bazaar_domain
            java.lang.String r6 = r0.b(r6)
            r7 = 0
            boolean r5 = defpackage.f88.c0(r5, r6, r7)
            if (r5 != r4) goto L53
            android.content.Intent r1 = r0.b
            android.net.Uri r1 = r1.getData()
            java.lang.String r4 = "id"
            java.lang.String r1 = defpackage.js8.p(r1, r4)
        L53:
            java.lang.String r15 = r0.l
            if (r1 == 0) goto L75
            boolean r0 = defpackage.f88.n0(r1)
            if (r0 == 0) goto L5e
            goto L75
        L5e:
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r4 = "[^A-Za-z0-9_.]"
            r0.<init>(r4)
            java.lang.String r4 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r4)
            java.lang.String r4 = "decode(...)"
            defpackage.js3.o(r1, r4)
            java.lang.String r0 = r0.g(r1)
            goto L76
        L75:
            r0 = r3
        L76:
            if (r0 == 0) goto La9
            boolean r1 = defpackage.f88.n0(r0)
            if (r1 != 0) goto L80
            r5 = r0
            goto L81
        L80:
            r5 = r3
        L81:
            if (r5 == 0) goto La9
            ir.mservices.market.data.NavIntentDirections$AppDetail r0 = new ir.mservices.market.data.NavIntentDirections$AppDetail
            ir.mservices.market.app.detail.ui.Tracker r7 = new ir.mservices.market.app.detail.ui.Tracker
            java.lang.String r1 = "externalLink"
            java.lang.String r3 = "U3RvcmU="
            r7.<init>(r1, r3, r2)
            hp r4 = new hp
            r16 = 0
            r17 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "U3RvcmU="
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.<init>(r4)
            dr3 r1 = new dr3
            r1.<init>(r0)
            return r1
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp.a(er3, q0):dr3");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // defpackage.z, defpackage.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.q0 r7) {
        /*
            r6 = this;
            boolean r0 = super.b(r7)
            r1 = 0
            if (r0 == 0) goto L53
            java.lang.String r0 = r7.c()
            int r2 = defpackage.rs6.bazaar_domain
            java.lang.String r2 = r7.b(r2)
            r3 = 1
            boolean r0 = defpackage.m88.T(r0, r2, r3)
            if (r0 == 0) goto L53
            java.util.List r0 = r7.d()
            r2 = 0
            if (r0 == 0) goto L4f
            int r4 = defpackage.rs6.external_intent_filters_path_detail
            android.content.Context r7 = r7.a
            java.lang.String r7 = r7.getString(r4)
            defpackage.js3.m(r7)
            boolean r4 = defpackage.f88.n0(r7)
            if (r4 != 0) goto L39
            char r4 = r7.charAt(r1)
            r5 = 47
            if (r4 != r5) goto L39
            goto L3a
        L39:
            r7 = r2
        L3a:
            if (r7 == 0) goto L46
            java.lang.String r7 = r7.substring(r3)
            java.lang.String r4 = "substring(...)"
            defpackage.js3.o(r7, r4)
            goto L47
        L46:
            r7 = r2
        L47:
            int r7 = r0.indexOf(r7)
            r4 = -1
            if (r7 == r4) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            if (r0 == 0) goto L53
            return r3
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp.b(q0):boolean");
    }
}
