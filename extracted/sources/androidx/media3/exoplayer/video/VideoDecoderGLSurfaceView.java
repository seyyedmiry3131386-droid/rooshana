package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import defpackage.c59;
import defpackage.d59;
import defpackage.e59;

/* JADX INFO: loaded from: classes.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements e59 {
    public static final /* synthetic */ int b = 0;
    public final c59 a;

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(d59 d59Var) {
        c59 c59Var = this.a;
        if (c59Var.f.getAndSet(d59Var) != null) {
            throw new ClassCastException();
        }
        c59Var.a.requestRender();
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c59 c59Var = new c59(this);
        this.a = c59Var;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c59Var);
        setRenderMode(0);
    }

    @Deprecated
    public e59 getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
