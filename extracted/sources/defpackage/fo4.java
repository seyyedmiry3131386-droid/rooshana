package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
public final class fo4 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ go4 a;

    public fo4(go4 go4Var) {
        this.a = go4Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        go4 go4Var = this.a;
        TextureView textureView = go4Var.B;
        if (textureView == null || textureView.getSurfaceTexture() != surfaceTexture) {
            return;
        }
        go4Var.z = new Surface(surfaceTexture);
        go4Var.r0(new eo4(this, 2));
        go4Var.A0(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        go4 go4Var = this.a;
        TextureView textureView = go4Var.B;
        if (textureView != null && textureView.getSurfaceTexture() == surfaceTexture) {
            go4Var.z = null;
            go4Var.r0(new eo4(this, 3));
            go4Var.A0(0, 0);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        go4 go4Var = this.a;
        TextureView textureView = go4Var.B;
        if (textureView == null || textureView.getSurfaceTexture() != surfaceTexture) {
            return;
        }
        go4Var.A0(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        go4 go4Var = this.a;
        if (go4Var.A != surfaceHolder) {
            return;
        }
        go4Var.A0(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        go4 go4Var = this.a;
        if (go4Var.A != surfaceHolder) {
            return;
        }
        go4Var.z = surfaceHolder.getSurface();
        go4Var.r0(new eo4(this, 0));
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        go4Var.A0(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        go4 go4Var = this.a;
        if (go4Var.A != surfaceHolder) {
            return;
        }
        go4Var.z = null;
        go4Var.r0(new eo4(this, 1));
        go4Var.A0(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
