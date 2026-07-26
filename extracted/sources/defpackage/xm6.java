package defpackage;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class xm6 {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public aj0 b;
    public jp8 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public static boolean b(wm6 wm6Var) {
        vm6 vm6Var = wm6Var.a;
        vm6 vm6Var2 = wm6Var.b;
        aj0[] aj0VarArr = vm6Var.a;
        if (aj0VarArr.length == 1 && aj0VarArr[0].b == 0) {
            aj0[] aj0VarArr2 = vm6Var2.a;
            if (aj0VarArr2.length == 1 && aj0VarArr2[0].b == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            jp8 jp8Var = new jp8("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.c = jp8Var;
            this.d = GLES20.glGetUniformLocation(jp8Var.b, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.b, "uTexMatrix");
            this.f = this.c.h("aPosition");
            this.g = this.c.h("aTexCoords");
            this.h = GLES20.glGetUniformLocation(this.c.b, "uTexture");
        } catch (GlUtil$GlException e) {
            t0.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
