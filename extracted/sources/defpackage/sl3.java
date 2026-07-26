package defpackage;

import android.graphics.Typeface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Trace;
import androidx.compose.ui.node.h;
import androidx.paging.j;
import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.SharingCommand;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.ByteString;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class sl3 implements h32, en4, RequestDTO, go5, ov5, fa6, k71, su7, om4, aq8 {
    public final /* synthetic */ int a;

    public /* synthetic */ sl3(int i) {
        this.a = i;
    }

    public static boolean B(int i) {
        List listC = br9.C(0, 1);
        if (listC == null || !listC.isEmpty()) {
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() == i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final String m(ByteString byteString, ByteString[] byteStringArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ByteString byteString2 = PublicSuffixDatabase.b;
        int iE = byteString.e();
        int i5 = 0;
        while (i5 < iE) {
            int i6 = (i5 + iE) / 2;
            while (i6 > -1 && byteString.j(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (byteString.j(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bJ = byteStringArr[i10].j(i11);
                    byte[] bArr = gh9.a;
                    int i13 = bJ & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bJ2 = byteString.j(i7 + i12);
                byte[] bArr2 = gh9.a;
                i4 = i3 - (bJ2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (byteStringArr[i10].e() != i11) {
                    z2 = z;
                } else {
                    if (i10 == byteStringArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iE2 = byteStringArr[i10].e() - i11;
                    int length = byteStringArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iE2 += byteStringArr[i15].e();
                    }
                    if (iE2 >= i14) {
                        if (iE2 <= i14) {
                            return byteString.p(i7, i9 + i7).o(zp0.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iE = i6;
        }
        return null;
    }

    public static final String n(int i) {
        return i != 0 ? i != 8 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN : "RESULT_ERROR" : "DEVELOPER_ERROR" : "ITEM_UNAVAILABLE" : "BILLING_UNAVAILABLE" : "ITEM_NOT_OWNED" : "OK";
    }

    public static final boolean o(Bundle bundle) {
        lw.d(null, null, bundle);
        Object obj = bundle.get("RESPONSE_CODE");
        lw.d(null, null, obj);
        if (obj == null || !(obj instanceof Integer)) {
            return false;
        }
        return B(((Number) obj).intValue());
    }

    public static final String q(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            String string = jSONObject.toString();
            js3.m(string);
            return string;
        } catch (Exception unused) {
            return "Failed to convert input to JsonObject";
        }
    }

    public static Typeface r(String str, fj2 fj2Var, int i) {
        if (i == 0 && js3.i(fj2Var, fj2.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iB0 = yq2.b0(fj2Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iB0) : Typeface.create(str, iB0);
    }

    public static MediaCodec t(on onVar) throws IOException {
        String str = ((sm4) onVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static a06 x(na4 na4Var) {
        js3.p(na4Var, "sourceLoadStates");
        return new a06(new d9(5, new j(EmptyList.a, na4Var)), a06.d, a06.e, new hk3(28, na4Var));
    }

    public static a06 y(List list, na4 na4Var) {
        js3.p(list, "data");
        js3.p(na4Var, "sourceLoadStates");
        return new a06(new d9(5, new j(list, na4Var)), a06.d, a06.e, new xv3(list, na4Var, 12));
    }

    public boolean A(Method method) {
        return false;
    }

    @Override // defpackage.su7
    public xe2 a(ia8 ia8Var) {
        return new d9(5, SharingCommand.a);
    }

    @Override // defpackage.en4
    public /* synthetic */ void b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // defpackage.om4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.pm4 c(defpackage.on r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = t(r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "configureCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r1 = r6.d     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r1 != 0) goto L25
            java.lang.Object r2 = r6.a     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            sm4 r2 = (defpackage.sm4) r2     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            boolean r2 = r2.h     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r2 == 0) goto L25
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r3 = 35
            if (r2 < r3) goto L25
            r2 = 8
            goto L26
        L21:
            r6 = move-exception
            goto L49
        L23:
            r6 = move-exception
            goto L49
        L25:
            r2 = 0
        L26:
            java.lang.Object r3 = r6.b     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r4 = r6.e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.start()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            pd8 r1 = new pd8     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r6 = r6.f     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            gg4 r6 = (defpackage.gg4) r6     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r1
        L49:
            if (r0 == 0) goto L4e
            r0.release()
        L4e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl3.c(on):pm4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [gx4] */
    /* JADX WARN: Type inference failed for: r9v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [gx4] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.go5
    public boolean d(gx4 gx4Var) {
        ?? zb5Var = 0;
        while (gx4Var != 0) {
            if (gx4Var instanceof dh6) {
                ((dh6) gx4Var).I();
            } else if ((gx4Var.c & 16) != 0 && (gx4Var instanceof ti1)) {
                gx4 gx4Var2 = ((ti1) gx4Var).p;
                int i = 0;
                zb5Var = zb5Var;
                gx4Var = gx4Var;
                while (gx4Var2 != null) {
                    if ((gx4Var2.c & 16) != 0) {
                        i++;
                        zb5Var = zb5Var;
                        if (i == 1) {
                            gx4Var = gx4Var2;
                        } else {
                            if (zb5Var == 0) {
                                zb5Var = new zb5(0, new gx4[16]);
                            }
                            if (gx4Var != 0) {
                                zb5Var.b(gx4Var);
                                gx4Var = 0;
                            }
                            zb5Var.b(gx4Var2);
                        }
                    }
                    gx4Var2 = gx4Var2.f;
                    zb5Var = zb5Var;
                    gx4Var = gx4Var;
                }
                if (i == 1) {
                }
            }
            gx4Var = y40.j(zb5Var);
        }
        return false;
    }

    @Override // defpackage.fa6
    public Typeface e(fj2 fj2Var, int i) {
        return r(null, fj2Var, i);
    }

    @Override // defpackage.go5
    public int f() {
        return 16;
    }

    @Override // defpackage.go5
    public void h(h hVar, long j, tz2 tz2Var, int i, boolean z) {
        hVar.M(j, tz2Var, i, z);
    }

    @Override // defpackage.fa6
    public Typeface i(lr2 lr2Var, fj2 fj2Var, int i) {
        String strConcat = lr2Var.c;
        int i2 = fj2Var.a / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceR = r(strConcat, fj2Var, i);
            if (!js3.i(typefaceR, Typeface.create(Typeface.DEFAULT, yq2.b0(fj2Var, i))) && !js3.i(typefaceR, r(null, fj2Var, i))) {
                typeface = typefaceR;
            }
        }
        return typeface == null ? r(lr2Var.c, fj2Var, i) : typeface;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        lw.g((SQLException) serializable, "Cannot save new message in inbox database", null);
    }

    @Override // defpackage.en4
    public /* synthetic */ void k() {
    }

    @Override // defpackage.go5
    public boolean l(h hVar) {
        return true;
    }

    @Override // defpackage.en4
    public /* synthetic */ void p() {
    }

    @Override // defpackage.en4
    public ij3 s(gn4 gn4Var, List list) {
        return ja1.y(new bq7(-6));
    }

    public String toString() {
        switch (this.a) {
            case 24:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.en4
    public /* synthetic */ void u() {
    }

    public String v(int i, Method method) {
        return "parameter #" + (i + 1);
    }

    @Override // defpackage.en4
    public ij3 w(wp7 wp7Var) {
        return ja1.y(new bq7(-6));
    }

    public Object z(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public sl3(bp2 bp2Var) {
        this.a = 28;
    }

    @Override // defpackage.ov5
    public void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
