package androidx.compose.ui.graphics.vector;

import android.graphics.Path;
import defpackage.bp2;
import defpackage.ch0;
import defpackage.hs9;
import defpackage.jz0;
import defpackage.my6;
import defpackage.ok4;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.s39;
import defpackage.s7;
import defpackage.tx8;
import defpackage.u39;
import defpackage.v39;
import defpackage.w39;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(final String str, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, final float f7, final List list, final androidx.compose.runtime.internal.a aVar, qz0 qz0Var, final int i) {
        qz0Var.c0(-1851426205);
        int i2 = i | (qz0Var.f(str) ? 4 : 2) | (qz0Var.c(f) ? 32 : 16) | (qz0Var.c(f2) ? 256 : 128) | (qz0Var.c(f3) ? 2048 : 1024) | (qz0Var.c(f4) ? 16384 : 8192) | (qz0Var.c(f5) ? 131072 : 65536) | (qz0Var.c(f6) ? 1048576 : 524288) | (qz0Var.c(f7) ? 8388608 : 4194304) | (qz0Var.h(list) ? 67108864 : 33554432);
        if (!qz0Var.R(i2 & 1, (306783379 & i2) != 306783378)) {
            qz0Var.U();
            my6 my6VarS = qz0Var.s();
            if (my6VarS != null) {
                my6VarS.d = new qp2(str, f, f2, f3, f4, f5, f6, f7, list, aVar, i) { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    public final /* synthetic */ String g;
                    public final /* synthetic */ float h;
                    public final /* synthetic */ float i;
                    public final /* synthetic */ float j;
                    public final /* synthetic */ float k;
                    public final /* synthetic */ float l;
                    public final /* synthetic */ float m;
                    public final /* synthetic */ float n;
                    public final /* synthetic */ List o;
                    public final /* synthetic */ androidx.compose.runtime.internal.a p;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.qp2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        int iW = hs9.W(805306369);
                        d.a(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (qz0) obj, iW);
                        return tx8.a;
                    }
                };
                return;
            }
            return;
        }
        qz0Var.W();
        if ((i & 1) != 0 && !qz0Var.z()) {
            qz0Var.U();
        }
        qz0Var.r();
        Object objM = qz0Var.M();
        if (objM == jz0.a) {
            objM = new bp2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1$1
                @Override // defpackage.bp2
                public final Object invoke() {
                    return new a();
                }
            };
            qz0Var.l0(objM);
        }
        ok4.J();
        throw null;
    }

    public static final void b(final List list, final int i, final String str, final ch0 ch0Var, final float f, final ch0 ch0Var2, final float f2, final float f3, final int i2, final int i3, final float f4, final float f5, final float f6, final float f7, qz0 qz0Var, final int i4) {
        qz0Var.c0(-1478270750);
        int i5 = i4 | (qz0Var.h(list) ? 4 : 2) | (qz0Var.d(i) ? 32 : 16) | (qz0Var.f(str) ? 256 : 128) | (qz0Var.f(ch0Var) ? 2048 : 1024) | (qz0Var.c(f) ? 16384 : 8192) | (qz0Var.f(ch0Var2) ? 131072 : 65536) | (qz0Var.c(f2) ? 1048576 : 524288) | (qz0Var.c(f3) ? 8388608 : 4194304) | (qz0Var.d(i2) ? 67108864 : 33554432) | (qz0Var.d(i3) ? 536870912 : 268435456);
        char c = 2048;
        int i6 = (qz0Var.c(f4) ? (char) 4 : (char) 2) | (qz0Var.c(f5) ? ' ' : (char) 16) | (qz0Var.c(f6) ? 256 : 128);
        if (!qz0Var.c(f7)) {
            c = 1024;
        }
        if (!qz0Var.R(i5 & 1, ((i5 & 306783379) == 306783378 && ((i6 | c) & 1171) == 1170) ? false : true)) {
            qz0Var.U();
            my6 my6VarS = qz0Var.s();
            if (my6VarS != null) {
                my6VarS.d = new qp2(list, i, str, ch0Var, f, ch0Var2, f2, f3, i2, i3, f4, f5, f6, f7, i4) { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
                    public final /* synthetic */ List g;
                    public final /* synthetic */ int h;
                    public final /* synthetic */ String i;
                    public final /* synthetic */ ch0 j;
                    public final /* synthetic */ float k;
                    public final /* synthetic */ ch0 l;
                    public final /* synthetic */ float m;
                    public final /* synthetic */ float n;
                    public final /* synthetic */ int o;
                    public final /* synthetic */ int p;
                    public final /* synthetic */ float q;
                    public final /* synthetic */ float r;
                    public final /* synthetic */ float s;
                    public final /* synthetic */ float t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.qp2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        int iW = hs9.W(1);
                        d.b(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (qz0) obj, iW);
                        return tx8.a;
                    }
                };
                return;
            }
            return;
        }
        Object objM = qz0Var.M();
        if (objM == jz0.a) {
            objM = new bp2() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1$1
                @Override // defpackage.bp2
                public final Object invoke() {
                    return new b();
                }
            };
            qz0Var.l0(objM);
        }
        ok4.J();
        throw null;
    }

    public static final void c(final s39 s39Var, final Map map, qz0 qz0Var, final int i) {
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(-446179233);
        int i2 = i | (qz0Var2.f(s39Var) ? 4 : 2) | (qz0Var2.h(map) ? 32 : 16);
        if (qz0Var2.R(i2 & 1, (i2 & 19) != 18)) {
            for (u39 u39Var : s39Var.j) {
                if (u39Var instanceof w39) {
                    qz0Var2.a0(798455915);
                    w39 w39Var = (w39) u39Var;
                    String str = w39Var.a;
                    v39 v39Var = (v39) map.get(str);
                    if (v39Var == null) {
                        v39Var = new v39(0);
                    }
                    b((List) v39Var.a(w39Var.b), w39Var.c, str, (ch0) v39Var.a(w39Var.d), ((Number) v39Var.a(Float.valueOf(w39Var.e))).floatValue(), (ch0) v39Var.a(w39Var.f), ((Number) v39Var.a(Float.valueOf(w39Var.g))).floatValue(), ((Number) v39Var.a(Float.valueOf(w39Var.h))).floatValue(), w39Var.i, w39Var.j, w39Var.k, ((Number) v39Var.a(Float.valueOf(w39Var.l))).floatValue(), ((Number) v39Var.a(Float.valueOf(w39Var.m))).floatValue(), ((Number) v39Var.a(Float.valueOf(w39Var.n))).floatValue(), qz0Var, 0);
                    qz0Var2 = qz0Var;
                    qz0Var2.q(false);
                } else {
                    if (u39Var instanceof s39) {
                        qz0Var2.a0(799870476);
                        final s39 s39Var2 = (s39) u39Var;
                        v39 v39Var2 = (v39) map.get(s39Var2.a);
                        if (v39Var2 == null) {
                            v39Var2 = new v39(1);
                        }
                        a(s39Var2.a, ((Number) v39Var2.a(Float.valueOf(s39Var2.b))).floatValue(), ((Number) v39Var2.a(Float.valueOf(s39Var2.c))).floatValue(), ((Number) v39Var2.a(Float.valueOf(s39Var2.d))).floatValue(), ((Number) v39Var2.a(Float.valueOf(s39Var2.e))).floatValue(), ((Number) v39Var2.a(Float.valueOf(s39Var2.f))).floatValue(), ((Number) v39Var2.a(Float.valueOf(s39Var2.g))).floatValue(), ((Number) v39Var2.a(Float.valueOf(s39Var2.h))).floatValue(), (List) v39Var2.a(s39Var2.i), s7.X(1450046638, new qp2() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.qp2
                            public final Object invoke(Object obj, Object obj2) {
                                qz0 qz0Var3 = (qz0) obj;
                                int iIntValue = ((Number) obj2).intValue();
                                if (qz0Var3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    d.c(s39Var2, map, qz0Var3, 0);
                                } else {
                                    qz0Var3.U();
                                }
                                return tx8.a;
                            }
                        }, qz0Var2), qz0Var2, 805306368);
                    } else {
                        qz0Var2.a0(782476035);
                    }
                    qz0Var2.q(false);
                }
            }
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(map, i) { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2
                public final /* synthetic */ Map h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(1);
                    d.c(this.g, this.h, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void d(a aVar, s39 s39Var) {
        List list = s39Var.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            u39 u39Var = (u39) list.get(i);
            if (u39Var instanceof w39) {
                b bVar = new b();
                w39 w39Var = (w39) u39Var;
                bVar.d = w39Var.b;
                bVar.n = true;
                bVar.c();
                bVar.s.a.setFillType(w39Var.c == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                bVar.c();
                bVar.c();
                bVar.b = w39Var.d;
                bVar.c();
                bVar.c = w39Var.e;
                bVar.c();
                bVar.g = w39Var.f;
                bVar.c();
                bVar.e = w39Var.g;
                bVar.c();
                bVar.f = w39Var.h;
                bVar.o = true;
                bVar.c();
                bVar.h = w39Var.i;
                bVar.o = true;
                bVar.c();
                bVar.i = w39Var.j;
                bVar.o = true;
                bVar.c();
                bVar.j = w39Var.k;
                bVar.o = true;
                bVar.c();
                bVar.k = w39Var.l;
                bVar.p = true;
                bVar.c();
                bVar.l = w39Var.m;
                bVar.p = true;
                bVar.c();
                bVar.m = w39Var.n;
                bVar.p = true;
                bVar.c();
                aVar.e(i, bVar);
            } else if (u39Var instanceof s39) {
                a aVar2 = new a();
                s39 s39Var2 = (s39) u39Var;
                aVar2.k = s39Var2.a;
                aVar2.c();
                aVar2.l = s39Var2.b;
                aVar2.s = true;
                aVar2.c();
                aVar2.o = s39Var2.e;
                aVar2.s = true;
                aVar2.c();
                aVar2.p = s39Var2.f;
                aVar2.s = true;
                aVar2.c();
                aVar2.q = s39Var2.g;
                aVar2.s = true;
                aVar2.c();
                aVar2.r = s39Var2.h;
                aVar2.s = true;
                aVar2.c();
                aVar2.m = s39Var2.c;
                aVar2.s = true;
                aVar2.c();
                aVar2.n = s39Var2.d;
                aVar2.s = true;
                aVar2.c();
                aVar2.f = s39Var2.i;
                aVar2.g = true;
                aVar2.c();
                d(aVar2, s39Var2);
                aVar.e(i, aVar2);
            }
        }
    }
}
