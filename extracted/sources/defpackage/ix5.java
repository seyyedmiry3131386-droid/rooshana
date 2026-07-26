package defpackage;

import androidx.compose.material3.internal.m;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class ix5 implements cl4 {
    public final dp2 a;
    public final lh8 b;
    public final jh8 c;
    public final wy5 d;
    public final float e;

    public ix5(dp2 dp2Var, lh8 lh8Var, jh8 jh8Var, wy5 wy5Var, float f) {
        this.a = dp2Var;
        this.b = lh8Var;
        this.c = jh8Var;
        this.d = wy5Var;
        this.e = f;
    }

    public static final int j(int i, ix5 ix5Var, int i2, int i3, b96 b96Var, b96 b96Var2) {
        return Math.max(i + i3, (b96Var != null ? b96Var.b : 0) / 2);
    }

    public final int a(es3 es3Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, wq2.M(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        wy5 wy5Var = this.d;
        float fS = es3Var.S(wy5Var.b);
        return j31.f(Math.max(i, Math.max(i2, ok4.V(wq2.L(fS, Math.max(fS, i6 / 2.0f), f) + i5 + es3Var.S(wy5Var.d)))) + i8, j);
    }

    @Override // defpackage.cl4
    public final int b(es3 es3Var, List list, int i) {
        return h(es3Var, list, i, new r05(23, (byte) 0));
    }

    public final int c(es3 es3Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, wq2.M(f, i6, 0))) + i + i2;
        LayoutDirection layoutDirection = LayoutDirection.a;
        wy5 wy5Var = this.d;
        return j31.g(Math.max(iMax, ok4.V((i6 + es3Var.S(wy5Var.b(layoutDirection) + wy5Var.a(layoutDirection))) * f)), j);
    }

    @Override // defpackage.cl4
    public final dl4 d(final el4 el4Var, List list, long j) {
        Object obj;
        Object obj2;
        b96 b96Var;
        int i;
        b96 b96VarT;
        Object obj3;
        b96 b96Var2;
        int i2;
        b96 b96VarT2;
        Object obj4;
        b96 b96Var3;
        int i3;
        b96 b96VarT3;
        Object obj5;
        long jFloatToRawIntBits;
        Object obj6;
        int i4;
        Object obj7;
        b96 b96Var4;
        int i5;
        b96 b96Var5;
        int i6;
        Ref$ObjectRef ref$ObjectRef;
        int i7;
        Ref$ObjectRef ref$ObjectRef2;
        b96 b96Var6;
        int i8;
        long j2;
        int i9;
        b96 b96Var7;
        b96 b96Var8;
        int i10;
        int i11;
        b96 b96Var9;
        float f;
        b96 b96Var10;
        ix5 ix5Var;
        el4 el4Var2;
        Ref$ObjectRef ref$ObjectRef3;
        int i12;
        b96 b96Var11;
        b96 b96Var12;
        int i13;
        int i14;
        b96 b96Var13;
        int i15;
        int i16;
        int i17;
        ix5 ix5Var2;
        el4 el4Var3;
        float f2;
        List list2 = list;
        float fA = this.c.a();
        wy5 wy5Var = this.d;
        int iB0 = el4Var.b0(wy5Var.d);
        long jA = h31.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i18);
            if (js3.i(is3.r((yk4) obj), "Leading")) {
                break;
            }
            i18++;
        }
        yk4 yk4Var = (yk4) obj;
        b96 b96VarT4 = yk4Var != null ? yk4Var.t(jA) : null;
        int i19 = b96VarT4 != null ? b96VarT4.a : 0;
        int iMax = Math.max(0, b96VarT4 != null ? b96VarT4.b : 0);
        int size2 = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i20);
            if (js3.i(is3.r((yk4) obj2), "Trailing")) {
                break;
            }
            i20++;
        }
        yk4 yk4Var2 = (yk4) obj2;
        if (yk4Var2 != null) {
            b96Var = b96VarT4;
            i = i19;
            b96VarT = yk4Var2.t(j31.j(-i19, 0, 2, jA));
        } else {
            b96Var = b96VarT4;
            i = i19;
            b96VarT = null;
        }
        int i21 = i + (b96VarT != null ? b96VarT.a : 0);
        int iMax2 = Math.max(iMax, b96VarT != null ? b96VarT.b : 0);
        int size3 = list2.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i22);
            int i23 = size3;
            if (js3.i(is3.r((yk4) obj3), "Prefix")) {
                break;
            }
            i22++;
            size3 = i23;
        }
        yk4 yk4Var3 = (yk4) obj3;
        if (yk4Var3 != null) {
            b96Var2 = b96VarT;
            i2 = i21;
            b96VarT2 = yk4Var3.t(j31.j(-i21, 0, 2, jA));
        } else {
            b96Var2 = b96VarT;
            i2 = i21;
            b96VarT2 = null;
        }
        int i24 = i2 + (b96VarT2 != null ? b96VarT2.a : 0);
        int iMax3 = Math.max(iMax2, b96VarT2 != null ? b96VarT2.b : 0);
        int size4 = list2.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i25);
            int i26 = size4;
            if (js3.i(is3.r((yk4) obj4), "Suffix")) {
                break;
            }
            i25++;
            size4 = i26;
        }
        yk4 yk4Var4 = (yk4) obj4;
        if (yk4Var4 != null) {
            b96Var3 = b96VarT2;
            i3 = i24;
            b96VarT3 = yk4Var4.t(j31.j(-i24, 0, 2, jA));
        } else {
            b96Var3 = b96VarT2;
            i3 = i24;
            b96VarT3 = null;
        }
        int i27 = i3 + (b96VarT3 != null ? b96VarT3.a : 0);
        int iMax4 = Math.max(iMax3, b96VarT3 != null ? b96VarT3.b : 0);
        int size5 = list2.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i28);
            int i29 = size5;
            if (js3.i(is3.r((yk4) obj5), "Label")) {
                break;
            }
            i28++;
            size5 = i29;
        }
        yk4 yk4Var5 = (yk4) obj5;
        Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
        int iB02 = el4Var.b0(wy5Var.b(el4Var.getLayoutDirection())) + el4Var.b0(wy5Var.a(el4Var.getLayoutDirection()));
        int i30 = -wq2.M(fA, i27 + iB02, iB02);
        int i31 = -iB0;
        b96 b96Var14 = b96Var;
        b96 b96VarT5 = yk4Var5 != null ? yk4Var5.t(j31.i(i30, i31, jA)) : null;
        ref$ObjectRef4.a = b96VarT5;
        if (b96VarT5 != null) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(b96VarT5.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(b96VarT5.a)) << 32);
        } else {
            jFloatToRawIntBits = 0;
        }
        this.a.invoke(new ey7(jFloatToRawIntBits));
        int size6 = list2.size();
        int i32 = 0;
        while (true) {
            if (i32 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i32);
            if (js3.i(is3.r((yk4) obj6), "Supporting")) {
                break;
            }
            i32++;
        }
        yk4 yk4Var6 = (yk4) obj6;
        int iP = yk4Var6 != null ? yk4Var6.P(h31.j(j)) : 0;
        b96 b96Var15 = (b96) ref$ObjectRef4.a;
        int iMax5 = Math.max((b96Var15 != null ? b96Var15.b : 0) / 2, el4Var.b0(wy5Var.b));
        long j3 = j;
        long jA2 = h31.a(j31.i(-i27, (i31 - iMax5) - iP, j3), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i33 = 0;
        while (i33 < size7) {
            int i34 = size7;
            yk4 yk4Var7 = (yk4) list2.get(i33);
            int i35 = iMax5;
            if (js3.i(is3.r(yk4Var7), "TextField")) {
                b96 b96VarT6 = yk4Var7.t(jA2);
                long jA3 = h31.a(jA2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i36 = 0;
                while (true) {
                    if (i36 >= size8) {
                        i4 = iB0;
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i36);
                    i4 = iB0;
                    int i37 = size8;
                    if (js3.i(is3.r((yk4) obj7), "Hint")) {
                        break;
                    }
                    i36++;
                    size8 = i37;
                    iB0 = i4;
                }
                yk4 yk4Var8 = (yk4) obj7;
                b96 b96VarT7 = yk4Var8 != null ? yk4Var8.t(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(b96VarT6.b, b96VarT7 != null ? b96VarT7.b : 0) + i35 + i4);
                int i38 = b96Var14 != null ? b96Var14.a : 0;
                b96 b96Var16 = b96Var2;
                if (b96Var2 != null) {
                    b96Var4 = b96Var14;
                    i5 = b96Var16.a;
                } else {
                    b96Var4 = b96Var14;
                    i5 = 0;
                }
                b96 b96Var17 = b96Var3;
                int i39 = b96Var3 != null ? b96Var17.a : 0;
                if (b96VarT3 != null) {
                    i6 = b96VarT3.a;
                    b96Var5 = b96Var16;
                } else {
                    b96Var5 = b96Var16;
                    i6 = 0;
                }
                int i40 = b96VarT6.a;
                b96 b96Var18 = (b96) ref$ObjectRef4.a;
                if (b96Var18 != null) {
                    i7 = b96Var18.a;
                    ref$ObjectRef = ref$ObjectRef4;
                } else {
                    ref$ObjectRef = ref$ObjectRef4;
                    i7 = 0;
                }
                if (b96VarT7 != null) {
                    b96Var6 = b96Var5;
                    i8 = i38;
                    ref$ObjectRef2 = ref$ObjectRef;
                    j2 = j3;
                    i9 = b96VarT7.a;
                    b96Var7 = b96VarT7;
                    b96Var8 = b96VarT3;
                    i10 = i39;
                    i11 = iMax6;
                    b96Var9 = b96Var17;
                    f = fA;
                    b96Var10 = b96VarT6;
                    el4Var2 = el4Var;
                    ix5Var = this;
                } else {
                    ref$ObjectRef2 = ref$ObjectRef;
                    b96Var6 = b96Var5;
                    i8 = i38;
                    j2 = j3;
                    i9 = 0;
                    b96Var7 = b96VarT7;
                    b96Var8 = b96VarT3;
                    i10 = i39;
                    i11 = iMax6;
                    b96Var9 = b96Var17;
                    f = fA;
                    b96Var10 = b96VarT6;
                    ix5Var = this;
                    el4Var2 = el4Var;
                }
                int iC = ix5Var.c(el4Var2, i8, i5, i10, i6, i40, i7, i9, j2, f);
                long jA4 = h31.a(j31.j(0, -i11, 1, jA), 0, iC, 0, 0, 9);
                int i41 = iC;
                final b96 b96VarT8 = yk4Var6 != null ? yk4Var6.t(jA4) : null;
                int i42 = b96VarT8 != null ? b96VarT8.b : 0;
                final b96 b96Var19 = b96Var4;
                int i43 = b96Var4 != null ? b96Var19.b : 0;
                b96 b96Var20 = b96Var6;
                int i44 = b96Var20 != null ? b96Var20.b : 0;
                b96 b96Var21 = b96Var9;
                int i45 = b96Var21 != null ? b96Var21.b : 0;
                final b96 b96Var22 = b96Var8;
                int i46 = b96Var22 != null ? b96Var22.b : 0;
                b96 b96Var23 = b96Var10;
                int i47 = b96Var23.b;
                Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef2;
                b96 b96Var24 = (b96) ref$ObjectRef5.a;
                int i48 = b96Var24 != null ? b96Var24.b : 0;
                int i49 = i42;
                final b96 b96Var25 = b96Var7;
                int i50 = b96Var25 != null ? b96Var25.b : 0;
                if (b96VarT8 != null) {
                    ref$ObjectRef3 = ref$ObjectRef5;
                    i12 = b96VarT8.b;
                    b96Var11 = b96Var20;
                    b96Var12 = b96Var21;
                    i13 = i45;
                    i14 = i46;
                    b96Var13 = b96Var23;
                    i15 = i50;
                    i16 = i48;
                    i17 = 0;
                    el4Var3 = el4Var;
                    f2 = f;
                    ix5Var2 = this;
                } else {
                    ref$ObjectRef3 = ref$ObjectRef5;
                    i12 = 0;
                    b96Var11 = b96Var20;
                    b96Var12 = b96Var21;
                    i13 = i45;
                    i14 = i46;
                    b96Var13 = b96Var23;
                    i15 = i50;
                    i16 = i48;
                    i17 = 0;
                    ix5Var2 = this;
                    el4Var3 = el4Var;
                    f2 = f;
                }
                final int iA = ix5Var2.a(el4Var3, i43, i44, i13, i14, i47, i16, i15, i12, j, f2);
                final float f3 = f2;
                int i51 = iA - i49;
                int size9 = list.size();
                int i52 = i17;
                while (i52 < size9) {
                    yk4 yk4Var9 = (yk4) list.get(i52);
                    if (js3.i(is3.r(yk4Var9), "Container")) {
                        final b96 b96VarT9 = yk4Var9.t(j31.a(i41 != Integer.MAX_VALUE ? i41 : i17, i41, i51 != Integer.MAX_VALUE ? i51 : i17, i51));
                        final int i53 = i41;
                        final b96 b96Var26 = b96Var11;
                        final b96 b96Var27 = b96Var12;
                        final Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef3;
                        final b96 b96Var28 = b96Var13;
                        return el4Var.D(i53, iA, b.I(), new dp2() { // from class: hx5
                            @Override // defpackage.dp2
                            public final Object invoke(Object obj8) {
                                b96 b96Var29;
                                ix5 ix5Var3;
                                float f4;
                                float f5;
                                int i54;
                                int i55;
                                b96 b96Var30;
                                ix5 ix5Var4;
                                int i56;
                                float f6;
                                float f7;
                                a96 a96Var = (a96) obj8;
                                b96 b96Var31 = (b96) ref$ObjectRef6.a;
                                el4 el4Var4 = el4Var;
                                float density = el4Var4.getDensity();
                                LayoutDirection layoutDirection = el4Var4.getLayoutDirection();
                                ix5 ix5Var5 = this.a;
                                float fS = el4Var4.S(ix5Var5.e);
                                lh8 lh8Var = ix5Var5.b;
                                wy5 wy5Var2 = ix5Var5.d;
                                a96Var.g(b96VarT9, 0, 0, 0.0f);
                                b96 b96Var32 = b96VarT8;
                                int i57 = iA - (b96Var32 != null ? b96Var32.b : 0);
                                int iV = ok4.V(wy5Var2.b * density);
                                b96 b96Var33 = b96Var19;
                                if (b96Var33 != null) {
                                    a96.j(a96Var, b96Var33, 0, Math.round((1 + 0.0f) * ((i57 - b96Var33.b) / 2.0f)));
                                }
                                int i58 = i53;
                                b96 b96Var34 = b96Var26;
                                if (b96Var31 != null) {
                                    int i59 = -(b96Var31.b / 2);
                                    float f8 = f3;
                                    int iM = wq2.M(f8, iV, i59);
                                    float fO = yh0.o(wy5Var2, layoutDirection) * density;
                                    float fN = yh0.n(wy5Var2, layoutDirection) * density;
                                    if (b96Var33 == null) {
                                        f6 = fO;
                                    } else {
                                        float f9 = b96Var33.a;
                                        float f10 = fO - fS;
                                        if (f10 < 0.0f) {
                                            f10 = 0.0f;
                                        }
                                        f6 = f9 + f10;
                                    }
                                    if (b96Var34 == null) {
                                        ix5Var3 = ix5Var5;
                                        f7 = fN;
                                    } else {
                                        ix5Var3 = ix5Var5;
                                        float f11 = b96Var34.a;
                                        float f12 = fN - fS;
                                        if (f12 < 0.0f) {
                                            f12 = 0.0f;
                                        }
                                        f7 = f11 + f12;
                                    }
                                    b96Var29 = b96Var34;
                                    LayoutDirection layoutDirection2 = LayoutDirection.a;
                                    float f13 = layoutDirection == layoutDirection2 ? fO : fN;
                                    float f14 = layoutDirection == layoutDirection2 ? f6 : f7;
                                    float f15 = m.a;
                                    int iV2 = ok4.V(wq2.L(lh8Var.b.a(b96Var31.a, i58 - ok4.V(f6 + f7), layoutDirection) + f14, ((ab0) m.c(lh8Var)).a(b96Var31.a, i58 - ok4.V(fO + fN), layoutDirection) + f13, f8));
                                    f4 = 0.0f;
                                    a96Var.g(b96Var31, iV2, iM, 0.0f);
                                } else {
                                    b96Var29 = b96Var34;
                                    ix5Var3 = ix5Var5;
                                    f4 = 0.0f;
                                }
                                b96 b96Var35 = b96Var27;
                                if (b96Var35 != null) {
                                    f5 = f4;
                                    i54 = iV;
                                    i55 = i57;
                                    b96Var30 = b96Var29;
                                    ix5Var4 = ix5Var3;
                                    i56 = 0;
                                    a96.j(a96Var, b96Var35, b96Var33 != null ? b96Var33.a : 0, ix5.j(0, ix5Var4, i55, i54, b96Var31, b96Var35));
                                } else {
                                    f5 = f4;
                                    i54 = iV;
                                    i55 = i57;
                                    b96Var30 = b96Var29;
                                    ix5Var4 = ix5Var3;
                                    i56 = 0;
                                }
                                int i60 = (b96Var33 != null ? b96Var33.a : 0) + (b96Var35 != null ? b96Var35.a : 0);
                                b96 b96Var36 = b96Var28;
                                a96.j(a96Var, b96Var36, i60, ix5.j(i56, ix5Var4, i55, i54, b96Var31, b96Var36));
                                b96 b96Var37 = b96Var25;
                                if (b96Var37 != null) {
                                    a96.j(a96Var, b96Var37, i60, ix5.j(i56, ix5Var4, i55, i54, b96Var31, b96Var37));
                                }
                                b96 b96Var38 = b96Var22;
                                if (b96Var38 != null) {
                                    a96.j(a96Var, b96Var38, (i58 - (b96Var30 != null ? b96Var30.a : 0)) - b96Var38.a, ix5.j(i56, ix5Var4, i55, i54, b96Var31, b96Var38));
                                }
                                if (b96Var30 != null) {
                                    a96.j(a96Var, b96Var30, i58 - b96Var30.a, Math.round((1 + f5) * ((i55 - b96Var30.b) / 2.0f)));
                                }
                                if (b96Var32 != null) {
                                    a96.j(a96Var, b96Var32, 0, i55);
                                }
                                return tx8.a;
                            }
                        });
                    }
                    i52++;
                    i41 = i41;
                    iA = iA;
                }
                k94.b("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i33++;
            iMax5 = i35;
            size7 = i34;
            jA2 = jA2;
            j3 = j;
            list2 = list2;
            iB0 = iB0;
        }
        k94.b("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.cl4
    public final int e(es3 es3Var, List list, int i) {
        return h(es3Var, list, i, new r05(25, (byte) 0));
    }

    public final int f(es3 es3Var, List list, int i, qp2 qp2Var) {
        Object obj;
        int iA;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        ix5 ix5Var = this;
        float fA = ix5Var.c.a();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (js3.i(tv8.r((yk4) obj), "Leading")) {
                break;
            }
            i2++;
        }
        yk4 yk4Var = (yk4) obj;
        if (yk4Var != null) {
            iA = tv8.A(i, yk4Var.n(Integer.MAX_VALUE));
            iIntValue = ((Number) qp2Var.invoke(yk4Var, Integer.valueOf(i))).intValue();
        } else {
            iA = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (js3.i(tv8.r((yk4) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        yk4 yk4Var2 = (yk4) obj2;
        if (yk4Var2 != null) {
            iA = tv8.A(iA, yk4Var2.n(Integer.MAX_VALUE));
            iIntValue2 = ((Number) qp2Var.invoke(yk4Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (js3.i(tv8.r((yk4) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (yk4) obj3;
        int iIntValue5 = obj8 != null ? ((Number) qp2Var.invoke(obj8, Integer.valueOf(wq2.M(fA, iA, i)))).intValue() : 0;
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            if (js3.i(tv8.r((yk4) obj4), "Prefix")) {
                break;
            }
            i5++;
        }
        yk4 yk4Var3 = (yk4) obj4;
        if (yk4Var3 != null) {
            iIntValue3 = ((Number) qp2Var.invoke(yk4Var3, Integer.valueOf(iA))).intValue();
            iA = tv8.A(iA, yk4Var3.n(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i6);
            if (js3.i(tv8.r((yk4) obj5), "Suffix")) {
                break;
            }
            i6++;
        }
        yk4 yk4Var4 = (yk4) obj5;
        if (yk4Var4 != null) {
            iIntValue4 = ((Number) qp2Var.invoke(yk4Var4, Integer.valueOf(iA))).intValue();
            iA = tv8.A(iA, yk4Var4.n(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (js3.i(tv8.r((yk4) obj9), "TextField")) {
                int iIntValue6 = ((Number) qp2Var.invoke(obj9, Integer.valueOf(iA))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (js3.i(tv8.r((yk4) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (yk4) obj6;
                int iIntValue7 = obj10 != null ? ((Number) qp2Var.invoke(obj10, Integer.valueOf(iA))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (js3.i(tv8.r((yk4) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (yk4) obj7;
                return ix5Var.a(es3Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) qp2Var.invoke(obj11, Integer.valueOf(i))).intValue() : 0, j31.b(0, 0, 15), fA);
            }
            i7++;
            iIntValue4 = iIntValue4;
            ix5Var = this;
            iIntValue3 = iIntValue3;
        }
        k94.b("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.cl4
    public final int g(es3 es3Var, List list, int i) {
        return f(es3Var, list, i, new r05(24, (byte) 0));
    }

    public final int h(es3 es3Var, List list, int i, qp2 qp2Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (js3.i(tv8.r((yk4) obj7), "TextField")) {
                int iIntValue = ((Number) qp2Var.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (js3.i(tv8.r((yk4) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                yk4 yk4Var = (yk4) obj2;
                int iIntValue2 = yk4Var != null ? ((Number) qp2Var.invoke(yk4Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (js3.i(tv8.r((yk4) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                yk4 yk4Var2 = (yk4) obj3;
                int iIntValue3 = yk4Var2 != null ? ((Number) qp2Var.invoke(yk4Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (js3.i(tv8.r((yk4) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                yk4 yk4Var3 = (yk4) obj4;
                int iIntValue4 = yk4Var3 != null ? ((Number) qp2Var.invoke(yk4Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (js3.i(tv8.r((yk4) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                yk4 yk4Var4 = (yk4) obj5;
                int iIntValue5 = yk4Var4 != null ? ((Number) qp2Var.invoke(yk4Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (js3.i(tv8.r((yk4) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                yk4 yk4Var5 = (yk4) obj6;
                int iIntValue6 = yk4Var5 != null ? ((Number) qp2Var.invoke(yk4Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (js3.i(tv8.r((yk4) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                yk4 yk4Var6 = (yk4) obj;
                return c(es3Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, yk4Var6 != null ? ((Number) qp2Var.invoke(yk4Var6, Integer.valueOf(i))).intValue() : 0, j31.b(0, 0, 15), this.c.a());
            }
        }
        k94.b("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.cl4
    public final int i(es3 es3Var, List list, int i) {
        return f(es3Var, list, i, new r05(22, (byte) 0));
    }
}
