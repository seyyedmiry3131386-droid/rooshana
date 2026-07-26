package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wn9 extends po9 {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ yo9 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn9(yo9 yo9Var, zzdf zzdfVar, String str, String str2) {
        super(yo9Var, true);
        this.i = zzdfVar;
        this.f = str;
        this.g = str2;
        Objects.requireNonNull(yo9Var);
        this.h = yo9Var;
    }

    @Override // defpackage.po9
    public final void a() {
        switch (this.e) {
            case 0:
                en9 en9Var = this.h.g;
                rq4.n(en9Var);
                en9Var.clearConditionalUserProperty(this.f, this.g, (Bundle) this.i);
                break;
            case 1:
                en9 en9Var2 = this.h.g;
                rq4.n(en9Var2);
                en9Var2.getConditionalUserProperties(this.f, this.g, (bn9) this.i);
                break;
            default:
                en9 en9Var3 = this.h.g;
                rq4.n(en9Var3);
                en9Var3.setCurrentScreenByScionActivityInfo((zzdf) this.i, this.f, this.g, this.a);
                break;
        }
    }

    @Override // defpackage.po9
    public void b() {
        switch (this.e) {
            case 1:
                ((bn9) this.i).I(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn9(yo9 yo9Var, String str, String str2, Bundle bundle) {
        super(yo9Var, true);
        this.f = str;
        this.g = str2;
        this.i = bundle;
        Objects.requireNonNull(yo9Var);
        this.h = yo9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn9(yo9 yo9Var, String str, String str2, bn9 bn9Var) {
        super(yo9Var, true);
        this.f = str;
        this.g = str2;
        this.i = bn9Var;
        Objects.requireNonNull(yo9Var);
        this.h = yo9Var;
    }
}
