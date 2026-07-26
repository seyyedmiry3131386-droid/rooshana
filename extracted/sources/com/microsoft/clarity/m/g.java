package com.microsoft.clarity.m;

import com.microsoft.clarity.a.K;
import com.microsoft.clarity.models.display.common.IRect;
import com.microsoft.clarity.models.display.images.Image;
import defpackage.js3;
import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends e {
    @Override // com.microsoft.clarity.m.e
    /* JADX INFO: renamed from: b */
    public final Image a(d dVar) throws IOException {
        js3.p(dVar, "buffer");
        IRect iRect = new IRect(dVar.d(), dVar.d(), dVar.d(), dVar.d());
        int iL = dVar.l();
        if (iL == 0) {
            return K.a;
        }
        byte[] bArr = new byte[iL];
        dVar.a(bArr, 0, iL, false);
        dVar.a((((iL + 3) >>> 2) << 2) - iL, false);
        MessageDigest messageDigest = com.microsoft.clarity.q.c.a;
        messageDigest.reset();
        return new Image(iRect, bArr, com.microsoft.clarity.q.c.a(messageDigest, bArr), null);
    }
}
