package defpackage;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.m1;
import com.google.common.collect.n1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class su4 extends yz0 {
    public static final jp4 s;
    public final x70[] k;
    public final ArrayList l;
    public final bm8[] m;
    public final ArrayList n;
    public final fv o;
    public int p;
    public long[][] q;
    public MergingMediaSource$IllegalMergeException r;

    static {
        yo4 yo4Var = new yo4();
        ImmutableMap.l();
        ImmutableList.q();
        List list = Collections.EMPTY_LIST;
        ImmutableList.q();
        dp4 dp4Var = new dp4();
        s = new jp4("MergingMediaSource", new ap4(yo4Var), null, new ep4(dp4Var), qp4.K, gp4.d);
    }

    public su4(x70... x70VarArr) {
        fv fvVar = new fv(11);
        this.k = x70VarArr;
        this.o = fvVar;
        this.n = new ArrayList(Arrays.asList(x70VarArr));
        this.p = -1;
        this.l = new ArrayList(x70VarArr.length);
        for (int i = 0; i < x70VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new bm8[x70VarArr.length];
        this.q = new long[0][];
        new HashMap();
        vy2.m(8, "expectedKeys");
        m1 m1Var = new m1();
        vy2.m(2, "expectedValuesPerKey");
        new n1(m1Var).a();
    }

    @Override // defpackage.x70
    public final boolean a(jp4 jp4Var) {
        x70[] x70VarArr = this.k;
        return x70VarArr.length > 0 && x70VarArr[0].a(jp4Var);
    }

    @Override // defpackage.x70
    public final zp4 b(ks4 ks4Var, qc1 qc1Var, long j) {
        x70[] x70VarArr = this.k;
        int length = x70VarArr.length;
        zp4[] zp4VarArr = new zp4[length];
        bm8[] bm8VarArr = this.m;
        int iB = bm8VarArr[0].b(ks4Var.a);
        for (int i = 0; i < length; i++) {
            ks4 ks4VarA = ks4Var.a(bm8VarArr[i].l(iB));
            zp4VarArr[i] = x70VarArr[i].b(ks4VarA, qc1Var, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new ru4(ks4VarA, zp4VarArr[i]));
        }
        return new qu4(this.o, this.q[iB], zp4VarArr);
    }

    @Override // defpackage.x70
    public final jp4 h() {
        x70[] x70VarArr = this.k;
        return x70VarArr.length > 0 ? x70VarArr[0].h() : s;
    }

    @Override // defpackage.yz0, defpackage.x70
    public final void j() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.r;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.j();
    }

    @Override // defpackage.x70
    public final void l(fq8 fq8Var) {
        this.j = fq8Var;
        this.i = j29.p(null);
        int i = 0;
        while (true) {
            x70[] x70VarArr = this.k;
            if (i >= x70VarArr.length) {
                return;
            }
            x(Integer.valueOf(i), x70VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.x70
    public final void n(zp4 zp4Var) {
        qu4 qu4Var = (qu4) zp4Var;
        int i = 0;
        while (true) {
            x70[] x70VarArr = this.k;
            if (i >= x70VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            zp4[] zp4VarArr = qu4Var.a;
            boolean[] zArr = qu4Var.b;
            zp4 zp4Var2 = zArr[i] ? ((nl8) zp4VarArr[i]).a : zp4VarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((ru4) list.get(i2)).b.equals(zp4Var2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            x70 x70Var = x70VarArr[i];
            zp4[] zp4VarArr2 = qu4Var.a;
            x70Var.n(zArr[i] ? ((nl8) zp4VarArr2[i]).a : zp4VarArr2[i]);
            i++;
        }
    }

    @Override // defpackage.yz0, defpackage.x70
    public final void p() {
        super.p();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.x70
    public final void s(jp4 jp4Var) {
        this.k[0].s(jp4Var);
    }

    @Override // defpackage.yz0
    public final ks4 t(Object obj, ks4 ks4Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((ru4) list.get(i)).a.equals(ks4Var)) {
                return ((ru4) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.yz0
    public final void w(Object obj, x70 x70Var, bm8 bm8Var) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = bm8Var.h();
        } else if (bm8Var.h() != this.p) {
            this.r = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.q.length;
        bm8[] bm8VarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, bm8VarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(x70Var);
        bm8VarArr[num.intValue()] = bm8Var;
        if (arrayList.isEmpty()) {
            m(bm8VarArr[0]);
        }
    }
}
