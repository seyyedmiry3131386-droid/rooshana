package androidx.navigation3.ui;

import androidx.compose.runtime.g;
import androidx.navigation3.ui.a;
import defpackage.a67;
import defpackage.av;
import defpackage.bo1;
import defpackage.bp2;
import defpackage.br9;
import defpackage.bt2;
import defpackage.cb0;
import defpackage.dj5;
import defpackage.dp2;
import defpackage.ee7;
import defpackage.ej5;
import defpackage.eq;
import defpackage.f8;
import defpackage.fe7;
import defpackage.fv;
import defpackage.hx4;
import defpackage.i25;
import defpackage.ie7;
import defpackage.je7;
import defpackage.js3;
import defpackage.jz0;
import defpackage.ke7;
import defpackage.lk5;
import defpackage.ln2;
import defpackage.m22;
import defpackage.my6;
import defpackage.pp;
import defpackage.qd;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.r05;
import defpackage.s01;
import defpackage.s7;
import defpackage.sy;
import defpackage.ut4;
import defpackage.va;
import defpackage.wu0;
import defpackage.y08;
import defpackage.zk8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x045b A[PHI: r8
      0x045b: PHI (r8v21 qp2) = (r8v15 qp2), (r8v22 qp2) binds: [B:195:0x0459, B:191:0x0452] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x047f A[PHI: r10
      0x047f: PHI (r10v31 dp2) = (r10v27 dp2), (r10v32 dp2) binds: [B:205:0x047d, B:201:0x0476] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x049c A[PHI: r11
      0x049c: PHI (r11v16 dp2) = (r11v11 dp2), (r11v17 dp2) binds: [B:215:0x049a, B:211:0x0493] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x054e A[LOOP:2: B:236:0x054e->B:239:0x0586, LOOP_START, PHI: r0
      0x054e: PHI (r0v9 int) = (r0v8 int), (r0v14 int) binds: [B:235:0x054c, B:239:0x0586] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.ke7 r33, defpackage.lk5 r34, defpackage.hx4 r35, defpackage.qd r36, defpackage.dp2 r37, defpackage.dp2 r38, defpackage.qp2 r39, defpackage.qz0 r40, int r41) {
        /*
            Method dump skipped, instruction units count: 1462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation3.ui.a.a(ke7, lk5, hx4, qd, dp2, dp2, qp2, qz0, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ArrayList arrayList, hx4 hx4Var, qd qdVar, fv fvVar, dp2 dp2Var, dp2 dp2Var2, qp2 qp2Var, bp2 bp2Var, qz0 qz0Var, int i) {
        int i2;
        int i3;
        int i4;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(-1483975592);
        if ((i & 6) == 0) {
            i2 = (qz0Var2.h(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var2.f(hx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var2.f(qdVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qz0Var2.f(fvVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= qz0Var2.h(null) ? 16384 : 8192;
        }
        dp2 dp2Var3 = dp2Var;
        if ((196608 & i) == 0) {
            i2 |= qz0Var2.h(dp2Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= qz0Var2.h(dp2Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= qz0Var2.h(qp2Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= qz0Var2.h(bp2Var) ? 67108864 : 33554432;
        }
        int i5 = 0;
        if (qz0Var2.R(i2 & 1, (38347923 & i2) != 38347922)) {
            qz0Var2.W();
            if ((i & 1) != 0 && !qz0Var2.z()) {
                qz0Var2.U();
            }
            qz0Var2.r();
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("NavDisplay entries cannot be empty");
            }
            int i6 = (i2 & 14) | ((i2 >> 6) & 112) | ((i2 >> 18) & 896);
            qz0Var2.a0(-193177615);
            ut4 ut4Var = new ut4(10, bp2Var);
            s01 s01Var = je7.a;
            Object objM = qz0Var2.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                y08 y08Var = new y08();
                i3 = i2;
                i4 = 1;
                objM = new ie7(new a67(4, y08Var), new androidx.compose.runtime.internal.a(-1714993007, new va(9, y08Var), true));
                qz0Var2.l0(objM);
            } else {
                i3 = i2;
                i4 = 1;
            }
            ej5 ej5Var = new ej5(new i25(25), s7.X(1077673004, new va(i4, g.k(arrayList, qz0Var2)), qz0Var2));
            ej5[] ej5VarArr = new ej5[2];
            ej5VarArr[0] = (ie7) objM;
            ej5VarArr[i4] = ej5Var;
            ArrayList arrayListL = br9.L(arrayList, br9.C(ej5VarArr), qz0Var2, i6 & 14);
            ee7[] ee7VarArr = new ee7[i4];
            ee7VarArr[0] = ln2.a(fvVar, ut4Var, arrayListL);
            ArrayList arrayListE = br9.E(ee7VarArr);
            while (true) {
                Object objU0 = kotlin.collections.a.u0(arrayListE);
                bo1 bo1Var = objU0 instanceof bo1 ? (bo1) objU0 : null;
                List list = bo1Var != null ? bo1Var.d : null;
                if (list != null) {
                    if (list.isEmpty()) {
                        throw new IllegalArgumentException(("Overlaid entries from " + bo1Var + " must not be empty").toString());
                    }
                    arrayListE.add(ln2.a(fvVar, ut4Var, list));
                }
                if (list == null) {
                    List listK0 = kotlin.collections.a.k0(arrayListE);
                    ArrayList arrayList2 = new ArrayList(listK0.size());
                    int size = listK0.size();
                    int i7 = 0;
                    while (i7 < size) {
                        ee7 ee7Var = (ee7) listK0.get(i7);
                        js3.n(ee7Var, "null cannot be cast to non-null type androidx.navigation3.scene.OverlayScene<T of androidx.navigation3.scene.SceneStateKt.rememberSceneState>");
                        arrayList2.add((bo1) ee7Var);
                        i7++;
                        arrayListE = arrayListE;
                    }
                    ArrayList arrayList3 = arrayListE;
                    ee7 ee7Var2 = (ee7) kotlin.collections.a.u0(arrayList3);
                    ArrayList arrayListE2 = br9.E(kotlin.collections.a.o0(arrayList3));
                    while (true) {
                        ee7 ee7Var3 = (ee7) kotlin.collections.a.p0(arrayListE2);
                        List listA = ee7Var3 != null ? ee7Var3.a() : null;
                        if (listA != null && !listA.isEmpty()) {
                            arrayListE2.add(i5, ln2.a(fvVar, ut4Var, listA));
                        }
                        if (listA == null || listA.isEmpty()) {
                            break;
                        } else {
                            i5 = 0;
                        }
                    }
                    arrayListE2.remove(ee7Var2);
                    ke7 ke7Var = new ke7(arrayListL, arrayList2, ee7Var2, arrayListE2);
                    qz0Var2.q(false);
                    fe7 fe7Var = new fe7(ee7Var2);
                    ArrayList arrayList4 = new ArrayList(wu0.V(arrayListE2, 10));
                    Iterator it = arrayListE2.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new fe7((ee7) it.next()));
                    }
                    EmptyList emptyList = EmptyList.a;
                    Object objM2 = qz0Var2.M();
                    if (objM2 == avVar) {
                        objM2 = new lk5(fe7Var, arrayList4, emptyList);
                        qz0Var2.l0(objM2);
                    }
                    lk5 lk5Var = (lk5) objM2;
                    boolean zH = qz0Var2.h(fe7Var) | qz0Var2.h(arrayList4) | qz0Var2.h(emptyList);
                    Object objM3 = qz0Var2.M();
                    if (zH || objM3 == avVar) {
                        objM3 = new pp(lk5Var, fe7Var, arrayList4, emptyList, 9);
                        qz0Var2.l0(objM3);
                    }
                    zk8.k((bp2) objM3, qz0Var2);
                    boolean z = !ee7Var2.a().isEmpty();
                    boolean zH2 = qz0Var2.h(arrayList) | qz0Var2.f(ee7Var2) | ((i3 & 234881024) == 67108864);
                    Object objM4 = qz0Var2.M();
                    if (zH2 || objM4 == avVar) {
                        objM4 = new f8(arrayList, ee7Var2, bp2Var, 13);
                        qz0Var2.l0(objM4);
                    }
                    bt2.c(lk5Var, z, null, (bp2) objM4, qz0Var2, 0);
                    a(ke7Var, lk5Var, hx4Var, qdVar, dp2Var3, dp2Var2, qp2Var, qz0Var, ((i3 << 3) & 8064) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128));
                } else {
                    dp2Var3 = dp2Var;
                    qz0Var2 = qz0Var;
                }
            }
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new sy(arrayList, hx4Var, qdVar, fvVar, dp2Var, dp2Var2, qp2Var, bp2Var, i);
        }
    }

    public static final void c(final List list, final hx4 hx4Var, qd qdVar, final bp2 bp2Var, final List list2, final fv fvVar, dp2 dp2Var, dp2 dp2Var2, qp2 qp2Var, final m22 m22Var, qz0 qz0Var, final int i) throws Exception {
        final qd qdVar2;
        final dp2 dp2Var3;
        final dp2 dp2Var4;
        final qp2 qp2Var2;
        int i2;
        dp2 i25Var;
        dp2 i25Var2;
        qp2 r05Var;
        qd qdVar3;
        ArrayList arrayList;
        qz0Var.c0(807086421);
        int i3 = i | (qz0Var.h(list) ? 4 : 2) | (qz0Var.f(hx4Var) ? 32 : 16) | 384 | (qz0Var.h(bp2Var) ? 2048 : 1024) | (qz0Var.h(list2) ? 16384 : 8192) | (qz0Var.f(fvVar) ? 131072 : 65536) | 307757056;
        int i4 = qz0Var.h(m22Var) ? 4 : 2;
        if (qz0Var.R(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            qz0Var.W();
            if ((i & 1) == 0 || qz0Var.z()) {
                cb0 cb0Var = eq.c;
                i2 = i3 & (-2143289345);
                i25Var = new i25(23);
                i25Var2 = new i25(24);
                r05Var = new r05(3, (byte) 0);
                qdVar3 = cb0Var;
            } else {
                qz0Var.U();
                i2 = i3 & (-2143289345);
                qdVar3 = qdVar;
                i25Var = dp2Var;
                i25Var2 = dp2Var2;
                r05Var = qp2Var;
            }
            qz0Var.r();
            if (list.isEmpty()) {
                throw new IllegalArgumentException("NavDisplay backstack cannot be empty");
            }
            int i5 = ((i4 << 6) & 896) | (i2 & 14) | ((i2 >> 9) & 112);
            boolean zF = qz0Var.f(kotlin.collections.a.P0(list));
            Object objM = qz0Var.M();
            if (zF || objM == jz0.a) {
                if (list instanceof RandomAccess) {
                    arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        arrayList.add((dj5) m22Var.invoke(list.get(i6)));
                    }
                } else {
                    arrayList = new ArrayList(wu0.V(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((dj5) m22Var.invoke(it.next()));
                    }
                }
                objM = arrayList;
                qz0Var.l0(objM);
            }
            b(br9.L((List) objM, list2, qz0Var, i5 & 112), hx4Var, qdVar3, fvVar, i25Var, i25Var2, r05Var, bp2Var, qz0Var, (i2 & 1008) | ((i2 >> 6) & 7168) | 24576 | ((i2 << 15) & 234881024));
            qdVar2 = qdVar3;
            dp2Var3 = i25Var;
            dp2Var4 = i25Var2;
            qp2Var2 = r05Var;
        } else {
            qz0Var.U();
            qdVar2 = qdVar;
            dp2Var3 = dp2Var;
            dp2Var4 = dp2Var2;
            qp2Var2 = qp2Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(list, hx4Var, qdVar2, bp2Var, list2, fvVar, dp2Var3, dp2Var4, qp2Var2, m22Var, i) { // from class: bj5
                public final /* synthetic */ List a;
                public final /* synthetic */ hx4 b;
                public final /* synthetic */ qd c;
                public final /* synthetic */ bp2 d;
                public final /* synthetic */ List e;
                public final /* synthetic */ fv f;
                public final /* synthetic */ dp2 g;
                public final /* synthetic */ dp2 h;
                public final /* synthetic */ qp2 i;
                public final /* synthetic */ m22 j;

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) throws Exception {
                    ((Integer) obj2).getClass();
                    int iW = hs9.W(1);
                    a.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }
}
