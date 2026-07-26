package defpackage;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.foundation.layout.LayoutOrientation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class k95 implements cl4 {
    public final xf2 a;

    public k95(xf2 xf2Var) {
        this.a = xf2Var;
    }

    @Override // defpackage.cl4
    public final int b(es3 es3Var, List list, int i) {
        ArrayList arrayListL = ct2.l(es3Var);
        xf2 xf2Var = this.a;
        tf2 tf2Var = xf2Var.h;
        List list2 = (List) a.q0(1, arrayListL);
        yk4 yk4Var = list2 != null ? (yk4) a.p0(list2) : null;
        List list3 = (List) a.q0(2, arrayListL);
        tf2Var.a(yk4Var, list3 != null ? (yk4) a.p0(list3) : null, j31.b(0, i, 7));
        List list4 = (List) a.p0(arrayListL);
        if (list4 == null) {
            list4 = EmptyList.a;
        }
        int iB0 = es3Var.b0(xf2Var.c);
        int i2 = xf2Var.f;
        int size = list4.size();
        int i3 = 0;
        int iMax = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < size) {
            int iN = ((yk4) list4.get(i3)).n(i) + iB0;
            int i6 = i3 + 1;
            if (i6 - i4 == i2 || i6 == list4.size()) {
                iMax = Math.max(iMax, (i5 + iN) - iB0);
                i4 = i3;
                i5 = 0;
            } else {
                i5 += iN;
            }
            i3 = i6;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v8, types: [b96[]] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v5, types: [b96[]] */
    @Override // defpackage.cl4
    public final dl4 d(el4 el4Var, List list, long j) {
        yk4 yk4Var;
        long j2;
        yk4 yk4Var2;
        yk4 yk4Var3;
        float f;
        Iterator it;
        lq3 lq3Var;
        of2 of2Var;
        int i;
        int i2;
        char c;
        int[] iArr;
        yk4 yk4Var4;
        yk4 yk4Var5;
        int i3;
        lq3 lq3Var2;
        lq3 lq3Var3;
        int i4;
        lq3 lq3Var4;
        of2 of2Var2;
        int i5;
        long jA;
        long jA2;
        ArrayList arrayListL = ct2.l(el4Var);
        final xf2 xf2Var = this.a;
        final tf2 tf2Var = xf2Var.h;
        final int i6 = 0;
        if (xf2Var.g != 0 && xf2Var.f != 0 && !arrayListL.isEmpty()) {
            if (h31.g(j) != 0) {
                List list2 = (List) a.o0(arrayListL);
                if (list2.isEmpty()) {
                    return el4Var.D(0, 0, b.I(), new k7(26));
                }
                final int i7 = 1;
                List list3 = (List) a.q0(1, arrayListL);
                yk4 yk4Var6 = list3 != null ? (yk4) a.p0(list3) : null;
                int i8 = 2;
                List list4 = (List) a.q0(2, arrayListL);
                yk4 yk4Var7 = list4 != null ? (yk4) a.p0(list4) : null;
                list2.size();
                tf2Var.getClass();
                LayoutOrientation layoutOrientation = LayoutOrientation.a;
                long jE = dt2.E(dt2.i(10, dt2.g(j, layoutOrientation)));
                if (yk4Var6 != null) {
                    ok4.N(yk4Var6, xf2Var, jE, new dp2() { // from class: sf2
                        @Override // defpackage.dp2
                        public final Object invoke(Object obj) {
                            int iU;
                            int iT;
                            int iU2;
                            int iT2;
                            b96 b96Var = (b96) obj;
                            switch (i6) {
                                case 0:
                                    if (b96Var != null) {
                                        xf2Var.getClass();
                                        iU = b96Var.U();
                                        iT = b96Var.T();
                                    } else {
                                        iU = 0;
                                        iT = 0;
                                    }
                                    new lq3(lq3.a(iU, iT));
                                    tf2Var.getClass();
                                    break;
                                default:
                                    if (b96Var != null) {
                                        xf2Var.getClass();
                                        iU2 = b96Var.U();
                                        iT2 = b96Var.T();
                                    } else {
                                        iU2 = 0;
                                        iT2 = 0;
                                    }
                                    new lq3(lq3.a(iU2, iT2));
                                    tf2Var.getClass();
                                    break;
                            }
                            return tx8.a;
                        }
                    });
                }
                if (yk4Var7 != null) {
                    ok4.N(yk4Var7, xf2Var, jE, new dp2() { // from class: sf2
                        @Override // defpackage.dp2
                        public final Object invoke(Object obj) {
                            int iU;
                            int iT;
                            int iU2;
                            int iT2;
                            b96 b96Var = (b96) obj;
                            switch (i7) {
                                case 0:
                                    if (b96Var != null) {
                                        xf2Var.getClass();
                                        iU = b96Var.U();
                                        iT = b96Var.T();
                                    } else {
                                        iU = 0;
                                        iT = 0;
                                    }
                                    new lq3(lq3.a(iU, iT));
                                    tf2Var.getClass();
                                    break;
                                default:
                                    if (b96Var != null) {
                                        xf2Var.getClass();
                                        iU2 = b96Var.U();
                                        iT2 = b96Var.T();
                                    } else {
                                        iU2 = 0;
                                        iT2 = 0;
                                    }
                                    new lq3(lq3.a(iU2, iT2));
                                    tf2Var.getClass();
                                    break;
                            }
                            return tx8.a;
                        }
                    });
                }
                Iterator it2 = list2.iterator();
                float f2 = xf2Var.c;
                float f3 = xf2Var.e;
                long jG = dt2.g(j, layoutOrientation);
                int i9 = xf2Var.f;
                int i10 = xf2Var.g;
                tf2 tf2Var2 = xf2Var.h;
                zb5 zb5Var = new zb5(0, new dl4[16]);
                int iH = h31.h(jG);
                int iJ = h31.j(jG);
                int iG = h31.g(jG);
                ya5 ya5Var = qq3.a;
                ya5 ya5Var2 = new ya5();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(el4Var.S(f2));
                int iCeil2 = (int) Math.ceil(el4Var.S(f3));
                long jA3 = j31.a(0, iH, 0, iG);
                long jE2 = dt2.E(dt2.i(14, jA3));
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                if (it2.hasNext()) {
                    try {
                        yk4Var = (yk4) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        yk4Var = null;
                    }
                    j2 = jA3;
                    yk4Var2 = yk4Var;
                } else {
                    j2 = jA3;
                    yk4Var2 = null;
                }
                if (yk4Var2 != null) {
                    if (xa7.e(xa7.d(yk4Var2)) == 0.0f) {
                        xa7.d(yk4Var2);
                        f = 0.0f;
                        b96 b96VarT = yk4Var2.t(jE2);
                        ref$ObjectRef.a = b96VarT;
                        jA2 = lq3.a(b96VarT.U(), b96VarT.T());
                    } else {
                        f = 0.0f;
                        int iL = yk4Var2.l(Integer.MAX_VALUE);
                        jA2 = lq3.a(iL, yk4Var2.P(iL));
                    }
                    yk4Var3 = yk4Var2;
                    it = it2;
                    lq3Var = new lq3(jA2);
                } else {
                    yk4Var3 = yk4Var2;
                    f = 0.0f;
                    it = it2;
                    lq3Var = null;
                }
                Integer numValueOf = lq3Var != null ? Integer.valueOf((int) (lq3Var.a >> 32)) : null;
                Integer numValueOf2 = lq3Var != null ? Integer.valueOf((int) (lq3Var.a & 4294967295L)) : null;
                int[] iArr2 = new int[16];
                int[] iArr3 = new int[16];
                yk4 yk4Var8 = yk4Var3;
                za5 za5Var = new za5();
                ff ffVar = new ff(i9, tf2Var2, jG, i10, iCeil, iCeil2);
                lq3 lq3Var5 = lq3Var;
                of2 of2VarB = ffVar.b(it.hasNext(), 0, lq3.a(iH, iG), lq3Var5, 0, 0, 0, false, false);
                if (of2VarB.b) {
                    of2Var = of2VarB;
                    ffVar.a(of2Var, lq3Var5 != null, -1, 0, iH, 0);
                } else {
                    of2Var = of2VarB;
                }
                int i11 = iG;
                xf2 xf2Var2 = xf2Var;
                int iMax = iJ;
                za5 za5Var2 = za5Var;
                int[] iArrCopyOf = iArr2;
                yk4 yk4Var9 = yk4Var8;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int[] iArrCopyOf2 = iArr3;
                int i19 = iH;
                of2 of2Var3 = of2Var;
                int i20 = 0;
                while (!of2Var3.b && yk4Var9 != null) {
                    js3.m(numValueOf);
                    int iIntValue = numValueOf.intValue();
                    js3.m(numValueOf2);
                    int iIntValue2 = numValueOf2.intValue();
                    int i21 = i14;
                    int i22 = i15 + iIntValue;
                    int iMax2 = Math.max(i12, iIntValue2);
                    int i23 = i19 - iIntValue;
                    int i24 = i20 + 1;
                    tf2Var2.getClass();
                    arrayList.add(yk4Var9);
                    ya5Var2.h(i20, ref$ObjectRef.a);
                    yk4Var9.v();
                    int i25 = i24 - i16;
                    if (it.hasNext()) {
                        try {
                            yk4Var4 = (yk4) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            yk4Var4 = null;
                        }
                    } else {
                        yk4Var4 = null;
                    }
                    ref$ObjectRef.a = null;
                    if (yk4Var4 != null) {
                        if (xa7.e(xa7.d(yk4Var4)) == f) {
                            xa7.d(yk4Var4);
                            b96 b96VarT2 = yk4Var4.t(jE2);
                            ref$ObjectRef.a = b96VarT2;
                            i3 = i24;
                            jA = lq3.a(b96VarT2.U(), b96VarT2.T());
                        } else {
                            i3 = i24;
                            int iL2 = yk4Var4.l(Integer.MAX_VALUE);
                            jA = lq3.a(iL2, yk4Var4.P(iL2));
                        }
                        yk4Var5 = yk4Var4;
                        lq3Var2 = new lq3(jA);
                    } else {
                        yk4Var5 = yk4Var4;
                        i3 = i24;
                        lq3Var2 = null;
                    }
                    Integer numValueOf3 = lq3Var2 != null ? Integer.valueOf(((int) (lq3Var2.a >> 32)) + iCeil) : null;
                    Integer numValueOf4 = lq3Var2 != null ? Integer.valueOf((int) (lq3Var2.a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    int i26 = i17;
                    long jA4 = lq3.a(i23, i11);
                    if (lq3Var2 == null) {
                        lq3Var3 = lq3Var2;
                        i4 = i23;
                        lq3Var4 = null;
                    } else {
                        js3.m(numValueOf3);
                        int iIntValue3 = numValueOf3.intValue();
                        js3.m(numValueOf4);
                        lq3Var3 = lq3Var2;
                        i4 = i23;
                        lq3Var4 = new lq3(lq3.a(iIntValue3, numValueOf4.intValue()));
                    }
                    of2 of2VarB2 = ffVar.b(zHasNext, i25, jA4, lq3Var4, i26, i18, iMax2, false, false);
                    if (of2VarB2.a) {
                        int iMin = Math.min(Math.max(iMax, i22), iH);
                        int i27 = i18 + iMax2;
                        of2Var2 = of2VarB2;
                        ffVar.a(of2Var2, lq3Var3 != null, i26, i27, i4, i25);
                        int i28 = i21 + 1;
                        if (iArrCopyOf2.length < i28) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i28, (iArrCopyOf2.length * 3) / 2));
                            js3.o(iArrCopyOf2, "copyOf(...)");
                        }
                        iArrCopyOf2[i21] = iMax2;
                        i14 = i21 + 1;
                        i11 = (iG - i27) - iCeil2;
                        int i29 = i13 + 1;
                        if (iArrCopyOf.length < i29) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i29, (iArrCopyOf.length * 3) / 2));
                            js3.o(iArrCopyOf, "copyOf(...)");
                        }
                        iArrCopyOf[i13] = i3;
                        i13++;
                        i17 = i26 + 1;
                        i18 = i27 + iCeil2;
                        numValueOf = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - iCeil) : null;
                        iMax = iMin;
                        i4 = iH;
                        i16 = i3;
                        i5 = 0;
                        iMax2 = 0;
                    } else {
                        of2Var2 = of2VarB2;
                        i5 = i22;
                        numValueOf = numValueOf3;
                        i17 = i26;
                        i14 = i21;
                    }
                    yk4 yk4Var10 = yk4Var5;
                    i15 = i5;
                    yk4Var9 = yk4Var10;
                    numValueOf2 = numValueOf4;
                    i20 = i3;
                    of2Var3 = of2Var2;
                    i12 = iMax2;
                    i19 = i4;
                }
                int i30 = i14;
                int size = arrayList.size();
                ?? r1 = new b96[size];
                for (int i31 = 0; i31 < size; i31++) {
                    r1[i31] = ya5Var2.b(i31);
                }
                int[] iArr4 = new int[i13];
                int[] iArr5 = new int[i13];
                int[] iArr6 = iArrCopyOf2;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                ?? r12 = r1;
                while (i33 < i13) {
                    int i35 = iArrCopyOf[i33];
                    if (i33 < 0 || i33 >= (i2 = i30)) {
                        lb7.k("Index must be between 0 and size");
                        throw null;
                    }
                    int iG2 = iArr6[i33];
                    za5 za5Var3 = za5Var2;
                    if (za5Var3.b(i33)) {
                        iArr = iArrCopyOf;
                        c = 65535;
                    } else {
                        c = 65535;
                        if (h31.g(j2) == Integer.MAX_VALUE) {
                            iArr = iArrCopyOf;
                            iG2 = Integer.MAX_VALUE;
                        } else {
                            iG2 = h31.g(j2) - i34;
                            iArr = iArrCopyOf;
                        }
                    }
                    ?? r8 = r12;
                    int i36 = iMax;
                    int[] iArr7 = iArr6;
                    za5Var2 = za5Var3;
                    xf2 xf2Var3 = xf2Var2;
                    dl4 dl4VarT = za7.t(xf2Var3, i36, h31.i(j2), h31.h(j2), iG2, iCeil, el4Var, arrayList, r8, i32, i35, iArr4, i33);
                    int iB = dl4VarT.b();
                    int iA = dl4VarT.a();
                    iArr5[i33] = iA;
                    iMax = Math.max(i36, iB);
                    zb5Var.b(dl4VarT);
                    i33++;
                    r12 = r8;
                    i13 = i13;
                    iArrCopyOf = iArr;
                    i30 = i2;
                    xf2Var2 = xf2Var3;
                    i34 += iA;
                    i32 = i35;
                    iArr6 = iArr7;
                }
                int i37 = iMax;
                int i38 = i34;
                xf2 xf2Var4 = xf2Var2;
                if (zb5Var.c == 0) {
                    i37 = 0;
                    i = 0;
                } else {
                    i = i38;
                }
                hv hvVar = xf2Var4.b;
                int iB0 = ((zb5Var.c - 1) * el4Var.b0(hvVar.e())) + i;
                int i39 = h31.i(jG);
                int iG3 = h31.g(jG);
                if (iB0 < i39) {
                    iB0 = i39;
                }
                if (iB0 <= iG3) {
                    iG3 = iB0;
                }
                hvVar.o(iG3, el4Var, iArr5, iArr4);
                int iJ2 = h31.j(jG);
                int iH2 = h31.h(jG);
                if (i37 < iJ2) {
                    i37 = iJ2;
                }
                if (i37 <= iH2) {
                    iH2 = i37;
                }
                return el4Var.D(iH2, iG3, b.I(), new m22(i8, zb5Var));
            }
            tf2Var.getClass();
            FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.a;
            FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType2 = FlowLayoutOverflow$OverflowType.a;
        }
        return el4Var.D(0, 0, b.I(), new k7(26));
    }

    @Override // defpackage.cl4
    public final int e(es3 es3Var, List list, int i) {
        int[] iArr;
        int i2;
        long j;
        List list2;
        int i3;
        long jA;
        int i4;
        int i5;
        yk4 yk4Var;
        lq3 lq3Var;
        ArrayList arrayListL = ct2.l(es3Var);
        xf2 xf2Var = this.a;
        tf2 tf2Var = xf2Var.h;
        int i6 = 1;
        List list3 = (List) a.q0(1, arrayListL);
        yk4 yk4Var2 = list3 != null ? (yk4) a.p0(list3) : null;
        List list4 = (List) a.q0(2, arrayListL);
        int i7 = 0;
        tf2Var.a(yk4Var2, list4 != null ? (yk4) a.p0(list4) : null, j31.b(0, i, 7));
        List list5 = (List) a.p0(arrayListL);
        if (list5 == null) {
            list5 = EmptyList.a;
        }
        int iB0 = es3Var.b0(xf2Var.c);
        int iB02 = es3Var.b0(xf2Var.e);
        int i8 = xf2Var.g;
        int i9 = xf2Var.f;
        tf2 tf2Var2 = xf2Var.h;
        long jA2 = lq3.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        int i10 = 0;
        while (i10 < size3) {
            int i11 = i7;
            yk4 yk4Var3 = (yk4) list5.get(i10);
            int i12 = i6;
            int iL = yk4Var3.l(i);
            iArr2[i10] = iL;
            iArr3[i10] = yk4Var3.P(iL);
            i10++;
            i7 = i11;
            i6 = i12;
        }
        int i13 = i6;
        int i14 = i7;
        int i15 = (i8 == Integer.MAX_VALUE || i9 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : i9 * i8;
        if (i15 < list5.size()) {
            tf2Var2.getClass();
            FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.a;
        }
        if (i15 >= list5.size()) {
            tf2Var2.getClass();
            if (i8 >= 0) {
                FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType2 = FlowLayoutOverflow$OverflowType.a;
            }
        }
        int iMin = Math.min(i15, list5.size());
        int size4 = ((list5.size() - 1) * iB0) + ew.U0(iArr2);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i16 = iArr3[i14];
        int i17 = size2 - 1;
        if (i13 <= i17) {
            int i18 = 1;
            while (true) {
                int i19 = iArr3[i18];
                if (i16 < i19) {
                    i16 = i19;
                }
                if (i18 == i17) {
                    break;
                }
                i18++;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i20 = iArr2[i14];
        int i21 = size - 1;
        if (1 <= i21) {
            int i22 = 1;
            while (true) {
                int i23 = iArr2[i22];
                if (i20 < i23) {
                    i20 = i23;
                }
                if (i22 == i21) {
                    break;
                }
                i22++;
            }
        }
        int i24 = size4;
        while (i20 <= size4 && i16 != i) {
            i24 = (i20 + size4) / 2;
            if (list5.isEmpty()) {
                i2 = i20;
                list2 = list5;
                jA = jA2;
                j = jA;
                iArr = iArr3;
            } else {
                int i25 = i14;
                iArr = iArr3;
                ff ffVar = new ff(i9, tf2Var2, j31.a(i25, i24, i25, Integer.MAX_VALUE), i8, iB0, iB02);
                yk4 yk4Var4 = (yk4) a.q0(i25, list5);
                int i26 = yk4Var4 != null ? iArr[i25] : i25;
                if (yk4Var4 != null) {
                    i25 = iArr2[i25];
                }
                i2 = i20;
                j = jA2;
                int i27 = 0;
                int i28 = 0;
                if (ffVar.b(list5.size() > 1, 0, lq3.a(i24, Integer.MAX_VALUE), yk4Var4 == null ? null : new lq3(lq3.a(i25, i26)), 0, 0, 0, false, false).b) {
                    tf2Var2.getClass();
                    FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType3 = FlowLayoutOverflow$OverflowType.a;
                    list2 = list5;
                    jA = j;
                } else {
                    int size5 = list5.size();
                    int i29 = i24;
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 0;
                    while (true) {
                        if (i31 >= size5) {
                            list2 = list5;
                            i3 = i33;
                            break;
                        }
                        i29 -= i25;
                        i3 = i31 + 1;
                        int iMax = Math.max(i30, i26);
                        yk4 yk4Var5 = (yk4) a.q0(i3, list5);
                        i26 = yk4Var5 != null ? iArr[i3] : 0;
                        if (yk4Var5 != null) {
                            i4 = size5;
                            i5 = iArr2[i3] + iB0;
                        } else {
                            i4 = size5;
                            i5 = 0;
                        }
                        list2 = list5;
                        boolean z = i31 + 2 < list2.size();
                        int i34 = i3 - i32;
                        long jA3 = lq3.a(i29, Integer.MAX_VALUE);
                        if (yk4Var5 == null) {
                            yk4Var = yk4Var5;
                            lq3Var = null;
                        } else {
                            yk4Var = yk4Var5;
                            lq3Var = new lq3(lq3.a(i5, i26));
                        }
                        of2 of2VarB = ffVar.b(z, i34, jA3, lq3Var, i27, i28, iMax, false, false);
                        if (of2VarB.a) {
                            int i35 = iMax + iB02 + i28;
                            int i36 = i27;
                            ffVar.a(of2VarB, yk4Var != null, i36, i35, i29, i34);
                            i5 -= iB0;
                            i27 = i36 + 1;
                            if (of2VarB.b) {
                                i28 = i35;
                                break;
                            }
                            i29 = i24;
                            i32 = i3;
                            i28 = i35;
                            i30 = 0;
                        } else {
                            i30 = iMax;
                        }
                        i31 = i3;
                        i33 = i31;
                        list5 = list2;
                        i25 = i5;
                        size5 = i4;
                    }
                    jA = lq3.a(i28 - iB02, i3);
                }
            }
            int i37 = (int) (jA >> 32);
            int i38 = (int) (jA & 4294967295L);
            if (i37 > i || i38 < iMin) {
                int i39 = i24 + 1;
                if (i39 > size4) {
                    return i39;
                }
                iArr3 = iArr;
                jA2 = j;
                i14 = 0;
                i16 = i37;
                i20 = i39;
                list5 = list2;
            } else {
                if (i37 >= i) {
                    return i24;
                }
                size4 = i24 - 1;
                iArr3 = iArr;
                jA2 = j;
                list5 = list2;
                i14 = 0;
                i16 = i37;
                i20 = i2;
            }
        }
        return i24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k95) && js3.i(this.a, ((k95) obj).a);
    }

    @Override // defpackage.cl4
    public final int g(es3 es3Var, List list, int i) {
        ArrayList arrayListL = ct2.l(es3Var);
        xf2 xf2Var = this.a;
        tf2 tf2Var = xf2Var.h;
        List list2 = (List) a.q0(1, arrayListL);
        yk4 yk4Var = list2 != null ? (yk4) a.p0(list2) : null;
        List list3 = (List) a.q0(2, arrayListL);
        tf2Var.a(yk4Var, list3 != null ? (yk4) a.p0(list3) : null, j31.b(i, 0, 13));
        List list4 = (List) a.p0(arrayListL);
        if (list4 == null) {
            list4 = EmptyList.a;
        }
        return xf2.b(list4, i, es3Var.b0(xf2Var.c), es3Var.b0(xf2Var.e), xf2Var.f, xf2Var.g, xf2Var.h);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.cl4
    public final int i(es3 es3Var, List list, int i) {
        ArrayList arrayListL = ct2.l(es3Var);
        xf2 xf2Var = this.a;
        tf2 tf2Var = xf2Var.h;
        List list2 = (List) a.q0(1, arrayListL);
        yk4 yk4Var = list2 != null ? (yk4) a.p0(list2) : null;
        List list3 = (List) a.q0(2, arrayListL);
        tf2Var.a(yk4Var, list3 != null ? (yk4) a.p0(list3) : null, j31.b(i, 0, 13));
        List list4 = (List) a.p0(arrayListL);
        if (list4 == null) {
            list4 = EmptyList.a;
        }
        return xf2.b(list4, i, es3Var.b0(xf2Var.c), es3Var.b0(xf2Var.e), xf2Var.f, xf2Var.g, xf2Var.h);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
