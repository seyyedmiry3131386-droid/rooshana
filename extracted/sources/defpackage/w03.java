package defpackage;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w03 extends oc7 {
    public final Map H;
    public DrmInitData I;

    public w03(qc1 qc1Var, vw1 vw1Var, sw1 sw1Var, Map map) {
        super(qc1Var, vw1Var, sw1Var);
        this.H = map;
    }

    @Override // defpackage.oc7
    public final b m(b bVar) {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = this.I;
        if (drmInitData2 == null) {
            drmInitData2 = bVar.r;
        }
        if (drmInitData2 != null && (drmInitData = (DrmInitData) this.H.get(drmInitData2.c)) != null) {
            drmInitData2 = drmInitData;
        }
        jv4 jv4Var = bVar.l;
        jv4 jv4Var2 = null;
        if (jv4Var == null) {
            jv4Var = jv4Var2;
        } else {
            iv4[] iv4VarArr = jv4Var.a;
            int length = iv4VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                iv4 iv4Var = iv4VarArr[i2];
                if ((iv4Var instanceof ik6) && "com.apple.streaming.transportStreamTimestamp".equals(((ik6) iv4Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    iv4[] iv4VarArr2 = new iv4[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            iv4VarArr2[i < i2 ? i : i - 1] = iv4VarArr[i];
                        }
                        i++;
                    }
                    jv4Var2 = new jv4(iv4VarArr2);
                }
                jv4Var = jv4Var2;
            }
        }
        if (drmInitData2 != bVar.r || jv4Var != bVar.l) {
            rj2 rj2VarA = bVar.a();
            rj2VarA.q = drmInitData2;
            rj2VarA.k = jv4Var;
            bVar = new b(rj2VarA);
        }
        return super.m(bVar);
    }
}
