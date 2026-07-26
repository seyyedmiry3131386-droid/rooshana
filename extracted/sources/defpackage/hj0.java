package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hj0 implements j67 {
    public static final gv f = new gv(4);
    public static final ca7 g = new ca7(12);
    public final Context a;
    public final ArrayList b;
    public final nc2 e;
    public final gv d = f;
    public final ca7 c = g;

    public hj0(Context context, ArrayList arrayList, pc0 pc0Var, dr3 dr3Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.e = new nc2(pc0Var, dr3Var, 4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x005b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // defpackage.j67
    public final defpackage.g67 a(java.lang.Object r8, int r9, int r10, defpackage.sv5 r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            ca7 r8 = r7.c
            monitor-enter(r8)
            java.lang.Object r0 = r8.b     // Catch: java.lang.Throwable -> L56
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L56
            ws2 r0 = (defpackage.ws2) r0     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L17
            ws2 r0 = new ws2     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
        L17:
            r5 = r0
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L59
        L1d:
            r0 = 0
            r5.b = r0     // Catch: java.lang.Throwable -> L56
            byte[] r0 = r5.a     // Catch: java.lang.Throwable -> L56
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L56
            vs2 r0 = new vs2     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            r5.c = r0     // Catch: java.lang.Throwable -> L56
            r5.d = r1     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L56
            r5.b = r0     // Catch: java.lang.Throwable -> L56
            r0.position(r1)     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r5.b     // Catch: java.lang.Throwable -> L56
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L56
            r0.order(r1)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            os2 r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            ca7 r9 = r1.c
            r9.k(r5)
            return r8
        L4e:
            r0 = move-exception
            r8 = r0
            ca7 r9 = r1.c
            r9.k(r5)
            throw r8
        L56:
            r0 = move-exception
            r1 = r7
        L58:
            r9 = r0
        L59:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5b
            throw r9
        L5b:
            r0 = move-exception
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj0.a(java.lang.Object, int, int, sv5):g67");
    }

    @Override // defpackage.j67
    public final boolean b(Object obj, sv5 sv5Var) {
        return !((Boolean) sv5Var.c(xs2.b)).booleanValue() && ok4.G(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final os2 c(ByteBuffer byteBuffer, int i, int i2, ws2 ws2Var, sv5 sv5Var) {
        int i3 = md4.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            vs2 vs2VarB = ws2Var.b();
            if (vs2VarB.c > 0 && vs2VarB.b == 0) {
                Bitmap.Config config = sv5Var.c(xs2.a) == DecodeFormat.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(vs2VarB.g / i2, vs2VarB.f / i);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                gv gvVar = this.d;
                nc2 nc2Var = this.e;
                gvVar.getClass();
                k48 k48Var = new k48(nc2Var, vs2VarB, byteBuffer, iMax);
                k48Var.c(config);
                k48Var.k = (k48Var.k + 1) % k48Var.l.c;
                Bitmap bitmapB = k48Var.b();
                if (bitmapB != null) {
                    os2 os2Var = new os2(new ns2(new gk(2, new us2(a.a(this.a), k48Var, i, i2, bitmapB))), 0);
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return os2Var;
                }
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                    return null;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
