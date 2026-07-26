package androidx.media3.exoplayer.hls;

import defpackage.af1;
import defpackage.av;
import defpackage.cv;
import defpackage.fv;
import defpackage.gd1;
import defpackage.jp4;
import defpackage.js4;
import defpackage.k03;
import defpackage.pt2;
import defpackage.q03;
import defpackage.qq4;
import defpackage.vw1;
import defpackage.wa1;
import defpackage.wv8;
import defpackage.xe1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource$Factory implements js4 {
    public final pt2 a;
    public xe1 b;
    public av c;
    public boolean d;
    public final cv e;
    public final gd1 f;
    public final fv g;
    public final wv8 h;
    public final fv i;
    public final boolean j;
    public final int k;
    public final long l;

    public HlsMediaSource$Factory(wa1 wa1Var) {
        this(new pt2(17, wa1Var));
    }

    @Override // defpackage.js4
    public final js4 a(av avVar) {
        this.c = avVar;
        return this;
    }

    @Override // defpackage.js4
    public final js4 b(boolean z) {
        this.d = z;
        return this;
    }

    @Override // defpackage.js4
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final k03 d(jp4 jp4Var) {
        jp4Var.b.getClass();
        if (this.b == null) {
            xe1 xe1Var = new xe1();
            xe1Var.b = new av(13);
            this.b = xe1Var;
        }
        av avVar = this.c;
        if (avVar != null) {
            this.b.b = avVar;
        }
        xe1 xe1Var2 = this.b;
        xe1Var2.a = this.d;
        xe1Var2.getClass();
        List list = jp4Var.b.e;
        boolean zIsEmpty = list.isEmpty();
        q03 qq4Var = this.e;
        if (!zIsEmpty) {
            qq4Var = new qq4(qq4Var, list);
        }
        vw1 vw1VarU = this.h.u(jp4Var);
        this.f.getClass();
        pt2 pt2Var = this.a;
        fv fvVar = this.i;
        return new k03(jp4Var, this.a, xe1Var2, this.g, vw1VarU, fvVar, new af1(pt2Var, fvVar, qq4Var), this.l, this.j, this.k);
    }

    public HlsMediaSource$Factory(pt2 pt2Var) {
        this.a = pt2Var;
        this.h = new wv8(20);
        this.e = new cv(12);
        this.f = af1.o;
        this.i = new fv(12);
        this.g = new fv(11);
        this.k = 1;
        this.l = -9223372036854775807L;
        this.j = true;
        this.d = true;
    }

    @Override // defpackage.js4
    public final js4 c() {
        return this;
    }
}
