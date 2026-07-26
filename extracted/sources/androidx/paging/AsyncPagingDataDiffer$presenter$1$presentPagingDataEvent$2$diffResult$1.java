package androidx.paging;

import defpackage.aj0;
import defpackage.cx;
import defpackage.e71;
import defpackage.eo1;
import defpackage.f96;
import defpackage.fo1;
import defpackage.g06;
import defpackage.g51;
import defpackage.g96;
import defpackage.ho1;
import defpackage.io1;
import defpackage.iz5;
import defpackage.js3;
import defpackage.mq3;
import defpackage.ok4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tq3;
import defpackage.tx8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1", f = "AsyncPagingDataDiffer.kt", l = {}, m = "invokeSuspend", v = 1)
final class AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ g06 a;
    public final /* synthetic */ cx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1(g06 g06Var, cx cxVar, g51 g51Var) {
        super(2, g51Var);
        this.a = g06Var;
        this.b = cxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        io1 io1Var;
        int i2;
        ho1 ho1Var;
        int i3;
        io1 io1Var2;
        io1 io1Var3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        g06 g06Var = this.a;
        g96 g96Var = g06Var.t;
        iz5 iz5Var = g06Var.s;
        js3.p(g96Var, "<this>");
        iz5 iz5Var2 = (iz5) g96Var;
        int i12 = iz5Var2.b;
        int i13 = iz5Var.b;
        aj0 aj0Var = new aj0(g96Var, iz5Var, i12, i13);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ho1 ho1Var2 = new ho1();
        int i14 = 0;
        ho1Var2.a = 0;
        ho1Var2.b = i12;
        ho1Var2.c = 0;
        ho1Var2.d = i13;
        arrayList2.add(ho1Var2);
        int i15 = i12 + i13;
        int i16 = 1;
        int i17 = (((i15 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i17];
        int i18 = i17 / 2;
        int[] iArr2 = new int[i17];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            ho1 ho1Var3 = (ho1) arrayList2.remove(arrayList2.size() - i16);
            if (ho1Var3.b() < i16 || ho1Var3.a() < i16) {
                i = i18;
                io1Var = null;
            } else {
                int iA = ((ho1Var3.a() + ho1Var3.b()) + i16) / 2;
                int i19 = i16 + i18;
                iArr[i19] = ho1Var3.a;
                iArr2[i19] = ho1Var3.b;
                int i20 = i14;
                while (i20 < iA) {
                    int i21 = Math.abs(ho1Var3.b() - ho1Var3.a()) % 2 == i16 ? i16 : i14;
                    int iB = ho1Var3.b() - ho1Var3.a();
                    int i22 = -i20;
                    int i23 = i22;
                    while (true) {
                        if (i23 > i20) {
                            i = i18;
                            i3 = iA;
                            io1Var2 = null;
                            break;
                        }
                        if (i23 == i22 || (i23 != i20 && iArr[i23 + 1 + i18] > iArr[(i23 - 1) + i18])) {
                            i8 = iArr[i23 + 1 + i18];
                            i9 = i8;
                        } else {
                            i8 = iArr[(i23 - 1) + i18];
                            i9 = i8 + 1;
                        }
                        int i24 = i23;
                        int i25 = ((i9 - ho1Var3.a) + ho1Var3.c) - i24;
                        if (i20 == 0 || i9 != i8) {
                            i10 = i25;
                        } else {
                            i10 = i25;
                            i25--;
                        }
                        int i26 = i18;
                        int i27 = i9;
                        int i28 = i10;
                        i = i26;
                        i3 = iA;
                        while (i27 < ho1Var3.b && i28 < ho1Var3.d && aj0Var.c(i27, i28)) {
                            i27++;
                            i28++;
                        }
                        iArr[i24 + i] = i27;
                        if (i21 != 0) {
                            int i29 = iB - i24;
                            i11 = i21;
                            if (i29 >= i22 + 1 && i29 <= i20 - 1 && iArr2[i29 + i] <= i27) {
                                io1Var2 = new io1();
                                io1Var2.a = i8;
                                io1Var2.b = i25;
                                io1Var2.c = i27;
                                io1Var2.d = i28;
                                io1Var2.e = false;
                                break;
                            }
                        } else {
                            i11 = i21;
                        }
                        i23 = i24 + 2;
                        i18 = i;
                        iA = i3;
                        i21 = i11;
                    }
                    if (io1Var2 != null) {
                        io1Var = io1Var2;
                        break;
                    }
                    boolean z2 = (ho1Var3.b() - ho1Var3.a()) % 2 == 0;
                    int iB2 = ho1Var3.b() - ho1Var3.a();
                    int i30 = i22;
                    while (true) {
                        if (i30 > i20) {
                            io1Var3 = null;
                            break;
                        }
                        if (i30 == i22 || (i30 != i20 && iArr2[i30 + 1 + i] < iArr2[(i30 - 1) + i])) {
                            i4 = iArr2[i30 + 1 + i];
                            i5 = i4;
                        } else {
                            i4 = iArr2[(i30 - 1) + i];
                            i5 = i4 - 1;
                        }
                        boolean z3 = z2;
                        int i31 = ho1Var3.d - ((ho1Var3.b - i5) - i30);
                        int i32 = (i20 == 0 || i5 != i4) ? i31 : i31 + 1;
                        int i33 = iB2;
                        while (i5 > ho1Var3.a && i31 > ho1Var3.c) {
                            i6 = i30;
                            if (!aj0Var.c(i5 - 1, i31 - 1)) {
                                break;
                            }
                            i5--;
                            i31--;
                            i30 = i6;
                        }
                        i6 = i30;
                        iArr2[i6 + i] = i5;
                        if (z3 && (i7 = i33 - i6) >= i22 && i7 <= i20 && iArr[i7 + i] >= i5) {
                            io1Var3 = new io1();
                            io1Var3.a = i5;
                            io1Var3.b = i31;
                            io1Var3.c = i4;
                            io1Var3.d = i32;
                            io1Var3.e = true;
                            break;
                        }
                        i30 = i6 + 2;
                        z2 = z3;
                        iB2 = i33;
                    }
                    if (io1Var3 != null) {
                        io1Var = io1Var3;
                        break;
                    }
                    i20++;
                    i18 = i;
                    iA = i3;
                    i16 = 1;
                    i14 = 0;
                }
                i = i18;
                io1Var = null;
            }
            if (io1Var != null) {
                if (io1Var.a() > 0) {
                    int i34 = io1Var.d;
                    int i35 = io1Var.b;
                    int i36 = i34 - i35;
                    int i37 = io1Var.c;
                    int i38 = io1Var.a;
                    int i39 = i37 - i38;
                    arrayList.add(i36 != i39 ? io1Var.e ? new eo1(i38, i35, io1Var.a()) : i36 > i39 ? new eo1(i38, i35 + 1, io1Var.a()) : new eo1(i38 + 1, i35, io1Var.a()) : new eo1(i38, i35, i39));
                }
                if (arrayList3.isEmpty()) {
                    ho1Var = new ho1();
                    i2 = 1;
                } else {
                    i2 = 1;
                    ho1Var = (ho1) arrayList3.remove(arrayList3.size() - 1);
                }
                ho1Var.a = ho1Var3.a;
                ho1Var.c = ho1Var3.c;
                ho1Var.b = io1Var.a;
                ho1Var.d = io1Var.b;
                arrayList2.add(ho1Var);
                ho1Var3.b = ho1Var3.b;
                ho1Var3.d = ho1Var3.d;
                ho1Var3.a = io1Var.c;
                ho1Var3.c = io1Var.d;
                arrayList2.add(ho1Var3);
            } else {
                i2 = 1;
                arrayList3.add(ho1Var3);
            }
            i16 = i2;
            i18 = i;
            i14 = 0;
        }
        int i40 = i16;
        Collections.sort(arrayList, js3.b);
        fo1 fo1Var = new fo1(aj0Var, arrayList, iArr, iArr2);
        Iterable iterableZ = ok4.Z(0, iz5Var2.b);
        if ((iterableZ instanceof Collection) && ((Collection) iterableZ).isEmpty()) {
            z = 0;
        } else {
            Iterator it = iterableZ.iterator();
            while (((tq3) it).c) {
                if (fo1Var.a(((mq3) it).nextInt()) != -1) {
                    z = i40;
                    break;
                }
            }
            z = 0;
        }
        return new f96(fo1Var, z);
    }
}
