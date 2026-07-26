package com.google.protobuf;

import defpackage.av;
import defpackage.bl4;
import defpackage.dw1;
import defpackage.gv;
import defpackage.ln2;
import defpackage.lu0;
import defpackage.o40;
import defpackage.oe;
import defpackage.qj0;
import defpackage.rm7;
import defpackage.sj0;
import defpackage.tj0;
import defpackage.tr3;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString b = new LiteralByteString(tr3.b);
    public static final tj0 c;
    private static final long serialVersionUID = 1;
    public int a = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        public final int e;
        public final int f;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.f(i, i + i2, bArr.length);
            this.e = i;
            this.f = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final byte c(int i) {
            ByteString.e(i, this.f);
            return this.d[this.e + i];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final void j(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.d, this.e + i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString.LeafByteString, com.google.protobuf.ByteString
        public final byte m(int i) {
            return this.d[this.e + i];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final int size() {
            return this.f;
        }

        public Object writeReplace() {
            return new LiteralByteString(t());
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        public final int z() {
            return this.e;
        }
    }

    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new qj0(this);
        }

        @Override // com.google.protobuf.ByteString
        public final int l() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public byte m(int i) {
            return c(i);
        }

        public abstract boolean y(ByteString byteString, int i, int i2);
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        public final byte[] d;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.d = bArr;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteBuffer a() {
            return ByteBuffer.wrap(this.d, z(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public byte c(int i) {
            return this.d[i];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i = this.a;
            int i2 = literalByteString.a;
            if (i == 0 || i2 == 0 || i == i2) {
                return y(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString
        public void j(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.d, i, bArr, i2, i3);
        }

        @Override // com.google.protobuf.ByteString.LeafByteString, com.google.protobuf.ByteString
        public byte m(int i) {
            return this.d[i];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean n() {
            int iZ = z();
            return z.a.p(this.d, iZ, size() + iZ);
        }

        @Override // com.google.protobuf.ByteString
        public final lu0 p() {
            return lu0.j(this.d, z(), size(), true);
        }

        @Override // com.google.protobuf.ByteString
        public final int q(int i, int i2, int i3) {
            int iZ = z() + i2;
            Charset charset = tr3.a;
            for (int i4 = iZ; i4 < iZ + i3; i4++) {
                i = (i * 31) + this.d[i4];
            }
            return i;
        }

        @Override // com.google.protobuf.ByteString
        public final int r(int i, int i2, int i3) {
            int iZ = z() + i2;
            return z.a.v(this.d, i, iZ, i3 + iZ);
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString s(int i, int i2) {
            int iF = ByteString.f(i, i2, size());
            if (iF == 0) {
                return ByteString.b;
            }
            return new BoundedByteString(this.d, z() + i, iF);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.d.length;
        }

        @Override // com.google.protobuf.ByteString
        public final String v(Charset charset) {
            return new String(this.d, z(), size(), charset);
        }

        @Override // com.google.protobuf.ByteString
        public final void x(j jVar) {
            jVar.Y(this.d, z(), size());
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        public final boolean y(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                StringBuilder sbB = bl4.B(i, i2, "Ran off end of other: ", ", ", ", ");
                sbB.append(byteString.size());
                throw new IllegalArgumentException(sbB.toString());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.s(i, i3).equals(s(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = literalByteString.d;
            int iZ = z() + i2;
            int iZ2 = z();
            int iZ3 = literalByteString.z() + i;
            while (iZ2 < iZ) {
                if (this.d[iZ2] != bArr[iZ3]) {
                    return false;
                }
                iZ2++;
                iZ3++;
            }
            return true;
        }

        public int z() {
            return 0;
        }
    }

    static {
        c = oe.a() ? new gv(5) : new av(5);
    }

    public static void e(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(dw1.j(i, i2, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(rm7.n(i, "Index < 0: "));
        }
    }

    public static int f(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(bl4.q(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(dw1.j(i2, i3, "End index: ", " >= "));
    }

    public static ByteString h(byte[] bArr, int i, int i2) {
        f(i, i + i2, bArr.length);
        return new LiteralByteString(c.b(bArr, i, i2));
    }

    public static ByteString i(String str) {
        return new LiteralByteString(str.getBytes(tr3.a));
    }

    public abstract ByteBuffer a();

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iQ = this.a;
        if (iQ == 0) {
            int size = size();
            iQ = q(size, 0, size);
            if (iQ == 0) {
                iQ = 1;
            }
            this.a = iQ;
        }
        return iQ;
    }

    public abstract void j(byte[] bArr, int i, int i2, int i3);

    public abstract int l();

    public abstract byte m(int i);

    public abstract boolean n();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public sj0 iterator() {
        return new qj0(this);
    }

    public abstract lu0 p();

    public abstract int q(int i, int i2, int i3);

    public abstract int r(int i, int i2, int i3);

    public abstract ByteString s(int i, int i2);

    public abstract int size();

    public final byte[] t() {
        int size = size();
        if (size == 0) {
            return tr3.b;
        }
        byte[] bArr = new byte[size];
        j(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString() {
        String strC;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strC = ln2.c(this);
        } else {
            strC = ln2.c(s(0, 47)) + "...";
        }
        return dw1.s(o40.B(size, "<ByteString@", hexString, " size=", " contents=\""), strC, "\">");
    }

    public abstract String v(Charset charset);

    public final String w() {
        return size() == 0 ? "" : v(tr3.a);
    }

    public abstract void x(j jVar);
}
