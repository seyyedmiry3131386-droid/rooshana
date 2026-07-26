package defpackage;

import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ga1 implements na1, ka1 {
    public final List a;
    public final xb1 b;
    public final ma1 c;
    public int d = -1;
    public sx3 e;
    public List f;
    public int g;
    public volatile zw4 h;
    public File i;

    public ga1(List list, xb1 xb1Var, ma1 ma1Var) {
        this.a = list;
        this.b = xb1Var;
        this.c = ma1Var;
    }

    @Override // defpackage.ka1
    public final void a(Exception exc) {
        this.c.c(this.e, exc, this.h.c, DataSource.c);
    }

    @Override // defpackage.na1
    public final boolean b() {
        while (true) {
            List list = this.f;
            boolean z = false;
            if (list != null && this.g < list.size()) {
                this.h = null;
                while (!z && this.g < this.f.size()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    ax4 ax4Var = (ax4) list2.get(i);
                    File file = this.i;
                    xb1 xb1Var = this.b;
                    this.h = ax4Var.a(file, xb1Var.e, xb1Var.f, xb1Var.i);
                    if (this.h != null && this.b.c(this.h.c.getDataClass()) != null) {
                        this.h.c.e(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            sx3 sx3Var = (sx3) this.a.get(this.d);
            xb1 xb1Var2 = this.b;
            File fileH = xb1Var2.h.a().h(new ha1(sx3Var, xb1Var2.n));
            this.i = fileH;
            if (fileH != null) {
                this.e = sx3Var;
                this.f = this.b.c.b().g(fileH);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.na1
    public final void cancel() {
        zw4 zw4Var = this.h;
        if (zw4Var != null) {
            zw4Var.c.cancel();
        }
    }

    @Override // defpackage.ka1
    public final void f(Object obj) {
        this.c.a(this.e, obj, this.h.c, DataSource.c, this.e);
    }
}
