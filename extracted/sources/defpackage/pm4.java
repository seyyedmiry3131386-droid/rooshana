package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface pm4 {
    void a();

    void b(Bundle bundle);

    void c(int i, d81 d81Var, long j, int i2);

    void d(int i, int i2, int i3, long j);

    void e(int i);

    MediaFormat f();

    void flush();

    void g();

    void h(int i, long j);

    int i();

    void j(bn4 bn4Var, Handler handler);

    int k(MediaCodec.BufferInfo bufferInfo);

    void l(int i);

    boolean m(r79 r79Var);

    ByteBuffer n(int i);

    void o(Surface surface);

    ByteBuffer p(int i);
}
