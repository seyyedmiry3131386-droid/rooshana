package androidx.compose.animation;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a96;
import defpackage.b96;
import defpackage.br9;
import defpackage.cl4;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.es3;
import defpackage.nj;
import defpackage.oj;
import defpackage.s08;
import defpackage.tx8;
import defpackage.yk4;
import defpackage.zq3;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements cl4 {
    public final oj a;

    public b(oj ojVar) {
        this.a = ojVar;
    }

    @Override // defpackage.cl4
    public final int b(es3 es3Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((yk4) list.get(0)).n(i));
            int iY = br9.y(list);
            int i2 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((yk4) list.get(i2)).n(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iY) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cl4
    public final dl4 d(el4 el4Var, List list, long j) {
        b96 b96Var;
        int i;
        b96 b96Var2;
        final int i2;
        final int i3;
        int size = list.size();
        final b96[] b96VarArr = new b96[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            b96Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            yk4 yk4Var = (yk4) list.get(i4);
            Object objV = yk4Var.v();
            nj njVar = objV instanceof nj ? (nj) objV : null;
            if (njVar != null && ((Boolean) ((s08) njVar.b).getValue()).booleanValue()) {
                b96 b96VarT = yk4Var.t(j);
                long j3 = (((long) b96VarT.b) & 4294967295L) | (((long) b96VarT.a) << 32);
                b96VarArr[i4] = b96VarT;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            yk4 yk4Var2 = (yk4) list.get(i5);
            if (b96VarArr[i5] == null) {
                b96VarArr[i5] = yk4Var2.t(j);
            }
        }
        if (el4Var.Q()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                b96Var2 = null;
            } else {
                b96Var2 = b96VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = b96Var2 != null ? b96Var2.a : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            b96 b96Var3 = b96VarArr[i8];
                            int i9 = b96Var3 != null ? b96Var3.a : 0;
                            if (i7 < i9) {
                                b96Var2 = b96Var3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = b96Var2 != null ? b96Var2.a : 0;
        }
        if (el4Var.Q()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                b96Var = b96VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = b96Var != null ? b96Var.b : 0;
                    if (1 <= i10) {
                        while (true) {
                            b96 b96Var4 = b96VarArr[i];
                            int i12 = b96Var4 != null ? b96Var4.b : 0;
                            if (i11 < i12) {
                                b96Var = b96Var4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = b96Var != null ? b96Var.b : 0;
        }
        if (!el4Var.Q()) {
            ((s08) this.a.c).setValue(new zq3((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return el4Var.D(i2, i3, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a96 a96Var = (a96) obj;
                for (b96 b96Var5 : b96VarArr) {
                    if (b96Var5 != null) {
                        long jA = this.a.b.a((((long) b96Var5.a) << 32) | (((long) b96Var5.b) & 4294967295L), (((long) i3) & 4294967295L) | (((long) i2) << 32), LayoutDirection.a);
                        a96Var.g(b96Var5, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
                    }
                }
                return tx8.a;
            }
        });
    }

    @Override // defpackage.cl4
    public final int e(es3 es3Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((yk4) list.get(0)).l(i));
            int iY = br9.y(list);
            int i2 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((yk4) list.get(i2)).l(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iY) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cl4
    public final int g(es3 es3Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((yk4) list.get(0)).a(i));
            int iY = br9.y(list);
            int i2 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((yk4) list.get(i2)).a(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iY) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cl4
    public final int i(es3 es3Var, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((yk4) list.get(0)).P(i));
            int iY = br9.y(list);
            int i2 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((yk4) list.get(i2)).P(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iY) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
