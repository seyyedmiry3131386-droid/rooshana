package com.google.protobuf;

import com.google.protobuf.ByteString;
import defpackage.lu0;
import defpackage.o37;
import defpackage.tr3;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
final class NioByteString extends ByteString.LeafByteString {
    public final ByteBuffer d;

    public NioByteString(ByteBuffer byteBuffer) {
        Charset charset = tr3.a;
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
        return new ByteString.LiteralByteString(bArr);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer a() {
        return this.d.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final byte c(int i) {
        try {
            return this.d.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
    public final void j(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.d.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean n() {
        o37 o37Var = z.a;
        ByteBuffer byteBuffer = this.d;
        return o37Var.u(0, byteBuffer.position(), byteBuffer.remaining(), byteBuffer) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public final lu0 p() {
        return lu0.i(this.d, true);
    }

    @Override // com.google.protobuf.ByteString
    public final int q(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.d.get(i4);
        }
        return i;
    }

    @Override // com.google.protobuf.ByteString
    public final int r(int i, int i2, int i3) {
        return z.a.u(i, i2, i3 + i2, this.d);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString s(int i, int i2) {
        try {
            return new NioByteString(z(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.d.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public final String v(Charset charset) {
        byte[] bArrT;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer.hasArray()) {
            bArrT = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            bArrT = t();
            length = bArrT.length;
            iPosition = 0;
        }
        return new String(bArrT, iPosition, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void x(j jVar) {
        jVar.X(this.d.slice());
    }

    @Override // com.google.protobuf.ByteString.LeafByteString
    public final boolean y(ByteString byteString, int i, int i2) {
        return s(0, i2).equals(byteString.s(i, i2 + i));
    }

    public final ByteBuffer z(int i, int i2) {
        ByteBuffer byteBuffer = this.d;
        if (i < byteBuffer.position() || i2 > byteBuffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i - byteBuffer.position());
        byteBufferSlice.limit(i2 - byteBuffer.position());
        return byteBufferSlice;
    }
}
