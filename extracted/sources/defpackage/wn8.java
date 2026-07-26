package defpackage;

import android.view.View;
import androidx.appcompat.widget.m;

/* JADX INFO: loaded from: classes.dex */
public final class wn8 extends n70 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public wn8(y89 y89Var) {
        this.a = 1;
        this.d = y89Var;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.n70, defpackage.z89
    public void a(View view) {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // defpackage.z89
    public final void b(View view) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((m) this.d).a.setVisibility(this.c);
                }
                break;
            default:
                int i = this.c + 1;
                this.c = i;
                y89 y89Var = (y89) this.d;
                if (i == y89Var.a.size()) {
                    z89 z89Var = y89Var.d;
                    if (z89Var != null) {
                        z89Var.b(null);
                    }
                    this.c = 0;
                    this.b = false;
                    y89Var.e = false;
                }
                break;
        }
    }

    @Override // defpackage.n70, defpackage.z89
    public final void c() {
        switch (this.a) {
            case 0:
                ((m) this.d).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    z89 z89Var = ((y89) this.d).d;
                    if (z89Var != null) {
                        z89Var.c();
                    }
                    break;
                }
                break;
        }
    }

    public wn8(m mVar, int i) {
        this.a = 0;
        this.d = mVar;
        this.c = i;
        this.b = false;
    }
}
