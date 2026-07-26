package defpackage;

import android.media.MediaFormat;
import androidx.media3.common.b;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;

/* JADX INFO: loaded from: classes.dex */
public final class c62 implements f59, em0, ke6 {
    public f59 a;
    public em0 b;
    public f59 c;
    public em0 d;

    @Override // defpackage.em0
    public final void a(long j, float[] fArr) {
        em0 em0Var = this.d;
        if (em0Var != null) {
            em0Var.a(j, fArr);
        }
        em0 em0Var2 = this.b;
        if (em0Var2 != null) {
            em0Var2.a(j, fArr);
        }
    }

    @Override // defpackage.em0
    public final void b() {
        em0 em0Var = this.d;
        if (em0Var != null) {
            em0Var.b();
        }
        em0 em0Var2 = this.b;
        if (em0Var2 != null) {
            em0Var2.b();
        }
    }

    @Override // defpackage.f59
    public final void c(long j, long j2, b bVar, MediaFormat mediaFormat) {
        long j3;
        long j4;
        b bVar2;
        MediaFormat mediaFormat2;
        f59 f59Var = this.c;
        if (f59Var != null) {
            f59Var.c(j, j2, bVar, mediaFormat);
            mediaFormat2 = mediaFormat;
            bVar2 = bVar;
            j4 = j2;
            j3 = j;
        } else {
            j3 = j;
            j4 = j2;
            bVar2 = bVar;
            mediaFormat2 = mediaFormat;
        }
        f59 f59Var2 = this.a;
        if (f59Var2 != null) {
            f59Var2.c(j3, j4, bVar2, mediaFormat2);
        }
    }

    @Override // defpackage.ke6
    public final void e(int i, Object obj) {
        if (i == 7) {
            this.a = (f59) obj;
            return;
        }
        if (i == 8) {
            this.b = (em0) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
        if (sphericalGLSurfaceView == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
            this.d = sphericalGLSurfaceView.getCameraMotionListener();
        }
    }
}
