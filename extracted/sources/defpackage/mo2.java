package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class mo2 implements m52 {
    public static final vv1 d = new vv1(22);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public mo2(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = xj0.b;
        vy2.i("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(xj0.c)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (xj0.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // defpackage.m52
    public final synchronized void a() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // defpackage.m52
    public final Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // defpackage.m52
    public final l52 c() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new l52(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // defpackage.m52
    public final void d(final pj9 pj9Var) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: lo2
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                mo2 mo2Var = this.a;
                pj9 pj9Var2 = pj9Var;
                mo2Var.getClass();
                hd hdVar = ((ie1) pj9Var2.a).w;
                hdVar.getClass();
                hdVar.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // defpackage.m52
    public final b81 e(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, xj0.c)) {
            uuid = xj0.b;
        }
        return new ko2(uuid, bArr);
    }

    @Override // defpackage.m52
    public final byte[] f() {
        return this.b.openSession();
    }

    @Override // defpackage.m52
    public final void g(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.m52
    public final void h(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // defpackage.m52
    public final byte[] i(byte[] bArr, byte[] bArr2) {
        if (xj0.c.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(j29.q(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                wn5.H("ClearKeyUtil", "Failed to adjust response data: ".concat(j29.q(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.m52
    public final void j(byte[] bArr) throws DeniedByServerException {
        this.b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    @Override // defpackage.m52
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.k52 k(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo2.k(byte[], java.util.List, int, java.util.HashMap):k52");
    }

    @Override // defpackage.m52
    public final int l() {
        return 2;
    }

    @Override // defpackage.m52
    public final void m(byte[] bArr, ee6 ee6Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                zc.u(this.b, bArr, ee6Var);
            } catch (UnsupportedOperationException unused) {
                wn5.k0("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // defpackage.m52
    public final boolean n(String str, byte[] bArr) throws Throwable {
        MediaCrypto mediaCrypto;
        boolean zEquals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(xj0.d);
            MediaDrm mediaDrm = this.b;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(xj0.c);
            }
            if (zEquals) {
                return zc.q(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !Objects.equals(uuid, xj0.c)) ? uuid : xj0.b, bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return zRequiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !uuid.equals(xj0.c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }
}
