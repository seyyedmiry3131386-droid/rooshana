package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class ua1 extends p60 {
    public db1 e;
    public byte[] f;
    public int g;
    public int h;

    @Override // defpackage.xa1
    public final long b(db1 db1Var) throws ParserException, DataSourceException {
        r();
        this.e = db1Var;
        Uri uri = db1Var.a;
        long j = db1Var.g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        vy2.i("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = j29.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(rm7.p(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(dw1.n("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = db1Var.f;
        byte[] bArr = this.f;
        if (j2 > bArr.length) {
            this.f = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j2;
        this.g = i;
        int length = bArr.length - i;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        s(db1Var);
        return j != -1 ? j : this.h;
    }

    @Override // defpackage.xa1
    public final void close() {
        if (this.f != null) {
            this.f = null;
            o();
        }
        this.e = null;
    }

    @Override // defpackage.xa1
    public final Uri p() {
        db1 db1Var = this.e;
        if (db1Var != null) {
            return db1Var.a;
        }
        return null;
    }

    @Override // defpackage.ra1
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = j29.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        l(iMin);
        return iMin;
    }
}
