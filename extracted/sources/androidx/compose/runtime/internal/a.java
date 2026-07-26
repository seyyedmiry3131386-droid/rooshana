package androidx.compose.runtime.internal;

import defpackage.a6;
import defpackage.ca;
import defpackage.cp2;
import defpackage.ea;
import defpackage.ep2;
import defpackage.gp2;
import defpackage.hp2;
import defpackage.hy;
import defpackage.ip2;
import defpackage.jp2;
import defpackage.js3;
import defpackage.kp2;
import defpackage.lp2;
import defpackage.mp2;
import defpackage.my6;
import defpackage.np2;
import defpackage.ny6;
import defpackage.op2;
import defpackage.pp2;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.s7;
import defpackage.sp2;
import defpackage.tp2;
import defpackage.up2;
import defpackage.vp2;
import defpackage.wp2;
import defpackage.wu8;
import defpackage.xp2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements qp2, rp2, sp2, tp2, up2, vp2, wp2, xp2, cp2, ep2, gp2, hp2, ip2, jp2, kp2, lp2, mp2, op2, pp2 {
    public final int a;
    public final boolean b;
    public Object c;
    public my6 d;
    public ArrayList e;

    public a(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // defpackage.rp2
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return d(obj, (qz0) obj2, ((Number) obj3).intValue());
    }

    public final Object b(int i, qz0 qz0Var) {
        qz0Var.c0(this.a);
        l(qz0Var);
        int iD = i | (qz0Var.f(this) ? s7.d(2, 0) : s7.d(1, 0));
        Object obj = this.c;
        js3.n(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        wu8.i(2, obj);
        Object objInvoke = ((qp2) obj).invoke(qz0Var, Integer.valueOf(iD));
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ComposableLambdaImpl$invoke$1(2, this, a.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objInvoke;
    }

    public final Object d(Object obj, qz0 qz0Var, int i) {
        qz0Var.c0(this.a);
        l(qz0Var);
        int iD = qz0Var.f(this) ? s7.d(2, 1) : s7.d(1, 1);
        Object obj2 = this.c;
        js3.n(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        wu8.i(3, obj2);
        Object objA = ((rp2) obj2).a(obj, qz0Var, Integer.valueOf(iD | i));
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new a6(this, obj, i, 3);
        }
        return objA;
    }

    public final Object e(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, qz0 qz0Var, int i) {
        qz0Var.c0(this.a);
        l(qz0Var);
        int iD = qz0Var.f(this) ? s7.d(2, 6) : s7.d(1, 6);
        Object obj5 = this.c;
        js3.n(obj5, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        wu8.i(8, obj5);
        Object objI = ((wp2) obj5).i(obj, bool, obj2, obj3, obj4, qz0Var, Integer.valueOf(i | iD));
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new hy(this, obj, bool, obj2, obj3, obj4, i, 1);
        }
        return objI;
    }

    public final Object f(Object obj, Object obj2, qz0 qz0Var, int i) {
        qz0Var.c0(this.a);
        l(qz0Var);
        int iD = qz0Var.f(this) ? s7.d(2, 2) : s7.d(1, 2);
        Object obj3 = this.c;
        js3.n(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        wu8.i(4, obj3);
        Object objG = ((sp2) obj3).g(obj, obj2, qz0Var, Integer.valueOf(iD | i));
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(i, 6, this, obj, obj2);
        }
        return objG;
    }

    @Override // defpackage.sp2
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        return f(obj, obj2, (qz0) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.wp2
    public final /* bridge */ /* synthetic */ Object i(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, qz0 qz0Var, Integer num) {
        return e(obj, bool, obj2, obj3, obj4, qz0Var, num.intValue());
    }

    @Override // defpackage.qp2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Number) obj2).intValue(), (qz0) obj);
    }

    public final Object j(Object obj, Object obj2, Object obj3, qz0 qz0Var, int i) {
        qz0Var.c0(this.a);
        l(qz0Var);
        int iD = qz0Var.f(this) ? s7.d(2, 3) : s7.d(1, 3);
        Object obj4 = this.c;
        js3.n(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        wu8.i(5, obj4);
        Object objInvoke = ((tp2) obj4).invoke(obj, obj2, obj3, qz0Var, Integer.valueOf(iD | i));
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ea(this, obj, obj2, obj3, i, 4);
        }
        return objInvoke;
    }

    public final void l(qz0 qz0Var) {
        my6 my6VarY;
        if (!this.b || (my6VarY = qz0Var.y()) == null) {
            return;
        }
        qz0Var.getClass();
        my6VarY.b |= 1;
        if (s7.Y(this.d, my6VarY)) {
            this.d = my6VarY;
            return;
        }
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.e = arrayList2;
            arrayList2.add(my6VarY);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (s7.Y((my6) arrayList.get(i), my6VarY)) {
                arrayList.set(i, my6VarY);
                return;
            }
        }
        arrayList.add(my6VarY);
    }

    public final void n(np2 np2Var) {
        if (js3.i(this.c, np2Var)) {
            return;
        }
        boolean z = this.c == null;
        this.c = np2Var;
        if (z || !this.b) {
            return;
        }
        my6 my6Var = this.d;
        if (my6Var != null) {
            ny6 ny6Var = my6Var.a;
            if (ny6Var != null) {
                ny6Var.c(my6Var, null);
            }
            this.d = null;
        }
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                my6 my6Var2 = (my6) arrayList.get(i);
                ny6 ny6Var2 = my6Var2.a;
                if (ny6Var2 != null) {
                    ny6Var2.c(my6Var2, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // defpackage.tp2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return j(obj, obj2, obj3, (qz0) obj4, ((Number) obj5).intValue());
    }
}
