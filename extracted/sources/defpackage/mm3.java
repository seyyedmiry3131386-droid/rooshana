package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class mm3 extends cw1 {
    public final ow1 n;
    public y o;
    public q39 p;

    public mm3(Context context, t80 t80Var, ow1 ow1Var, y yVar) {
        super(context, t80Var);
        this.n = ow1Var;
        this.o = yVar;
        yVar.a = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm3.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.cw1
    public final boolean e(boolean z, boolean z2, boolean z3) {
        q39 q39Var;
        boolean zE = super.e(z, z2, z3);
        if (this.c != null && fl.a(this.a.getContentResolver()) == 0.0f && (q39Var = this.p) != null) {
            return q39Var.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.o.d();
        }
        if (z && z3) {
            this.o.D();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.f();
    }
}
