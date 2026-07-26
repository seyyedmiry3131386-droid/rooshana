package defpackage;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: loaded from: classes.dex */
public final class so9 extends po9 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ b92 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so9(b92 b92Var, Activity activity2, int i) {
        super((yo9) b92Var.b, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = activity2;
                this.g = b92Var;
                super((yo9) b92Var.b, true);
                break;
            case 2:
                this.f = activity2;
                this.g = b92Var;
                super((yo9) b92Var.b, true);
                break;
            case 3:
                this.f = activity2;
                this.g = b92Var;
                super((yo9) b92Var.b, true);
                break;
            case 4:
                this.f = activity2;
                this.g = b92Var;
                super((yo9) b92Var.b, true);
                break;
            default:
                this.f = activity2;
                this.g = b92Var;
                break;
        }
    }

    @Override // defpackage.po9
    public final void a() {
        switch (this.e) {
            case 0:
                en9 en9Var = ((yo9) this.g.b).g;
                rq4.n(en9Var);
                en9Var.onActivityStartedByScionActivityInfo(zzdf.u(this.f), this.b);
                break;
            case 1:
                en9 en9Var2 = ((yo9) this.g.b).g;
                rq4.n(en9Var2);
                en9Var2.onActivityResumedByScionActivityInfo(zzdf.u(this.f), this.b);
                break;
            case 2:
                en9 en9Var3 = ((yo9) this.g.b).g;
                rq4.n(en9Var3);
                en9Var3.onActivityPausedByScionActivityInfo(zzdf.u(this.f), this.b);
                break;
            case 3:
                en9 en9Var4 = ((yo9) this.g.b).g;
                rq4.n(en9Var4);
                en9Var4.onActivityStoppedByScionActivityInfo(zzdf.u(this.f), this.b);
                break;
            default:
                en9 en9Var5 = ((yo9) this.g.b).g;
                rq4.n(en9Var5);
                en9Var5.onActivityDestroyedByScionActivityInfo(zzdf.u(this.f), this.b);
                break;
        }
    }
}
