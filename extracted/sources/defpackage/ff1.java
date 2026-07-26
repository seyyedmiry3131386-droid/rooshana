package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class ff1 implements ei3 {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final byte[] b = "MPF".getBytes(Charset.forName("UTF-8"));
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int g(ef1 ef1Var, dr3 dr3Var) {
        try {
            int iF = ef1Var.f();
            if ((iF & 65496) != 65496 && iF != 19789 && iF != 18761) {
                return -1;
            }
            int iK = k(ef1Var, 225);
            if (iK != -1) {
                byte[] bArr = (byte[]) dr3Var.d(iK, byte[].class);
                try {
                    return l(ef1Var, bArr, iK);
                } finally {
                    dr3Var.i(bArr);
                }
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType h(ef1 ef1Var) {
        try {
            int iF = ef1Var.f();
            if (iF == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iO = (iF << 8) | ef1Var.o();
            if (iO == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iO2 = (iO << 8) | ef1Var.o();
            if (iO2 == -1991225785) {
                ef1Var.skip(21L);
                try {
                    return ef1Var.o() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iO2 == 1380533830) {
                ef1Var.skip(4L);
                if (((ef1Var.f() << 16) | ef1Var.f()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iF2 = (ef1Var.f() << 16) | ef1Var.f();
                if ((iF2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iF2 & 255;
                if (i == 88) {
                    ef1Var.skip(4L);
                    short sO = ef1Var.o();
                    return (sO & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sO & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                ef1Var.skip(4L);
                return (ef1Var.o() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((ef1Var.f() << 16) | ef1Var.f()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iF3 = (ef1Var.f() << 16) | ef1Var.f();
            if (iF3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iF3 == 1635150182;
            ef1Var.skip(4L);
            int i3 = iO2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iF4 = (ef1Var.f() << 16) | ef1Var.f();
                    if (iF4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iF4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static boolean i(ef1 ef1Var, dr3 dr3Var) {
        if (h(ef1Var) == ImageHeaderParser$ImageType.JPEG) {
            int iK = k(ef1Var, 226);
            while (iK > 0) {
                byte[] bArr = (byte[]) dr3Var.d(iK, byte[].class);
                try {
                    if (ef1Var.r(iK, bArr) != iK ? false : j(bArr, iK, b)) {
                        dr3Var.i(bArr);
                        return true;
                    }
                    dr3Var.i(bArr);
                    iK = k(ef1Var, 226);
                } catch (Throwable th) {
                    dr3Var.i(bArr);
                    throw th;
                }
            }
        }
        return false;
    }

    public static boolean j(byte[] bArr, int i, byte[] bArr2) {
        boolean z = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    public static int k(ef1 ef1Var, int i) {
        short sO;
        while (ef1Var.o() == 255 && (sO = ef1Var.o()) != 218 && sO != 217) {
            int iF = ef1Var.f() - 2;
            if (sO == i) {
                return iF;
            }
            long j = iF;
            if (ef1Var.skip(j) != j) {
                return -1;
            }
        }
        return -1;
    }

    public static int l(ef1 ef1Var, byte[] bArr, int i) {
        int i2;
        int i3;
        if (ef1Var.r(i, bArr) == i && j(bArr, i, a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            byteBuffer.order(s != 18761 ? s != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i5 = i4 + 6;
            short s2 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
            for (int i6 = 0; i6 < s2; i6++) {
                int i7 = (i6 * 12) + i4 + 8;
                if ((byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : (short) -1) == 274) {
                    int i8 = i7 + 2;
                    short s3 = byteBuffer.remaining() - i8 >= 2 ? byteBuffer.getShort(i8) : (short) -1;
                    if (s3 >= 1 && s3 <= 12) {
                        int i9 = i7 + 4;
                        int i10 = byteBuffer.remaining() - i9 >= 4 ? byteBuffer.getInt(i9) : -1;
                        if (i10 >= 0 && (i2 = i10 + c[s3]) <= 4 && (i3 = i7 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                            if (byteBuffer.remaining() - i3 >= 2) {
                                return byteBuffer.getShort(i3);
                            }
                            return -1;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.ei3
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        ok4.p(byteBuffer, "Argument must not be null");
        return h(new ql4(byteBuffer));
    }

    @Override // defpackage.ei3
    public final int b(InputStream inputStream, dr3 dr3Var) {
        nm5 nm5Var = new nm5(15, inputStream);
        ok4.p(dr3Var, "Argument must not be null");
        return g(nm5Var, dr3Var);
    }

    @Override // defpackage.ei3
    public final boolean c(InputStream inputStream, dr3 dr3Var) {
        ok4.p(inputStream, "Argument must not be null");
        nm5 nm5Var = new nm5(15, inputStream);
        ok4.p(dr3Var, "Argument must not be null");
        return i(nm5Var, dr3Var);
    }

    @Override // defpackage.ei3
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return h(new nm5(15, inputStream));
    }

    @Override // defpackage.ei3
    public final boolean e(ByteBuffer byteBuffer, dr3 dr3Var) {
        ql4 ql4Var = new ql4(byteBuffer);
        ok4.p(dr3Var, "Argument must not be null");
        return i(ql4Var, dr3Var);
    }

    @Override // defpackage.ei3
    public final int f(ByteBuffer byteBuffer, dr3 dr3Var) {
        ql4 ql4Var = new ql4(byteBuffer);
        ok4.p(dr3Var, "Argument must not be null");
        return g(ql4Var, dr3Var);
    }
}
