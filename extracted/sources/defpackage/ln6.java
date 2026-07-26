package defpackage;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class ln6 implements z29 {
    public boolean a = false;
    public boolean b = false;
    public xa2 c;
    public final kn6 d;

    public ln6(kn6 kn6Var) {
        this.d = kn6Var;
    }

    @Override // defpackage.z29
    public final z29 b(String str) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.z29
    public final z29 c(boolean z) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.b(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
