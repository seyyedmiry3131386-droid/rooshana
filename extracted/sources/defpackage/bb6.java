package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class bb6 {
    public static final qa o = new qa(2);
    public final Context a;
    public final za6 b;
    public final SparseArray c;
    public final boolean d;
    public final ii1 e;
    public final td8 f;
    public final CopyOnWriteArraySet g;
    public aj0 h = new aj0(10, (byte) 0);
    public wd8 i;
    public Pair j;
    public int k;
    public int l;
    public long m;
    public int n;

    public bb6(ag1 ag1Var) {
        this.a = (Context) ag1Var.c;
        za6 za6Var = (za6) ag1Var.e;
        vy2.t(za6Var);
        this.b = za6Var;
        this.c = new SparseArray();
        ImmutableList.q();
        this.d = ag1Var.a;
        td8 td8Var = (td8) ag1Var.f;
        this.f = td8Var;
        this.e = new ii1((i59) ag1Var.d, td8Var);
        this.g = new CopyOnWriteArraySet();
        new rj2().a();
        this.m = -9223372036854775807L;
        this.n = -1;
        this.l = 0;
    }
}
