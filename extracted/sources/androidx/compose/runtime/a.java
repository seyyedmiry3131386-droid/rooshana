package androidx.compose.runtime;

import defpackage.bp2;
import defpackage.c01;
import defpackage.d01;
import defpackage.hy2;
import defpackage.i56;
import defpackage.j01;
import defpackage.j56;
import defpackage.js3;
import defpackage.kz4;
import defpackage.lv7;
import defpackage.lz4;
import defpackage.my6;
import defpackage.ou;
import defpackage.pm0;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.r79;
import defpackage.s08;
import defpackage.w61;
import defpackage.wb5;
import defpackage.wu8;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d01 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final wb5 f = new ParcelableSnapshotMutableState(i56.d, hy2.r);
    public final /* synthetic */ qz0 g;

    public a(qz0 qz0Var, long j, boolean z, boolean z2, r79 r79Var) {
        this.g = qz0Var;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.d01
    public final void a(j01 j01Var, qp2 qp2Var) {
        this.g.b.a(j01Var, qp2Var);
    }

    @Override // defpackage.d01
    public final androidx.collection.e b(j01 j01Var, lv7 lv7Var, qp2 qp2Var) {
        return this.g.b.b(j01Var, lv7Var, qp2Var);
    }

    @Override // defpackage.d01
    public final void c(lz4 lz4Var) {
        this.g.b.c(lz4Var);
    }

    @Override // defpackage.d01
    public final void d() {
        qz0 qz0Var = this.g;
        qz0Var.A--;
    }

    @Override // defpackage.d01
    public final boolean e() {
        return this.g.b.e();
    }

    @Override // defpackage.d01
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.d01
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.d01
    public final long h() {
        return this.a;
    }

    @Override // defpackage.d01
    public final c01 i() {
        return this.g.h;
    }

    @Override // defpackage.d01
    public final j56 j() {
        return (j56) ((s08) this.f).getValue();
    }

    @Override // defpackage.d01
    public final w61 k() {
        return this.g.b.k();
    }

    @Override // defpackage.d01
    public final boolean l() {
        return this.g.b.l();
    }

    @Override // defpackage.d01
    public final void m(lz4 lz4Var) {
        this.g.b.m(lz4Var);
    }

    @Override // defpackage.d01
    public final void n(j01 j01Var) {
        qz0 qz0Var = this.g;
        qz0Var.b.n(qz0Var.h);
        qz0Var.b.n(j01Var);
    }

    @Override // defpackage.d01
    public final void o(lz4 lz4Var, kz4 kz4Var, ou ouVar) {
        this.g.b.o(lz4Var, kz4Var, ouVar);
    }

    @Override // defpackage.d01
    public final kz4 p(lz4 lz4Var) {
        return this.g.b.p(lz4Var);
    }

    @Override // defpackage.d01
    public final androidx.collection.e q(j01 j01Var, lv7 lv7Var, androidx.collection.e eVar) {
        return this.g.b.q(j01Var, lv7Var, eVar);
    }

    @Override // defpackage.d01
    public final void r(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.d01
    public final void s(qz0 qz0Var) {
        this.e.add(qz0Var);
    }

    @Override // defpackage.d01
    public final void t(my6 my6Var) {
        this.g.b.t(my6Var);
    }

    @Override // defpackage.d01
    public final void u(j01 j01Var) {
        this.g.b.u(j01Var);
    }

    @Override // defpackage.d01
    public final pm0 v(bp2 bp2Var) {
        return this.g.b.v(bp2Var);
    }

    @Override // defpackage.d01
    public final void w() {
        this.g.A++;
    }

    @Override // defpackage.d01
    public final void x(qz0 qz0Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                js3.n(qz0Var, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(qz0Var.x());
            }
        }
        wu8.g(this.e).remove(qz0Var);
    }

    @Override // defpackage.d01
    public final void y(j01 j01Var) {
        this.g.b.y(j01Var);
    }

    public final void z() {
        LinkedHashSet<qz0> linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet != null) {
            for (qz0 qz0Var : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(qz0Var.x());
                }
            }
        }
        linkedHashSet.clear();
    }
}
