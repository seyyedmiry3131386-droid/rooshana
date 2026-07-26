package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.common.ParserException;
import com.airbnb.lottie.network.FileExtension;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.sentry.config.a;
import ir.mservices.market.common.comment.CommentViewModel;
import ir.mservices.market.common.comment.dialog.DeveloperCommentBottomDialogFragment;
import ir.mservices.market.core.Font$FontStyle;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.setting.fontStyle.ui.FontStyleDialogFragment;
import ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel;
import ir.mservices.market.version2.fragments.dialog.AppInstallRetryDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.manager.b;
import ir.mservices.market.views.MyketProgressState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public class nm5 implements gl8, ms5, rm1, fl0, fi6, ef1, d4, at5 {
    public static final String[] c = {"_data"};
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nm5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static String h(String str, FileExtension fileExtension, boolean z) {
        String strConcat = fileExtension.a;
        if (z) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return o40.y("lottie_cache_", strReplaceAll, strConcat);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A(defpackage.t48 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            defpackage.js3.p(r6, r0)
            java.lang.Object r0 = r5.b
            kotlinx.coroutines.flow.l r0 = (kotlinx.coroutines.flow.l) r0
        L9:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            t48 r2 = (defpackage.t48) r2
            boolean r3 = r2 instanceof defpackage.kv6
            if (r3 != 0) goto L42
            ix8 r3 = defpackage.ix8.b
            boolean r3 = defpackage.js3.i(r2, r3)
            if (r3 == 0) goto L1d
            goto L42
        L1d:
            boolean r3 = r2 instanceof defpackage.aa1
            if (r3 == 0) goto L2b
            int r3 = r6.a
            r4 = r2
            aa1 r4 = (defpackage.aa1) r4
            int r4 = r4.a
            if (r3 <= r4) goto L43
            goto L42
        L2b:
            boolean r3 = r2 instanceof defpackage.qc2
            if (r3 == 0) goto L30
            goto L43
        L30:
            boolean r6 = r2 instanceof defpackage.bo5
            if (r6 == 0) goto L3c
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r6.<init>(r0)
            throw r6
        L3c:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L42:
            r2 = r6
        L43:
            boolean r1 = r0.n(r1, r2)
            if (r1 == 0) goto L9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm5.A(t48):void");
    }

    public File B(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(v(), h(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStreamK = a.k(new FileOutputStream(file), file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStreamK.flush();
                        fileOutputStreamK.close();
                        return file;
                    }
                    fileOutputStreamK.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStreamK.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // defpackage.fi6
    public long a(vq3 vq3Var, long j, LayoutDirection layoutDirection, long j2) {
        long j3 = ((rq3) ((bp2) this.b).invoke()).a;
        return (((long) rf0.h(vq3Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), layoutDirection == LayoutDirection.a, (int) (j >> 32))) << 32) | (((long) rf0.h(vq3Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), true, (int) (j & 4294967295L))) & 4294967295L);
    }

    @Override // defpackage.d4
    public boolean b(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) this.b;
        if (!DrawerLayout.j(view) || drawerLayout.f(view) == 2) {
            return false;
        }
        drawerLayout.b(view, true);
        return true;
    }

    @Override // defpackage.gl8
    public Cursor c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.b).query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(int i, int i2, w72 w72Var) throws ParserException {
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        int i9;
        uk4 uk4Var = (uk4) this.b;
        e39 e39Var = uk4Var.b;
        SparseArray sparseArray = uk4Var.c;
        h26 h26Var = uk4Var.k;
        h26 h26Var2 = uk4Var.i;
        int i10 = 1;
        int i11 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (uk4Var.J != 2) {
                    return;
                }
                tk4 tk4Var = (tk4) sparseArray.get(uk4Var.P);
                int i12 = uk4Var.S;
                h26 h26Var3 = uk4Var.p;
                if (i12 != 4 || !"V_VP9".equals(tk4Var.c)) {
                    w72Var.n(i2);
                    return;
                } else {
                    h26Var3.G(i2);
                    w72Var.readFully(h26Var3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                uk4Var.e(i);
                tk4 tk4Var2 = uk4Var.x;
                int i13 = tk4Var2.h;
                if (i13 != 1685485123 && i13 != 1685480259) {
                    w72Var.n(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                tk4Var2.P = bArr;
                w72Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                uk4Var.e(i);
                byte[] bArr2 = new byte[i2];
                uk4Var.x.j = bArr2;
                w72Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                w72Var.readFully(bArr3, 0, i2);
                uk4Var.e(i);
                uk4Var.x.k = new bp8(bArr3, 1, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(h26Var.a, (byte) 0);
                w72Var.readFully(h26Var.a, 4 - i2, i2);
                h26Var.J(0);
                uk4Var.z = (int) h26Var.z();
                return;
            }
            if (i == 25506) {
                uk4Var.e(i);
                byte[] bArr4 = new byte[i2];
                uk4Var.x.l = bArr4;
                w72Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw ParserException.a(null, "Unexpected id: " + i);
            }
            uk4Var.e(i);
            byte[] bArr5 = new byte[i2];
            uk4Var.x.x = bArr5;
            w72Var.readFully(bArr5, 0, i2);
            return;
        }
        if (uk4Var.J == 0) {
            uk4Var.P = (int) e39Var.h(w72Var, false, true, 8);
            uk4Var.Q = e39Var.b;
            uk4Var.L = -9223372036854775807L;
            uk4Var.J = 1;
            h26Var2.G(0);
        }
        tk4 tk4Var3 = (tk4) sparseArray.get(uk4Var.P);
        if (tk4Var3 == null) {
            w72Var.n(i2 - uk4Var.Q);
            uk4Var.J = 0;
            return;
        }
        tk4Var3.Z.getClass();
        if (uk4Var.J == 1) {
            uk4Var.k(w72Var, 3);
            int i14 = (h26Var2.a[2] & 6) >> 1;
            int i15 = 255;
            if (i14 == 0) {
                uk4Var.N = 1;
                int[] iArr = uk4Var.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                uk4Var.O = iArr;
                iArr[0] = (i2 - uk4Var.Q) - 3;
            } else {
                uk4Var.k(w72Var, 4);
                int i16 = (h26Var2.a[3] & 255) + 1;
                uk4Var.N = i16;
                int[] iArr2 = uk4Var.O;
                if (iArr2 == null) {
                    iArr2 = new int[i16];
                } else if (iArr2.length < i16) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i16)];
                }
                uk4Var.O = iArr2;
                if (i14 == 2) {
                    int i17 = (i2 - uk4Var.Q) - 4;
                    int i18 = uk4Var.N;
                    Arrays.fill(iArr2, 0, i18, i17 / i18);
                } else {
                    if (i14 != 1) {
                        if (i14 != 3) {
                            throw ParserException.a(null, "Unexpected lacing value: " + i14);
                        }
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 4;
                        while (true) {
                            int i22 = uk4Var.N - i10;
                            if (i19 >= i22) {
                                i3 = i10;
                                i4 = i11;
                                uk4Var.O[i22] = ((i2 - uk4Var.Q) - i21) - i20;
                                break;
                            }
                            uk4Var.O[i19] = i11;
                            int i23 = i21 + 1;
                            uk4Var.k(w72Var, i23);
                            if (h26Var2.a[i21] == 0) {
                                throw ParserException.a(null, "No valid varint length mask found");
                            }
                            int i24 = i10;
                            int i25 = i11;
                            while (true) {
                                if (i25 >= 8) {
                                    i5 = i11;
                                    j = 0;
                                    i6 = i23;
                                    break;
                                }
                                int i26 = i24 << (7 - i25);
                                i5 = i11;
                                if ((h26Var2.a[i21] & i26) != 0) {
                                    i6 = i23 + i25;
                                    uk4Var.k(w72Var, i6);
                                    j = h26Var2.a[i21] & i15 & (~i26);
                                    while (i23 < i6) {
                                        j = (j << 8) | ((long) (h26Var2.a[i23] & i15));
                                        i23++;
                                        i15 = 255;
                                    }
                                    if (i19 > 0) {
                                        j -= (1 << ((i25 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i25++;
                                    i11 = i5;
                                    i15 = 255;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i27 = (int) j;
                            int[] iArr3 = uk4Var.O;
                            if (i19 != 0) {
                                i27 += iArr3[i19 - 1];
                            }
                            iArr3[i19] = i27;
                            i20 += i27;
                            i19++;
                            i21 = i6;
                            i10 = i24;
                            i11 = i5;
                            i15 = 255;
                        }
                        throw ParserException.a(null, "EBML lacing sample size out of range.");
                    }
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        i7 = uk4Var.N - 1;
                        if (i28 >= i7) {
                            break;
                        }
                        uk4Var.O[i28] = 0;
                        while (true) {
                            i8 = i30 + 1;
                            uk4Var.k(w72Var, i8);
                            int i31 = h26Var2.a[i30] & 255;
                            int[] iArr4 = uk4Var.O;
                            i9 = iArr4[i28] + i31;
                            iArr4[i28] = i9;
                            if (i31 != 255) {
                                break;
                            } else {
                                i30 = i8;
                            }
                        }
                        i29 += i9;
                        i28++;
                        i30 = i8;
                    }
                    uk4Var.O[i7] = ((i2 - uk4Var.Q) - i30) - i29;
                }
            }
            i3 = 1;
            i4 = 0;
            byte[] bArr6 = h26Var2.a;
            uk4Var.K = uk4Var.n((bArr6[i3] & 255) | (bArr6[i4] << 8)) + uk4Var.E;
            uk4Var.R = (tk4Var3.e == 2 || (i == 163 && (h26Var2.a[2] & 128) == 128)) ? i3 : i4;
            uk4Var.J = 2;
            uk4Var.M = i4;
        } else {
            i3 = 1;
        }
        if (i == 163) {
            while (true) {
                int i32 = uk4Var.M;
                if (i32 >= uk4Var.N) {
                    uk4Var.J = 0;
                    return;
                } else {
                    uk4Var.f(tk4Var3, ((long) ((uk4Var.M * tk4Var3.f) / 1000)) + uk4Var.K, uk4Var.R, uk4Var.o(w72Var, tk4Var3, uk4Var.O[i32], false), 0);
                    uk4Var.M++;
                }
            }
        } else {
            while (true) {
                int i33 = uk4Var.M;
                if (i33 >= uk4Var.N) {
                    return;
                }
                int[] iArr5 = uk4Var.O;
                boolean z = i3;
                iArr5[i33] = uk4Var.o(w72Var, tk4Var3, iArr5[i33], z);
                uk4Var.M += z ? 1 : 0;
            }
        }
    }

    @Override // defpackage.ef1
    public int f() {
        return (o() << 8) | o();
    }

    public t3 g(int i) {
        return null;
    }

    @Override // defpackage.fl0
    public Type i() {
        return (Type) this.b;
    }

    public t3 j(int i) {
        return null;
    }

    public File k(String str) {
        File file = new File(v(), h(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(v(), h(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(v(), h(str, FileExtension.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    @Override // defpackage.at5
    public void l(bf8 bf8Var) {
        hx2 hx2Var = (hx2) this.b;
        boolean z = false;
        if (!bf8Var.f()) {
            hx2Var.i(false);
            return;
        }
        ek9 ek9Var = (ek9) ((f87) ((jc7) bf8Var.d()).b);
        Status status = ek9Var.a;
        if (status != null && status.u()) {
            z = ek9Var.b;
        }
        if (z) {
            hx2Var.n.g().g(new qm5(23, hx2Var));
        } else {
            hx2Var.i(true);
        }
    }

    public t48 m() {
        return (t48) ((l) this.b).getValue();
    }

    @Override // defpackage.fl0
    public Object n(dl0 dl0Var) {
        jx0 jx0Var = new jx0(dl0Var);
        dl0Var.l0(new ix0(jx0Var, 1));
        return jx0Var;
    }

    @Override // defpackage.ef1
    public short o() throws IOException {
        int i = ((InputStream) this.b).read();
        if (i != -1) {
            return (short) i;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // defpackage.rm1
    public void onCancel() {
        switch (this.a) {
            case 5:
                ((AppInstallRetryDialogFragment) this.b).N0(DialogResult.b, new Bundle());
                break;
            case 16:
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                DeveloperCommentBottomDialogFragment developerCommentBottomDialogFragment = (DeveloperCommentBottomDialogFragment) this.b;
                iw0 iw0Var = developerCommentBottomDialogFragment.j1;
                js3.m(iw0Var);
                clickEventBuilder.b(iw0Var.z.getRating() > 0.0f ? "developer_stars_cancel_star" : "developer_stars_cancel_nostar");
                clickEventBuilder.a();
                developerCommentBottomDialogFragment.R0(DialogResult.b, new Bundle());
                developerCommentBottomDialogFragment.z0();
                break;
        }
    }

    @Override // defpackage.rm1
    public void onCommit() {
        switch (this.a) {
            case 5:
                ((AppInstallRetryDialogFragment) this.b).N0(DialogResult.a, new Bundle());
                break;
            case 16:
                DeveloperCommentBottomDialogFragment developerCommentBottomDialogFragment = (DeveloperCommentBottomDialogFragment) this.b;
                iw0 iw0Var = developerCommentBottomDialogFragment.j1;
                js3.m(iw0Var);
                if (iw0Var.z.getRating() != 0.0f) {
                    dw1.y("developer_review_send");
                    iw0 iw0Var2 = developerCommentBottomDialogFragment.j1;
                    js3.m(iw0Var2);
                    iw0Var2.v.setStateCommit(MyketProgressState.c);
                    CommentViewModel commentViewModel = (CommentViewModel) developerCommentBottomDialogFragment.h1.getValue();
                    String str = developerCommentBottomDialogFragment.V0().b;
                    String str2 = developerCommentBottomDialogFragment.V0().e;
                    iw0 iw0Var3 = developerCommentBottomDialogFragment.j1;
                    js3.m(iw0Var3);
                    commentViewModel.e(str, (int) iw0Var3.z.getRating(), str2, "");
                } else {
                    TranslateAnimation translateAnimation = new TranslateAnimation(10.0f, -10.0f, 0.0f, 0.0f);
                    translateAnimation.setRepeatCount(2);
                    translateAnimation.setDuration(100L);
                    iw0 iw0Var4 = developerCommentBottomDialogFragment.j1;
                    js3.m(iw0Var4);
                    iw0Var4.z.startAnimation(translateAnimation);
                }
                break;
            default:
                FontStyleDialogFragment fontStyleDialogFragment = (FontStyleDialogFragment) this.b;
                Font$FontStyle font$FontStyle = (Font$FontStyle) ((FontStyleViewModel) fontStyleDialogFragment.k1.getValue()).x.a.getValue();
                Bundle bundle = fontStyleDialogFragment.L0().c;
                bundle.putSerializable("FONT_STYLE", font$FontStyle);
                fontStyleDialogFragment.R0(DialogResult.a, bundle);
                break;
        }
    }

    public void p(float f, float f2, float f3, float f4) {
        wv8 wv8Var = (wv8) this.b;
        tm0 tm0VarV = wv8Var.v();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (wv8Var.A() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (wv8Var.A() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            qn3.a("Width and height must be greater than or equal to zero");
        }
        wv8Var.P(jFloatToRawIntBits);
        tm0VarV.n(f, f2);
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        int i;
        int i2;
        int i3;
        int i4;
        lf9 lf9VarF = lf9Var;
        int i5 = this.a;
        Object obj = this.b;
        switch (i5) {
            case 4:
                int iD = lf9VarF.d();
                ln lnVar = (ln) obj;
                Context context = lnVar.k;
                int iD2 = lf9VarF.d();
                ActionBarContextView actionBarContextView = lnVar.v;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    i = 0;
                    i2 = 0;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lnVar.v.getLayoutParams();
                    if (lnVar.v.isShown()) {
                        if (lnVar.A0 == null) {
                            lnVar.A0 = new Rect();
                            lnVar.B0 = new Rect();
                        }
                        Rect rect = lnVar.A0;
                        Rect rect2 = lnVar.B0;
                        rect.set(lf9VarF.b(), lf9VarF.d(), lf9VarF.c(), lf9VarF.a());
                        ViewGroup viewGroup = lnVar.B;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean z = ca9.a;
                            y99.a(viewGroup, rect, rect2);
                            i3 = 0;
                        } else {
                            if (ca9.a) {
                                i3 = 0;
                            } else {
                                ca9.a = true;
                                i3 = 0;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    ca9.b = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        ca9.b.setAccessible(true);
                                    }
                                    break;
                                } catch (NoSuchMethodException unused) {
                                }
                            }
                            Method method = ca9.b;
                            if (method != null) {
                                try {
                                    Object[] objArr = new Object[2];
                                    objArr[i3] = rect;
                                    objArr[1] = rect2;
                                    method.invoke(viewGroup, objArr);
                                    break;
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        int i6 = rect.top;
                        int i7 = rect.left;
                        int i8 = rect.right;
                        ViewGroup viewGroup2 = lnVar.B;
                        WeakHashMap weakHashMap = q69.a;
                        lf9 lf9VarA = i69.a(viewGroup2);
                        int iB = lf9VarA == null ? i3 : lf9VarA.b();
                        int iC = lf9VarA == null ? i3 : lf9VarA.c();
                        if (marginLayoutParams.topMargin == i6 && marginLayoutParams.leftMargin == i7 && marginLayoutParams.rightMargin == i8) {
                            i4 = i3;
                        } else {
                            marginLayoutParams.topMargin = i6;
                            marginLayoutParams.leftMargin = i7;
                            marginLayoutParams.rightMargin = i8;
                            i4 = 1;
                        }
                        if (i6 <= 0 || lnVar.D != null) {
                            View view2 = lnVar.D;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i9 = marginLayoutParams2.height;
                                int i10 = marginLayoutParams.topMargin;
                                if (i9 != i10 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                                    marginLayoutParams2.height = i10;
                                    marginLayoutParams2.leftMargin = iB;
                                    marginLayoutParams2.rightMargin = iC;
                                    lnVar.D.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context);
                            lnVar.D = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = iB;
                            layoutParams.rightMargin = iC;
                            lnVar.B.addView(lnVar.D, -1, layoutParams);
                        }
                        View view4 = lnVar.D;
                        i = view4 == null ? i3 : 1;
                        if (i != 0 && view4.getVisibility() != 0) {
                            View view5 = lnVar.D;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? ContextCompat.getColor(context, gq6.abc_decor_view_status_guard_light) : ContextCompat.getColor(context, gq6.abc_decor_view_status_guard));
                        }
                        if (!lnVar.I && i != 0) {
                            iD2 = i3;
                        }
                        i2 = i;
                        i = i3;
                        i = i4;
                    } else if (marginLayoutParams.topMargin != 0) {
                        i = 0;
                        marginLayoutParams.topMargin = 0;
                        i2 = 0;
                    } else {
                        i = 0;
                        i2 = 0;
                        i = 0;
                    }
                    if (i != 0) {
                        lnVar.v.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = lnVar.D;
                if (view6 != null) {
                    view6.setVisibility(i2 != 0 ? i : 8);
                }
                if (iD != iD2) {
                    lf9VarF = lf9VarF.f(lf9VarF.b(), iD2, lf9VarF.c(), lf9VarF.a());
                }
                return q69.k(view, lf9VarF);
            default:
                if0 if0Var = (if0) obj;
                hf0 hf0Var = if0Var.n;
                if (hf0Var != null) {
                    if0Var.g.x0.remove(hf0Var);
                }
                hf0 hf0Var2 = new hf0(if0Var.j, lf9VarF);
                if0Var.n = hf0Var2;
                hf0Var2.e(if0Var.getWindow());
                if0Var.g.y(if0Var.n);
                return lf9VarF;
        }
    }

    @Override // defpackage.ef1
    public int r(int i, byte[] bArr) throws DefaultImageHeaderParser$Reader$EndOfFileException {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.b).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        return i2;
    }

    public void s(int i, long j) throws ParserException {
        uk4 uk4Var = (uk4) this.b;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                uk4Var.e(i);
                uk4Var.x.e = (int) j;
                return;
            case 136:
                uk4Var.e(i);
                uk4Var.x.X = j == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                uk4Var.L = uk4Var.n(j);
                return;
            case 159:
                uk4Var.e(i);
                uk4Var.x.Q = (int) j;
                return;
            case 176:
                uk4Var.e(i);
                uk4Var.x.n = (int) j;
                return;
            case 179:
                uk4Var.c(i);
                uk4Var.F.a(uk4Var.n(j));
                return;
            case 186:
                uk4Var.e(i);
                uk4Var.x.o = (int) j;
                return;
            case 215:
                uk4Var.e(i);
                uk4Var.x.d = (int) j;
                return;
            case 231:
                uk4Var.E = uk4Var.n(j);
                return;
            case 238:
                uk4Var.S = (int) j;
                return;
            case 241:
                if (uk4Var.H) {
                    return;
                }
                uk4Var.c(i);
                uk4Var.G.a(j);
                uk4Var.H = true;
                return;
            case 251:
                uk4Var.T = true;
                return;
            case 16871:
                uk4Var.e(i);
                uk4Var.x.h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                uk4Var.A = j + uk4Var.s;
                return;
            case 21432:
                int i2 = (int) j;
                uk4Var.e(i);
                if (i2 == 0) {
                    uk4Var.x.y = 0;
                    return;
                }
                if (i2 == 1) {
                    uk4Var.x.y = 2;
                    return;
                } else if (i2 == 3) {
                    uk4Var.x.y = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    uk4Var.x.y = 3;
                    return;
                }
            case 21680:
                uk4Var.e(i);
                uk4Var.x.q = (int) j;
                return;
            case 21682:
                uk4Var.e(i);
                uk4Var.x.s = (int) j;
                return;
            case 21690:
                uk4Var.e(i);
                uk4Var.x.r = (int) j;
                return;
            case 21930:
                uk4Var.e(i);
                uk4Var.x.W = j == 1;
                return;
            case 21938:
                uk4Var.e(i);
                tk4 tk4Var = uk4Var.x;
                tk4Var.z = true;
                tk4Var.p = (int) j;
                return;
            case 21998:
                uk4Var.e(i);
                uk4Var.x.g = (int) j;
                return;
            case 22186:
                uk4Var.e(i);
                uk4Var.x.T = j;
                return;
            case 22203:
                uk4Var.e(i);
                uk4Var.x.U = j;
                return;
            case 25188:
                uk4Var.e(i);
                uk4Var.x.R = (int) j;
                return;
            case 30114:
                uk4Var.U = j;
                return;
            case 30321:
                uk4Var.e(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    uk4Var.x.t = 0;
                    return;
                }
                if (i3 == 1) {
                    uk4Var.x.t = 1;
                    return;
                } else if (i3 == 2) {
                    uk4Var.x.t = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    uk4Var.x.t = 3;
                    return;
                }
            case 2352003:
                uk4Var.e(i);
                uk4Var.x.f = (int) j;
                return;
            case 2807729:
                uk4Var.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        uk4Var.e(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            uk4Var.x.C = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            uk4Var.x.C = 1;
                            return;
                        }
                    case 21946:
                        uk4Var.e(i);
                        int iG = cv0.g((int) j);
                        if (iG != -1) {
                            uk4Var.x.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        uk4Var.e(i);
                        uk4Var.x.z = true;
                        int iF = cv0.f((int) j);
                        if (iF != -1) {
                            uk4Var.x.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        uk4Var.e(i);
                        uk4Var.x.D = (int) j;
                        return;
                    case 21949:
                        uk4Var.e(i);
                        uk4Var.x.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // defpackage.ef1
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.b;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    public void u(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((r90) this.b).a(0);
    }

    public File v() {
        File file = new File(((Context) ((qs3) this.b).b).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public boolean w(int i, int i2, Bundle bundle) {
        return false;
    }

    public void x(float f, long j) {
        tm0 tm0VarV = ((wv8) this.b).v();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        tm0VarV.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        tm0VarV.b(f);
        tm0VarV.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void y(float f, float f2, long j) {
        tm0 tm0VarV = ((wv8) this.b).v();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        tm0VarV.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        tm0VarV.a(f, f2);
        tm0VarV.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void z(float f, float f2) {
        ((wv8) this.b).v().n(f, f2);
    }

    public nm5(ir.mservices.market.common.model.a aVar) {
        this.a = 21;
        js3.p(aVar, "submitCommentRepository");
        this.b = aVar;
    }

    public nm5(b bVar) {
        this.a = 6;
        js3.p(bVar, "appUsageManager");
        this.b = bVar;
    }

    public nm5(Context context, ls0 ls0Var) {
        this.a = 11;
        js3.p(ls0Var, "citySource");
        this.b = ls0Var;
    }

    public nm5(ly lyVar) {
        this.a = 7;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(lyVar.a).setFlags(lyVar.b).setUsage(lyVar.c);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            te.K(usage, lyVar.d);
        }
        if (i >= 32) {
            ky.b(usage, lyVar.e);
            ky.a(usage, lyVar.f);
        }
        this.b = usage.build();
    }

    public nm5(int i) {
        this.a = i;
        switch (i) {
            case 14:
                this.b = ja1.b(ix8.b);
                break;
            case 25:
                this.b = new HashSet();
                break;
            case 29:
                this.b = new HashMap();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new v3(this);
                } else {
                    this.b = new u3(this);
                }
                break;
        }
    }

    private final void t() {
    }

    public void d(int i, t3 t3Var, String str, Bundle bundle) {
    }
}
