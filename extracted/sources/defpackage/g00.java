package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public interface g00 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean b();

    boolean c();

    ByteBuffer d();

    void e(ByteBuffer byteBuffer);

    f00 f(f00 f00Var);

    void flush();

    void g();

    void reset();
}
