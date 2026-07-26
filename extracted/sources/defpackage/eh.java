package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class eh implements u26 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public eh(Path path) {
        this.a = path;
    }

    public final sy6 a() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        js3.m(rectF);
        this.a.computeBounds(rectF, true);
        return new sy6(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean b(u26 u26Var, u26 u26Var2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(u26Var instanceof eh)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((eh) u26Var).a;
        if (u26Var2 instanceof eh) {
            return this.a.op(path, ((eh) u26Var2).a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void c() {
        this.a.reset();
    }
}
