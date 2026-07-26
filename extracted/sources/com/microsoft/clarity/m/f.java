package com.microsoft.clarity.m;

import com.microsoft.clarity.a.K;
import com.microsoft.clarity.models.display.common.IRect;
import com.microsoft.clarity.models.display.images.Image;
import defpackage.js3;
import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e {
    @Override // com.microsoft.clarity.m.e
    /* JADX INFO: renamed from: b */
    public final Image a(d dVar) throws IOException {
        byte[] bArr;
        js3.p(dVar, "buffer");
        int iD = dVar.d();
        int iL = dVar.l();
        byte[] bArr2 = null;
        if (Integer.compare(iL ^ Integer.MIN_VALUE, Integer.MIN_VALUE) > 0) {
            bArr = new byte[iL];
            dVar.a(bArr, 0, iL, false);
            dVar.a((((iL + 3) >>> 2) << 2) - iL, false);
        } else {
            bArr = null;
        }
        IRect iRect = (iD & 256) != 0 ? new IRect(dVar.d(), dVar.d(), dVar.d(), dVar.d()) : null;
        if ((iD & 512) != 0) {
            int iL2 = dVar.l();
            if (Integer.compare(iL2 ^ Integer.MIN_VALUE, Integer.MIN_VALUE) > 0) {
                bArr2 = new byte[iL2];
                dVar.a(bArr2, 0, iL2, false);
                dVar.a((((iL2 + 3) >>> 2) << 2) - iL2, false);
            }
        }
        if (bArr == null) {
            return K.a;
        }
        MessageDigest messageDigest = com.microsoft.clarity.q.c.a;
        messageDigest.reset();
        return new Image(iRect, bArr, com.microsoft.clarity.q.c.a(messageDigest, bArr), bArr2);
    }
}
