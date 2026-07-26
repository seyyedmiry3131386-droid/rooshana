package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ vm(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.a
            switch(r0) {
                case 0: goto L30;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            qa r0 = new qa
            r1 = 0
            r0.<init>(r1)
            ql3 r1 = defpackage.dt2.k
            r2 = 0
            android.content.Context r3 = r11.b
            defpackage.dt2.I(r3, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            vm r0 = new vm
            r1 = 2
            android.content.Context r2 = r11.b
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        L30:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lb0
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r5 = r11.b
            r3.<init>(r5, r4)
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lb0
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L89
            zv r0 = defpackage.zm.g
            r0.getClass()
            sv r2 = new sv
            r2.<init>(r0)
        L58:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            zm r0 = (defpackage.zm) r0
            if (r0 == 0) goto L58
            ln r0 = (defpackage.ln) r0
            android.content.Context r0 = r0.k
            if (r0 == 0) goto L58
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L78
        L77:
            r0 = 0
        L78:
            if (r0 == 0) goto L8e
            android.os.LocaleList r0 = defpackage.xm.a(r0)
            yc4 r2 = new yc4
            bd4 r6 = new bd4
            r6.<init>(r0)
            r2.<init>(r6)
            goto L90
        L89:
            yc4 r2 = defpackage.zm.c
            if (r2 == 0) goto L8e
            goto L90
        L8e:
            yc4 r2 = defpackage.yc4.b
        L90:
            ad4 r0 = r2.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La9
            java.lang.String r0 = defpackage.is3.E(r5)
            java.lang.Object r2 = r5.getSystemService(r4)
            if (r2 == 0) goto La9
            android.os.LocaleList r0 = defpackage.wm.a(r0)
            defpackage.xm.b(r2, r0)
        La9:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        Lb0:
            defpackage.zm.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.run():void");
    }
}
