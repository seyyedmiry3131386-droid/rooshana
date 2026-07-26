package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class jg extends z67 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public jg(om0 om0Var, p67 p67Var) {
        this.e = om0Var;
        this.f = p67Var;
    }

    @Override // defpackage.z67
    public final void j(int i) {
        switch (this.d) {
            case 0:
                ((om0) this.e).n(new IllegalStateException("Unable to load font " + ((p67) this.f) + " (reason=" + i + ')'));
                break;
            default:
                ((vf8) this.f).n = true;
                ((c77) this.e).f(i);
                break;
        }
    }

    @Override // defpackage.z67
    public final void k(Typeface typeface) {
        switch (this.d) {
            case 0:
                ((om0) this.e).resumeWith(typeface);
                break;
            default:
                vf8 vf8Var = (vf8) this.f;
                vf8Var.p = Typeface.create(typeface, vf8Var.d);
                vf8Var.n = true;
                ((c77) this.e).g(vf8Var.p, false);
                break;
        }
    }

    public jg(vf8 vf8Var, c77 c77Var) {
        this.f = vf8Var;
        this.e = c77Var;
    }
}
