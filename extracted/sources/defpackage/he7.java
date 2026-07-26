package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.b;
import androidx.media3.common.util.GlUtil$GlException;
import io.sentry.android.core.t0;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class he7 implements f59, em0 {
    public int i;
    public SurfaceTexture j;
    public byte[] m;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final xm6 c = new xm6();
    public final ry d = new ry(5);
    public final aj0 e = new aj0(10, (byte) 0);
    public final aj0 f = new aj0(10, (byte) 0);
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public volatile int k = 0;
    public int l = -1;

    @Override // defpackage.em0
    public final void a(long j, float[] fArr) {
        ((aj0) this.d.e).a(j, fArr);
    }

    @Override // defpackage.em0
    public final void b() {
        this.e.e();
        ry ryVar = this.d;
        ((aj0) ryVar.e).e();
        ryVar.b = false;
        this.b.set(true);
    }

    @Override // defpackage.f59
    public final void c(long j, long j2, b bVar, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListC;
        int iJ;
        this.e.a(j2, Long.valueOf(j));
        byte[] bArr = bVar.B;
        int i2 = bVar.C;
        byte[] bArr2 = this.m;
        int i3 = this.l;
        this.m = bArr;
        if (i2 == -1) {
            i2 = this.k;
        }
        this.l = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        wm6 wm6Var = null;
        if (bArr3 != null) {
            int i4 = this.l;
            h26 h26Var = new h26(bArr3);
            try {
                h26Var.K(4);
                iJ = h26Var.j();
                h26Var.J(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iJ == 1886547818) {
                h26Var.K(8);
                int i5 = h26Var.b;
                int i6 = h26Var.c;
                while (i5 < i6) {
                    int iJ2 = h26Var.j() + i5;
                    if (iJ2 > i5 && iJ2 <= i6) {
                        int iJ3 = h26Var.j();
                        if (iJ3 != 2037673328 && iJ3 != 1836279920) {
                            h26Var.J(iJ2);
                            i5 = iJ2;
                        }
                        h26Var.I(iJ2);
                        arrayListC = xq2.C(h26Var);
                        break;
                    }
                    break;
                }
                arrayListC = null;
            } else {
                arrayListC = xq2.C(h26Var);
            }
            if (arrayListC != null) {
                int size = arrayListC.size();
                if (size == 1) {
                    vm6 vm6Var = (vm6) arrayListC.get(0);
                    wm6Var = new wm6(vm6Var, vm6Var, i4);
                } else if (size == 2) {
                    wm6Var = new wm6((vm6) arrayListC.get(0), (vm6) arrayListC.get(1), i4);
                }
            }
        }
        if (wm6Var == null || !xm6.b(wm6Var)) {
            int i7 = this.l;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 36; i8 < i11; i11 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i8 * f) - f3;
                int i12 = i8 + 1;
                float f5 = (i12 * f) - f3;
                int i13 = 0;
                while (i13 < 73) {
                    int i14 = i12;
                    float f6 = f5;
                    float f7 = radians;
                    int i15 = i9;
                    int i16 = i10;
                    int i17 = 0;
                    int i18 = 2;
                    while (i17 < i18) {
                        float f8 = i17 == 0 ? f4 : f6;
                        float f9 = radians2;
                        float f10 = i13 * f2;
                        float f11 = f4;
                        float f12 = f;
                        double d = 50.0f;
                        double d2 = (f10 + 3.1415927f) - (f9 / 2.0f);
                        double d3 = f8;
                        fArr[i15] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        fArr[i15 + 1] = (float) (Math.sin(d3) * d);
                        int i19 = i15 + 3;
                        fArr[i15 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr2[i16] = f10 / f9;
                        int i20 = i16 + 2;
                        fArr2[i16 + 1] = ((i8 + i17) * f12) / f7;
                        if ((i13 == 0 && i17 == 0) || (i13 == 72 && i17 == 1)) {
                            System.arraycopy(fArr, i15, fArr, i19, 3);
                            i15 += 6;
                            i = 2;
                            System.arraycopy(fArr2, i16, fArr2, i20, 2);
                            i16 += 4;
                        } else {
                            i = 2;
                            i15 = i19;
                            i16 = i20;
                        }
                        i17++;
                        i18 = i;
                        radians2 = f9;
                        f4 = f11;
                        f = f12;
                    }
                    i13++;
                    i9 = i15;
                    i10 = i16;
                    i12 = i14;
                    f5 = f6;
                    radians = f7;
                    radians2 = radians2;
                    f = f;
                }
                i8 = i12;
            }
            vm6 vm6Var2 = new vm6(new aj0(0, 1, fArr, fArr2));
            wm6Var = new wm6(vm6Var2, vm6Var2, i7);
        }
        this.f.a(j2, wm6Var);
    }

    public final void d(float[] fArr) {
        Object objR;
        GLES20.glClear(16384);
        try {
            is3.i();
        } catch (GlUtil$GlException e) {
            wn5.H("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                is3.i();
            } catch (GlUtil$GlException e2) {
                wn5.H("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.g, 0);
            }
            long timestamp = this.j.getTimestamp();
            aj0 aj0Var = this.e;
            synchronized (aj0Var) {
                objR = aj0Var.r(timestamp, false);
            }
            Long l = (Long) objR;
            if (l != null) {
                ry ryVar = this.d;
                float[] fArr2 = this.g;
                float[] fArr3 = (float[]) ((aj0) ryVar.e).t(l.longValue());
                if (fArr3 != null) {
                    float[] fArr4 = (float[]) ryVar.d;
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!ryVar.b) {
                        ry.d((float[]) ryVar.c, (float[]) ryVar.d);
                        ryVar.b = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) ryVar.c, 0, (float[]) ryVar.d, 0);
                }
            }
            wm6 wm6Var = (wm6) this.f.t(timestamp);
            if (wm6Var != null) {
                xm6 xm6Var = this.c;
                xm6Var.getClass();
                if (xm6.b(wm6Var)) {
                    xm6Var.a = wm6Var.c;
                    xm6Var.b = new aj0(wm6Var.a.a[0]);
                    if (!wm6Var.d) {
                        new aj0(wm6Var.b.a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.h, 0, fArr, 0, this.g, 0);
        xm6 xm6Var2 = this.c;
        int i = this.i;
        float[] fArr5 = this.h;
        aj0 aj0Var2 = xm6Var2.b;
        if (aj0Var2 == null) {
            return;
        }
        int i2 = xm6Var2.a;
        GLES20.glUniformMatrix3fv(xm6Var2.e, 1, false, i2 == 1 ? xm6.j : i2 == 2 ? xm6.k : xm6.i, 0);
        GLES20.glUniformMatrix4fv(xm6Var2.d, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(xm6Var2.h, 0);
        try {
            is3.i();
        } catch (GlUtil$GlException e3) {
            t0.e("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(xm6Var2.f, 3, 5126, false, 12, (Buffer) aj0Var2.d);
        try {
            is3.i();
        } catch (GlUtil$GlException e4) {
            t0.e("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(xm6Var2.g, 2, 5126, false, 8, (Buffer) aj0Var2.e);
        try {
            is3.i();
        } catch (GlUtil$GlException e5) {
            t0.e("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(aj0Var2.c, 0, aj0Var2.b);
        try {
            is3.i();
        } catch (GlUtil$GlException e6) {
            t0.e("ProjectionRenderer", "Failed to render", e6);
        }
    }

    public final SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            is3.i();
            this.c.a();
            is3.i();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            is3.i();
            int i = iArr[0];
            is3.f(36197, i);
            this.i = i;
        } catch (GlUtil$GlException e) {
            wn5.H("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ge7
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.a.a.set(true);
            }
        });
        return this.j;
    }
}
