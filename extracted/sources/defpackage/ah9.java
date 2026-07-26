package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ah9 implements qp2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ tv6 c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Ref$ObjectRef e;

    public /* synthetic */ ah9(tv6 tv6Var, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.c = tv6Var;
        this.b = ref$ObjectRef;
        this.d = ref$ObjectRef2;
        this.e = ref$ObjectRef3;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.a;
        int iIntValue = ((Integer) obj).intValue();
        Long l = (Long) obj2;
        switch (i) {
            case 0:
                long jLongValue = l.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    tv6 tv6Var = this.c;
                    byte b = tv6Var.readByte();
                    boolean z = (b & 1) == 1;
                    boolean z2 = (b & 2) == 2;
                    boolean z3 = (b & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        this.b.a = Integer.valueOf(tv6Var.k());
                    }
                    if (z2) {
                        this.d.a = Integer.valueOf(tv6Var.k());
                    }
                    if (z3) {
                        this.e.a = Integer.valueOf(tv6Var.k());
                    }
                }
                return tx8.a;
            default:
                long jLongValue2 = l.longValue();
                if (iIntValue == 1) {
                    Ref$ObjectRef ref$ObjectRef = this.b;
                    if (ref$ObjectRef.a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    tv6 tv6Var2 = this.c;
                    ref$ObjectRef.a = Long.valueOf(tv6Var2.u());
                    this.d.a = Long.valueOf(tv6Var2.u());
                    this.e.a = Long.valueOf(tv6Var2.u());
                }
                return tx8.a;
        }
    }

    public /* synthetic */ ah9(Ref$ObjectRef ref$ObjectRef, tv6 tv6Var, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.b = ref$ObjectRef;
        this.c = tv6Var;
        this.d = ref$ObjectRef2;
        this.e = ref$ObjectRef3;
    }
}
