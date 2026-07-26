package defpackage;

import com.android.volley.Request$Priority;
import ir.mservices.market.version2.webapi.requestdto.UploadImageRequestDto;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ib2 extends xv2 {
    public static final String B;
    public static final String C;
    public final UploadImageRequestDto A;

    static {
        String str = String.format("apiclient-%s", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        B = str;
        C = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public ib2(z57 z57Var, UploadImageRequestDto uploadImageRequestDto, Object obj, wv2 wv2Var, zv2 zv2Var) {
        super(1, z57Var, uploadImageRequestDto, Request$Priority.b, false, obj, wv2Var, zv2Var, false);
        this.A = uploadImageRequestDto;
    }

    @Override // defpackage.xv2, defpackage.x47
    public final byte[] f() {
        return this.A.getBody();
    }

    @Override // defpackage.xv2, defpackage.x47
    public final String g() {
        return C;
    }
}
