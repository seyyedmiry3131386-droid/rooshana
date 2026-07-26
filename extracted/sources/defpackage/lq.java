package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lq extends lb7 {
    public final /* synthetic */ int c;

    public /* synthetic */ lq(int i) {
        this.c = i;
    }

    public static h42 o(h26 h26Var) {
        String strS = h26Var.s();
        strS.getClass();
        String strS2 = h26Var.s();
        strS2.getClass();
        return new h42(strS, strS2, h26Var.r(), h26Var.r(), Arrays.copyOfRange(h26Var.a, h26Var.b, h26Var.c));
    }

    @Override // defpackage.lb7
    public final jv4 c(mv4 mv4Var, ByteBuffer byteBuffer) {
        switch (this.c) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                ao0 ao0Var = new ao0(byteBuffer.array(), byteBuffer.limit());
                int i = 12;
                ao0Var.t(12);
                int iF = (ao0Var.f() + ao0Var.i(12)) - 4;
                ao0Var.t(44);
                ao0Var.u(ao0Var.i(12));
                ao0Var.t(16);
                ArrayList arrayList = new ArrayList();
                while (ao0Var.f() < iF) {
                    ao0Var.t(48);
                    int i2 = ao0Var.i(8);
                    ao0Var.t(4);
                    int iF2 = ao0Var.f() + ao0Var.i(i);
                    String str = null;
                    String str2 = null;
                    while (ao0Var.f() < iF2) {
                        int i3 = ao0Var.i(8);
                        int i4 = ao0Var.i(8);
                        int iF3 = ao0Var.f() + i4;
                        if (i3 == 2) {
                            int i5 = ao0Var.i(16);
                            ao0Var.t(8);
                            if (i5 == 3) {
                                while (ao0Var.f() < iF3) {
                                    int i6 = ao0Var.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i6];
                                    ao0Var.l(i6, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i7 = ao0Var.i(8);
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        ao0Var.u(ao0Var.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i3 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i4];
                            ao0Var.l(i4, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        ao0Var.q(iF3 * 8);
                    }
                    ao0Var.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new kq(i2, str.concat(str2)));
                    }
                    i = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new jv4(arrayList);
            default:
                return new jv4(o(new h26(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
