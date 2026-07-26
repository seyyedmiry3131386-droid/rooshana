package defpackage;

import ir.mservices.market.version2.services.b;

/* JADX INFO: loaded from: classes3.dex */
public final class d27 extends ep7 {
    public b l;
    public c5 m;
    public ee n;
    public lu7 o;

    @Override // defpackage.ep7
    public final boolean g() {
        if (b() == 0) {
            return true;
        }
        if (this.i == null) {
            this.i = Long.valueOf(this.d.d(this.b));
        }
        return this.i.longValue() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    @Override // defpackage.ep7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = ""
            lu7 r1 = r8.o
            java.lang.String r2 = defpackage.lu7.W
            r3 = 0
            boolean r1 = r1.b(r2, r3)
            lu7 r2 = r8.o
            java.lang.String r4 = defpackage.lu7.X
            r5 = 1
            boolean r2 = r2.b(r4, r5)
            if (r1 != 0) goto Lb6
            if (r2 == 0) goto Lb6
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L46
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L46
            android.content.Context r6 = r8.g     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L46
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L46
            java.lang.String r7 = "invitor.txt"
            java.io.InputStream r6 = r6.open(r7)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L46
            java.lang.String r7 = "UTF-8"
            r4.<init>(r6, r7)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L46
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L46
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3d
            r2.close()     // Catch: java.io.IOException -> L4b
            r0 = r1
            goto L4b
        L3a:
            r0 = move-exception
            r1 = r2
            goto L40
        L3d:
            r1 = r2
            goto L46
        L3f:
            r0 = move-exception
        L40:
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.io.IOException -> L45
        L45:
            throw r0
        L46:
            if (r1 == 0) goto L4b
            r1.close()     // Catch: java.io.IOException -> L4b
        L4b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lab
            lu7 r1 = r8.o
            java.lang.String r2 = defpackage.lu7.X
            r1.j(r2, r5)
            c5 r1 = r8.m
            java.lang.String r1 = r1.a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto La7
            ir.mservices.market.version2.webapi.requestdto.ReferrerRequestDTO r1 = new ir.mservices.market.version2.webapi.requestdto.ReferrerRequestDTO
            r1.<init>()
            c5 r2 = r8.m
            java.lang.String r2 = r2.b()
            r1.setUuid(r2)
            r1.setReferrerId(r0)
            int r2 = r0.length()
            java.lang.String r4 = "referrer"
            r5 = 36
            if (r2 <= r5) goto L89
            ee r2 = r8.n
            java.lang.String r0 = r0.substring(r3, r5)
            r2.c(r4, r0)
            goto L8e
        L89:
            ee r2 = r8.n
            r2.c(r4, r0)
        L8e:
            ir.mservices.market.version2.services.b r0 = r8.l
            c5 r2 = r8.m
            java.lang.String r2 = r2.a()
            vo4 r3 = new vo4
            r4 = 7
            r3.<init>(r4, r8)
            ck4 r4 = new ck4
            r5 = 13
            r4.<init>(r5, r8)
            r0.i(r2, r1, r3, r4)
            goto Lb5
        La7:
            r8.i(r3)
            goto Lb5
        Lab:
            lu7 r0 = r8.o
            java.lang.String r1 = defpackage.lu7.X
            r0.j(r1, r3)
            r8.i(r5)
        Lb5:
            return
        Lb6:
            r8.i(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d27.h():void");
    }
}
