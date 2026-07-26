package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class vs8 implements RequestDTO, b59, wt0, ry1 {
    public static r79 c(x79 x79Var, q79 q79Var) {
        l71 l71VarI = x79Var instanceof jx2 ? ((jx2) x79Var).i() : j71.b;
        js3.p(q79Var, "factory");
        js3.p(l71VarI, "extras");
        return new r79(x79Var.m(), q79Var, l71VarI);
    }

    @Override // defpackage.wt0
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.b59
    public void b(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ry1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.rz5 d(android.content.Context r3, java.lang.String r4, defpackage.qy1 r5) {
        /*
            r2 = this;
            rz5 r0 = new rz5
            r0.<init>()
            int r1 = r5.c(r3, r4)
            r0.a = r1
            r1 = 1
            int r3 = r5.b(r3, r4, r1)
            r0.b = r3
            int r4 = r0.a
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs8.d(android.content.Context, java.lang.String, qy1):rz5");
    }

    public boolean e(CharSequence charSequence) {
        return charSequence instanceof vi6;
    }

    @Override // defpackage.b59
    public void f(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
