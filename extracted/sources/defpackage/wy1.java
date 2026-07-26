package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wy1 {
    public static final byte[] f = {127, 69, 76, 70};
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public static wy1 a(String str) {
        wy1 wy1Var = new wy1();
        wy1Var.a = false;
        wy1Var.b = false;
        wy1Var.c = false;
        wy1Var.d = false;
        wy1Var.e = false;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() > 4) {
                byte[] bArr = new byte[4];
                randomAccessFile.seek(0L);
                randomAccessFile.read(bArr);
                if (Arrays.equals(bArr, f)) {
                    wy1Var.a = true;
                }
            }
            if (wy1Var.a) {
                randomAccessFile.seek(4L);
                byte b = randomAccessFile.readByte();
                byte b2 = randomAccessFile.readByte();
                wy1Var.b = b == 2;
                wy1Var.c = b2 == 2;
                randomAccessFile.seek(0L);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(wy1Var.b ? 64 : 52);
                randomAccessFile.getChannel().read(byteBufferAllocate, 0L);
                byteBufferAllocate.order(wy1Var.c ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                if (byteBufferAllocate.get(18) == 40) {
                    wy1Var.d = (byteBufferAllocate.getInt(wy1Var.b ? 48 : 36) & 1024) == 1024;
                    wy1Var.b(byteBufferAllocate, randomAccessFile);
                }
            }
            try {
                randomAccessFile.close();
                return wy1Var;
            } catch (IOException unused) {
                return wy1Var;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        }
    }

    public static String c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        while (byteBuffer.get() != 0 && byteBuffer.position() <= byteBuffer.limit()) {
        }
        byte[] bArr = new byte[(byteBuffer.position() - iPosition) - 1];
        byteBuffer.position(iPosition);
        byteBuffer.get(bArr);
        byteBuffer.position(byteBuffer.position() + 1);
        try {
            return new String(bArr, "ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static BigInteger d(ByteBuffer byteBuffer) {
        BigInteger bigIntegerOr = BigInteger.ZERO;
        int i = 0;
        while (true) {
            byte b = byteBuffer.get();
            bigIntegerOr = bigIntegerOr.or(BigInteger.valueOf(b & 127).shiftLeft(i));
            if ((b & 128) == 0) {
                return bigIntegerOr;
            }
            i += 7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.HashMap] */
    public final void b(ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) throws IOException {
        ?? map;
        for (vy1 vy1Var : (ArrayList) new qm5(this.b, this.c, byteBuffer, randomAccessFile).b) {
            if (".ARM.attributes".equals(vy1Var.b)) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(vy1Var.f);
                byteBufferAllocate.order(this.c ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                randomAccessFile.getChannel().read(byteBufferAllocate, vy1Var.e);
                byteBufferAllocate.rewind();
                if (byteBufferAllocate.get() != 65) {
                    map = Collections.EMPTY_MAP;
                } else {
                    while (byteBufferAllocate.position() < byteBufferAllocate.limit()) {
                        int iPosition = byteBufferAllocate.position();
                        int i = byteBufferAllocate.getInt();
                        if (i <= 0) {
                            break;
                        }
                        if ("aeabi".equals(c(byteBufferAllocate))) {
                            map = new HashMap();
                            while (byteBufferAllocate.position() < byteBufferAllocate.limit()) {
                                int iPosition2 = byteBufferAllocate.position();
                                int iIntValue = d(byteBufferAllocate).intValue();
                                int i2 = byteBufferAllocate.getInt();
                                if (iIntValue == 1) {
                                    Integer numValueOf = Integer.valueOf(iIntValue);
                                    HashMap map2 = new HashMap();
                                    while (byteBufferAllocate.position() < byteBufferAllocate.limit()) {
                                        uy1 uy1VarB = uy1.b(d(byteBufferAllocate).intValue());
                                        int iOrdinal = uy1VarB.c.ordinal();
                                        if (iOrdinal == 0) {
                                            map2.put(uy1VarB, Integer.valueOf(byteBufferAllocate.getInt()));
                                        } else if (iOrdinal == 1) {
                                            map2.put(uy1VarB, c(byteBufferAllocate));
                                        } else if (iOrdinal == 2) {
                                            map2.put(uy1VarB, d(byteBufferAllocate));
                                        }
                                    }
                                    map.put(numValueOf, map2);
                                }
                                byteBufferAllocate.position(iPosition2 + i2);
                            }
                        } else {
                            byteBufferAllocate.position(iPosition + i);
                        }
                    }
                    map = Collections.EMPTY_MAP;
                }
                Map map3 = (Map) map.get(1);
                if (map3 != null) {
                    Object obj = map3.get(uy1.g);
                    if ((obj instanceof Integer) && ((Integer) obj).equals(1)) {
                        this.e = true;
                    } else if ((obj instanceof BigInteger) && ((BigInteger) obj).intValue() == 1) {
                        this.e = true;
                    }
                }
            }
        }
    }
}
