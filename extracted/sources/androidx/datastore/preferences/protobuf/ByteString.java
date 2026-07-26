package androidx.datastore.preferences.protobuf;

import defpackage.av;
import defpackage.bl4;
import defpackage.cv;
import defpackage.dw1;
import defpackage.o40;
import defpackage.pe;
import defpackage.rj0;
import defpackage.rm7;
import defpackage.sb7;
import defpackage.sj0;
import defpackage.uj0;
import defpackage.ur3;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString b = new LiteralByteString(ur3.b);
    public static final uj0 c;
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

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte c(int i) {
            ByteString.e(i, this.f);
            return this.d[this.e + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final void i(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.d, this.e + i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte l(int i) {
            return this.d[this.e + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        public final int s() {
            return this.e;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.f;
        }

        public Object writeReplace() {
            return new LiteralByteString(p());
        }
    }

    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        public /* synthetic */ LeafByteString(int i) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new rj0(this);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int j() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte l(int i) {
            return c(i);
        }

        public abstract boolean r(ByteString byteString, int i, int i2);

        private LeafByteString() {
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        public final byte[] d;

        public LiteralByteString(byte[] bArr) {
            super(0);
            bArr.getClass();
            this.d = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer a() {
            return ByteBuffer.wrap(this.d, s(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte c(int i) {
            return this.d[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
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
                return r(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void i(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.d, i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte l(int i) {
            return this.d[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int n(int i, int i2, int i3) {
            int iS = s() + i2;
            Charset charset = ur3.a;
            for (int i4 = iS; i4 < iS + i3; i4++) {
                i = (i * 31) + this.d[i4];
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString o(int i, int i2) {
            int iF = ByteString.f(i, i2, size());
            if (iF == 0) {
                return ByteString.b;
            }
            return new BoundedByteString(this.d, s() + i, iF);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void q(e eVar) {
            eVar.P(this.d, s(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean r(ByteString byteString, int i, int i2) {
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
                return byteString.o(i, i3).equals(o(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = literalByteString.d;
            int iS = s() + i2;
            int iS2 = s();
            int iS3 = literalByteString.s() + i;
            while (iS2 < iS) {
                if (this.d[iS2] != bArr[iS3]) {
                    return false;
                }
                iS2++;
                iS3++;
            }
            return true;
        }

        public int s() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.d.length;
        }
    }

    public static final class NioByteString extends LeafByteString {
        public final ByteBuffer d;

        public NioByteString(ByteBuffer byteBuffer) {
            super(0);
            Charset charset = ur3.a;
            this.d = byteBuffer.slice().order(ByteOrder.nativeOrder());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        private Object writeReplace() {
            ByteBuffer byteBufferSlice = this.d.slice();
            int iRemaining = byteBufferSlice.remaining();
            ByteString.f(0, iRemaining, byteBufferSlice.remaining());
            byte[] bArr = new byte[iRemaining];
            byteBufferSlice.get(bArr);
            return new LiteralByteString(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer a() {
            return this.d.asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final byte c(int i) {
            try {
                return this.d.get(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (IndexOutOfBoundsException e2) {
                throw new ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString)) {
                return false;
            }
            ByteString byteString = (ByteString) obj;
            ByteBuffer byteBuffer = this.d;
            if (byteBuffer.remaining() != byteString.size()) {
                return false;
            }
            if (byteBuffer.remaining() == 0) {
                return true;
            }
            return obj instanceof NioByteString ? byteBuffer.equals(((NioByteString) obj).d) : obj instanceof RopeByteString ? obj.equals(this) : byteBuffer.equals(byteString.a());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void i(byte[] bArr, int i, int i2, int i3) {
            ByteBuffer byteBufferSlice = this.d.slice();
            byteBufferSlice.position(i);
            byteBufferSlice.get(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int n(int i, int i2, int i3) {
            for (int i4 = i2; i4 < i2 + i3; i4++) {
                i = (i * 31) + this.d.get(i4);
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString o(int i, int i2) {
            try {
                return new NioByteString(s(i, i2));
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (IndexOutOfBoundsException e2) {
                throw new ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void q(e eVar) {
            eVar.O(this.d.slice());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean r(ByteString byteString, int i, int i2) {
            return o(0, i2).equals(byteString.o(i, i2 + i));
        }

        public final ByteBuffer s(int i, int i2) {
            ByteBuffer byteBuffer = this.d;
            if (i < byteBuffer.position() || i2 > byteBuffer.limit() || i > i2) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.position(i - byteBuffer.position());
            byteBufferSlice.limit(i2 - byteBuffer.position());
            return byteBufferSlice;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.d.remaining();
        }
    }

    static {
        c = pe.a() ? new av(6) : new cv(5);
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

    public abstract ByteBuffer a();

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iN = this.a;
        if (iN == 0) {
            int size = size();
            iN = n(size, 0, size);
            if (iN == 0) {
                iN = 1;
            }
            this.a = iN;
        }
        return iN;
    }

    public abstract void i(byte[] bArr, int i, int i2, int i3);

    public abstract int j();

    public abstract byte l(int i);

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public sj0 iterator() {
        return new rj0(this);
    }

    public abstract int n(int i, int i2, int i3);

    public abstract ByteString o(int i, int i2);

    public final byte[] p() {
        int size = size();
        if (size == 0) {
            return ur3.b;
        }
        byte[] bArr = new byte[size];
        i(bArr, 0, 0, size);
        return bArr;
    }

    public abstract void q(e eVar);

    public abstract int size();

    public final String toString() {
        String strH;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strH = sb7.h(this);
        } else {
            strH = sb7.h(o(0, 47)) + "...";
        }
        return dw1.s(o40.B(size, "<ByteString@", hexString, " size=", " contents=\""), strH, "\">");
    }
}
