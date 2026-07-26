package ir.mservices.market.pika.send.filter;

import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaAppFilter extends GeneralFilter {
    public final String b;

    public PikaAppFilter(GeneralFilter generalFilter, String str) {
        super(generalFilter);
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @Override // ir.mservices.market.common.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(ir.mservices.market.common.ui.recycler.MyketRecyclerData r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = r5.b
            if (r2 == 0) goto L2b
            boolean r3 = r6 instanceof defpackage.k76
            r4 = 0
            if (r3 == 0) goto Lf
            r3 = r6
            k76 r3 = (defpackage.k76) r3
            goto L10
        Lf:
            r3 = r4
        L10:
            if (r3 == 0) goto L24
            ir.mservices.market.pika.send.recycler.InstalledAppData r3 = (ir.mservices.market.pika.send.recycler.InstalledAppData) r3
            java.lang.String r3 = r3.b
            java.lang.String r4 = "appName"
            defpackage.js3.p(r3, r4)
            boolean r2 = defpackage.f88.c0(r3, r2, r1)
            r2 = r2 ^ r1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
        L24:
            if (r4 == 0) goto L2b
            boolean r2 = r4.booleanValue()
            goto L2c
        L2b:
            r2 = r0
        L2c:
            if (r2 != 0) goto L3c
            ir.mservices.market.common.Filter r2 = r5.a
            if (r2 == 0) goto L37
            boolean r6 = r2.u(r6)
            goto L38
        L37:
            r6 = r0
        L38:
            if (r6 == 0) goto L3b
            goto L3c
        L3b:
            return r0
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.pika.send.filter.PikaAppFilter.u(ir.mservices.market.common.ui.recycler.MyketRecyclerData):boolean");
    }
}
