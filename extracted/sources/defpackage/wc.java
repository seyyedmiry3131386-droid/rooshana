package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class wc implements xa1 {
    public final xa1 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public wc(xa1 xa1Var, byte[] bArr, byte[] bArr2) {
        this.a = xa1Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.xa1
    public final long b(db1 db1Var) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                bb1 bb1Var = new bb1(this.a, db1Var);
                this.d = new CipherInputStream(bb1Var, cipher);
                bb1Var.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.xa1
    public final void c(fq8 fq8Var) {
        fq8Var.getClass();
        this.a.c(fq8Var);
    }

    @Override // defpackage.xa1
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // defpackage.xa1
    public final Map k() {
        return this.a.k();
    }

    @Override // defpackage.xa1
    public final Uri p() {
        return this.a.p();
    }

    @Override // defpackage.ra1
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
