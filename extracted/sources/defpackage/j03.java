package defpackage;

import androidx.media3.common.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j03 extends o03 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final DrmInitData q;
    public final ImmutableList r;
    public final ImmutableList s;
    public final ImmutableMap t;
    public final long u;
    public final i03 v;
    public final ImmutableList w;

    public j03(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List list2, List list3, i03 i03Var, Map map, List list4) {
        super(list, str, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = drmInitData;
        this.r = ImmutableList.n(list2);
        this.s = ImmutableList.n(list3);
        this.t = ImmutableMap.b(map);
        this.w = ImmutableList.n(list4);
        if (!list3.isEmpty()) {
            e03 e03Var = (e03) tv8.q(list3);
            this.u = e03Var.e + e03Var.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            g03 g03Var = (g03) tv8.q(list2);
            this.u = g03Var.e + g03Var.c;
        }
        this.e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.u, j) : Math.max(0L, this.u + j) : -9223372036854775807L;
        this.f = j >= 0;
        this.v = i03Var;
    }

    @Override // defpackage.o03
    public final Object a(List list) {
        return this;
    }
}
