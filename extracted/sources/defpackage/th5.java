package defpackage;

import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class th5 implements FilenameFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ th5(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    @Override // java.io.FilenameFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean accept(java.io.File r4, java.lang.String r5) {
        /*
            r3 = this;
            int r4 = r3.a
            switch(r4) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.String r4 = r3.b
            boolean r4 = r5.startsWith(r4)
            return r4
        Lc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "lib"
            r4.<init>(r0)
            java.lang.String r1 = r3.b
            r4.append(r1)
            java.lang.String r2 = ".so"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            boolean r4 = r5.startsWith(r4)
            if (r4 != 0) goto L42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L4a
            boolean r4 = r1.startsWith(r0)
            if (r4 == 0) goto L4a
        L42:
            boolean r4 = defpackage.uh5.g(r5)
            if (r4 == 0) goto L4a
            r4 = 1
            goto L4b
        L4a:
            r4 = 0
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th5.accept(java.io.File, java.lang.String):boolean");
    }
}
