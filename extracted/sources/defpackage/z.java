package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z extends r0 {
    public static int a;
    public static boolean b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    @Override // defpackage.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(defpackage.q0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "analysedIntent"
            defpackage.js3.p(r3, r0)
            int r0 = java.lang.System.identityHashCode(r3)
            int r1 = defpackage.z.a
            if (r1 == 0) goto Lf
            if (r1 == r0) goto L49
        Lf:
            defpackage.z.a = r0
            android.content.Intent r3 = r3.b
            java.lang.String r3 = r3.getAction()
            if (r3 == 0) goto L46
            int r0 = r3.hashCode()
            switch(r0) {
                case -1173171990: goto L3c;
                case 1624720262: goto L33;
                case 1639291568: goto L2a;
                case 1790957502: goto L21;
                default: goto L20;
            }
        L20:
            goto L46
        L21:
            java.lang.String r0 = "android.intent.action.INSERT"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L44
            goto L46
        L2a:
            java.lang.String r0 = "android.intent.action.DELETE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L44
            goto L46
        L33:
            java.lang.String r0 = "android.intent.action.RUN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L44
            goto L46
        L3c:
            java.lang.String r0 = "android.intent.action.VIEW"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L46
        L44:
            r3 = 1
            goto L47
        L46:
            r3 = 0
        L47:
            defpackage.z.b = r3
        L49:
            boolean r3 = defpackage.z.b
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z.b(q0):boolean");
    }
}
