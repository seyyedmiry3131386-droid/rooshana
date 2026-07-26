package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ko2 implements b81 {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            defpackage.ko2.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko2.<clinit>():void");
    }

    public ko2(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
