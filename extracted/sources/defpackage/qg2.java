package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qg2 {
    public static final qg2 b = new qg2();
    public static final qg2 c = new qg2();
    public static final qg2 d = new qg2();
    public final zb5 a = new zb5(0, new sg2[16]);

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0046, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r14 = this;
            qg2 r0 = defpackage.qg2.b
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r14 == r0) goto Lc1
            qg2 r0 = defpackage.qg2.c
            if (r14 == r0) goto Lbb
            zb5 r0 = r14.a
            int r1 = r0.c
            r2 = 0
            if (r1 != 0) goto L19
            java.lang.String r0 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            return r2
        L19:
            java.lang.Object[] r0 = r0.a
            r3 = r2
            r4 = r3
        L1d:
            if (r3 >= r1) goto Lba
            r5 = r0[r3]
            sg2 r5 = (defpackage.sg2) r5
            gx4 r5 = (defpackage.gx4) r5
            gx4 r6 = r5.a
            boolean r6 = r6.n
            if (r6 != 0) goto L30
            java.lang.String r6 = "visitChildren called on an unattached node"
            defpackage.rn3.b(r6)
        L30:
            zb5 r6 = new zb5
            r7 = 16
            gx4[] r8 = new defpackage.gx4[r7]
            r6.<init>(r2, r8)
            gx4 r5 = r5.a
            gx4 r8 = r5.f
            if (r8 != 0) goto L43
            defpackage.y40.g(r6, r5)
            goto L46
        L43:
            r6.b(r8)
        L46:
            int r5 = r6.c
            if (r5 == 0) goto Lb6
            int r5 = r5 + (-1)
            java.lang.Object r5 = r6.l(r5)
            gx4 r5 = (defpackage.gx4) r5
            int r8 = r5.d
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L5c
            defpackage.y40.g(r6, r5)
            goto L46
        L5c:
            if (r5 == 0) goto L46
            int r8 = r5.c
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Lb3
            r8 = 0
            r9 = r8
        L66:
            if (r5 == 0) goto L46
            boolean r10 = r5 instanceof androidx.compose.ui.focus.d
            r11 = 1
            if (r10 == 0) goto L78
            androidx.compose.ui.focus.d r5 = (androidx.compose.ui.focus.d) r5
            r10 = 7
            boolean r5 = r5.J0(r10)
            if (r5 == 0) goto Lae
            r4 = r11
            goto Lb6
        L78:
            int r10 = r5.c
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto Lae
            boolean r10 = r5 instanceof defpackage.ti1
            if (r10 == 0) goto Lae
            r10 = r5
            ti1 r10 = (defpackage.ti1) r10
            gx4 r10 = r10.p
            r12 = r2
        L88:
            if (r10 == 0) goto Lab
            int r13 = r10.c
            r13 = r13 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto La8
            int r12 = r12 + 1
            if (r12 != r11) goto L96
            r5 = r10
            goto La8
        L96:
            if (r9 != 0) goto L9f
            zb5 r9 = new zb5
            gx4[] r13 = new defpackage.gx4[r7]
            r9.<init>(r2, r13)
        L9f:
            if (r5 == 0) goto La5
            r9.b(r5)
            r5 = r8
        La5:
            r9.b(r10)
        La8:
            gx4 r10 = r10.f
            goto L88
        Lab:
            if (r12 != r11) goto Lae
            goto L66
        Lae:
            gx4 r5 = defpackage.y40.j(r9)
            goto L66
        Lb3:
            gx4 r5 = r5.f
            goto L5c
        Lb6:
            int r3 = r3 + 1
            goto L1d
        Lba:
            return r4
        Lbb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lc1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg2.a():boolean");
    }
}
