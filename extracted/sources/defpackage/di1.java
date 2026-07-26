package defpackage;

import androidx.media3.common.b;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class di1 {
    public final int a;
    public final List b;

    public di1(int i, List list) {
        this.a = i;
        this.b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.gt8 a(int r6, defpackage.jx9 r7) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di1.a(int, jx9):gt8");
    }

    public List b(jx9 jx9Var) {
        String str;
        int i;
        List listSingletonList;
        boolean zC = c(32);
        List list = this.b;
        if (zC) {
            return list;
        }
        h26 h26Var = new h26((byte[]) jx9Var.d);
        while (h26Var.a() > 0) {
            int iX = h26Var.x();
            int iX2 = h26Var.b + h26Var.x();
            if (iX == 134) {
                ArrayList arrayList = new ArrayList();
                int iX3 = h26Var.x() & 31;
                for (int i2 = 0; i2 < iX3; i2++) {
                    String strV = h26Var.v(3, StandardCharsets.UTF_8);
                    int iX4 = h26Var.x();
                    boolean z = (iX4 & 128) != 0;
                    if (z) {
                        i = iX4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bX = (byte) h26Var.x();
                    h26Var.K(1);
                    if (z) {
                        boolean z2 = (bX & 64) != 0;
                        byte[] bArr = ku0.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    rj2 rj2Var = new rj2();
                    rj2Var.m = tv4.m(str);
                    rj2Var.d = strV;
                    rj2Var.J = i;
                    rj2Var.p = listSingletonList;
                    arrayList.add(new b(rj2Var));
                }
                list = arrayList;
            }
            h26Var.J(iX2);
        }
        return list;
    }

    public boolean c(int i) {
        return (i & this.a) != 0;
    }

    public di1() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    public di1(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
