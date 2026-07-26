package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k48 {
    public int[] a;
    public final nc2 c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public vs2 l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public k48(nc2 nc2Var, vs2 vs2Var, ByteBuffer byteBuffer, int i) {
        this.c = nc2Var;
        this.l = new vs2();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = vs2Var;
                this.k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = vs2Var.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((qs2) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = iHighestOneBit;
                int i2 = vs2Var.f;
                this.r = i2 / iHighestOneBit;
                int i3 = vs2Var.g;
                this.q = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                dr3 dr3Var = (dr3) this.c.c;
                this.i = dr3Var == null ? new byte[i4] : (byte[]) dr3Var.d(i4, byte[].class);
                nc2 nc2Var2 = this.c;
                int i5 = this.r * this.q;
                dr3 dr3Var2 = (dr3) nc2Var2.c;
                this.j = dr3Var2 == null ? new int[i5] : (int[]) dr3Var2.d(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.s;
        Bitmap bitmapA = ((pc0) this.c.b).a(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.l.c <= 0 || this.k < 0) {
                if (Log.isLoggable("k48", 3)) {
                    int i = this.l.c;
                }
                this.o = 1;
            }
            int i2 = this.o;
            if (i2 != 1 && i2 != 2) {
                this.o = 0;
                if (this.e == null) {
                    dr3 dr3Var = (dr3) this.c.c;
                    this.e = dr3Var == null ? new byte[255] : (byte[]) dr3Var.d(255, byte[].class);
                }
                qs2 qs2Var = (qs2) this.l.e.get(this.k);
                int i3 = this.k - 1;
                qs2 qs2Var2 = i3 >= 0 ? (qs2) this.l.e.get(i3) : null;
                int[] iArr = qs2Var.k;
                if (iArr == null) {
                    iArr = this.l.a;
                }
                this.a = iArr;
                if (iArr == null) {
                    this.o = 1;
                    return null;
                }
                if (qs2Var.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.a = iArr2;
                    iArr2[qs2Var.h] = 0;
                    if (qs2Var.g == 2 && this.k == 0) {
                        this.s = Boolean.TRUE;
                    }
                }
                return d(qs2Var, qs2Var2);
            }
            return null;
        } finally {
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v23, types: [short] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d(defpackage.qs2 r36, defpackage.qs2 r37) {
        /*
            Method dump skipped, instruction units count: 1039
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k48.d(qs2, qs2):android.graphics.Bitmap");
    }
}
