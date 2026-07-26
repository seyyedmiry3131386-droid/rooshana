package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.media3.common.b;
import com.google.common.base.c;
import ir.mservices.market.common.data.ForceUpdateDto;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public final class pg implements lb0, dq2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public /* synthetic */ pg(int i, int i2, Object obj, String str) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0202, code lost:
    
        r0 = new defpackage.hh2(r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0208, code lost:
    
        if (r9 == 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020b, code lost:
    
        if (r9 == 2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020d, code lost:
    
        r17 = (int[]) r0.b;
        r18 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021b, code lost:
    
        if (r6 == 1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021d, code lost:
    
        if (r6 == 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021f, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022a, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022d, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0230, code lost:
    
        r12 = new android.graphics.LinearGradient(r21, r22, r26, r16, r17, r18, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0234, code lost:
    
        r12 = new android.graphics.SweepGradient(r7, r10, (int[]) r0.b, (float[]) r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0246, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0248, code lost:
    
        r21 = (int[]) r0.b;
        r22 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0258, code lost:
    
        if (r6 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025a, code lost:
    
        if (r6 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0267, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x026a, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026d, code lost:
    
        r12 = new android.graphics.RadialGradient(r7, r10, r25, r21, r22, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0279, code lost:
    
        return new defpackage.pg(r12, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0281, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ed, code lost:
    
        if (r2.size() <= 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ef, code lost:
    
        r0 = new defpackage.hh2(r2, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f5, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f6, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01fa, code lost:
    
        if (r19 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fc, code lost:
    
        r0 = new defpackage.hh2(r5, r11, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.pg d(android.content.res.Resources r27, int r28, android.content.res.Resources.Theme r29) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg.d(android.content.res.Resources, int, android.content.res.Resources$Theme):pg");
    }

    private final /* synthetic */ void s() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        if (r14 == r16) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        return defpackage.kb0.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return new defpackage.kb0(r14, -2, r7 + r4);
     */
    @Override // defpackage.lb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.kb0 a(defpackage.w72 r23, long r24) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg.a(w72, long):kb0");
    }

    public void b() {
        x11 x11Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            aw1.a(drawable);
        }
        if (drawable == null || (x11Var = (x11) this.d) == null) {
            return;
        }
        pn.e(drawable, x11Var, imageView.getDrawableState());
    }

    @Override // defpackage.lb0
    public void c() {
        switch (this.a) {
            case 5:
                break;
            default:
                h26 h26Var = (h26) this.d;
                byte[] bArr = j29.b;
                h26Var.getClass();
                h26Var.H(bArr.length, bArr);
                break;
        }
    }

    public void e(n31 n31Var) {
        for (os4 os4Var : (CopyOnWriteArrayList) this.d) {
            j29.a0(os4Var.a, new lo4(n31Var, os4Var.b, 15));
        }
    }

    public void f(int i, int i2) {
        if (i > 131072) {
            un3.a("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = (int[]) this.c;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            ew.B0(i2, 0, 12, (int[]) this.c, iArr2);
            this.c = iArr2;
        }
    }

    public long g(w72 w72Var) {
        int iJ;
        sd2 sd2Var = (sd2) this.d;
        ud2 ud2Var = (ud2) this.c;
        while (w72Var.f() < w72Var.i() - 6) {
            int i = this.b;
            long jF = w72Var.f();
            byte[] bArr = new byte[2];
            int i2 = 0;
            boolean zP = false;
            w72Var.q(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                w72Var.m();
                w72Var.g((int) (jF - w72Var.getPosition()));
            } else {
                h26 h26Var = new h26(16);
                System.arraycopy(bArr, 0, h26Var.a, 0, 2);
                byte[] bArr2 = h26Var.a;
                while (i2 < 14 && (iJ = w72Var.j(bArr2, 2 + i2, 14 - i2)) != -1) {
                    i2 += iJ;
                }
                h26Var.I(i2);
                w72Var.m();
                w72Var.g((int) (jF - w72Var.getPosition()));
                zP = bt2.p(h26Var, ud2Var, i, sd2Var);
            }
            if (zP) {
                break;
            }
            w72Var.g(1);
        }
        if (w72Var.f() < w72Var.i() - 6) {
            return sd2Var.a;
        }
        w72Var.g((int) (w72Var.i() - w72Var.f()));
        return ud2Var.j;
    }

    public bs3 h(int i) {
        if (i < 0 || i >= this.b) {
            StringBuilder sbR = rm7.r(i, "Index ", ", size ");
            sbR.append(this.b);
            un3.e(sbR.toString());
        }
        bs3 bs3Var = (bs3) this.d;
        if (bs3Var != null) {
            int i2 = bs3Var.a;
            if (i < bs3Var.b + i2 && i2 <= i) {
                return bs3Var;
            }
        }
        zb5 zb5Var = (zb5) this.c;
        bs3 bs3Var2 = (bs3) zb5Var.a[dy3.f(i, zb5Var)];
        this.d = bs3Var2;
        return bs3Var2;
    }

    public Object i(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i2 = this.b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    public String j() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof no7) {
                no7 no7Var = (no7) obj;
                if (!js3.i(no7Var.getKind(), g98.c)) {
                    int i3 = ((int[]) this.d)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(no7Var.f(i3));
                    }
                } else if (((int[]) this.d)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.d)[i2]);
                    sb.append("]");
                }
            } else if (obj != fz1.n) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public void k(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.c;
        int i8 = this.b;
        int i9 = i8 + 3;
        this.b = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            js3.o(jArrCopyOf, "copyOf(...)");
            this.c = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.d, iMax);
            js3.o(jArrCopyOf2, "copyOf(...)");
            this.d = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.c;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i10) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                jArr2[i12] = (j & vy6.a) | (((long) Math.min((i8 - i11) / 3, 1023)) << 50);
                return;
            }
        }
    }

    public boolean m() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void n(da4 da4Var, int i, int i2, b bVar, int i3, Object obj, long j, long j2) {
        e(new ms4(this, da4Var, new op4(i, i2, bVar, i3, obj, j29.k0(j), j29.k0(j2)), 1));
    }

    public void o(da4 da4Var, int i, int i2, b bVar, int i3, Object obj, long j, long j2) {
        e(new ms4(this, da4Var, new op4(i, i2, bVar, i3, obj, j29.k0(j), j29.k0(j2)), 0));
    }

    @Override // defpackage.dq2
    public void onSuccess(Object obj) {
        List list = (List) obj;
        xq4 xq4Var = ((hr4) this.d).g;
        Handler handler = xq4Var.l;
        hq4 hq4Var = (hq4) this.c;
        j29.a0(handler, new lo4(xq4Var, hq4Var, new up4(this.b, 1, this, list, hq4Var)));
    }

    public void p(da4 da4Var, int i, int i2, b bVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        e(new ns4(this, da4Var, new op4(i, i2, bVar, i3, obj, j29.k0(j), j29.k0(j2)), iOException, z));
    }

    public void q(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        sk6 sk6VarD = sk6.D(imageView.getContext(), attributeSet, lu6.AppCompatImageView, i);
        TypedArray typedArray = (TypedArray) sk6VarD.c;
        q69.p(imageView, imageView.getContext(), lu6.AppCompatImageView, attributeSet, (TypedArray) sk6VarD.c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(lu6.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = rf0.v(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                aw1.a(drawable);
            }
            if (typedArray.hasValue(lu6.AppCompatImageView_tint)) {
                imageView.setImageTintList(sk6VarD.t(lu6.AppCompatImageView_tint));
            }
            if (typedArray.hasValue(lu6.AppCompatImageView_tintMode)) {
                imageView.setImageTintMode(aw1.c(typedArray.getInt(lu6.AppCompatImageView_tintMode, -1), null));
            }
            sk6VarD.G();
        } catch (Throwable th) {
            sk6VarD.G();
            throw th;
        }
    }

    public void r(da4 da4Var, int i, int i2, b bVar, int i3, Object obj, long j, long j2, int i4) {
        e(new xc1(this, da4Var, new op4(i, i2, bVar, i3, obj, j29.k0(j), j29.k0(j2)), i4));
    }

    public void t() {
        int i = this.b * 2;
        Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.c, i);
        js3.o(objArrCopyOf, "copyOf(...)");
        this.c = objArrCopyOf;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        ew.B0(0, 0, 14, (int[]) this.d, iArr);
        this.d = iArr;
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return j();
            case 18:
                StringBuilder sb = new StringBuilder();
                if (((Protocol) this.c) == Protocol.c) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        ImageView imageView = (ImageView) this.c;
        if (i != 0) {
            Drawable drawableV = rf0.v(imageView.getContext(), i);
            if (drawableV != null) {
                aw1.a(drawableV);
            }
            imageView.setImageDrawable(drawableV);
        } else {
            imageView.setImageDrawable(null);
        }
        b();
    }

    public List v(CharSequence charSequence) {
        charSequence.getClass();
        xg5 xg5Var = (xg5) this.d;
        xg5Var.getClass();
        c cVar = new c(xg5Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (cVar.hasNext()) {
            arrayList.add((String) cVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void w(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i3 = this.b;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = z ? 1L : 0L;
                jArr[i5] = (j2 * Long.MIN_VALUE) | (8070450532247928831L & j) | (1152921504606846976L * j2);
                return;
            }
        }
    }

    public void x(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.c;
        long[] jArr2 = (long[]) this.d;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.b : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i11] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        jArr2[i4] = (vy6.b & j3) | (((long) ((i7 + 3) & i3)) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public void y(int i, sp2 sp2Var) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i3 = this.b;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                sp2Var.g(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public /* synthetic */ pg(int i, boolean z) {
        this.a = i;
    }

    public pg(String str, String[] strArr) {
        String string;
        this.a = 8;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.d = string;
        this.c = str;
        int i = 2;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            while (i <= 7 && !Log.isLoggable((String) this.c, i)) {
                i++;
            }
            this.b = i;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public pg(String str, int i, ForceUpdateDto forceUpdateDto) {
        this.a = 14;
        this.c = str;
        this.b = i;
        this.d = forceUpdateDto != null ? Long.valueOf(forceUpdateDto.getFileLength()) : null;
    }

    public pg(int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.c = new zb5(0, new bs3[16]);
                break;
            default:
                this.c = new int[16];
                this.d = new ov();
                break;
        }
    }

    public pg(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = 0;
        this.c = arrayList;
        this.b = i;
        this.d = motionEvent;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }

    @Override // defpackage.dq2
    public void onFailure(Throwable th) {
    }

    public pg(ImageView imageView) {
        this.a = 1;
        this.b = 0;
        this.c = imageView;
    }

    public pg(y45 y45Var) {
        this.a = 16;
        this.c = new SparseArray();
        this.d = y45Var;
        this.b = -1;
    }

    public pg(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 3;
        this.c = shader;
        this.d = colorStateList;
        this.b = i;
    }

    public pg(ud2 ud2Var, int i) {
        this.a = 5;
        this.c = ud2Var;
        this.b = i;
        this.d = new sd2();
    }

    public pg(int i, hm8 hm8Var) {
        this.a = 19;
        this.b = i;
        this.c = hm8Var;
        this.d = new h26();
    }

    public pg(xg5 xg5Var) {
        this.a = 17;
        this.d = xg5Var;
        this.c = up0.a;
        this.b = Integer.MAX_VALUE;
    }

    public pg(CopyOnWriteArrayList copyOnWriteArrayList, int i, ks4 ks4Var) {
        this.a = 11;
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = ks4Var;
    }

    public pg(v69 v69Var) {
        this.a = 2;
        this.c = v69Var;
    }

    public pg(x41 x41Var) {
        this.a = 4;
        this.d = ml9.y(150, new qm5(19, this));
        this.c = x41Var;
    }

    public pg(hr4 hr4Var, hq4 hq4Var, int i) {
        this.a = 10;
        this.d = hr4Var;
        this.c = hq4Var;
        this.b = i;
    }
}
