package defpackage;

import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h38 extends lb7 {
    public final h26 c = new h26();
    public final ao0 d = new ao0();
    public hm8 e;

    @Override // defpackage.lb7
    public final jv4 c(mv4 mv4Var, ByteBuffer byteBuffer) {
        iv4 i38Var;
        long j;
        hm8 hm8Var = this.e;
        if (hm8Var == null || mv4Var.j != hm8Var.e()) {
            hm8 hm8Var2 = new hm8(mv4Var.g);
            this.e = hm8Var2;
            hm8Var2.a(mv4Var.g - mv4Var.j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        h26 h26Var = this.c;
        h26Var.H(iLimit, bArrArray);
        ao0 ao0Var = this.d;
        ao0Var.o(iLimit, bArrArray);
        ao0Var.t(39);
        long jI = (((long) ao0Var.i(1)) << 32) | ((long) ao0Var.i(32));
        ao0Var.t(20);
        int i = ao0Var.i(12);
        int i2 = ao0Var.i(8);
        h26Var.K(14);
        if (i2 == 0) {
            i38Var = new i38();
        } else if (i2 == 255) {
            long jZ = h26Var.z();
            int i3 = i - 4;
            h26Var.h(new byte[i3], 0, i3);
            i38Var = new jk6(jZ, 0, jI);
        } else if (i2 == 4) {
            int iX = h26Var.x();
            ArrayList arrayList = new ArrayList(iX);
            for (int i4 = 0; i4 < iX; i4++) {
                h26Var.z();
                boolean z = (h26Var.x() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int iX2 = h26Var.x();
                    boolean z2 = (iX2 & 64) != 0;
                    boolean z3 = (iX2 & 32) != 0;
                    if (z2) {
                        h26Var.z();
                    }
                    if (!z2) {
                        int iX3 = h26Var.x();
                        ArrayList arrayList3 = new ArrayList(iX3);
                        for (int i5 = 0; i5 < iX3; i5++) {
                            h26Var.x();
                            h26Var.z();
                            arrayList3.add(new sl3(23));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        h26Var.x();
                        h26Var.z();
                    }
                    h26Var.D();
                    h26Var.x();
                    h26Var.x();
                }
                ol3 ol3Var = new ol3(24);
                DesugarCollections.unmodifiableList(arrayList2);
                arrayList.add(ol3Var);
            }
            i38 i38Var2 = new i38();
            DesugarCollections.unmodifiableList(arrayList);
            i38Var = i38Var2;
        } else if (i2 == 5) {
            hm8 hm8Var3 = this.e;
            h26Var.z();
            boolean z4 = (h26Var.x() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iX4 = h26Var.x();
                boolean z5 = (iX4 & 64) != 0;
                boolean z6 = (iX4 & 32) != 0;
                boolean z7 = (iX4 & 16) != 0;
                long jD = (!z5 || z7) ? -9223372036854775807L : jk6.d(jI, h26Var);
                if (!z5) {
                    int iX5 = h26Var.x();
                    ArrayList arrayList4 = new ArrayList(iX5);
                    for (int i6 = 0; i6 < iX5; i6++) {
                        h26Var.x();
                        hm8Var3.b(!z7 ? jk6.d(jI, h26Var) : -9223372036854775807L);
                        arrayList4.add(new rl3());
                    }
                    list = arrayList4;
                }
                if (z6) {
                    h26Var.x();
                    h26Var.z();
                }
                h26Var.D();
                h26Var.x();
                h26Var.x();
                j = jD;
            }
            i38Var = new jk6(list, j, hm8Var3.b(j));
        } else if (i2 != 6) {
            i38Var = null;
        } else {
            hm8 hm8Var4 = this.e;
            long jD2 = jk6.d(jI, h26Var);
            i38Var = new jk6(jD2, 2, hm8Var4.b(jD2));
        }
        return i38Var == null ? new jv4(new iv4[0]) : new jv4(i38Var);
    }
}
