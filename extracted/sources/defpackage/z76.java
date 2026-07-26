package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z76 extends z {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    @Override // defpackage.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dr3 a(defpackage.er3 r8, defpackage.q0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "intentFragmentFactory"
            defpackage.js3.p(r8, r0)
            ir.mservices.market.version2.fragments.dialog.DialogDataModel r2 = new ir.mservices.market.version2.fragments.dialog.DialogDataModel
            java.lang.Class<z76> r0 = defpackage.z76.class
            java.lang.String r0 = r0.getSimpleName()
            r1 = 0
            r3 = 12
            java.lang.String r4 = "DIALOG_KEY_NO_RESULT"
            r2.<init>(r0, r4, r1, r3)
            qu2 r0 = r8.e
            android.content.Context r1 = r9.a
            r0.getClass()
            boolean r0 = defpackage.qu2.e(r1)
            if (r0 != 0) goto L34
            qu2 r8 = r8.e
            r8.getClass()
            boolean r8 = defpackage.qu2.d(r1)
            if (r8 == 0) goto L2e
            goto L34
        L2e:
            ir.mservices.market.data.NavIntentDirections$PikaHome r8 = new ir.mservices.market.data.NavIntentDirections$PikaHome
            r8.<init>()
            goto L4c
        L34:
            ir.mservices.market.data.NavIntentDirections$AlertCenter r8 = new ir.mservices.market.data.NavIntentDirections$AlertCenter
            od r1 = new od
            int r0 = defpackage.rs6.gms_not_supported_on_device
            java.lang.String r4 = r9.b(r0)
            int r0 = defpackage.rs6.button_ok
            java.lang.String r5 = r9.b(r0)
            r6 = 0
            r3 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r8.<init>(r1)
        L4c:
            dr3 r9 = new dr3
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z76.a(er3, q0):dr3");
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_pika), true);
    }
}
