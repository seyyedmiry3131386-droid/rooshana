package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public interface ph0 extends t18, ReadableByteChannel {
    int A(tv5 tv5Var);

    String Y(long j);

    long e0(oh0 oh0Var);

    void g1(long j);

    gh0 h();

    InputStream n1();

    tv6 peek();

    byte readByte();

    int readInt();

    short readShort();

    boolean request(long j);

    void skip(long j);

    String u0(Charset charset);

    ByteString v(long j);
}
