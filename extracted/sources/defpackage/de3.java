package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.collections.a;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class de3 implements Closeable {
    public static final Logger d;
    public final ph0 a;
    public final ce3 b;
    public final bd3 c;

    static {
        Logger logger = Logger.getLogger(sd3.class.getName());
        js3.o(logger, "getLogger(...)");
        d = logger;
    }

    public de3(tv6 tv6Var) {
        js3.p(tv6Var, "source");
        this.a = tv6Var;
        ce3 ce3Var = new ce3(tv6Var);
        this.b = ce3Var;
        this.c = new bd3(ce3Var);
    }

    public final void D(zd3 zd3Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte b = this.a.readByte();
            byte[] bArr = gh9.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i6 = this.a.readInt() & Integer.MAX_VALUE;
        List listK = k(rf0.C(i - 4, i2, i4), i4, i2, i3);
        js3.p(listK, "requestHeaders");
        ae3 ae3Var = (ae3) zd3Var.c;
        synchronized (ae3Var) {
            if (ae3Var.y.contains(Integer.valueOf(i6))) {
                ae3Var.I(i6, ErrorCode.d);
                return;
            }
            ae3Var.y.add(Integer.valueOf(i6));
            ff8.c(ae3Var.i, ae3Var.c + '[' + i6 + "] onRequest", new vd3(ae3Var, i6, listK, i5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x014d, code lost:
    
        throw new java.io.IOException(defpackage.rm7.n(r7, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(boolean r13, defpackage.zd3 r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de3.b(boolean, zd3):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        if (r19 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011f, code lost:
    
        r9.k(defpackage.by2.b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.zd3 r17, int r18, int r19, final int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de3.d(zd3, int, int, int):void");
    }

    public final void g(zd3 zd3Var, int i, int i2) throws IOException {
        ErrorCode errorCode;
        Object[] array;
        if (i < 8) {
            throw new IOException(rm7.n(i, "TYPE_GOAWAY length < 8: "));
        }
        if (i2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i3 = this.a.readInt();
        int i4 = this.a.readInt();
        int i5 = i - 8;
        ErrorCode.b.getClass();
        ErrorCode[] errorCodeArrValues = ErrorCode.values();
        int length = errorCodeArrValues.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                errorCode = null;
                break;
            }
            errorCode = errorCodeArrValues[i6];
            if (errorCode.a == i4) {
                break;
            } else {
                i6++;
            }
        }
        if (errorCode == null) {
            throw new IOException(rm7.n(i4, "TYPE_GOAWAY unexpected error code: "));
        }
        ByteString byteStringV = ByteString.d;
        if (i5 > 0) {
            byteStringV = this.a.v(i5);
        }
        js3.p(byteStringV, "debugData");
        byteStringV.e();
        ae3 ae3Var = (ae3) zd3Var.c;
        synchronized (ae3Var) {
            array = ae3Var.b.values().toArray(new he3[0]);
            ae3Var.f = true;
        }
        for (he3 he3Var : (he3[]) array) {
            if (he3Var.a > i3 && he3Var.h()) {
                he3Var.l(ErrorCode.g);
                ((ae3) zd3Var.c).k(he3Var.a);
            }
        }
    }

    public final List k(int i, int i2, int i3, int i4) throws IOException {
        ce3 ce3Var = this.b;
        ce3Var.e = i;
        ce3Var.b = i;
        ce3Var.f = i2;
        ce3Var.c = i3;
        ce3Var.d = i4;
        bd3 bd3Var = this.c;
        tv6 tv6Var = bd3Var.c;
        ArrayList arrayList = bd3Var.b;
        while (!tv6Var.b()) {
            byte b = tv6Var.readByte();
            byte[] bArr = gh9.a;
            int i5 = b & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == 128) {
                int iE = bd3Var.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    ox2[] ox2VarArr = dd3.a;
                    if (i6 <= ox2VarArr.length - 1) {
                        arrayList.add(ox2VarArr[i6]);
                    }
                }
                int length = bd3Var.e + 1 + (i6 - dd3.a.length);
                if (length >= 0) {
                    ox2[] ox2VarArr2 = bd3Var.d;
                    if (length < ox2VarArr2.length) {
                        ox2 ox2Var = ox2VarArr2[length];
                        js3.m(ox2Var);
                        arrayList.add(ox2Var);
                    }
                }
                throw new IOException(rm7.n(iE, "Header index too large "));
            }
            if (i5 == 64) {
                ox2[] ox2VarArr3 = dd3.a;
                ByteString byteStringD = bd3Var.d();
                dd3.a(byteStringD);
                bd3Var.c(new ox2(byteStringD, bd3Var.d()));
            } else if ((b & 64) == 64) {
                bd3Var.c(new ox2(bd3Var.b(bd3Var.e(i5, 63) - 1), bd3Var.d()));
            } else if ((b & 32) == 32) {
                int iE2 = bd3Var.e(i5, 31);
                bd3Var.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + bd3Var.a);
                }
                int i7 = bd3Var.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        ox2[] ox2VarArr4 = bd3Var.d;
                        ew.F0(0, ox2VarArr4.length, null, ox2VarArr4);
                        bd3Var.e = bd3Var.d.length - 1;
                        bd3Var.f = 0;
                        bd3Var.g = 0;
                    } else {
                        bd3Var.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                ox2[] ox2VarArr5 = dd3.a;
                ByteString byteStringD2 = bd3Var.d();
                dd3.a(byteStringD2);
                arrayList.add(new ox2(byteStringD2, bd3Var.d()));
            } else {
                arrayList.add(new ox2(bd3Var.b(bd3Var.e(i5, 15) - 1), bd3Var.d()));
            }
        }
        List listP0 = a.P0(arrayList);
        arrayList.clear();
        return listP0;
    }

    public final void u(zd3 zd3Var, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i4 = 0;
        boolean z = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.a.readByte();
            byte[] bArr = gh9.a;
            i4 = b & 255;
        }
        if ((i2 & 32) != 0) {
            ph0 ph0Var = this.a;
            ph0Var.readInt();
            ph0Var.readByte();
            byte[] bArr2 = gh9.a;
            i -= 5;
        }
        List listK = k(rf0.C(i, i2, i4), i4, i2, i3);
        js3.p(listK, "headerBlock");
        ae3 ae3Var = (ae3) zd3Var.c;
        if (i3 != 0 && (i3 & 1) == 0) {
            ff8.c(ae3Var.i, ae3Var.c + '[' + i3 + "] onHeaders", new vd3(ae3Var, i3, listK, z));
            return;
        }
        synchronized (ae3Var) {
            he3 he3VarD = ae3Var.d(i3);
            if (he3VarD != null) {
                he3VarD.k(ih9.h(listK), z);
                return;
            }
            if (ae3Var.f) {
                return;
            }
            if (i3 <= ae3Var.d) {
                return;
            }
            if (i3 % 2 == ae3Var.e % 2) {
                return;
            }
            he3 he3Var = new he3(i3, ae3Var, false, z, ih9.h(listK));
            ae3Var.d = i3;
            ae3Var.b.put(Integer.valueOf(i3), he3Var);
            ff8.c(ae3Var.g.d(), ae3Var.c + '[' + i3 + "] onStream", new d(ae3Var, he3Var, 27));
        }
    }

    public final void y(zd3 zd3Var, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException(rm7.n(i, "TYPE_PING length != 8: "));
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        final int i4 = this.a.readInt();
        final int i5 = this.a.readInt();
        if (!((i2 & 1) != 0)) {
            ff8 ff8Var = ((ae3) zd3Var.c).h;
            String strS = dw1.s(new StringBuilder(), ((ae3) zd3Var.c).c, " ping");
            final ae3 ae3Var = (ae3) zd3Var.c;
            ff8.c(ff8Var, strS, new bp2() { // from class: yd3
                @Override // defpackage.bp2
                public final Object invoke() {
                    ae3 ae3Var2 = ae3Var;
                    try {
                        ae3Var2.w.y(i4, i5, true);
                    } catch (IOException e) {
                        ErrorCode errorCode = ErrorCode.d;
                        ae3Var2.b(errorCode, errorCode, e);
                    }
                    return tx8.a;
                }
            });
            return;
        }
        ae3 ae3Var2 = (ae3) zd3Var.c;
        synchronized (ae3Var2) {
            try {
                if (i4 == 1) {
                    ae3Var2.l++;
                } else if (i4 == 2) {
                    ae3Var2.n++;
                } else if (i4 == 3) {
                    ae3Var2.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
