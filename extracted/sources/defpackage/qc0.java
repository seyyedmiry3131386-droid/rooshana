package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class qc0 implements g67, ln3 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public qc0(pc0 pc0Var, Bitmap bitmap) {
        ok4.p(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        ok4.p(pc0Var, "BitmapPool must not be null");
        this.c = pc0Var;
    }

    public static qc0 b(pc0 pc0Var, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new qc0(pc0Var, bitmap);
    }

    @Override // defpackage.g67
    public final void a() {
        switch (this.a) {
            case 0:
                ((pc0) this.c).c((Bitmap) this.b);
                break;
            default:
                ((g67) this.c).a();
                break;
        }
    }

    @Override // defpackage.g67
    public final int c() {
        switch (this.a) {
            case 0:
                return i29.c((Bitmap) this.b);
            default:
                return ((g67) this.c).c();
        }
    }

    @Override // defpackage.g67
    public final Class d() {
        switch (this.a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // defpackage.g67
    public final Object get() {
        switch (this.a) {
            case 0:
                return (Bitmap) this.b;
            default:
                return new BitmapDrawable((Resources) this.b, (Bitmap) ((g67) this.c).get());
        }
    }

    @Override // defpackage.ln3
    public final void initialize() {
        switch (this.a) {
            case 0:
                ((Bitmap) this.b).prepareToDraw();
                break;
            default:
                g67 g67Var = (g67) this.c;
                if (g67Var instanceof ln3) {
                    ((ln3) g67Var).initialize();
                }
                break;
        }
    }

    public qc0(Resources resources, g67 g67Var) {
        ok4.p(resources, "Argument must not be null");
        this.b = resources;
        ok4.p(g67Var, "Argument must not be null");
        this.c = g67Var;
    }
}
