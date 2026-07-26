package defpackage;

import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public interface oh0 extends by7, WritableByteChannel {
    oh0 T0(ByteString byteString);

    @Override // defpackage.by7, java.io.Flushable
    void flush();

    gh0 h();

    oh0 i1(long j);

    oh0 j0(int i, byte[] bArr);

    oh0 n0(String str);

    oh0 write(byte[] bArr);

    oh0 writeByte(int i);

    oh0 writeInt(int i);

    oh0 writeShort(int i);
}
