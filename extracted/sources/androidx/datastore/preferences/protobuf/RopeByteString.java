package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import defpackage.sj0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class RopeByteString extends ByteString {
    private static final long serialVersionUID = 1;
    public final int d;
    public final ByteString e;
    public final ByteString f;
    public final int g;
    public final int h;

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.e = byteString;
        this.f = byteString2;
        int size = byteString.size();
        this.g = size;
        this.d = byteString2.size() + size;
        this.h = Math.max(byteString.j(), byteString2.j()) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final ByteBuffer a() {
        return ByteBuffer.wrap(p()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final byte c(int i) {
        ByteString.e(i, this.d);
        return l(i);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i = this.d;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                int i2 = this.a;
                int i3 = byteString.a;
                if (i2 == 0 || i3 == 0 || i2 == i3) {
                    k kVar = new k(this);
                    ByteString.LeafByteString leafByteStringA = kVar.next();
                    k kVar2 = new k(byteString);
                    ByteString.LeafByteString leafByteStringA2 = kVar2.next();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int size2 = leafByteStringA.size() - i4;
                        int size3 = leafByteStringA2.size() - i5;
                        int iMin = Math.min(size2, size3);
                        if (!(i4 == 0 ? leafByteStringA.r(leafByteStringA2, i5, iMin) : leafByteStringA2.r(leafByteStringA, i4, iMin))) {
                            break;
                        }
                        i6 += iMin;
                        if (i6 >= i) {
                            if (i6 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            i4 = 0;
                            leafByteStringA = kVar.next();
                        } else {
                            i4 += iMin;
                            leafByteStringA = leafByteStringA;
                        }
                        if (iMin == size3) {
                            leafByteStringA2 = kVar2.next();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void i(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.e;
        int i5 = this.g;
        if (i4 <= i5) {
            byteString.i(bArr, i, i2, i3);
            return;
        }
        ByteString byteString2 = this.f;
        if (i >= i5) {
            byteString2.i(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.i(bArr, i, i2, i6);
        byteString2.i(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new j(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int j() {
        return this.h;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final byte l(int i) {
        int i2 = this.g;
        return i < i2 ? this.e.l(i) : this.f.l(i - i2);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    /* JADX INFO: renamed from: m */
    public final sj0 iterator() {
        return new j(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int n(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.e;
        int i5 = this.g;
        if (i4 <= i5) {
            return byteString.n(i, i2, i3);
        }
        ByteString byteString2 = this.f;
        if (i2 >= i5) {
            return byteString2.n(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.n(byteString.n(i, i2, i6), 0, i3 - i6);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final ByteString o(int i, int i2) {
        int i3 = this.d;
        int iF = ByteString.f(i, i2, i3);
        if (iF == 0) {
            return ByteString.b;
        }
        if (iF == i3) {
            return this;
        }
        ByteString byteString = this.e;
        int i4 = this.g;
        if (i2 <= i4) {
            return byteString.o(i, i2);
        }
        ByteString byteString2 = this.f;
        return i >= i4 ? byteString2.o(i - i4, i2 - i4) : new RopeByteString(byteString.o(i, byteString.size()), byteString2.o(0, i2 - i4));
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void q(e eVar) {
        this.e.q(eVar);
        this.f.q(eVar);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int size() {
        return this.d;
    }

    public Object writeReplace() {
        return new ByteString.LiteralByteString(p());
    }
}
