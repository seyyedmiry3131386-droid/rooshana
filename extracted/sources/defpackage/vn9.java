package defpackage;

import android.content.Intent;
import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vn9 extends po9 {
    public final /* synthetic */ int e;
    public final /* synthetic */ yo9 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn9(yo9 yo9Var, Object obj, int i) {
        super(yo9Var, true);
        this.e = i;
        this.g = obj;
        this.f = yo9Var;
    }

    @Override // defpackage.po9
    public final void a() {
        switch (this.e) {
            case 0:
                en9 en9Var = this.f.g;
                rq4.n(en9Var);
                en9Var.setConditionalUserProperty((Bundle) this.g, this.a);
                break;
            case 1:
                en9 en9Var2 = this.f.g;
                rq4.n(en9Var2);
                en9Var2.retrieveAndUploadBatches(new eo9(this, (Runnable) this.g));
                break;
            case 2:
                en9 en9Var3 = this.f.g;
                rq4.n(en9Var3);
                en9Var3.logHealthData(5, "Error with data collection. Data lost.", new dr5((Exception) this.g), new dr5(null), new dr5(null));
                break;
            case 3:
                en9 en9Var4 = this.f.g;
                rq4.n(en9Var4);
                en9Var4.setEventInterceptor((qo9) this.g);
                break;
            default:
                en9 en9Var5 = this.f.g;
                rq4.n(en9Var5);
                en9Var5.setSgtmDebugInfo((Intent) this.g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn9(yo9 yo9Var, Bundle bundle) {
        super(yo9Var, true);
        this.e = 0;
        this.g = bundle;
        Objects.requireNonNull(yo9Var);
        this.f = yo9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn9(yo9 yo9Var, Exception exc) {
        super(yo9Var, false);
        this.e = 2;
        this.g = exc;
        this.f = yo9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn9(yo9 yo9Var, qo9 qo9Var) {
        super(yo9Var, true);
        this.e = 3;
        this.g = qo9Var;
        Objects.requireNonNull(yo9Var);
        this.f = yo9Var;
    }
}
