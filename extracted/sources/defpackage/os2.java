package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class os2 implements g67, ln3 {
    public final Drawable a;
    public final /* synthetic */ int b;

    public os2(Drawable drawable, int i) {
        this.b = i;
        ok4.p(drawable, "Argument must not be null");
        this.a = drawable;
    }

    @Override // defpackage.g67
    public final void a() {
        dr3 dr3Var;
        dr3 dr3Var2;
        dr3 dr3Var3;
        switch (this.b) {
            case 0:
                ns2 ns2Var = (ns2) this.a;
                ns2Var.stop();
                ns2Var.d = true;
                us2 us2Var = (us2) ns2Var.a.b;
                s57 s57Var = us2Var.d;
                us2Var.c.clear();
                Bitmap bitmap = us2Var.l;
                if (bitmap != null) {
                    us2Var.e.c(bitmap);
                    us2Var.l = null;
                }
                us2Var.f = false;
                rs2 rs2Var = us2Var.i;
                if (rs2Var != null) {
                    s57Var.o(rs2Var);
                    us2Var.i = null;
                }
                rs2 rs2Var2 = us2Var.k;
                if (rs2Var2 != null) {
                    s57Var.o(rs2Var2);
                    us2Var.k = null;
                }
                rs2 rs2Var3 = us2Var.m;
                if (rs2Var3 != null) {
                    s57Var.o(rs2Var3);
                    us2Var.m = null;
                }
                k48 k48Var = us2Var.a;
                nc2 nc2Var = k48Var.c;
                k48Var.l = null;
                byte[] bArr = k48Var.i;
                if (bArr != null && (dr3Var3 = (dr3) nc2Var.c) != null) {
                    dr3Var3.i(bArr);
                }
                int[] iArr = k48Var.j;
                if (iArr != null && (dr3Var2 = (dr3) nc2Var.c) != null) {
                    dr3Var2.i(iArr);
                }
                Bitmap bitmap2 = k48Var.m;
                if (bitmap2 != null) {
                    ((pc0) nc2Var.b).c(bitmap2);
                }
                k48Var.m = null;
                k48Var.d = null;
                k48Var.s = null;
                byte[] bArr2 = k48Var.e;
                if (bArr2 != null && (dr3Var = (dr3) nc2Var.c) != null) {
                    dr3Var.i(bArr2);
                }
                us2Var.j = true;
                break;
        }
    }

    @Override // defpackage.g67
    public final int c() {
        switch (this.b) {
            case 0:
                us2 us2Var = (us2) ((ns2) this.a).a.b;
                k48 k48Var = us2Var.a;
                return (k48Var.j.length * 4) + k48Var.d.limit() + k48Var.i.length + us2Var.n;
            default:
                Drawable drawable = this.a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // defpackage.g67
    public final Class d() {
        switch (this.b) {
            case 0:
                return ns2.class;
            default:
                return this.a.getClass();
        }
    }

    @Override // defpackage.g67
    public final Object get() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // defpackage.ln3
    public void initialize() {
        switch (this.b) {
            case 0:
                ((us2) ((ns2) this.a).a.b).l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.a;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof ns2) {
                    ((us2) ((ns2) drawable).a.b).l.prepareToDraw();
                }
                break;
        }
    }

    private final void b() {
    }
}
